# GitHub Copilot: Prompting Techniques & Workflows

## Overview

This guide focuses on practical prompting techniques and workflows tailored to GitHub Copilot (editor completions, Copilot Chat, and Copilot Labs). It explains how to prompt inside code, use tests as prompts, run iterative cycles, and safely adopt generated code.

## Table of Contents

- When to prompt Copilot vs use Copilot Chat
- Comment-based prompt patterns
- Tests-first (TDD) and spec-driven prompts
- Refactor, debug, and audit prompts
- Templates & practical examples
- Safety, licensing, and privacy
- Tools, settings, and workflow tips

---

## When to prompt Copilot vs use Copilot Chat

- Use inline comments or short natural-language prompts for local completions and single-file changes.
- Use Copilot Chat when you need multi-file context, high-level design, explanations, or step-by-step debugging.
- Use Copilot Labs experiments (if available) for advanced transformations and exploration.

## Comment-based prompt patterns (in-editor)

- Single-line instruction: Add a short comment describing the goal above or near the cursor.

Example (Python):

```py
# Implement `compute_checksum(data)` returning SHA256 hex digest
def compute_checksum(data):
    
```

- Multi-step TODO: Outline constraints or required behavior.

```js
/* TODO: Implement `fetchWithRetries(url, options)`
 - retry up to 3 times on network errors
 - exponential backoff starting at 200ms
 - return parsed JSON
 - do not add external dependencies */
async function fetchWithRetries(url, options) {
  
}
```

- Format-only prompt: Ask Copilot to produce code in a fixed shape (e.g., function signature, JSON, or specific API usage).

```go
// Generate function: `func ParseConfig(data []byte) (Config, error)`
```

## Tests-first & spec-driven prompts

- Write unit tests first (or a failing test case) and prompt Copilot to implement the minimum code necessary to pass them.
- Benefits: drives correct behavior, creates repeatable acceptance criteria, and reduces hallucination.

Example flow:

1. Add test skeleton: `test_foo_handles_empty_input()`
2. Ask Copilot (via comment or chat): "Implement function to satisfy this test. Keep changes minimal." 

Example prompt in test file:

```py
# Test: returns empty list for empty input
def test_parse_empty():
    assert parse_items("") == []

# Copilot: implement `parse_items` to make this test pass
```

## Refactor, debug, and audit prompts

- Refactor prompts:
  - "Refactor this function to improve readability and performance while keeping behavior identical. Keep changes localized and add tests."

- Debug prompts:
  - Insert failing test, then ask: "Find the bug and provide a minimal fix with an explanation in one paragraph."

- Security audit prompts:
  - "Flag any potential security issues, unsafe function calls, or user-input sanitization problems in this code." 

## Templates & practical examples

- Implement function (minimal):

```text
# Implement `functionName(params)` to do X, keep behavior minimal and add unit tests.
```

- Add types or annotations:

```text
# Add type annotations for function signatures and update tests accordingly.
```

- Limit changes (safety):

```text
# Only change the body of `foo()`. Do not modify other files. Add unit tests for any new behavior.
```

- Commit message / PR description generation:

```text
# Generate a concise commit message and a one-paragraph PR description summarizing the change and why.
```

## Best practices & tips

- Be explicit about constraints: required behavior, performance targets, and forbidden changes.
- Provide small focused prompts rather than very broad ones to keep suggestions relevant.
- Prefer tests-first: it reduces ambiguity and ensures verifiable outcomes.
- Use examples in comments or small datasets to show expected outputs.
- When using Copilot Chat, paste relevant files or diffs to provide context.
- For deterministic behavior, prefer small completions and specific constraints rather than long, open-ended prompts.

## Safety, licensing, and privacy

- Review generated code for security vulnerabilities, secrets, or unsafe patterns.
- Check licenses of suggested dependencies and libraries before adding to your project.
- Avoid pasting secrets or private credentials into prompts.
- Add a CI step to run linters, security scanners (e.g., Snyk, Bandit), and license checks on generated code.

## Tools, settings, and workflow tips

- Configure Copilot settings to respect your preferred languages and code styles.
- Keep editor context small for targeted changes (close unrelated files if necessary).
- Save and review suggestions in small increments and run tests frequently.

## Closing notes

Treat Copilot as an assistant that speeds up routine coding tasks; retain human review for correctness, security, and style. Prompts are cheap and iterative—refine them and capture the patterns that consistently produce high-quality output.

---

If you'd like, I can:

- Add a `README` with one-click copy templates.
- Produce domain-specific Copilot prompt packs (web, data, infra).
