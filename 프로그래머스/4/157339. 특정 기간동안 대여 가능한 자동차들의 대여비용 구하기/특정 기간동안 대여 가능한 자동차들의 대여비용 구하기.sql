-- 코드를 입력하세요
select *
from (
    select cc.car_id, cc.car_type,round((daily_fee)*30*(100-discount_rate)*0.01) as fee
    from car_rental_company_car cc
    join car_rental_company_discount_plan dp on cc.car_type = dp.car_type and duration_type like '%30일 이상%'
    where cc.car_type in ('세단','suv')
    and car_id not in 
    (
    select car_id 
    from car_rental_company_rental_history 
    WHERE END_DATE >= '2022-11-01' AND START_DATE < '2022-11-30'
    )
) t1
WHERE (FEE >=500000 AND FEE<2000000) 
ORDER BY FEE DESC , CAR_TYPE , CAR_ID DESC