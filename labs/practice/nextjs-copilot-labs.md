# Next.js Copilot Labs

## Overview

Hands-on tasks to practice using Copilot with Next.js (React framework for production). Each task includes step guidance and example prompts to try with Copilot.

---

## Lab 1 — Beginner: Create a simple Next.js app with pages

**Objective:** Build a Next.js app with basic pages and routing.

**Steps:**

- Set up a new Next.js project.
- Create pages: Home (`/`), About (`/about`), Contact (`/contact`).
- Add navigation between pages.
- Style with CSS modules or Tailwind CSS.

**Acceptance criteria:** App runs locally, navigation works, pages display content.

**Example Copilot prompts:**

- "Scaffold a new Next.js 14 project with TypeScript and Tailwind CSS in the labs/practice folder."
- "Create a layout component with navigation for Home, About, and Contact pages."
- "Generate pages for Home, About, and Contact with basic content and styling."

**Stretch:** Add a footer or theme toggle.

---

## Lab 2 — Intermediate: Add API routes and data fetching

**Objective:** Implement API routes and fetch data in components.

**Steps:**

- Create API routes for products (GET /api/products, POST /api/products).
- Add a products page that fetches and displays data.
- Implement client-side and server-side data fetching.
- Add forms for adding products.

**Acceptance criteria:** API routes work, data is fetched and displayed, form submissions update data.

**Example Copilot prompts:**

- "Create Next.js API routes for CRUD operations on products (id, name, price)."
- "Write a React component that fetches products using SWR or fetch API."
- "Add a form to create new products with validation."

**Stretch:** Add authentication or pagination.

---

## Lab 3 — Advanced: Static generation and deployment

**Objective:** Use static site generation (SSG) and deploy the app.

**Steps:**

- Convert pages to use `getStaticProps` for SSG.
- Add dynamic routes for individual products.
- Set up deployment to Vercel or Netlify.
- Optimize images and performance.

**Acceptance criteria:** Pages are statically generated, app deploys successfully, performance is optimized.

**Example Copilot prompts:**

- "Convert the products page to use getStaticProps for static generation."
- "Create dynamic routes for product details using [id].js."
- "Optimize images with Next.js Image component and add meta tags for SEO."

**Stretch:** Add internationalization or PWA features.

---

## Copilot prompt patterns & tips 💡

- Specify Next.js version and features (e.g., "Next.js 14 with App Router").
- Ask Copilot to generate components, hooks, and API handlers.
- Ask for refactors ("Refactor to use App Router instead of Pages Router") and for deployment scripts.
