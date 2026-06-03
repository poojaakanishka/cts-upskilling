/*
12. Event with Maximum Sessions
List the event(s) with the highest number of sessions.
*/

SELECT
    e.event_id,
    e.event_name,
    COUNT(s.session_id) AS total_sessions
FROM Events e
JOIN Sessions s
    ON e.event_id = s.event_id
GROUP BY
    e.event_id,
    e.event_name
HAVING COUNT(s.session_id) = (
    SELECT MAX(session_count)
    FROM (
        SELECT COUNT(session_id) AS session_count
        FROM Sessions
        GROUP BY event_id
    ) AS session_summary
);