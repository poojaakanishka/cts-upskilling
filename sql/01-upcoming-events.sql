/*
1. User Upcoming Events
Show a list of all upcoming events a user is registered for in their city, sorted by date.
*/

SELECT
    e.event_id,
    e.event_name,
    e.city,
    e.event_date
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE u.user_id = 1
  AND e.city = u.city
  AND e.event_date >= CURRENT_DATE
ORDER BY e.event_date ASC;