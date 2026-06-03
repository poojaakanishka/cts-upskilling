/*
17. Multi-Session Speakers
Identify speakers who are handling more than one session across all events.
*/


SELECT
    speaker_id,
    speaker_name,
    COUNT(session_id) AS total_sessions
FROM Sessions
GROUP BY
    speaker_id,
    speaker_name
HAVING COUNT(session_id) > 1
ORDER BY total_sessions DESC;