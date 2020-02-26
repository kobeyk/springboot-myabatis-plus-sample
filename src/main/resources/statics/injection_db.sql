DROP TABLE IF EXISTS "public"."t_user";
CREATE TABLE "public"."t_user" (
  "id" int8 NOT NULL,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "password" varchar(255) COLLATE "pg_catalog"."default",
  "create_time" date
);

INSERT INTO "public"."t_user" VALUES (111, 'appelyk', '11111', NULL);
INSERT INTO "public"."t_user" VALUES (1232679405023793154, 'appelyk', '123456a', NULL);
INSERT INTO "public"."t_user" VALUES (1232680020835762177, 'appelyk', '123456a', NULL);
INSERT INTO "public"."t_user" VALUES (1232680432896749569, 'appelyk', '123456a', '2020-02-26');
INSERT INTO "public"."t_user" VALUES (1232680817808056322, 'appelyk', '123456a', '2020-02-26');
INSERT INTO "public"."t_user" VALUES (1232681928061243393, 'appelyk', '123456a', '2020-02-26');
INSERT INTO "public"."t_user" VALUES (1232684931182948354, 'kobe', '123456a', '2020-02-26');
INSERT INTO "public"."t_user" VALUES (1232687920962592770, 'kobe', '123456a', '2020-02-26');


DROP TABLE IF EXISTS "public"."t_user_info";
CREATE TABLE "public"."t_user_info" (
  "id" int8 NOT NULL,
  "uid" int8,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "gender" int2,
  "age" int2,
  "address" varchar(255) COLLATE "pg_catalog"."default"
);

ALTER TABLE "public"."t_user" ADD CONSTRAINT "t_user_pkey" PRIMARY KEY ("id");
ALTER TABLE "public"."t_user_info" ADD CONSTRAINT "t_user_info_pkey" PRIMARY KEY ("id");