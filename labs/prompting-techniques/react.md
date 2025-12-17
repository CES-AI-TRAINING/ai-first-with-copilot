# ReAct (Reasoning + Acting)

Description: Alternate short chains-of-thought with explicit actions (e.g., Search, Lookup, Calc), then use observations from actions to produce final answers. Good for tasks that mix reasoning and retrieval or tool use.

Prompt (template):

```
System: Use the ReAct format. For each step include "Thought:", then either an "Action: <ActionName(arguments)>" (allowed actions: Search(query), Lookup(url), Calc(expression)) and then "Observation:" with the result. Conclude with "Answer:". Keep thoughts brief.
User: Question: "What's the population of Zurich, and is it larger than 400,000?"
```

Simulated example output (when tools/observations are available):

```
Thought: Need the latest population figure for Zurich.
Action: Search("Zurich population 2023")
Observation: "Zurich population (city) ~ 443,000 (source: City statistics 2023)."
Thought: Compare 443,000 to 400,000.
Answer: Zurich's population is approximately 443,000, which is larger than 400,000. Source: City statistics 2023 (provide URL with Lookup action if available).
```

Usage tip: When running against real tools, ensure actions map to actual API calls and include the returned URL or raw data in the Observation. Keep thoughts short and only include them to explain the next action; avoid exposing chain-of-thought in sensitive contexts if you need terse, policy-compliant outputs.