SELECT
    S.user_id,
    COALESCE(
        ROUND(
            SUM(CASE WHEN C.action = 'confirmed' THEN 1.0 ELSE 0 END)
            /
            COUNT(C.action),
            2
        ),
        0.00
    ) AS confirmation_rate
FROM
    Signups S
LEFT JOIN
    Confirmations C
ON
    S.user_id = C.user_id
GROUP BY
    S.user_id;
