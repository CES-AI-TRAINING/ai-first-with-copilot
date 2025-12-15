# Prompting Techniques — Labs

This folder contains concise, copyable examples that demonstrate common prompting techniques and patterns. Each file contains a short description, a sample prompt, and an example expected response to help you test and iterate quickly.

Files:

- `zero-shot.md` — direct task prompts (no examples)
- `few-shot.md` — few-shot prompting with input-output examples
- `chain-of-thought.md` — show intermediate reasoning steps
- `persona.md` — role-based prompts (persona/expert)
- `constrained-json.md` — enforce structured JSON outputs
- `tests-first-copilot.md` — using tests as prompts (Copilot workflow)
- `self-consistency.md` — sampling + voting via chains-of-thought
- `structured-qa.md` — evidence-grounded Q&A
- `debugging.md` — prompts for finding and fixing bugs

Usage:

1. Open the relevant file and copy the "Prompt" section to your model interface or editor.
2. Adjust domain inputs (replace placeholders like `{text}` or `{code}`).
3. Run, inspect, and iterate (lower temperature for deterministic tasks).
