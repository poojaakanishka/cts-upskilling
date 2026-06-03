/*
4. Peak Session Hours
Count how many sessions are scheduled between 10 AM to 12 PM for each event.
*/


SELECT
    event_id,
    COUNT(session_id) AS session_count
FROM Sessions
WHERE session_time BETWEEN '10:00:00' AND '12:00:00'
GROUP BY event_id;