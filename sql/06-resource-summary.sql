/*
6. Event Resource Summary
Generate a report showing the number of resources (PDFs, images, links) uploaded for each
event.
*/
SELECT
    event_id,
    SUM(CASE WHEN resource_type = 'PDF' THEN 1 ELSE 0 END) AS pdf_count,
    SUM(CASE WHEN resource_type = 'Image' THEN 1 ELSE 0 END) AS image_count,
    SUM(CASE WHEN resource_type = 'Link' THEN 1 ELSE 0 END) AS link_count,
    COUNT(resource_id) AS total_resources
FROM Resources
GROUP BY event_id;