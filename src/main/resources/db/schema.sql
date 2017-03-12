CREATE TABLE sys_group (
  group_id varchar(10) NOT NULL DEFAULT '' COMMENT '用户组编码',
  group_name varchar(50) DEFAULT NULL COMMENT '用户组名称',
  in_use char(1) DEFAULT '1' COMMENT '是否使用',
  PRIMARY KEY (`group_id`)
);


INSERT INTO sys_group VALUES ('admin', '管理员', '1');
INSERT INTO sys_group VALUES ('user1', '用户组1', '1');
INSERT INTO sys_group VALUES ('user2', '用户组2', '1');
INSERT INTO sys_group VALUES ('user3', '用户组3', '1');
INSERT INTO sys_group VALUES ('user4', '用户组4', '1');
INSERT INTO sys_group VALUES ('user5', '用户组5', '1');

CREATE TABLE sys_user (
  userid varchar(30) NOT NULL COMMENT '用户ID',
  username varchar(30) NOT NULL DEFAULT '' COMMENT '姓名',
  nickname varchar(50) NOT NULL DEFAULT '' COMMENT '昵称',
  password varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
  email varchar(50) NOT NULL DEFAULT '' COMMENT '邮箱',
  groupin varchar(50) NOT NULL DEFAULT '' COMMENT '分组',
  mobile varchar(20) NOT NULL DEFAULT '' COMMENT '手机号',
  qq varchar(20) NOT NULL DEFAULT '' COMMENT 'QQ号',
  photo varchar(100) NOT NULL DEFAULT '' COMMENT '头像',
  motto varchar(500) NOT NULL DEFAULT '' COMMENT '备注',
  logincount mediumint(8) unsigned NOT NULL DEFAULT '0' COMMENT '登录次数',
  lastip varchar(15) NOT NULL DEFAULT '0.0.0.0' COMMENT '最后登录ip',
  lastlogin datetime DEFAULT NULL COMMENT '最后登录时间',
  active tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否激活{0:未激活,1:已激活}',
  admin char(1) DEFAULT '0' COMMENT '管理员',
  PRIMARY KEY (`userid`)
);

INSERT INTO sys_user VALUES ('admin', '管理员', '管理员', '616ed9e93a693b6eca2286238d2b4f5d', '', 'admin', '18611111111', '155098761', '', '', '0', '0.0.0.0', null, '0', '0');

CREATE TABLE sys_third_app (
  app_id varchar(20) NOT NULL DEFAULT '' COMMENT '应用编码',
  secret_id varchar(30) DEFAULT NULL COMMENT '密钥',
  PRIMARY KEY (`app_id`)
);


INSERT INTO sys_third_app VALUES ('2204', 'q55@6u');

CREATE TABLE data_for_test (
  USER_ID varchar(50) CHARACTER SET utf8 NOT NULL,
  USER_NAME varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  COM_NAME varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  DPT_NAME varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  CREATE_TIME varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
);

CREATE TABLE
    test_data
    (
        ID VARCHAR(20) NOT NULL,
        NUM1 VARCHAR(20),
        NUM2 VARCHAR(20),
        NUM3 VARCHAR(20),
        NUM4 VARCHAR(20),
        NUM5 VARCHAR(20),
        NUM6 VARCHAR(20),
        NUM7 VARCHAR(20),
        NUM8 VARCHAR(20),
        NUM9 VARCHAR(20),
        NUM10 VARCHAR(20),
        PRIMARY KEY (ID)
    );

INSERT INTO data_for_test VALUES ('00000001', '肖建国', '济南市烟草专卖局(公司)', '济南市营销中心', '20130316 17:10:42');
INSERT INTO data_for_test VALUES ('00000111', 'khjl', '山东省烟草专卖局(公司)', '计划处', '20130425 14:47:44');
INSERT INTO data_for_test VALUES ('00001', 'testAAA', '山东省烟草专卖局(公司)', '计划处', '20130221 13:18:47');
INSERT INTO data_for_test VALUES ('0002222', 'zhangzh', '济南市烟草专卖局(公司)', '历下区送货部', '20130321 13:56:25');
INSERT INTO data_for_test VALUES ('003D02', '小刀', '济南市烟草专卖局(公司)', '高新区送货部', '20140715 15:17:40');
INSERT INTO data_for_test VALUES ('003D03', '小刀测试', '济南市烟草专卖局(公司)', '高新区送货部', '20140715 15:31:07');
INSERT INTO data_for_test VALUES ('003D04', '小刀测试3', '济南市烟草专卖局(公司)', '高新区送货部', '20140715 15:34:50');
INSERT INTO data_for_test VALUES ('003D05', '牡丹江小刀', '济南市烟草专卖局(公司)', '高新区送货部', '20140715 15:41:54');
INSERT INTO data_for_test VALUES ('020000101', '测试PUB_STRU', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20140304 08:50:44');
INSERT INTO data_for_test VALUES ('100000100011', '客户经理', '济南市烟草专卖局(公司)', '济南市营销中心', '20130425 13:44:52');
INSERT INTO data_for_test VALUES ('10111980101', '张无忌', '济南市市中区烟草专卖局（公司）', '专卖科', '20140523 11:34:02');
INSERT INTO data_for_test VALUES ('103701010120102', 'wanger', '济南市烟草专卖局(公司)', '济南市采供部', '20140507 09:07:27');
INSERT INTO data_for_test VALUES ('1037010101203', '肖建国', '济南市烟草专卖局(公司)', '济南市营销中心', '20130813 09:08:06');
INSERT INTO data_for_test VALUES ('1037010101207', '李丽', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 14:25:29');
INSERT INTO data_for_test VALUES ('1037010101208', '张霞', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 15:07:13');
INSERT INTO data_for_test VALUES ('1037010101209', '董栋', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 15:08:47');
INSERT INTO data_for_test VALUES ('1037010120102', '特别丑', '济南市烟草专卖局(公司)', '济南市信息中心', '20130723 09:09:48');
INSERT INTO data_for_test VALUES ('1037010120103', '测试023', '济南市烟草专卖局(公司)', '济南市信息中心', '20130723 23:35:39');
INSERT INTO data_for_test VALUES ('10370101201103', '爱的发的', '山东省烟草专卖局(公司)', '计划处', '20140217 11:42:11');
INSERT INTO data_for_test VALUES ('10370101201105', '李四', '山东省烟草专卖局(公司)', '计划处', '20141204 00:19:01');
INSERT INTO data_for_test VALUES ('103701012011061', 'RIMADMINP', '山东省烟草专卖局(公司)', '计划处', '20150814 16:29:47');
INSERT INTO data_for_test VALUES ('10370101202902', '王洁', '山东省烟草专卖局(公司)', '内管处', '20151117 16:35:21');
INSERT INTO data_for_test VALUES ('1037010401010102', 'weijingjie', '泰安市烟草(专卖局)', '泰安物流中心', '20130726 10:17:13');
INSERT INTO data_for_test VALUES ('10370104010102', 'xiaozhou2', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130717 09:54:11');
INSERT INTO data_for_test VALUES ('103701040102', '小周3', '办公室（外事办公室）', '办公室（外事办公室）', '20130717 10:24:15');
INSERT INTO data_for_test VALUES ('103701040102122', '1213', '泰安市烟草(专卖局)', '泰安物流中心', '20131220 11:52:32');
INSERT INTO data_for_test VALUES ('1037010401021232', 'test4545', '办公室（外事办公室）', '办公室（外事办公室）', '20131221 15:52:46');
INSERT INTO data_for_test VALUES ('1037010401021233', 'test545', '办公室（外事办公室）', '办公室（外事办公室）', '20131221 16:02:42');
INSERT INTO data_for_test VALUES ('10370104010212341', '程辉', '办公室（外事办公室）', '办公室（外事办公室）', '20131221 16:04:36');
INSERT INTO data_for_test VALUES ('103701040102123421', '程辉1', '市局专卖科', '市局专卖科', '20131221 16:08:05');
INSERT INTO data_for_test VALUES ('103701040102123422', 'test0001', '办公室（外事办公室）', '办公室（外事办公室）', '20131223 09:02:52');
INSERT INTO data_for_test VALUES ('1062090400000015', '甘肃酒泉客户经理', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130608 13:57:00');
INSERT INTO data_for_test VALUES ('1131111341', 'xiaoli', '济南历城区烟草专卖局（公司）', '稽查一队', '20130409 11:00:09');
INSERT INTO data_for_test VALUES ('115107020103', '大黄蜂', '济南历城区烟草专卖局（公司）', '专卖科', '20130626 15:13:01');
INSERT INTO data_for_test VALUES ('11520200010102', '外包测试', '济南市烟草专卖局(公司)', '外包单位', '20150123 17:23:22');
INSERT INTO data_for_test VALUES ('116209010102', '张三', '济南市烟草专卖局(公司)', '市局领导', '20140806 16:29:40');
INSERT INTO data_for_test VALUES ('123', '123', '重庆市万州区烟草专卖局', '万州营销部', '20150827 19:24:14');
INSERT INTO data_for_test VALUES ('20130306', '测小试1', '济南市烟草专卖局(公司)', '济南市信息中心', '20130306 23:55:26');
INSERT INTO data_for_test VALUES ('213', '123', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130515 09:58:15');
INSERT INTO data_for_test VALUES ('213000000101', '测试市管员', '泰安市烟草(专卖局)', '泰安物流中心', '20130813 13:25:20');
INSERT INTO data_for_test VALUES ('213000000201', '历下小王', '济南烟草历下区公司(专卖局)', '高新片区', '20150121 23:18:17');
INSERT INTO data_for_test VALUES ('216000000101', '郑斌', '市局专卖科', '市局专卖科', '20130723 14:21:09');
INSERT INTO data_for_test VALUES ('216000000103', 'zmmgr', '市局专卖科', '市局专卖科', '20130816 18:07:31');
INSERT INTO data_for_test VALUES ('2222222', '22222', '办公室（外事办公室）', '办公室（外事办公室）', '20130322 09:52:12');
INSERT INTO data_for_test VALUES ('23', '刘辉龙', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130322 09:51:48');
INSERT INTO data_for_test VALUES ('231001', '营销中心', '济南市烟草专卖局(公司)', '济南市营销中心', '20130204 15:56:26');
INSERT INTO data_for_test VALUES ('631300002050110', 'jl', '铜川市烟草专卖局(公司)', '送货部', '20151121 15:56:04');
INSERT INTO data_for_test VALUES ('666', '66', '济南市烟草专卖局(公司)', '济南市营销中心', '20150129 21:53:25');
INSERT INTO data_for_test VALUES ('7799001', '陈晓东', '济南市烟草专卖局(公司)', '济南市营销中心', '20130118 13:52:53');
INSERT INTO data_for_test VALUES ('800001', '物X流', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130130 10:29:00');
INSERT INTO data_for_test VALUES ('987653205', '程辉2', '市局专卖科', '市局专卖科', '20131221 16:09:21');
INSERT INTO data_for_test VALUES ('987653208', 'zhangfeng', '济南历城区烟草专卖局（公司）', '稽查一队', '20140706 11:48:00');
INSERT INTO data_for_test VALUES ('9876532223', '冬雨', '济南历城区烟草专卖局（公司）', '姚家片区', '20150615 10:56:14');
INSERT INTO data_for_test VALUES ('AA', 'aa', '济南市烟草专卖局(公司)', '济南市信息中心', '20130427 15:17:19');
INSERT INTO data_for_test VALUES ('AAA', 'aaa', '办公室（外事办公室）', '办公室（外事办公室）', '20130820 12:22:44');
INSERT INTO data_for_test VALUES ('ADMIN', '考试系统管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 14:27:38');
INSERT INTO data_for_test VALUES ('AJ01', '省局案件管理', '山东省烟草专卖局(公司)', '内管处', '20140416 17:27:15');
INSERT INTO data_for_test VALUES ('AJ02', '市局案件管理', '济南历城区烟草专卖局（公司）', '姚家片区', '20140416 17:29:03');
INSERT INTO data_for_test VALUES ('AJ03', '县局案件管理', '济南历城区烟草专卖局（公司）', '丁家片区', '20140416 17:30:55');
INSERT INTO data_for_test VALUES ('ANJIAN', '案件管理', '办公室（外事办公室）', '办公室（外事办公室）', '20130417 19:22:36');
INSERT INTO data_for_test VALUES ('BBB', 'bbb', '济南历城区烟草专卖局（公司）', '专卖科', '20130820 12:23:21');
INSERT INTO data_for_test VALUES ('BI', '王斌', '办公室（外事办公室）', '办公室（外事办公室）', '20130813 17:10:55');
INSERT INTO data_for_test VALUES ('BIADMIN', 'BI管理员', '山东省烟草专卖局(公司)', '内管处', '20130111 09:10:28');
INSERT INTO data_for_test VALUES ('BIMAN', 'biman', '办公室（外事办公室）', '办公室（外事办公室）', '20130813 17:17:35');
INSERT INTO data_for_test VALUES ('BIMGR', 'bi管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20130813 11:08:50');
INSERT INTO data_for_test VALUES ('BJTEST1', 'bjtest1', '办公室（外事办公室）', '办公室（外事办公室）', '20130831 19:04:47');
INSERT INTO data_for_test VALUES ('BJTEST2', 'bjtest2', '济南市烟草专卖局(公司)', '济南市采供部', '20130831 19:17:16');
INSERT INTO data_for_test VALUES ('BJYC', '北京烟草', '济南市烟草专卖局(公司)', '济南市信息中心', '20130821 16:29:27');
INSERT INTO data_for_test VALUES ('BNGKADMIN', '版纳管控用户', '济南市烟草专卖局(公司)', '济南市信息中心', '20151013 14:52:50');
INSERT INTO data_for_test VALUES ('BRANDMGR', '武X刚', '济南市烟草专卖局(公司)', '济南市采供部', '20130123 09:32:39');
INSERT INTO data_for_test VALUES ('CAIWU', '采收验收', '济南市烟草专卖局(公司)', '济南市营销中心', '20130316 17:34:27');
INSERT INTO data_for_test VALUES ('CALLMAN', '孟X波', '济南市烟草专卖局(公司)', '济南市营销中心', '20130122 14:51:55');
INSERT INTO data_for_test VALUES ('CALLMAN01', '王X东', '济南市烟草专卖局(公司)', '济南座席班组01', '20130122 12:03:35');
INSERT INTO data_for_test VALUES ('CALLMAN03', 'callman03', '济南市烟草专卖局(公司)', '济南市营销中心', '20130220 18:33:33');
INSERT INTO data_for_test VALUES ('CC', '仓储管理员', '济南市烟草专卖局(公司)', '仓储部', '20130201 14:37:48');
INSERT INTO data_for_test VALUES ('CC2', '仓储管理员2', '济南市烟草专卖局(公司)', '仓储部', '20130202 16:49:35');
INSERT INTO data_for_test VALUES ('CCC', 'ccc', '济南历城区烟草专卖局（公司）', '专卖科', '20130820 12:23:53');
INSERT INTO data_for_test VALUES ('CESHI', '测试', '市局专卖科', '市局专卖科', '20130819 09:32:54');
INSERT INTO data_for_test VALUES ('CHXD', '陈晓东', '济南市烟草专卖局(公司)', '济南市营销中心', '20130220 18:17:36');
INSERT INTO data_for_test VALUES ('CJQ', 'cjq', '宁波市烟草物流公司', '江东区仓储部', '20151111 10:57:58');
INSERT INTO data_for_test VALUES ('CMRADMIN', 'CMR系统管理员', '陕西省烟草专卖局(公司)', '信息处', '20150421 19:47:09');
INSERT INTO data_for_test VALUES ('CQFL1', '重庆涪陵用户1', '重庆烟草物流分公司', '涪陵城区送货部', '20130731 10:03:01');
INSERT INTO data_for_test VALUES ('CQFL2', '重庆涪陵用户', '重庆烟草物流分公司', '涪陵城区送货部', '20130926 11:10:06');
INSERT INTO data_for_test VALUES ('CQFL3', '涪陵测试用户3', '重庆烟草物流分公司', '涪陵城区送货部', '20131029 17:23:55');
INSERT INTO data_for_test VALUES ('CQJBADMIN', '江北二级管控管理员', '重庆烟草物流分公司', '仓储部', '20131024 09:46:59');
INSERT INTO data_for_test VALUES ('CQSADMIN', '重庆管理员', '重庆市烟草专卖局(公司)', '重庆营销中心', '20150701 16:19:34');
INSERT INTO data_for_test VALUES ('CQWL1', '物流公司用户', '重庆烟草物流分公司', '涪陵配送中心', '20130730 16:51:19');
INSERT INTO data_for_test VALUES ('CSC', 'csc', '济南市烟草专卖局(公司)', '济南座席班组01', '20130204 17:01:23');
INSERT INTO data_for_test VALUES ('CUSTMANAGER', '营销部客户管理员', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130130 09:23:46');
INSERT INTO data_for_test VALUES ('DHF', '大黄蜂', '济南历城区烟草专卖局（公司）', '专卖科', '20130627 11:31:13');
INSERT INTO data_for_test VALUES ('DHPTJNADMIN', '济南市公司系统管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20150106 17:01:13');
INSERT INTO data_for_test VALUES ('DHPTJNCG', '济南市公司品牌部采购员', '济南市烟草专卖局(公司)', '济南市品牌部', '20150106 15:49:42');
INSERT INTO data_for_test VALUES ('DHPTJNDZJS', '济南市公司电子结算员', '济南市烟草专卖局(公司)', '办公室', '20150106 15:52:54');
INSERT INTO data_for_test VALUES ('DHPTJNHYGL', '济南市公司货源管理员', '济南市烟草专卖局(公司)', '济南市采供部', '20150106 15:39:04');
INSERT INTO data_for_test VALUES ('DHPTJNLCKHJL', '济南历城客户经理', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20150106 16:20:46');
INSERT INTO data_for_test VALUES ('DHPTJNLCNQ', '济南历城营销部内勤', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20150106 16:18:15');
INSERT INTO data_for_test VALUES ('DHPTJNPHGL', '济南市公司配货管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20150106 16:14:12');
INSERT INTO data_for_test VALUES ('DHPTJNYXZXNQ', '济南市营销中心内勤', '济南市烟草专卖局(公司)', '济南市营销中心', '20150106 16:11:27');
INSERT INTO data_for_test VALUES ('DHPTJNZXBZ', '济南市公司座席班长', '济南市烟草专卖局(公司)', '济南座席班组01', '20150106 15:56:20');
INSERT INTO data_for_test VALUES ('DHPTJNZXY', '济南市公司座席员', '济南市烟草专卖局(公司)', '济南座席班组01', '20150106 15:58:35');
INSERT INTO data_for_test VALUES ('DHPTSDHYSH', '山东省公司货源审核', '山东省烟草专卖局(公司)', '销售处', '20150107 09:51:54');
INSERT INTO data_for_test VALUES ('DINGXIAO', '丁晓', '办公室（外事办公室）', '办公室（外事办公室）', '20130410 08:31:15');
INSERT INTO data_for_test VALUES ('DLADMIN', '指挥调度管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20140520 19:44:53');
INSERT INTO data_for_test VALUES ('DLCJY', '张岚', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20150911 11:43:48');
INSERT INTO data_for_test VALUES ('DLWL', '大连物流', '济南市烟草专卖局(公司)', '仓储部', '20131215 12:42:21');
INSERT INTO data_for_test VALUES ('DOCTEST', 'doctest', '山东省烟草专卖局(公司)', '计划处', '20130719 13:40:59');
INSERT INTO data_for_test VALUES ('DONGJIE', '大杰', '济南市烟草专卖局(公司)', '济南市采供部', '20130529 16:04:20');
INSERT INTO data_for_test VALUES ('DONGY', '冬雨', '济南历城区烟草专卖局（公司）', '稽查一队', '20150615 11:41:29');
INSERT INTO data_for_test VALUES ('EXAMER', '董栋', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 15:31:40');
INSERT INTO data_for_test VALUES ('EXAMER1', '张建', '济南市市中区烟草专卖局（公司）', '济南市市中区营销部', '20140618 16:18:34');
INSERT INTO data_for_test VALUES ('EXAMER2', '林峰', '济南市烟草专卖局(公司)', '济南市采供部', '20140704 17:14:46');
INSERT INTO data_for_test VALUES ('FENGSHB', '冯树柏', '济南市烟草专卖局(公司)', '济南市营销中心', '20130412 17:21:14');
INSERT INTO data_for_test VALUES ('FGSTEST', '一分公司员工', '济南市烟草专卖局(公司)', '一分公司', '20150305 15:05:45');
INSERT INTO data_for_test VALUES ('GAOXIANSHENG', '高先生', '秀山县烟草专卖局（公司）', '办公室', '20150921 11:08:57');
INSERT INTO data_for_test VALUES ('GAOZHCH', '高志超', '秀山县烟草专卖局（公司）', '办公室', '20140508 10:29:01');
INSERT INTO data_for_test VALUES ('GISTEST', 'gistest', '济南市烟草专卖局(公司)', '济南市营销中心', '20140709 09:33:32');
INSERT INTO data_for_test VALUES ('GUO', '仓库保管员', '济南市烟草专卖局(公司)', '综合部', '20141225 17:23:09');
INSERT INTO data_for_test VALUES ('GYADMIN', '贵阳物流管理员', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20150402 10:57:22');
INSERT INTO data_for_test VALUES ('HSJ', '黄少军', '济南历城区烟草专卖局（公司）', '稽查一队', '20141219 00:32:08');
INSERT INTO data_for_test VALUES ('HUANGMING', '黄明', '济南历城区烟草专卖局（公司）', '丁家片区', '20140618 16:00:06');
INSERT INTO data_for_test VALUES ('HZX', '郝兆旭', '济南市烟草专卖局(公司)', '济南市采供部', '20150413 10:25:30');
INSERT INTO data_for_test VALUES ('INVMAN', '业务库管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20130316 17:41:50');
INSERT INTO data_for_test VALUES ('ITEM01', '商品管理01', '山东省烟草专卖局(公司)', '计划处', '20130122 11:15:38');
INSERT INTO data_for_test VALUES ('ITEMMGR', '李X涛', '山东省烟草专卖局(公司)', '计划处', '20130123 09:28:40');
INSERT INTO data_for_test VALUES ('ITEMMGR01', '王X琪', '济南市烟草专卖局(公司)', '济南市采供部', '20130122 12:50:10');
INSERT INTO data_for_test VALUES ('ITSMAN', '运维管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20130822 11:11:01');
INSERT INTO data_for_test VALUES ('ITSMMGR', '运维管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20130222 14:52:41');
INSERT INTO data_for_test VALUES ('JLPLANUSER', '吉林计划处员工', '山东省烟草专卖局(公司)', '计划处', '20150615 09:56:44');
INSERT INTO data_for_test VALUES ('JLSALECENTER', '济南市营销中心', '济南市烟草专卖局(公司)', '济南市营销中心', '20130401 12:27:57');
INSERT INTO data_for_test VALUES ('JN8000002', '赵X磊', '济南市烟草专卖局(公司)', '济南市信息中心', '20130201 09:25:57');
INSERT INTO data_for_test VALUES ('JNADMIN', '济南系统管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20130122 09:50:31');
INSERT INTO data_for_test VALUES ('JNCG03', 'jncg03', '济南市烟草专卖局(公司)', '济南市采供部', '20130321 13:54:58');
INSERT INTO data_for_test VALUES ('JNECHECK', '结算平台交易对账管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20150613 10:48:17');
INSERT INTO data_for_test VALUES ('JNSALECENTER', '济南市营销中心管理员', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130401 13:49:55');
INSERT INTO data_for_test VALUES ('JNSKSMAN001', '李健', '济南市烟草专卖局(公司)', '济南市营销中心', '20130204 18:54:36');
INSERT INTO data_for_test VALUES ('JNYXZX', '营销中心--测试', '济南市烟草专卖局(公司)', '济南市营销中心', '20131126 09:37:04');
INSERT INTO data_for_test VALUES ('KATE', '卡特琳娜', '山东省烟草专卖局(公司)', '内管处', '20140725 16:31:24');
INSERT INTO data_for_test VALUES ('LANGCHAO', 'langchao', '济南烟草历下区公司(专卖局)', '济南烟草历下区营销部文登', '20130905 15:02:14');
INSERT INTO data_for_test VALUES ('LCZMADMIN', '历城案件管理员', '办公室（外事办公室）', '办公室（外事办公室）', '20130423 16:37:52');
INSERT INTO data_for_test VALUES ('LICHENG1', '历城测试1', '泰安市烟草(专卖局)', '泰安物流中心', '20130712 14:29:49');
INSERT INTO data_for_test VALUES ('LIHAILONG', '李海龙', '济南市高新区烟草专卖局（公司）', '专卖科', '20140509 16:07:43');
INSERT INTO data_for_test VALUES ('LIJIA', '李佳', '济南市烟草专卖局(公司)', '营销一部', '20150306 09:42:49');
INSERT INTO data_for_test VALUES ('LIJIAN2', '李健2', '济南市烟草专卖局(公司)', '济南市营销中心', '20130206 01:32:27');
INSERT INTO data_for_test VALUES ('LINMU', '林木', '重庆市烟草专卖局（公司）', '计划处', '20140305 08:39:34');
INSERT INTO data_for_test VALUES ('LINXIAOER', 'lianxiaoer', '重庆市烟草专卖局（公司）', '销售处', '20150806 13:51:06');
INSERT INTO data_for_test VALUES ('LISI', 'lisi', '山东省烟草专卖局(公司)', '内管处', '20150923 10:46:28');
INSERT INTO data_for_test VALUES ('LISI11', '李四', '云阳县烟草专卖局（公司）', '销售科', '20141014 16:36:46');
INSERT INTO data_for_test VALUES ('LITX', '李泰祥', '办公室（外事办公室）', '办公室（外事办公室）', '20130317 10:36:02');
INSERT INTO data_for_test VALUES ('LIUBA', '刘八', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130807 11:07:53');
INSERT INTO data_for_test VALUES ('LIUYU', '刘宇', '耀州区烟草专卖局', '领导班子', '20151106 14:51:48');
INSERT INTO data_for_test VALUES ('LIUYUN', '刘云', '济南历城区烟草专卖局（公司）', '专卖科', '20140616 14:57:54');
INSERT INTO data_for_test VALUES ('LSMAN', 'LSMAN', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130222 11:46:45');
INSERT INTO data_for_test VALUES ('LSMGR01', 'LSMGR', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130222 14:37:25');
INSERT INTO data_for_test VALUES ('LUODG', 'luodg', '泰安市烟草(专卖局)', '市局专卖科', '20150901 10:18:48');
INSERT INTO data_for_test VALUES ('LW01', '李维', '济南市烟草专卖局(公司)', '济南市营销中心', '20130221 15:17:08');
INSERT INTO data_for_test VALUES ('LXZM', '历下专卖', '专卖科', '专卖科', '20131017 11:26:57');
INSERT INTO data_for_test VALUES ('LY_CAIJUN', '蔡军', '济南市烟草专卖局(公司)', '济南市营销中心', '20150130 17:22:48');
INSERT INTO data_for_test VALUES ('LY_DENGW', '邓伟', '济南市烟草专卖局(公司)', '济南市营销中心', '20150130 18:39:57');
INSERT INTO data_for_test VALUES ('LY_SUJD', '苏建东', '济南市烟草专卖局(公司)', '济南市营销中心', '20150130 18:41:08');
INSERT INTO data_for_test VALUES ('MSDD', '大队长', '济南历城区烟草专卖局（公司）', '稽查一队', '20140611 09:25:54');
INSERT INTO data_for_test VALUES ('MSSGS', '师广胜', '济南历城区烟草专卖局（公司）', '历城一大队', '20141219 00:39:17');
INSERT INTO data_for_test VALUES ('MSZD', '中队长', '济南历城区烟草专卖局（公司）', '稽查一队', '20140110 09:03:15');
INSERT INTO data_for_test VALUES ('NXADMIN', '宁夏管理员', '银川市烟草公司', '银川市送货部', '20140818 15:35:11');
INSERT INTO data_for_test VALUES ('PAPERMANAGER', '张霞', '济南市烟草专卖局(公司)', '济南市营销中心', '20140616 15:11:27');
INSERT INTO data_for_test VALUES ('PIMAN', '采购员张三', '济南市烟草专卖局(公司)', '济南市采供部', '20130316 16:55:13');
INSERT INTO data_for_test VALUES ('QUXIAOSHENHE', 'quxiaoshenhe', '秀山县烟草专卖局（公司）', '办公室', '20150923 10:37:28');
INSERT INTO data_for_test VALUES ('QUXIAOSHENHE1', 'quxiaoshenhe1', '秀山县烟草专卖局（公司）', '办公室', '20150923 10:39:08');
INSERT INTO data_for_test VALUES ('REGIEUSER', '历城用户', '济南历城区烟草专卖局（公司）', '专卖科', '20150110 14:24:04');
INSERT INTO data_for_test VALUES ('RIMADMIN', 'RIM管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20130228 17:25:10');
INSERT INTO data_for_test VALUES ('RIMADMIN231', '终端（营销中心）', '济南市烟草专卖局(公司)', '济南市营销中心', '20150228 14:17:38');
INSERT INTO data_for_test VALUES ('RIMADMINP', 'RIMADMINP', '山东省烟草专卖局(公司)', '计划处', '20150814 16:39:05');
INSERT INTO data_for_test VALUES ('RISMAN', '王俊杰', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130222 15:04:23');
INSERT INTO data_for_test VALUES ('RISMGR', '赵光明', '济南市烟草专卖局(公司)', '内管派驻办', '20130222 15:10:23');
INSERT INTO data_for_test VALUES ('RIS_SUNSHI', '孙十', '办公室（外事办公室）', '办公室（外事办公室）', '20130712 10:17:36');
INSERT INTO data_for_test VALUES ('RIS_ZHAOLIU', '赵六', '济南市烟草专卖局(公司)', '内管派驻办', '20130712 10:14:32');
INSERT INTO data_for_test VALUES ('RMMAN', '张世强', '办公室（外事办公室）', '办公室（外事办公室）', '20130222 15:14:33');
INSERT INTO data_for_test VALUES ('RMMGR', '赵卫国', '市局专卖科', '市局专卖科', '20130222 16:16:10');
INSERT INTO data_for_test VALUES ('SC00001', '营销中心内勤', '济南市烟草专卖局(公司)', '济南市营销中心', '20130129 15:22:12');
INSERT INTO data_for_test VALUES ('SCCUSTMANAGER', '营销中心客户管理员', '济南市烟草专卖局(公司)', '济南市营销中心', '20130129 14:51:31');
INSERT INTO data_for_test VALUES ('SCJL', '市场经理', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130222 13:21:08');
INSERT INTO data_for_test VALUES ('SCMRADMIN', '行业监管', '山东省烟草专卖局(公司)', '销售处', '20150804 20:34:26');
INSERT INTO data_for_test VALUES ('SCMRDEMO', '行业监管', '山东省烟草专卖局(公司)', '销售处', '20151009 09:15:37');
INSERT INTO data_for_test VALUES ('SHJ', 'shj', '山东省烟草专卖局(公司)', '计划处', '20130628 20:36:48');
INSERT INTO data_for_test VALUES ('SJ', '测试', '山东省烟草专卖局(公司)', '计划处', '20130808 18:42:06');
INSERT INTO data_for_test VALUES ('SJTEST', 'SJtest', '山东省烟草专卖局(公司)', '计划处', '20130819 16:40:23');
INSERT INTO data_for_test VALUES ('SLSMAN', '刘X江', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130122 14:25:59');
INSERT INTO data_for_test VALUES ('SLSMAN01', '崔X阳', '办公室（外事办公室）', '办公室（外事办公室）', '20130122 11:39:46');
INSERT INTO data_for_test VALUES ('SLSMAN03', 'XX客户经理', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130129 10:51:17');
INSERT INTO data_for_test VALUES ('SLSMAN10', '济南市公司客户经理', '济南市烟草专卖局(公司)', '仓储部', '20130206 15:37:39');
INSERT INTO data_for_test VALUES ('SLSMGR', '李健1', '济南市烟草专卖局(公司)', '济南市营销中心', '20130205 23:01:29');
INSERT INTO data_for_test VALUES ('SONGBO', '宋博', '济南历城区烟草专卖局（公司）', '专卖科', '20130317 10:45:35');
INSERT INTO data_for_test VALUES ('SONGGUOHUA', '宋国华', '山东省烟草专卖局(公司)', '计划处', '20130729 08:51:43');
INSERT INTO data_for_test VALUES ('SS', 'ss', '泰安市烟草(专卖局)', '市场部', '20150709 11:01:53');
INSERT INTO data_for_test VALUES ('SSS', 'sss', '山东省烟草专卖局(公司)', '内管处', '20130820 10:57:47');
INSERT INTO data_for_test VALUES ('SSSSUNSE', '孙福森', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130327 11:20:00');
INSERT INTO data_for_test VALUES ('SUNFS', '孙福森', '济南市烟草专卖局(公司)', '济南市营销中心', '20150228 15:20:37');
INSERT INTO data_for_test VALUES ('SUPERADMIN', 'SUPERADMIN', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20100120         ');
INSERT INTO data_for_test VALUES ('SUPPLYADMIN', '囍之郎', '济南市烟草专卖局(公司)', '济南市采供部', '20130129 15:32:01');
INSERT INTO data_for_test VALUES ('SY', '十一', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130808 13:50:21');
INSERT INTO data_for_test VALUES ('SYSADMIN', 'SYSADMIN', '山东省烟草专卖局(公司)', '山东省烟草专卖局(公司)', '20100120         ');
INSERT INTO data_for_test VALUES ('TAOCHUN', '测试', '济南市烟草专卖局(公司)', '济南市营销中心', '20130222 11:21:42');
INSERT INTO data_for_test VALUES ('TAWL', '泰安管理员', '泰安市烟草(专卖局)', '综合部', '20141231 10:09:49');
INSERT INTO data_for_test VALUES ('TCSADMIN', '铜川管理员', '铜川市烟草专卖局(公司)', '信息中心', '20130305 16:07:59');
INSERT INTO data_for_test VALUES ('TCSANLIANG', '安亮', '铜川市直属分局', '王益区（城关片区）', '20130411 14:41:16');
INSERT INTO data_for_test VALUES ('TCSBAILM', '白利民', '宜君县烟草专卖局', '城关片区', '20131210 11:23:18');
INSERT INTO data_for_test VALUES ('TCSBAIXL', '白晓龙', '铜川市烟草专卖局(公司)', '物流中心', '20130415 16:23:02');
INSERT INTO data_for_test VALUES ('TCSBAIYS', '白雨松', '铜川市直属分局', '王益区（二马路）', '20130411 14:39:20');
INSERT INTO data_for_test VALUES ('TCSCHENAL', '陈爱玲', '宜君县烟草专卖局', '宜君县烟草专卖局稽查大队', '20130411 11:04:00');
INSERT INTO data_for_test VALUES ('TCSCHENBIN', '陈斌', '耀州区烟草专卖局', '耀州区烟草专卖局稽查大队', '20130411 11:18:37');
INSERT INTO data_for_test VALUES ('TCSCHENJUN', '陈军', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 14:54:22');
INSERT INTO data_for_test VALUES ('TCSCHIXK', '赤新奎', '铜川市烟草专卖局(公司)', '物流中心', '20130409 16:50:43');
INSERT INTO data_for_test VALUES ('TCSDONGQF', '董秋芳', '铜川市烟草专卖局(公司)', '耀州营销部', '20130408 09:49:40');
INSERT INTO data_for_test VALUES ('TCSFANCC', '范聪聪', '铜川市烟草专卖局(公司)', '耀州营销部', '20130410 18:53:49');
INSERT INTO data_for_test VALUES ('TCSFANRONG', '樊荣', '铜川市烟草专卖局(公司)', '送货部', '20130421 13:47:51');
INSERT INTO data_for_test VALUES ('TCSFENGXL ', '冯晓丽', '铜川市直属分局', '专卖管理股', '20130409 21:42:59');
INSERT INTO data_for_test VALUES ('TCSGAOQI', '高琦', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 14:55:13');
INSERT INTO data_for_test VALUES ('TCSGUANXB', '关小博', '耀州区烟草专卖局', '耀州区烟草专卖局', '20130418 21:56:40');
INSERT INTO data_for_test VALUES ('TCSGUOJQ', '郭建庆', '铜川市烟草专卖局(公司)', '客户服务部', '20130415 20:23:44');
INSERT INTO data_for_test VALUES ('TCSGYCX', '铜川工业查询', '铜川市烟草专卖局(公司)', '铜川营销中心', '20130724 11:27:34');
INSERT INTO data_for_test VALUES ('TCSHEPING', '贺平', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 16:53:31');
INSERT INTO data_for_test VALUES ('TCSHOUYF', '候永峰', '耀州区烟草专卖局', '耀州区烟草专卖局稽查大队', '20130411 11:20:19');
INSERT INTO data_for_test VALUES ('TCSHUIXL', '惠小兰', '铜川市烟草专卖局(公司)', '内管派出办', '20130426 11:58:21');
INSERT INTO data_for_test VALUES ('TCSJIANYF', '菅永飞', '铜川市直属分局', '专卖管理股', '20130411 14:38:41');
INSERT INTO data_for_test VALUES ('TCSJIAWQ', '贾文庆', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 16:48:01');
INSERT INTO data_for_test VALUES ('TCSJIESUAN', '营销中心', '铜川市烟草专卖局(公司)', '铜川营销中心', '20150613 10:37:17');
INSERT INTO data_for_test VALUES ('TCSJINXIN', '晋鑫', '铜川市烟草专卖局(公司)', '采供部', '20130408 10:28:07');
INSERT INTO data_for_test VALUES ('TCSLANGCHAO', '浪潮铜川', '铜川市烟草专卖局(公司)', '信息中心', '20130524 16:36:44');
INSERT INTO data_for_test VALUES ('TCSLIHX', '李红霞', '铜川市烟草专卖局(公司)', '宜君营销部', '20130408 10:08:34');
INSERT INTO data_for_test VALUES ('TCSLIJCH', '李进川', '耀州区烟草专卖局', '耀州营销部', '20130410 18:59:20');
INSERT INTO data_for_test VALUES ('TCSLIJING', '李敬', '铜川市烟草专卖局(公司)', '耀州营销部', '20130408 09:58:52');
INSERT INTO data_for_test VALUES ('TCSLIML', '李美玲', '铜川市直属分局', '城区营销部', '20130410 19:11:55');
INSERT INTO data_for_test VALUES ('TCSLIML1', '栗梦龙', '耀州区烟草专卖局', '耀州区烟草专卖局稽查大队', '20130411 11:49:13');
INSERT INTO data_for_test VALUES ('TCSLIUWEI', '刘伟', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 14:56:16');
INSERT INTO data_for_test VALUES ('TCSLIUXH', '刘晓红', '宜君县烟草专卖局', '宜君县烟草专卖局稽查大队', '20130411 11:03:24');
INSERT INTO data_for_test VALUES ('TCSLIUYU', '刘宇', '耀州区烟草专卖局', '耀州区烟草专卖局', '20130418 21:54:10');
INSERT INTO data_for_test VALUES ('TCSLIYING', '李颖', '耀州区烟草专卖局', '耀州营销部', '20130905 10:49:44');
INSERT INTO data_for_test VALUES ('TCSLIYU', '李玉', '铜川市烟草专卖局(公司)', '城区营销部', '20130408 10:25:09');
INSERT INTO data_for_test VALUES ('TCSLSMAN', '铜川客户经理', '铜川市烟草专卖局(公司)', '宜君营销部', '20151010 14:13:43');
INSERT INTO data_for_test VALUES ('TCSMAHUI', '马辉', '铜川市烟草专卖局(公司)', '财务科', '20130426 16:13:20');
INSERT INTO data_for_test VALUES ('TCSMANXIN', '满心', '耀州区烟草专卖局', '耀州营销部', '20130410 18:54:58');
INSERT INTO data_for_test VALUES ('TCSMASL', '马石磊', '铜川市烟草专卖局(公司)', '财务科', '20130416 11:09:05');
INSERT INTO data_for_test VALUES ('TCSMAZHENG', '马征', '铜川市烟草专卖局(公司)', '耀州营销部', '20130410 18:52:06');
INSERT INTO data_for_test VALUES ('TCSMIAOXH', '苗秀华', '铜川市直属分局', '内管派驻组', '20130723 12:59:59');
INSERT INTO data_for_test VALUES ('TCSNINGTAO', '宁涛', '铜川市直属分局', '铜川市直属分局', '20130418 21:49:27');
INSERT INTO data_for_test VALUES ('TCSPANGZHL', '庞中亮', '耀州区烟草专卖局', '专卖管理股', '20130411 12:25:38');
INSERT INTO data_for_test VALUES ('TCSQIAOGL', '乔国利', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 16:51:09');
INSERT INTO data_for_test VALUES ('TCSQUXY', '屈晓燕', '铜川市烟草专卖局(公司)', '宜君营销部', '20130408 10:07:30');
INSERT INTO data_for_test VALUES ('TCSRENFF', '任飞菲', '耀州区烟草专卖局', '耀州营销部', '20130410 18:56:34');
INSERT INTO data_for_test VALUES ('TCSRENZP', '任泽平', '宜君县烟草专卖局', '宜君营销部', '20130410 19:02:55');
INSERT INTO data_for_test VALUES ('TCSSHENWQ', '沈文全', '铜川市烟草专卖局(公司)', '信息中心', '20130406 15:38:42');
INSERT INTO data_for_test VALUES ('TCSSHIYE', '铜川实业公司', '铜川市烟草专卖局(公司)', '铜川营销中心', '20131016 16:16:22');
INSERT INTO data_for_test VALUES ('TCSSHJ', '铜川省局管理员XXX', '陕西省烟草专卖局(公司)', '信息处', '20150806 15:20:29');
INSERT INTO data_for_test VALUES ('TCSSONGXM', '宋肖明', '宜君县烟草专卖局', '宜君营销部', '20130410 19:01:26');
INSERT INTO data_for_test VALUES ('TCSSUIFJ', '睢粉娟', '铜川市烟草专卖局(公司)', '内管派出办', '20130426 11:55:23');
INSERT INTO data_for_test VALUES ('TCSSUNGUANG', '孙光', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 16:55:32');
INSERT INTO data_for_test VALUES ('TCSSUNLH', '孙丽慧', '铜川市直属分局', '专卖管理股', '20130411 14:42:23');
INSERT INTO data_for_test VALUES ('TCSSUNTAO', '孙涛', '宜君县烟草专卖局', '宜君县烟草专卖局', '20130418 21:45:49');
INSERT INTO data_for_test VALUES ('TCSSUNWSH', '孙旺社', '铜川市烟草专卖局(公司)', '城区营销部', '20130409 15:24:46');
INSERT INTO data_for_test VALUES ('TCSTONGTT', '童婷婷', '铜川市烟草专卖局(公司)', '客户服务部', '20130415 20:28:53');
INSERT INTO data_for_test VALUES ('TCSWANGCHAO', '王超', '耀州区烟草专卖局', '内管派驻组', '20130723 12:58:12');
INSERT INTO data_for_test VALUES ('TCSWANGGM', '王光明', '宜君县烟草专卖局', '宜君县烟草专卖局', '20130418 21:40:41');
INSERT INTO data_for_test VALUES ('TCSWANGJUAN', '王娟', '耀州区烟草专卖局', '内管派驻组', '20130723 12:55:51');
INSERT INTO data_for_test VALUES ('TCSWANGLEI', '王磊', '铜川市直属分局', '专卖管理股', '20140107 10:04:18');
INSERT INTO data_for_test VALUES ('TCSWANGQI', '王琦', '铜川市烟草专卖局(公司)', '专卖科（稽查支队）', '20130411 14:55:54');
INSERT INTO data_for_test VALUES ('TCSWANGSW', '王淑文', '宜君县烟草专卖局', '专卖管理股', '20130411 11:05:29');
INSERT INTO data_for_test VALUES ('TCSWANGTQ', '王铜琴', '铜川市直属分局', '内管派驻组', '20130723 12:59:10');
INSERT INTO data_for_test VALUES ('TCSWANGXP', '王西平', '宜君县烟草专卖局', '宜君县烟草专卖局稽查大队', '20130411 10:51:59');
INSERT INTO data_for_test VALUES ('TCSWEILY', '韦利艳', '铜川市直属分局', '城区营销部', '20130717 18:13:13');
INSERT INTO data_for_test VALUES ('TCSWENYL', '问彦龙', '铜川市烟草专卖局(公司)', '内管派出办', '20130426 12:00:16');
INSERT INTO data_for_test VALUES ('TCSWUJX', '武婧轩', '耀州区烟草专卖局', '专卖管理股', '20130411 12:19:18');
INSERT INTO data_for_test VALUES ('TCSWULF', '武龙飞', '耀州区烟草专卖局', '耀州新区片区', '20140122 15:17:57');
INSERT INTO data_for_test VALUES ('TCSXIEWJ', '谢文娟', '铜川市烟草专卖局(公司)', '耀州营销部', '20130408 09:56:33');
INSERT INTO data_for_test VALUES ('TCSXIXM', '惠孝民', '铜川市烟草专卖局(公司)', '仓储部', '20130412 15:08:14');
INSERT INTO data_for_test VALUES ('TCSYANFENG', '颜峰', '铜川市烟草专卖局(公司)', '耀州营销部', '20140122 15:47:14');
INSERT INTO data_for_test VALUES ('TCSYANGWF', '杨武峰', '铜川市烟草专卖局(公司)', '城区营销部', '20130724 18:08:26');
INSERT INTO data_for_test VALUES ('TCSYANGYF', '杨云锋', '铜川市烟草专卖局(公司)', '城区营销部', '20130408 10:22:47');
INSERT INTO data_for_test VALUES ('TCSYANGYING', '杨英', '耀州区烟草专卖局', '专卖管理股', '20130408 11:48:14');
INSERT INTO data_for_test VALUES ('TCSYANGYN', '杨燕妮', '宜君县烟草专卖局', '宜君营销部', '20130709 10:56:51');
INSERT INTO data_for_test VALUES ('TCSYANGZHJ', '杨张俊', '铜川市直属分局', '印台区(东区)', '20130411 16:23:16');
INSERT INTO data_for_test VALUES ('TCSYANJQ', '闫军强', '铜川市直属分局', '王益区（王家河黄堡片区）', '20130529 11:06:18');
INSERT INTO data_for_test VALUES ('TCSYUANGL', '袁桂玲', '铜川市烟草专卖局(公司)', '财务科', '20130529 09:51:34');
INSERT INTO data_for_test VALUES ('TCSYUFL', '余复玲', '铜川市烟草专卖局(公司)', '物流中心', '20130416 10:37:05');
INSERT INTO data_for_test VALUES ('TCSZHANGHF', '张慧芳', '宜君县烟草专卖局', '宜君县烟草专卖局稽查大队', '20130411 11:04:33');
INSERT INTO data_for_test VALUES ('TCSZHANGMIN', '张敏', '铜川市烟草专卖局(公司)', '铜川营销中心', '20140314 15:59:27');
INSERT INTO data_for_test VALUES ('TCSZHANGQIANG', '张强', '铜川市直属分局', '城区营销部', '20130410 19:10:38');
INSERT INTO data_for_test VALUES ('TCSZHANGQIANG1', '张强', '铜川市直属分局', '王益区（城区片区）', '20140107 09:13:06');
INSERT INTO data_for_test VALUES ('TCSZHANGXIN', '张昕', '铜川市烟草专卖局(公司)', '采供部', '20130408 10:30:38');
INSERT INTO data_for_test VALUES ('TCSZHANGXUAN', '张轩', '铜川市烟草专卖局(公司)', '城区营销部', '20130410 19:09:49');
INSERT INTO data_for_test VALUES ('TCSZHANGYANG', '张扬', '铜川市烟草专卖局(公司)', '城区营销部', '20130410 19:07:34');
INSERT INTO data_for_test VALUES ('TCSZHANGYH', '张永宏', '宜君县烟草专卖局', '专卖管理股', '20130408 11:37:42');
INSERT INTO data_for_test VALUES ('TCSZHANGYJ', '张延举', '铜川市烟草专卖局(公司)', '市局领导班子', '20130521 15:10:11');
INSERT INTO data_for_test VALUES ('TCSZHANGYUN', '张云', '铜川市烟草专卖局(公司)', '市局领导班子', '20130710 18:09:15');
INSERT INTO data_for_test VALUES ('TCSZHAOHF', '赵海锋', '铜川市烟草专卖局(公司)', '耀州营销部', '20130408 09:57:48');
INSERT INTO data_for_test VALUES ('TCSZHAOYX', '赵云侠', '铜川市烟草专卖局(公司)', '综合部', '20130408 10:34:15');
INSERT INTO data_for_test VALUES ('TCSZHOUSJ', '周守杰', '铜川市直属分局', '铜川市直属分局', '20130418 21:51:57');
INSERT INTO data_for_test VALUES ('TCSZM', '专卖管理员', '铜川市烟草专卖局(公司)', '信息中心', '20130917 09:45:18');
INSERT INTO data_for_test VALUES ('TCS_GANLU', '甘露', '铜川市烟草专卖局(公司)', '铜川营销中心', '20150807 18:28:12');
INSERT INTO data_for_test VALUES ('TEST001', 'test001z', '山东省烟草专卖局(公司)', '计划处', '20141022 08:45:28');
INSERT INTO data_for_test VALUES ('TEST009', '自行车', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20150608 10:56:48');
INSERT INTO data_for_test VALUES ('TIANYUAN', '1', '专卖科', '专卖科', '20130730 13:02:45');
INSERT INTO data_for_test VALUES ('TWOWORK', '两项工作', '山东省烟草专卖局(公司)', '计划处', '20130403 13:14:47');
INSERT INTO data_for_test VALUES ('WANGBINYC', 'wangbin', '济南市烟草专卖局(公司)', '仓储部', '20131012 19:50:06');
INSERT INTO data_for_test VALUES ('WANGGL', 'WANGGUOLIANG', '济南市烟草专卖局(公司)', '济南市信息中心', '20130813 17:17:35');
INSERT INTO data_for_test VALUES ('WANGHAI', '王海', '济南历城区烟草专卖局（公司）', '专卖科', '20140122 09:29:06');
INSERT INTO data_for_test VALUES ('WANGJIE', '王洁', '山东省烟草专卖局(公司)', '内管处', '20151117 16:35:45');
INSERT INTO data_for_test VALUES ('WANGWU', '王五', '济南市烟草专卖局(公司)', '内管派驻办', '20130217 16:37:34');
INSERT INTO data_for_test VALUES ('WANG_TH', '王天华', '济南市烟草专卖局(公司)', '济南市营销中心', '20150304 12:46:09');
INSERT INTO data_for_test VALUES ('WB', '外包测试人', '济南市烟草专卖局(公司)', '外包单位', '20150123 17:23:57');
INSERT INTO data_for_test VALUES ('WJL', 'wjlmgqs', '济南市烟草专卖局(公司)', '综合部', '20140819 11:24:03');
INSERT INTO data_for_test VALUES ('WL', '物流管理员', '济南市烟草专卖局(公司)', '济南市信息中心', '20130129 13:28:54');
INSERT INTO data_for_test VALUES ('WL0000000101', 'bjtest1', '山东省烟草专卖局(公司)', '物流中心', '20130831 19:09:40');
INSERT INTO data_for_test VALUES ('WL2', '物流测试2', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130605 16:57:50');
INSERT INTO data_for_test VALUES ('WLC', '处长', '山东省烟草专卖局(公司)', '物流中心', '20130325 11:29:16');
INSERT INTO data_for_test VALUES ('WLCC', '物流管理员', '济南市烟草专卖局(公司)', '仓储部', '20130129 13:28:54');
INSERT INTO data_for_test VALUES ('WLDELIVER', 'wldeliver', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130828 08:52:02');
INSERT INTO data_for_test VALUES ('WLG', '物流管理员', '济南市烟草专卖局(公司)', '综合部', '20150121 19:07:33');
INSERT INTO data_for_test VALUES ('WYD', '家乡送货员', '济南市烟草专卖局(公司)', '济南卷烟配送中心', '20130816 10:51:36');
INSERT INTO data_for_test VALUES ('XASADMIN', 'XASADMIN', '西安市烟草专卖局(公司)', '西安信息中心', '20151105 21:58:59');
INSERT INTO data_for_test VALUES ('XAWLADMIN', '西安物流管理员', '西安市烟草专卖局(公司)', '雁塔区送货部', '20150421 11:23:53');
INSERT INTO data_for_test VALUES ('XIAODING', '小丁', '办公室（外事办公室）', '办公室（外事办公室）', '20130409 11:33:16');
INSERT INTO data_for_test VALUES ('XIAOGANG', '小刚', '市局专卖科', '市局专卖科', '20130426 15:24:29');
INSERT INTO data_for_test VALUES ('XIAOHUANG', '小黄', '济南历城区烟草专卖局（公司）', '历城二中队', '20140706 14:01:34');
INSERT INTO data_for_test VALUES ('XIAOJG', '肖建国', '济南市烟草专卖局(公司)', '济南市营销中心', '20130316 17:29:11');
INSERT INTO data_for_test VALUES ('XIAOSAN', '小三三', '重庆市烟草专卖局（公司）', '销售处', '20150116 11:50:49');
INSERT INTO data_for_test VALUES ('XIAOSONG', 'xiaosong', '办公室（外事办公室）', '办公室（外事办公室）', '20130514 09:44:58');
INSERT INTO data_for_test VALUES ('XIAOSONG1', '小宋', '泰安市烟草(专卖局)', '泰安物流中心', '20130514 09:55:34');
INSERT INTO data_for_test VALUES ('XIAOSONG2', 'xiaosong1', '济南市烟草专卖局(公司)', '办公室（外事办公室）', '20130521 14:21:02');
INSERT INTO data_for_test VALUES ('XIAOSONG3', 'xiaosong3', '济南历城区烟草专卖局（公司）', '专卖科', '20130521 14:22:10');
INSERT INTO data_for_test VALUES ('XIAOZHANG', '小张', '办公室（外事办公室）', '办公室（外事办公室）', '20130130 16:27:04');
INSERT INTO data_for_test VALUES ('XIAOZHOU', '小周', '办公室（外事办公室）', '办公室（外事办公室）', '20130418 13:53:05');
INSERT INTO data_for_test VALUES ('XIAOZHOU1', '小周1', '办公室（外事办公室）', '办公室（外事办公室）', '20130521 15:19:08');
INSERT INTO data_for_test VALUES ('XIAOZHOU2', '小周2', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130717 10:05:59');
INSERT INTO data_for_test VALUES ('XIAOZHOU3', '小周3', '办公室（外事办公室）', '办公室（外事办公室）', '20130717 10:26:11');
INSERT INTO data_for_test VALUES ('XIAOZHOU4', '小周4', '办公室（外事办公室）', '办公室（外事办公室）', '20130719 13:39:10');
INSERT INTO data_for_test VALUES ('XIONG1', '熊大1', '铜川市烟草专卖局(公司)', '送货部', '20141202 19:58:29');
INSERT INTO data_for_test VALUES ('XIONG2', '熊2', '铜川市烟草专卖局(公司)', '市局领导班子', '20141202 21:03:19');
INSERT INTO data_for_test VALUES ('XIONGHL', '熊辉龙', '济南市烟草专卖局(公司)', '仓储部', '20131012 19:50:58');
INSERT INTO data_for_test VALUES ('XIONGHUILONG', '熊辉龙', '济南市烟草专卖局(公司)', '分拣部', '20131014 14:36:15');
INSERT INTO data_for_test VALUES ('XT', 'xt', '山东省烟草专卖局(公司)', '测试罢了', '20140825 16:36:01');
INSERT INTO data_for_test VALUES ('XZ', 'xz', '济南烟草历下区公司(专卖局)', '济南烟草历下区营销部文登', '20130905 15:05:29');
INSERT INTO data_for_test VALUES ('YANG', '洋', '山东省烟草专卖局(公司)', '物流中心', '20140829 16:22:13');
INSERT INTO data_for_test VALUES ('YANG_TEST', 'yang_test', '山东省烟草专卖局(公司)', '测试罢了', '20140819 15:47:48');
INSERT INTO data_for_test VALUES ('YANLJ', '颜丽娟', '山东省烟草专卖局(公司)', '计划处', '20130704 13:32:55');
INSERT INTO data_for_test VALUES ('YASGUOWL', '张忠喜', '办公室（外事办公室）', '办公室（外事办公室）', '20130720 10:07:06');
INSERT INTO data_for_test VALUES ('ZENGKEDA', '曾可达', '济南市烟草专卖局(公司)', '章丘中转站', '20141230 15:12:20');
INSERT INTO data_for_test VALUES ('ZHANGBING', '张兵', '市局专卖科', '市局专卖科', '20130729 11:11:36');
INSERT INTO data_for_test VALUES ('ZHANGFENG', '张峰', '济南历城区烟草专卖局（公司）', '稽查一队', '20140706 11:49:20');
INSERT INTO data_for_test VALUES ('ZHANGJIU', '张九', '济南烟草历下区公司(专卖局)', '内管派驻组', '20130217 16:51:14');
INSERT INTO data_for_test VALUES ('ZHANGSAN', 'zhangsan', '济南市烟草专卖局(公司)', '高新区送货部', '20141023 19:09:41');
INSERT INTO data_for_test VALUES ('ZHANGWJ', '张无忌', '济南市市中区烟草专卖局（公司）', '专卖科', '20140523 11:34:48');
INSERT INTO data_for_test VALUES ('ZHANGXD', '张旭东', '济南历城区烟草专卖局（公司）', '济南烟草历城区营销部', '20130828 20:17:21');
INSERT INTO data_for_test VALUES ('ZHANGXIAOSAN', 'zhangxiaosan', '云阳县烟草专卖局（公司）', '销售科', '20150921 20:57:30');
INSERT INTO data_for_test VALUES ('ZHANGXZH', '张行政', '济南市烟草专卖局(公司)', '济南市信息中心', '20130301 09:44:39');
INSERT INTO data_for_test VALUES ('ZHANGZHX', '张忠喜', '办公室（外事办公室）', '办公室（外事办公室）', '20130317 10:26:23');
INSERT INTO data_for_test VALUES ('ZHANSAN', '张三', '重庆市烟草专卖局（公司）', '计划处', '20140214 09:41:22');
INSERT INTO data_for_test VALUES ('ZHANXSAN', '张小三', '云阳县烟草专卖局（公司）', '销售科', '20140709 13:43:35');
INSERT INTO data_for_test VALUES ('ZHAOLIU', 'zhaoliu', '济南市烟草专卖局(公司)', '济南市营销中心', '20130318 11:48:02');
INSERT INTO data_for_test VALUES ('ZHAOWG', '赵卫国', '市局专卖科', '市局专卖科', '20130317 09:53:16');
INSERT INTO data_for_test VALUES ('ZHGL02', '综合管理02', '山东省烟草专卖局(公司)', '计划处', '20130217 10:05:03');
INSERT INTO data_for_test VALUES ('ZHONGYU', 'zhongyu', '济南市烟草专卖局(公司)', '济南市营销中心', '20130318 11:57:14');
INSERT INTO data_for_test VALUES ('ZHONGYU003', 'zhongyu003', '济南市烟草专卖局(公司)', '济南市营销中心', '20130318 14:51:35');
INSERT INTO data_for_test VALUES ('ZHXSAN', '张小三', '重庆市烟草专卖局（公司）', '计划处', '20140805 19:56:41');
INSERT INTO data_for_test VALUES ('ZMMAN', '测试市管员', '泰安市烟草(专卖局)', '泰安物流中心', '20130813 13:27:11');
INSERT INTO data_for_test VALUES ('ZMMGR', 'zmmgr', '市局专卖科', '市局专卖科', '20130816 18:08:03');
INSERT INTO data_for_test VALUES ('ZXC2014', 'zxc2014', '铜川市烟草专卖局(公司)', '物流中心', '20141118 19:30:26');
INSERT INTO data_for_test VALUES ('ZYX', 'zyx', '铜川市烟草专卖局(公司)', '仓储部', '20140809 13:49:23');

INSERT INTO test_data (ID, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) VALUES ('周二', '89', '34', '34', '67', '99', '88', '57', '99', '99', '99');
INSERT INTO test_data (ID, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) VALUES ('张三', '33', '44', '55', '22', '11', '66', '88', '99', '100', '77');
INSERT INTO test_data (ID, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) VALUES ('李四', '54', '32', '88', '77', '56', '23', '05', '86', '83', '97');
INSERT INTO test_data (ID, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10) VALUES ('王五', '96', '87', '76', '86', '74', '82', '38', '86', '78', '59');
