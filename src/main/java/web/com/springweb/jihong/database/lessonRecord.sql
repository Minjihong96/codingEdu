DROP TABLE class_record;

SELECT * FROM JOIN_MEMBERSHIP;

SELECT MEM_PRID, MEM_NAME FROM JOIN_MEMBERSHIP WHERE ACCOUNT_TYPE='student';



-- 학생 이름을 통해 학생 ID 가져오기 위한 JOIN
SELECT C.MEM_PRID 
FROM class_record.C, JOIN_MEMBERSHIP.J
WHERE J.MEM_PRID = C.MEM_PRID;

CREATE TABLE class_record (
    RECORD_ID       NUMBER PRIMARY KEY,             -- 기록아이디 (기본키)
    MEM_PRID        NUMBER(8,0) NOT NULL,    -- 회원아이디 (학생 ID, 외래키 가능)
    CLASS_DATE      DATE NOT NULL,                  -- 수업날짜
    CLASS_CONTENTS   VARCHAR2(100) NOT NULL,         -- 수업내용
    SUBJECT         VARCHAR2(100),                  -- 과제
    SESSION_NUMBER  NUMBER NOT NULL,                -- 잔여수업회차
    PAYMENT         NUMBER,                         -- 결제
    ETC             VARCHAR2(100)                   -- 기타
);

ALTER TABLE class_record
ADD CONSTRAINT fk_mem_prid 
    FOREIGN KEY (MEM_PRID)          -- 외래키 설정
    REFERENCES JOIN_MEMBERSHIP(MEM_PRID);    -- 참조할 부모 테이블과 컬럼
    
COMMIT;
SELECT * FROM class_record;

CREATE SEQUENCE CRID_SEQ
     START WITH 1;

-- 시퀀스 INSERT
INSERT INTO class_record(record_id, MEM_PRID, class_date, class_contents, subject,
    SESSION_NUMBER, payment, etc) VALUES(CRID_SEQ.NEXTVAL, 11, TO_DATE('2025-06-21', 'YYYY-MM-DD'), '파이썬 for 반복문 34쪽 완료', '35쪽 1번 문제',
    5, NULL, NULL);

SELECT * FROM Class_Record;

-- 예시 1

INSERT INTO class_record (
    record_id, MEM_PRID, class_date, class_contents, subject,
    SESSION_NUMBER, payment, etc
) VALUES (
    1, 1001, TO_DATE('2025-06-01', 'YYYY-MM-DD'), '문법 복습 및 작문 연습', '작문 과제 제출',
    5, 50000, '온라인 수업'
);

SELECT * FROM class_record WHERE MEM_PRID = 1001;

-- 수업 기록 삭제
DELETE FROM class_record WHERE RECORD_ID=1

-- 수업 기록 수정
UPDATE class_record SET 
