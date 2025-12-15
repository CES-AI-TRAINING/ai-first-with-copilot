# Self-Consistency via Sampling

Description: For difficult reasoning tasks, sample multiple chain-of-thought responses and take the majority/vote of final answers.

Prompt (single sample):

```
System: Show your chain-of-thought and final answer.
User: What's the next number in the series: 2, 3, 5, 8, 13, ?
```

Workflow:

1. Generate N chains (e.g., 5) with temperature > 0.
2. Extract each final answer and take the majority vote.
3. If no clear majority, increase samples or ask for justification.
