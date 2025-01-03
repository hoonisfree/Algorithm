-- 코드를 입력하세요
SELECT ao.animal_id, ao.animal_type, ao.name
from animal_outs ao
left join animal_ins ai on ao.animal_id = ai.animal_id
where ai.sex_upon_intake like '%intact%' and (AO.SEX_UPON_OUTCOME LIKE "Spayed%" OR AO.SEX_UPON_OUTCOME LIKE "Neutered%")