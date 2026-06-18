# FINAL PLAN: June 24 - July 20 (27 Days)

> This plan starts AFTER the Trilogy test (June 23). Pre-June-23 work (Nimblize report + Trilogy prep) is handled separately.

---

## What Both Plans Agree On (The Non-Negotiables)

Both my plan and Claude's plan converge on these truths:

1. **Java + Backend + DB = your ONE path** (not two competing paths)
2. **TransitPulse is THE project** - finish it before starting anything new
3. **MongoDB for TransitPulse** (schemaless, beginner-friendly, no SQL needed to start)
4. **Daily DSA is non-negotiable** - Zift challenge + LeetCode streak
5. **Push to GitHub daily** - even imperfect code with comments
6. **Don't spread across 8 things** - serialize tasks by deadline
7. **One deployed live project > five half-finished ones**
8. **SQL/relational DBMS is still needed** for AKTU 5th sem - but AFTER TransitPulse

---

## Where Plans Differed (And What I Picked)

| Topic | My Plan | Claude's Plan | Final Decision |
|-------|---------|---------------|----------------|
| Database for TransitPulse | PostgreSQL/MySQL | MongoDB + Mongoose | **MongoDB** - faster to start, matches TransitPulse needs (real-time bus locations, TTL for stale data) |
| Deployment platform | AWS Free Tier | Render | **Render** first (simpler), then try AWS later as cloud learning |
| DBMS learning | Full SQL + relational DB theory | MongoDB only | **MongoDB first** (for TransitPulse), then SQL basics (for AKTU) in Phase C |
| Spring Boot timing | Phase 2 (June 23 onwards) | After July 10 | **After July 10** - agree with Claude, finish DB first |
| DSA scope | Full topic coverage | Focus on Topics 1+2, light on 3+4 | **Continue all 4 topics** but prioritize Easy+Medium |
| DAA prep | 2 full weeks | Minimal | **1 week light intro** - full prep during semester |
| C++ for DAA | Start in Phase 3 | Minimum viable | **Minimum viable** - just syntax differences from C, learn during semester |

---

## The 3 Phases

| Phase | Dates | Days | Primary Focus | Secondary |
|-------|-------|------|---------------|-----------|
| A | June 24 - July 6 | 13 | MongoDB + TransitPulse DB | Java (GFG) + DSA |
| B | July 7 - 13 | 7 | TransitPulse DB completion + Spring Boot start | DSA + Nimblize (if Phase 3 tasks come) |
| C | July 14 - 20 | 7 | Spring Boot + Deploy to Render + DAA intro | SQL basics (AKTU prep) + portfolio |

---

## PHASE A: MongoDB + TransitPulse DB (June 24 - July 6)

### What You'll Learn
- What is MongoDB, documents, collections (not tables/rows)
- MongoDB Atlas (free cloud hosting)
- Mongoose (MongoDB library for Node.js - schema definition)
- The 4 TransitPulse collections: Users, Routes, Buses, LiveLocations

### TransitPulse Database Schema (The 4 Collections)

```
USERS
  - _id
  - name
  - email
  - password (hashed)
  - role: "admin" | "driver" | "passenger"
  - createdAt

ROUTES
  - _id
  - routeName: "Route 12A"
  - stops: [{name, lat, lng, order}]
  - isActive: true/false

BUSES
  - _id
  - busNumber: "UP32-1234"
  - routeId (references Routes)
  - driverId (references Users)
  - capacity: 40
  - status: "active" | "inactive"

LIVE_LOCATIONS
  - _id
  - busId (references Buses)
  - lat, lng
  - speed
  - timestamp
  - TTL index: auto-delete after 5 minutes (stale data cleanup)
```

### Week 3: June 24-29

| Day | Morning (2 hrs) | Afternoon (1.5 hrs) | Evening (1 hr) |
|-----|-----------------|---------------------|-----------------|
| **Tue 24** | Trilogy session + review test results | MongoDB 101: What are documents, collections, BSON. Watch a 30-min intro video | Zift daily + LC #383 Ransom Note (Hashing) |
| **Wed 25** | Set up MongoDB Atlas (free tier) + install Mongoose + connect | Java GFG: OOP - Classes, Objects, Inheritance | Zift daily + LC #349 Intersection of Two Arrays |
| **Thu 26** | Write User.js Mongoose schema + test creating a user | Java GFG: Polymorphism, Abstraction, Interfaces | Zift daily + LC #347 Top K Frequent Elements |
| **Fri 27** | Write Route.js schema with embedded stops array | Java GFG: Collections - ArrayList, HashMap | Zift daily + LC #128 Longest Consecutive Sequence |
| **Sat 28** | Write Bus.js schema with references to Route and User | Java GFG: Collections - HashSet, LinkedList, Stack | Zift daily + LC #560 Subarray Sum Equals K |
| **Sun 29** | REST DAY | Light review of schemas written so far | - |

### Week 4: June 30 - July 6

| Day | Morning (2 hrs) | Afternoon (1.5 hrs) | Evening (1 hr) |
|-----|-----------------|---------------------|-----------------|
| **Mon 30** | Write LiveLocation.js schema with TTL index (auto-delete) | Java GFG: Exception Handling + Strings | Zift daily + LC #238 Product of Array Except Self |
| **Tue 1** | Trilogy session | Write db.js connection file + test connection to Atlas | Zift daily + LC #48 Rotate Image |
| **Wed 2** | Seed dummy data: 1 route (3 stops), 2 buses, 3 users (admin/driver/passenger) | Java GFG: Multithreading basics | Zift daily + LC #50 Pow(x, n) |
| **Thu 3** | Verify seed data in Atlas UI + test queries (find all buses on a route) | Java GFG: File I/O | Zift daily + LC #73 Set Matrix Zeroes |
| **Fri 4** | Add indexes: email unique on Users, TTL on LiveLocations, routeId on Buses | Nimblize tasks (if any new assignment) | Zift daily + LC #189 Rotate Array |
| **Sat 5** | Test everything end-to-end: create user -> create route -> assign bus -> send location -> verify TTL deletes | Push all TransitPulse DB code to GitHub with proper README | Zift daily + LC #371 Sum of Two Integers (Bits) |
| **Sun 6** | REST DAY | Review + catch up on anything incomplete | - |

### Phase A Checklist
- [ ] MongoDB Atlas account set up
- [ ] 4 Mongoose schemas written (User, Route, Bus, LiveLocation)
- [ ] db.js connection file working
- [ ] Seed data inserted and visible in Atlas
- [ ] TTL index working (stale locations auto-deleted)
- [ ] Java: OOP, Collections, Strings, Exception Handling covered
- [ ] 12 LeetCode problems solved
- [ ] Daily Zift challenges done + pushed to GitHub

---

## PHASE B: DB Completion + Spring Boot (July 7-13)

### What You'll Do
- Finalize TransitPulse DB (any remaining work)
- **Start Spring Boot** (Telusko YouTube playlist)
- Build your first REST API
- Continue DSA

### Week 5: July 7-13

| Day | Morning (2 hrs) | Afternoon (1.5 hrs) | Evening (1 hr) |
|-----|-----------------|---------------------|-----------------|
| **Mon 7** | TransitPulse DB: Final testing + write README documentation | Spring Boot: What is Spring Boot + project setup (Telusko) | Zift daily + LC #200 Number of Islands |
| **Tue 8** | Trilogy session | Spring Boot: Your first REST controller + GET endpoint | Zift daily + LC #70 Climbing Stairs |
| **Wed 9** | Spring Boot: POST/PUT/DELETE endpoints + request body | Spring Boot: Connect to a database (H2 or MongoDB) | Zift daily + LC #198 House Robber |
| **Thu 10** | **TransitPulse DB: SUBMIT** (deadline). Final verification in Atlas. | Spring Boot: JPA/Mongoose integration + CRUD operations | Zift daily + LC #322 Coin Change |
| **Fri 11** | Spring Boot: Service layer + proper project structure | Spring Boot: Build a mini "Product API" (CRUD) | Zift daily + LC #55 Jump Game |
| **Sat 12** | Spring Boot: Error handling + validation | Push Spring Boot project to GitHub | Zift daily + LC #62 Unique Paths |
| **Sun 13** | REST DAY | Review Spring Boot concepts | - |

### Phase B Checklist
- [ ] TransitPulse DB submitted by July 10
- [ ] Spring Boot: Can create REST APIs with CRUD operations
- [ ] Spring Boot mini project on GitHub
- [ ] 6 LeetCode problems solved
- [ ] Daily Zift challenges maintained

---

## PHASE C: Deploy + DAA + Portfolio (July 14-20)

### What You'll Do
- Deploy TransitPulse (or Spring Boot project) to **Render** (free)
- Learn SQL basics for AKTU 5th sem DBMS subject
- Light DAA intro (Abdul Bari - just Unit I: asymptotic notations + sorting)
- Clean up GitHub portfolio for semester

### Week 6: July 14-20

| Day | Morning (2 hrs) | Afternoon (1.5 hrs) | Evening (1 hr) |
|-----|-----------------|---------------------|-----------------|
| **Mon 14** | Deploy to Render: sign up + connect GitHub repo + deploy | SQL basics: CREATE TABLE, INSERT, SELECT (W3Schools) | Zift daily + LC #104 Max Depth Binary Tree |
| **Tue 15** | Trilogy session | SQL: WHERE, ORDER BY, JOINs | Zift daily + LC #1143 Longest Common Subsequence |
| **Wed 16** | Fix deployment issues + verify live URL works | DAA: Asymptotic Notations - Big-O, Omega, Theta (Abdul Bari) | Zift daily + LC #15 3Sum |
| **Thu 17** | DAA: Recurrence Relations + Master Theorem (Abdul Bari) | SQL: GROUP BY, Aggregate functions | Zift daily + LC #33 Search Rotated Sorted Array |
| **Fri 18** | DAA: Sorting algorithms overview - Merge Sort, Quick Sort theory | Portfolio: Update GitHub profile README | Zift daily + LC #78 Subsets |
| **Sat 19** | Portfolio: Add project screenshots, clean up repos, write descriptions | Revision: Java concepts + MongoDB + Spring Boot | Zift daily + LC #46 Permutations |
| **Sun 20** | BUFFER DAY - catch up on anything incomplete | Prepare for semester start | - |

### Phase C Checklist
- [ ] One project deployed live on Render with working URL
- [ ] SQL basics covered (enough for AKTU DBMS start)
- [ ] DAA Unit I introduced (asymptotic notations + sorting theory)
- [ ] GitHub portfolio polished with README + project descriptions
- [ ] 6 LeetCode problems solved
- [ ] Ready for 5th semester

---

## Full LeetCode Tracker (Post June 23): 24 Problems

### Phase A: Hashing, Arrays, Math, Bits (12 problems)

| # | LC ID | Problem | Difficulty | Topic |
|---|-------|---------|------------|-------|
| 1 | #383 | Ransom Note | Easy | Hashing |
| 2 | #349 | Intersection of Two Arrays | Easy | Hashing |
| 3 | #347 | Top K Frequent Elements | Medium | Hashing |
| 4 | #128 | Longest Consecutive Sequence | Medium | Hashing |
| 5 | #560 | Subarray Sum Equals K | Medium | Hashing/Prefix Sum |
| 6 | #238 | Product of Array Except Self | Medium | Adhoc |
| 7 | #48 | Rotate Image | Medium | Adhoc/Matrix |
| 8 | #50 | Pow(x, n) | Medium | Maths |
| 9 | #73 | Set Matrix Zeroes | Medium | Adhoc/Matrix |
| 10 | #189 | Rotate Array | Medium | Adhoc |
| 11 | #371 | Sum of Two Integers | Medium | Bits |

### Phase B: Graphs, DP, Greedy (6 problems)

| # | LC ID | Problem | Difficulty | Topic |
|---|-------|---------|------------|-------|
| 12 | #200 | Number of Islands | Medium | Graphs |
| 13 | #70 | Climbing Stairs | Easy | DP |
| 14 | #198 | House Robber | Medium | DP |
| 15 | #322 | Coin Change | Medium | DP |
| 16 | #55 | Jump Game | Medium | Greedy |
| 17 | #62 | Unique Paths | Medium | DP |

### Phase C: Mixed + Placement Staples (6 problems)

| # | LC ID | Problem | Difficulty | Topic |
|---|-------|---------|------------|-------|
| 18 | #104 | Max Depth Binary Tree | Easy | Trees |
| 19 | #1143 | Longest Common Subsequence | Medium | DP |
| 20 | #15 | 3Sum | Medium | Two Pointer |
| 21 | #33 | Search Rotated Sorted Array | Medium | Binary Search |
| 22 | #78 | Subsets | Medium | Backtracking |
| 23 | #46 | Permutations | Medium | Backtracking |

---

## Daily Routine (Final)

**Good Day (4-5 hrs):**
- Morning (2 hrs): Primary task (MongoDB/Spring Boot/DAA)
- Afternoon (1.5 hrs): Secondary task (Java GFG/SQL/Nimblize)
- Evening (1 hr): Zift daily challenge + 1 LeetCode + push to GitHub

**Busy Day / Low Energy (1-1.5 hrs):**
- Evening only: Zift challenge + push to GitHub
- Never zero. Even 30 minutes counts.

**Tuesday (Trilogy Day):**
- Trilogy session
- Evening: Zift + LeetCode + review what Trilogy covered

**Sunday:**
- Rest. Light review at most.

---

## Rules (Final)

1. **TransitPulse DB first. No new projects until July 10.**
2. **MongoDB for TransitPulse, SQL for AKTU** - learn both, but MongoDB first.
3. **Java is your primary language.** C++ is DAA-lab-only (minimal, during semester).
4. **Push to GitHub daily.** Imperfect code with a comment > no code.
5. **Zift daily challenge = your non-negotiable minimum.** Even on bad days.
6. **Deploy ONE thing to Render by July 20.** That live URL is your placement weapon.
7. **Don't panic about Jan 2027.** You have 7 months. This plan covers 1 month. The remaining 6 months (5th semester) will deepen everything.

---

## What You'll Have By July 20

| What | Proof |
|------|-------|
| MongoDB skills | TransitPulse DB (4 collections, indexes, TTL, seed data) |
| Java proficiency | GFG topics covered + 24 LeetCode in Java |
| Spring Boot basics | Mini REST API project on GitHub |
| DSA foundation | Zift daily + LeetCode profile + Trilogy training |
| SQL basics | Enough for AKTU DBMS semester start |
| DAA awareness | Unit I intro (asymptotic notations, sorting theory) |
| Live deployed project | TransitPulse or Spring Boot app on Render |
| GitHub portfolio | Daily commits, clean repos, project READMEs |
| Nimblize credibility | 2 professional reports submitted |
| Cloud understanding | Nimblize cloud report + Render deployment experience |

> **That is a strong foundation for a 3rd-year student heading into placement season.**

---

## Quick Links

| Resource | Link |
|----------|------|
| GFG Java | geeksforgeeks.org/java |
| MongoDB Docs | docs.mongodb.com/manual |
| MongoDB Atlas | mongodb.com/cloud/atlas (free tier) |
| Mongoose Docs | mongoosejs.com/docs |
| Telusko Spring Boot | YouTube @Telusko - Spring Boot playlist |
| Abdul Bari Algorithms | YouTube - Abdul Bari Algorithms playlist |
| LeetCode | leetcode.com |
| W3Schools SQL | w3schools.com/sql |
| Render (deploy) | render.com |
| Draw.io (diagrams) | app.diagrams.net |
