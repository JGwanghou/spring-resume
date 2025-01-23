create table career (id bigint not null auto_increment, user_id bigint, company_name varchar(255), dept_name varchar(255), description longtext, end_date date, grade varchar(255), job_category varchar(255), start_date date, primary key (id)) engine=InnoDB;
create table education (id bigint not null auto_increment, degree varchar(255), department_name varchar(255), end_date date, gpa varchar(255), school_name varchar(255), start_date date, user_id bigint, primary key (id)) engine=InnoDB;
create table user (id bigint not null auto_increment, address varchar(255), email varchar(255), name varchar(255), phone varchar(255), primary key (id)) engine=InnoDB;

INSERT INTO user (`id`, `address`, `email`, `name`, `phone`) VALUE (1, '서울시 관악구', 'jgh0609@naver.com', '조광호', '010-4503-1335');

INSERT INTO career (`user_id`,`company_name`, `dept_name`, `description`, `end_date`, `grade`, `job_category`, `start_date`)
VALUE (1, '큐패스코리아', '개발기획팀', 'Java와 Spring을 사용하여 백엔드 시스템을 개발했습니다.', '2023-07-04', '사원/매니저', '웹개발', '2024-08-19');

INSERT INTO `education` (`school_name`, `degree`, `department_name`, `start_date`, `end_date`, `gpa`, `user_id`)
VALUES
    ('한국승강기대학교', '전문학사', '승강기공학부', '2018-03-05', '2022-02-01', '3.9/4.5', 1),
    ('진해중앙고등학교','졸업', '인문계', '2015-03-02', '2018-02-01', '', 1);

