# Tests-First (Copilot Workflow)

Description: Use failing unit tests as prompts to guide Copilot to implement correct behavior.

Example (Python / pytest):

```py
# test_utils.py
def test_parse_items_empty():
    assert parse_items("") == []

# Comment for Copilot:
# Implement `parse_items(text)` to pass the tests above. Keep changes minimal.
```

Flow:

1. Add the failing test to your test file.
2. Use an inline comment or Copilot Chat to ask for an implementation.
3. Run tests, iterate until passing, then review code and add edge-case tests.
