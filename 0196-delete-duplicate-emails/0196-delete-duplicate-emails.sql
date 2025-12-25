delete s1 from Person s1 join Person s2
on s1.email = s2.email and s1.id > s2.id;