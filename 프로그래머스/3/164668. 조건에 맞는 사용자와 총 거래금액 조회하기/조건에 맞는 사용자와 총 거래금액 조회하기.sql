-- 코드를 입력하세요
SELECT user_id, nickname,sum(price) as total_sales
from used_goods_board b
left join used_goods_user u on b.writer_id = u.user_id
where status in ('done')
group by writer_id
having sum(price) >= 700000
order by total_sales