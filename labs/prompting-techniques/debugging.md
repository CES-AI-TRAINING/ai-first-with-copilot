# Debugging Prompts

Description: Prompt patterns that help locate and fix bugs with minimal context.

Prompt examples:

1. Find bug and fix:

````
System: Inspect the following function and find the bug. Provide a one-paragraph explanation and a minimal code fix.
User: ```
def add_unique(items, x):
    if x not in items:
        items.append(x)
    return items
````

```

2) Explain failing test:

```

System: Explain why the test `test_sort_desc()` is failing and suggest a minimal fix. Show the corrected code and updated test if needed.
User: [include test and failing output here]

```

Tip: Add failing tests first to make debugging iterative and verifiable.
```
