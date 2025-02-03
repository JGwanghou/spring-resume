create table career (id bigint not null auto_increment, user_id bigint, company_name varchar(255), dept_name varchar(255), description longtext, end_date date, grade varchar(255), job_category varchar(255), start_date date, primary key (id)) engine=InnoDB;
create table education (id bigint not null auto_increment, degree varchar(255), department_name varchar(255), end_date date, gpa varchar(255), school_name varchar(255), start_date date, user_id bigint, primary key (id)) engine=InnoDB;
create table user (id bigint not null auto_increment, address varchar(255), email varchar(255), name varchar(255), phone varchar(255), profile_image LONGTEXT, text varchar(255), birth date, primary key (id)) engine=InnoDB;
create table activity (id bigint not null auto_increment, active_name varchar(255), end_date date, start_date date, user_id bigint, primary key (id)) engine=InnoDB;
create table project (id bigint not null auto_increment, end_date date, project_name varchar(255), start_date date, user_id bigint, primary key (id)) engine=InnoDB;

INSERT INTO user (`id`, `address`, `email`, `name`, `phone`, `birth`) VALUE (1, '서울시 관악구', 'jgh0609@naver.com', '조광호', '010-4503-1335', '1999-06-19');

INSERT INTO career (`user_id`,`company_name`, `dept_name`, `description`, `start_date`, `grade`, `job_category`, `end_date`)
VALUE (1, '큐패스코리아', '개발기획팀', 'Java와 Spring을 사용하여 백엔드 시스템을 개발했습니다.', '2023-07-04', '사원/매니저', '웹개발', '2024-08-19');

INSERT INTO `education` (`school_name`, `degree`, `department_name`, `start_date`, `end_date`, `gpa`, `user_id`)
VALUES
    ('한국승강기대학교', '전문학사', '승강기공학부', '2018-03-05', '2022-02-01', '3.9/4.5', 1),
    ('진해중앙고등학교','졸업', '인문계', '2015-03-02', '2018-02-01', '', 1);

INSERT INTO `project` (`user_id`,`project_name`, `start_date`, `end_date`)
VALUES
    (1, 'Spring: Photostaram(SNS) 팀 프로젝트', '2023-02-05', '2023-04-01'),
    (1, 'Spring: 한국민속촌 사내 프로젝트', '2023-07-05', '2024-01-01'),
    (1, 'Spring: 풋살 소셜매치 사내 프로젝트', '2024-02-05', '2024-08-01');

INSERT INTO `activity` (`user_id`,`active_name`, `start_date`, `end_date`)
VALUES
    (1, '그린컴퓨터아카데미', '2022-08-05', '2023-04-01'),
    (1, '항해플러스 백엔드 직무심화과정', '2024-10-05', '2024-12-01');

