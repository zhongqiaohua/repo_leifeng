package com.example.leifeng.models;

import java.util.ArrayList;
import java.util.List;

public class VipuserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipuserinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("passWord is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("passWord is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("passWord =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("passWord <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("passWord >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("passWord >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("passWord <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("passWord <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("passWord like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("passWord not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("passWord in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("passWord not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("passWord between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("passWord not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(Integer value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(Integer value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(Integer value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(Integer value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(Integer value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<Integer> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<Integer> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(Integer value1, Integer value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNull() {
            addCriterion("serialNo is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("serialNo is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(Integer value) {
            addCriterion("serialNo =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(Integer value) {
            addCriterion("serialNo <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(Integer value) {
            addCriterion("serialNo >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("serialNo >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(Integer value) {
            addCriterion("serialNo <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(Integer value) {
            addCriterion("serialNo <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<Integer> values) {
            addCriterion("serialNo in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<Integer> values) {
            addCriterion("serialNo not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(Integer value1, Integer value2) {
            addCriterion("serialNo between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(Integer value1, Integer value2) {
            addCriterion("serialNo not between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNull() {
            addCriterion("isVip is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("isVip is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(String value) {
            addCriterion("isVip =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(String value) {
            addCriterion("isVip <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(String value) {
            addCriterion("isVip >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(String value) {
            addCriterion("isVip >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(String value) {
            addCriterion("isVip <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(String value) {
            addCriterion("isVip <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLike(String value) {
            addCriterion("isVip like", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotLike(String value) {
            addCriterion("isVip not like", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<String> values) {
            addCriterion("isVip in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<String> values) {
            addCriterion("isVip not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(String value1, String value2) {
            addCriterion("isVip between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(String value1, String value2) {
            addCriterion("isVip not between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("payTime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("payTime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyIsNull() {
            addCriterion("allChargeMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyIsNotNull() {
            addCriterion("allChargeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyEqualTo(Integer value) {
            addCriterion("allChargeMoney =", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyNotEqualTo(Integer value) {
            addCriterion("allChargeMoney <>", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyGreaterThan(Integer value) {
            addCriterion("allChargeMoney >", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("allChargeMoney >=", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyLessThan(Integer value) {
            addCriterion("allChargeMoney <", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("allChargeMoney <=", value, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyIn(List<Integer> values) {
            addCriterion("allChargeMoney in", values, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyNotIn(List<Integer> values) {
            addCriterion("allChargeMoney not in", values, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyBetween(Integer value1, Integer value2) {
            addCriterion("allChargeMoney between", value1, value2, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andAllchargemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("allChargeMoney not between", value1, value2, "allchargemoney");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsIsNull() {
            addCriterion("updateUseridSms is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsIsNotNull() {
            addCriterion("updateUseridSms is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsEqualTo(String value) {
            addCriterion("updateUseridSms =", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsNotEqualTo(String value) {
            addCriterion("updateUseridSms <>", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsGreaterThan(String value) {
            addCriterion("updateUseridSms >", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsGreaterThanOrEqualTo(String value) {
            addCriterion("updateUseridSms >=", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsLessThan(String value) {
            addCriterion("updateUseridSms <", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsLessThanOrEqualTo(String value) {
            addCriterion("updateUseridSms <=", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsLike(String value) {
            addCriterion("updateUseridSms like", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsNotLike(String value) {
            addCriterion("updateUseridSms not like", value, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsIn(List<String> values) {
            addCriterion("updateUseridSms in", values, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsNotIn(List<String> values) {
            addCriterion("updateUseridSms not in", values, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsBetween(String value1, String value2) {
            addCriterion("updateUseridSms between", value1, value2, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmsNotBetween(String value1, String value2) {
            addCriterion("updateUseridSms not between", value1, value2, "updateuseridsms");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeIsNull() {
            addCriterion("updateUseridSmsTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeIsNotNull() {
            addCriterion("updateUseridSmsTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeEqualTo(String value) {
            addCriterion("updateUseridSmsTime =", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeNotEqualTo(String value) {
            addCriterion("updateUseridSmsTime <>", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeGreaterThan(String value) {
            addCriterion("updateUseridSmsTime >", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeGreaterThanOrEqualTo(String value) {
            addCriterion("updateUseridSmsTime >=", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeLessThan(String value) {
            addCriterion("updateUseridSmsTime <", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeLessThanOrEqualTo(String value) {
            addCriterion("updateUseridSmsTime <=", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeLike(String value) {
            addCriterion("updateUseridSmsTime like", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeNotLike(String value) {
            addCriterion("updateUseridSmsTime not like", value, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeIn(List<String> values) {
            addCriterion("updateUseridSmsTime in", values, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeNotIn(List<String> values) {
            addCriterion("updateUseridSmsTime not in", values, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeBetween(String value1, String value2) {
            addCriterion("updateUseridSmsTime between", value1, value2, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridsmstimeNotBetween(String value1, String value2) {
            addCriterion("updateUseridSmsTime not between", value1, value2, "updateuseridsmstime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateUserid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateUserid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(Integer value) {
            addCriterion("updateUserid =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(Integer value) {
            addCriterion("updateUserid <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(Integer value) {
            addCriterion("updateUserid >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateUserid >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(Integer value) {
            addCriterion("updateUserid <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("updateUserid <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<Integer> values) {
            addCriterion("updateUserid in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<Integer> values) {
            addCriterion("updateUserid not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(Integer value1, Integer value2) {
            addCriterion("updateUserid between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updateUserid not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(String value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(String value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(String value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(String value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(String value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(String value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLike(String value) {
            addCriterion("registerTime like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotLike(String value) {
            addCriterion("registerTime not like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<String> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<String> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(String value1, String value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(String value1, String value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidIsNull() {
            addCriterion("payDeviceId is null");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidIsNotNull() {
            addCriterion("payDeviceId is not null");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidEqualTo(Integer value) {
            addCriterion("payDeviceId =", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidNotEqualTo(Integer value) {
            addCriterion("payDeviceId <>", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidGreaterThan(Integer value) {
            addCriterion("payDeviceId >", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payDeviceId >=", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidLessThan(Integer value) {
            addCriterion("payDeviceId <", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidLessThanOrEqualTo(Integer value) {
            addCriterion("payDeviceId <=", value, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidIn(List<Integer> values) {
            addCriterion("payDeviceId in", values, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidNotIn(List<Integer> values) {
            addCriterion("payDeviceId not in", values, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidBetween(Integer value1, Integer value2) {
            addCriterion("payDeviceId between", value1, value2, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPaydeviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("payDeviceId not between", value1, value2, "paydeviceid");
            return (Criteria) this;
        }

        public Criteria andPermsIsNull() {
            addCriterion("perms is null");
            return (Criteria) this;
        }

        public Criteria andPermsIsNotNull() {
            addCriterion("perms is not null");
            return (Criteria) this;
        }

        public Criteria andPermsEqualTo(String value) {
            addCriterion("perms =", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotEqualTo(String value) {
            addCriterion("perms <>", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThan(String value) {
            addCriterion("perms >", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThanOrEqualTo(String value) {
            addCriterion("perms >=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThan(String value) {
            addCriterion("perms <", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThanOrEqualTo(String value) {
            addCriterion("perms <=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLike(String value) {
            addCriterion("perms like", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotLike(String value) {
            addCriterion("perms not like", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsIn(List<String> values) {
            addCriterion("perms in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotIn(List<String> values) {
            addCriterion("perms not in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsBetween(String value1, String value2) {
            addCriterion("perms between", value1, value2, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotBetween(String value1, String value2) {
            addCriterion("perms not between", value1, value2, "perms");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}