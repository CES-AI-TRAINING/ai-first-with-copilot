# Few-shot Prompting

Description: Provide a small set of input-output examples to show desired format and behavior.

Prompt (examples first):

```
System: You are a helpful assistant that returns short answers.
User: Example: Review: "Great product, fast shipping." -> Sentiment: Positive
User: Example: Review: "Product arrived broken." -> Sentiment: Negative
User: Example: Review: "Item as described." -> Sentiment: Neutral
User: Review: "The packaging was damaged but the product works." -> Sentiment:
```

Expected output: "Neutral" (or another label based on your labeling scheme).
