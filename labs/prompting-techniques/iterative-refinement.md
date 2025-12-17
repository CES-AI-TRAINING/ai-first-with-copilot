# Iterative Refinement

Description: Produce an initial draft and then iteratively improve it across multiple passes. Useful when you want progressively better style, clarity, or correctness while keeping changes minimal and reviewable.

Prompt:

```
System: You are an assistant that returns an initial draft and then performs iterative refinements. After each pass, show the draft and one-line note about what you changed.
User: 1) Write a 2-sentence product summary for "Acme Portable Charger".
      2) Then refine it to be more persuasive.
      3) Then refine it again to be shorter and put the main benefit first.
```

Example output:

```
Draft 0: The Acme Portable Charger keeps your devices powered when you're away from an outlet. It has fast charging and a compact design suitable for travel.

Refinement 1 (more persuasive): The Acme Portable Charger ensures your phone never dies on the go — fast-charging tech and a long-lasting battery keep you connected all day. It's compact, durable, and travel-ready.
Change: Added urgency and benefit-oriented language.

Refinement 2 (shorter, benefit-first): Stay connected all day with the Acme Portable Charger — fast charging in a pocket-sized, travel-ready design.
Change: Shortened and moved the key benefit to the first sentence.

Final: Stay connected all day with the Acme Portable Charger — fast charging in a pocket-sized, travel-ready design.
```

Validation tip: Ask for a diff or change summary between passes and stop when the user confirms satisfaction. Lower temperature for deterministic wording or increase it when exploring multiple stylistic variants.