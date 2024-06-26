### User

- **Depends on:** Subscription, Website (Ce = 2)
- **Used by:** Subscription (Ca = 0 initially, but will be incremented below)

### Website

- **Depends on:** None (Ce = 0)
- **Used by:** User, Subscription (Ca = 2)

### Subscription

- **Depends on:** User, Website, Notification, UpdateChecker (Ce = 4)
- **Used by:** User, Notification (Ca = 1 initially, but will be incremented below)

### Notification

- **Depends on:** Subscription (Ce = 1)
- **Used by:** Subscription (Ca = 0 initially, but will be incremented below)

### UpdateChecker

- **Depends on:** None (Ce = 0)
- **Used by:** Subscription (Ca = 1)






| Class          | Efferent Coupling (Ce) | Afferent Coupling (Ca) | Instability (I) |
|----------------|------------------------|------------------------|-----------------|
| User           | 2                      | 0                      | 1.0             |
| Website        | 0                      | 2                      | 0.0             |
| Subscription   | 4                      | 1                      | 0.8             |
| Notification   | 1                      | 1                      | 0.5             |
| UpdateChecker  | 0                      | 1                      | 0.0             |
