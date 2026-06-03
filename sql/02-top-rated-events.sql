/*
2. Top Rated Events
Identify events with the highest average rating, considering only those that have received at
least 10 feedback submissions.
*/

SELECT
    e.event_id,
    e.event_name,
    AVG(f.rating) AS average_rating,
    COUNT(f.rating) AS total_feedbacks
FROM Events e
JOIN Feedback f
    ON e.event_id = f.event_id
GROUP BY e.event_id, e.event_name
HAVING COUNT(f.rating) >= 10
ORDER BY average_rating DESC;