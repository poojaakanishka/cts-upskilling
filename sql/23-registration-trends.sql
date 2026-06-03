/*
23. Registration Trends
Show a month-wise registration count trend over the past 12 months.
*/


SELECT
    YEAR(registration_date) AS year,
    MONTH(registration_date) AS month,
    COUNT(registration_id) AS registration_count
FROM Registrations
WHERE registration_date >= CURRENT_DATE - INTERVAL 12 MONTH
GROUP BY
    YEAR(registration_date),
    MONTH(registration_date)
ORDER BY
    year,
    month;