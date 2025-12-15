# Constrained Generation (JSON)

Description: Force the model to return structured JSON only; useful for parsable outputs.

Prompt:

```
System: Return valid JSON only. Do not include any explanatory text.
User: Extract fields `title`, `author`, and `date` from the article below and return as JSON:
"""
{article_text}
"""
```

Expected output (example):

```
{"title": "Example Article", "author": "Jane Doe", "date": "2025-01-10"}
```

Validation tip: Always run a JSON parser on the response; reject or re-prompt on parse failures.
