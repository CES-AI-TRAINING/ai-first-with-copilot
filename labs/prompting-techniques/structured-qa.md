# Structured Q&A (Evidence Grounding)

Description: Ask the model to answer a question and cite the sentence in the passage that supports the answer.

Prompt:

```
System: Answer in one sentence and include the sentence from the passage that justifies your answer.
User: Passage: "{passage}" Question: "{question}"
```

Expected output (example):

"Answer: The mitochondria is the cell's powerhouse. Support: 'Mitochondria produce most of the cell's ATP.'"
