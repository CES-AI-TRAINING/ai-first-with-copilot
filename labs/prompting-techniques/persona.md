# Persona / Role Prompting

Description: Tell the model to take on an expert role to influence tone and correctness.

Prompt:

```
System: You are a senior backend engineer with 10 years experience in Python.
User: Explain how to improve the database schema for performance in 3 bullet points.
```

Expected output (example):

"- Add appropriate indexes for common queries.
- Normalize or denormalize based on read/write patterns.
- Use partitioning for large tables and monitor query plans."
