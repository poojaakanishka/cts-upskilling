/*
9. Organizer Event Summary
For each event organizer, show the number of events created and their current status
(upcoming, completed, cancelled).
*/

SELECT
    organizer_id,
    status,
    COUNT(event_id) AS total_events
FROM Events
GROUP BY organizer_id, status
ORDER BY organizer_id, status;