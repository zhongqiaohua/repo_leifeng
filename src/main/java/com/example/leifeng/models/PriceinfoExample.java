package com.example.leifeng.models;

import java.util.ArrayList;
import java.util.List;

public class PriceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceinfoExample() {
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

        public Criteria andShCodeIsNull() {
            addCriterion("sh_code is null");
            return (Criteria) this;
        }

        public Criteria andShCodeIsNotNull() {
            addCriterion("sh_code is not null");
            return (Criteria) this;
        }

        public Criteria andShCodeEqualTo(Integer value) {
            addCriterion("sh_code =", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeNotEqualTo(Integer value) {
            addCriterion("sh_code <>", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeGreaterThan(Integer value) {
            addCriterion("sh_code >", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sh_code >=", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeLessThan(Integer value) {
            addCriterion("sh_code <", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeLessThanOrEqualTo(Integer value) {
            addCriterion("sh_code <=", value, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeIn(List<Integer> values) {
            addCriterion("sh_code in", values, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeNotIn(List<Integer> values) {
            addCriterion("sh_code not in", values, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeBetween(Integer value1, Integer value2) {
            addCriterion("sh_code between", value1, value2, "shCode");
            return (Criteria) this;
        }

        public Criteria andShCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sh_code not between", value1, value2, "shCode");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNull() {
            addCriterion("dev_type is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("dev_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(Integer value) {
            addCriterion("dev_type =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(Integer value) {
            addCriterion("dev_type <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(Integer value) {
            addCriterion("dev_type >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_type >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(Integer value) {
            addCriterion("dev_type <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dev_type <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<Integer> values) {
            addCriterion("dev_type in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<Integer> values) {
            addCriterion("dev_type not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(Integer value1, Integer value2) {
            addCriterion("dev_type between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_type not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andShUserIdIsNull() {
            addCriterion("sh_user_id is null");
            return (Criteria) this;
        }

        public Criteria andShUserIdIsNotNull() {
            addCriterion("sh_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andShUserIdEqualTo(String value) {
            addCriterion("sh_user_id =", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdNotEqualTo(String value) {
            addCriterion("sh_user_id <>", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdGreaterThan(String value) {
            addCriterion("sh_user_id >", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("sh_user_id >=", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdLessThan(String value) {
            addCriterion("sh_user_id <", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdLessThanOrEqualTo(String value) {
            addCriterion("sh_user_id <=", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdLike(String value) {
            addCriterion("sh_user_id like", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdNotLike(String value) {
            addCriterion("sh_user_id not like", value, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdIn(List<String> values) {
            addCriterion("sh_user_id in", values, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdNotIn(List<String> values) {
            addCriterion("sh_user_id not in", values, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdBetween(String value1, String value2) {
            addCriterion("sh_user_id between", value1, value2, "shUserId");
            return (Criteria) this;
        }

        public Criteria andShUserIdNotBetween(String value1, String value2) {
            addCriterion("sh_user_id not between", value1, value2, "shUserId");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNull() {
            addCriterion("network is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNotNull() {
            addCriterion("network is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEqualTo(String value) {
            addCriterion("network =", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotEqualTo(String value) {
            addCriterion("network <>", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThan(String value) {
            addCriterion("network >", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("network >=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThan(String value) {
            addCriterion("network <", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThanOrEqualTo(String value) {
            addCriterion("network <=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLike(String value) {
            addCriterion("network like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotLike(String value) {
            addCriterion("network not like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkIn(List<String> values) {
            addCriterion("network in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotIn(List<String> values) {
            addCriterion("network not in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkBetween(String value1, String value2) {
            addCriterion("network between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotBetween(String value1, String value2) {
            addCriterion("network not between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerIsNull() {
            addCriterion("finish_min_power is null");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerIsNotNull() {
            addCriterion("finish_min_power is not null");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerEqualTo(Integer value) {
            addCriterion("finish_min_power =", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerNotEqualTo(Integer value) {
            addCriterion("finish_min_power <>", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerGreaterThan(Integer value) {
            addCriterion("finish_min_power >", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_min_power >=", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerLessThan(Integer value) {
            addCriterion("finish_min_power <", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerLessThanOrEqualTo(Integer value) {
            addCriterion("finish_min_power <=", value, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerIn(List<Integer> values) {
            addCriterion("finish_min_power in", values, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerNotIn(List<Integer> values) {
            addCriterion("finish_min_power not in", values, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerBetween(Integer value1, Integer value2) {
            addCriterion("finish_min_power between", value1, value2, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFinishMinPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_min_power not between", value1, value2, "finishMinPower");
            return (Criteria) this;
        }

        public Criteria andFees250wIsNull() {
            addCriterion("fees_250W is null");
            return (Criteria) this;
        }

        public Criteria andFees250wIsNotNull() {
            addCriterion("fees_250W is not null");
            return (Criteria) this;
        }

        public Criteria andFees250wEqualTo(Integer value) {
            addCriterion("fees_250W =", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wNotEqualTo(Integer value) {
            addCriterion("fees_250W <>", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wGreaterThan(Integer value) {
            addCriterion("fees_250W >", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wGreaterThanOrEqualTo(Integer value) {
            addCriterion("fees_250W >=", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wLessThan(Integer value) {
            addCriterion("fees_250W <", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wLessThanOrEqualTo(Integer value) {
            addCriterion("fees_250W <=", value, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wIn(List<Integer> values) {
            addCriterion("fees_250W in", values, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wNotIn(List<Integer> values) {
            addCriterion("fees_250W not in", values, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wBetween(Integer value1, Integer value2) {
            addCriterion("fees_250W between", value1, value2, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees250wNotBetween(Integer value1, Integer value2) {
            addCriterion("fees_250W not between", value1, value2, "fees250w");
            return (Criteria) this;
        }

        public Criteria andFees350wIsNull() {
            addCriterion("fees_350W is null");
            return (Criteria) this;
        }

        public Criteria andFees350wIsNotNull() {
            addCriterion("fees_350W is not null");
            return (Criteria) this;
        }

        public Criteria andFees350wEqualTo(Integer value) {
            addCriterion("fees_350W =", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wNotEqualTo(Integer value) {
            addCriterion("fees_350W <>", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wGreaterThan(Integer value) {
            addCriterion("fees_350W >", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wGreaterThanOrEqualTo(Integer value) {
            addCriterion("fees_350W >=", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wLessThan(Integer value) {
            addCriterion("fees_350W <", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wLessThanOrEqualTo(Integer value) {
            addCriterion("fees_350W <=", value, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wIn(List<Integer> values) {
            addCriterion("fees_350W in", values, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wNotIn(List<Integer> values) {
            addCriterion("fees_350W not in", values, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wBetween(Integer value1, Integer value2) {
            addCriterion("fees_350W between", value1, value2, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees350wNotBetween(Integer value1, Integer value2) {
            addCriterion("fees_350W not between", value1, value2, "fees350w");
            return (Criteria) this;
        }

        public Criteria andFees600wIsNull() {
            addCriterion("fees_600W is null");
            return (Criteria) this;
        }

        public Criteria andFees600wIsNotNull() {
            addCriterion("fees_600W is not null");
            return (Criteria) this;
        }

        public Criteria andFees600wEqualTo(Integer value) {
            addCriterion("fees_600W =", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wNotEqualTo(Integer value) {
            addCriterion("fees_600W <>", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wGreaterThan(Integer value) {
            addCriterion("fees_600W >", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wGreaterThanOrEqualTo(Integer value) {
            addCriterion("fees_600W >=", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wLessThan(Integer value) {
            addCriterion("fees_600W <", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wLessThanOrEqualTo(Integer value) {
            addCriterion("fees_600W <=", value, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wIn(List<Integer> values) {
            addCriterion("fees_600W in", values, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wNotIn(List<Integer> values) {
            addCriterion("fees_600W not in", values, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wBetween(Integer value1, Integer value2) {
            addCriterion("fees_600W between", value1, value2, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFees600wNotBetween(Integer value1, Integer value2) {
            addCriterion("fees_600W not between", value1, value2, "fees600w");
            return (Criteria) this;
        }

        public Criteria andFeesDcIsNull() {
            addCriterion("fees_dc is null");
            return (Criteria) this;
        }

        public Criteria andFeesDcIsNotNull() {
            addCriterion("fees_dc is not null");
            return (Criteria) this;
        }

        public Criteria andFeesDcEqualTo(Integer value) {
            addCriterion("fees_dc =", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcNotEqualTo(Integer value) {
            addCriterion("fees_dc <>", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcGreaterThan(Integer value) {
            addCriterion("fees_dc >", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcGreaterThanOrEqualTo(Integer value) {
            addCriterion("fees_dc >=", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcLessThan(Integer value) {
            addCriterion("fees_dc <", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcLessThanOrEqualTo(Integer value) {
            addCriterion("fees_dc <=", value, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcIn(List<Integer> values) {
            addCriterion("fees_dc in", values, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcNotIn(List<Integer> values) {
            addCriterion("fees_dc not in", values, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcBetween(Integer value1, Integer value2) {
            addCriterion("fees_dc between", value1, value2, "feesDc");
            return (Criteria) this;
        }

        public Criteria andFeesDcNotBetween(Integer value1, Integer value2) {
            addCriterion("fees_dc not between", value1, value2, "feesDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeIsNull() {
            addCriterion("max_charge_time is null");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeIsNotNull() {
            addCriterion("max_charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeEqualTo(Integer value) {
            addCriterion("max_charge_time =", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeNotEqualTo(Integer value) {
            addCriterion("max_charge_time <>", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeGreaterThan(Integer value) {
            addCriterion("max_charge_time >", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_charge_time >=", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeLessThan(Integer value) {
            addCriterion("max_charge_time <", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("max_charge_time <=", value, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeIn(List<Integer> values) {
            addCriterion("max_charge_time in", values, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeNotIn(List<Integer> values) {
            addCriterion("max_charge_time not in", values, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeBetween(Integer value1, Integer value2) {
            addCriterion("max_charge_time between", value1, value2, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_charge_time not between", value1, value2, "maxChargeTime");
            return (Criteria) this;
        }

        public Criteria andCanUseIsNull() {
            addCriterion("can_use is null");
            return (Criteria) this;
        }

        public Criteria andCanUseIsNotNull() {
            addCriterion("can_use is not null");
            return (Criteria) this;
        }

        public Criteria andCanUseEqualTo(Integer value) {
            addCriterion("can_use =", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseNotEqualTo(Integer value) {
            addCriterion("can_use <>", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseGreaterThan(Integer value) {
            addCriterion("can_use >", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_use >=", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseLessThan(Integer value) {
            addCriterion("can_use <", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseLessThanOrEqualTo(Integer value) {
            addCriterion("can_use <=", value, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseIn(List<Integer> values) {
            addCriterion("can_use in", values, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseNotIn(List<Integer> values) {
            addCriterion("can_use not in", values, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseBetween(Integer value1, Integer value2) {
            addCriterion("can_use between", value1, value2, "canUse");
            return (Criteria) this;
        }

        public Criteria andCanUseNotBetween(Integer value1, Integer value2) {
            addCriterion("can_use not between", value1, value2, "canUse");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipIsNull() {
            addCriterion("paymoney_fen_pertime_notvip is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipIsNotNull() {
            addCriterion("paymoney_fen_pertime_notvip is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip =", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipNotEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip <>", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipGreaterThan(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip >", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip >=", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipLessThan(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip <", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipLessThanOrEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_notvip <=", value, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipIn(List<Integer> values) {
            addCriterion("paymoney_fen_pertime_notvip in", values, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipNotIn(List<Integer> values) {
            addCriterion("paymoney_fen_pertime_notvip not in", values, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipBetween(Integer value1, Integer value2) {
            addCriterion("paymoney_fen_pertime_notvip between", value1, value2, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeNotvipNotBetween(Integer value1, Integer value2) {
            addCriterion("paymoney_fen_pertime_notvip not between", value1, value2, "paymoneyFenPertimeNotvip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipIsNull() {
            addCriterion("paymoney_fen_pertime_vip is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipIsNotNull() {
            addCriterion("paymoney_fen_pertime_vip is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_vip =", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipNotEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_vip <>", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipGreaterThan(Integer value) {
            addCriterion("paymoney_fen_pertime_vip >", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_vip >=", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipLessThan(Integer value) {
            addCriterion("paymoney_fen_pertime_vip <", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipLessThanOrEqualTo(Integer value) {
            addCriterion("paymoney_fen_pertime_vip <=", value, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipIn(List<Integer> values) {
            addCriterion("paymoney_fen_pertime_vip in", values, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipNotIn(List<Integer> values) {
            addCriterion("paymoney_fen_pertime_vip not in", values, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipBetween(Integer value1, Integer value2) {
            addCriterion("paymoney_fen_pertime_vip between", value1, value2, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andPaymoneyFenPertimeVipNotBetween(Integer value1, Integer value2) {
            addCriterion("paymoney_fen_pertime_vip not between", value1, value2, "paymoneyFenPertimeVip");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Integer value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Integer value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Integer value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Integer value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Integer value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Integer> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Integer> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Integer value1, Integer value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeIsNull() {
            addCriterion("giveup_time is null");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeIsNotNull() {
            addCriterion("giveup_time is not null");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeEqualTo(Integer value) {
            addCriterion("giveup_time =", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeNotEqualTo(Integer value) {
            addCriterion("giveup_time <>", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeGreaterThan(Integer value) {
            addCriterion("giveup_time >", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveup_time >=", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeLessThan(Integer value) {
            addCriterion("giveup_time <", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeLessThanOrEqualTo(Integer value) {
            addCriterion("giveup_time <=", value, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeIn(List<Integer> values) {
            addCriterion("giveup_time in", values, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeNotIn(List<Integer> values) {
            addCriterion("giveup_time not in", values, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeBetween(Integer value1, Integer value2) {
            addCriterion("giveup_time between", value1, value2, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andGiveupTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("giveup_time not between", value1, value2, "giveupTime");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerIsNull() {
            addCriterion("overload_power is null");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerIsNotNull() {
            addCriterion("overload_power is not null");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerEqualTo(Integer value) {
            addCriterion("overload_power =", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerNotEqualTo(Integer value) {
            addCriterion("overload_power <>", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerGreaterThan(Integer value) {
            addCriterion("overload_power >", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("overload_power >=", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerLessThan(Integer value) {
            addCriterion("overload_power <", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerLessThanOrEqualTo(Integer value) {
            addCriterion("overload_power <=", value, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerIn(List<Integer> values) {
            addCriterion("overload_power in", values, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerNotIn(List<Integer> values) {
            addCriterion("overload_power not in", values, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerBetween(Integer value1, Integer value2) {
            addCriterion("overload_power between", value1, value2, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andOverloadPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("overload_power not between", value1, value2, "overloadPower");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNull() {
            addCriterion("free_charge is null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIsNotNull() {
            addCriterion("free_charge is not null");
            return (Criteria) this;
        }

        public Criteria andFreeChargeEqualTo(Integer value) {
            addCriterion("free_charge =", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotEqualTo(Integer value) {
            addCriterion("free_charge <>", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThan(Integer value) {
            addCriterion("free_charge >", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_charge >=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThan(Integer value) {
            addCriterion("free_charge <", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeLessThanOrEqualTo(Integer value) {
            addCriterion("free_charge <=", value, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeIn(List<Integer> values) {
            addCriterion("free_charge in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotIn(List<Integer> values) {
            addCriterion("free_charge not in", values, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeBetween(Integer value1, Integer value2) {
            addCriterion("free_charge between", value1, value2, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andFreeChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("free_charge not between", value1, value2, "freeCharge");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressIsNull() {
            addCriterion("device_province_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressIsNotNull() {
            addCriterion("device_province_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressEqualTo(String value) {
            addCriterion("device_province_address =", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressNotEqualTo(String value) {
            addCriterion("device_province_address <>", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressGreaterThan(String value) {
            addCriterion("device_province_address >", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_province_address >=", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressLessThan(String value) {
            addCriterion("device_province_address <", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressLessThanOrEqualTo(String value) {
            addCriterion("device_province_address <=", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressLike(String value) {
            addCriterion("device_province_address like", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressNotLike(String value) {
            addCriterion("device_province_address not like", value, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressIn(List<String> values) {
            addCriterion("device_province_address in", values, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressNotIn(List<String> values) {
            addCriterion("device_province_address not in", values, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressBetween(String value1, String value2) {
            addCriterion("device_province_address between", value1, value2, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceProvinceAddressNotBetween(String value1, String value2) {
            addCriterion("device_province_address not between", value1, value2, "deviceProvinceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressIsNull() {
            addCriterion("device_city_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressIsNotNull() {
            addCriterion("device_city_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressEqualTo(String value) {
            addCriterion("device_city_address =", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressNotEqualTo(String value) {
            addCriterion("device_city_address <>", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressGreaterThan(String value) {
            addCriterion("device_city_address >", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_city_address >=", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressLessThan(String value) {
            addCriterion("device_city_address <", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressLessThanOrEqualTo(String value) {
            addCriterion("device_city_address <=", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressLike(String value) {
            addCriterion("device_city_address like", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressNotLike(String value) {
            addCriterion("device_city_address not like", value, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressIn(List<String> values) {
            addCriterion("device_city_address in", values, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressNotIn(List<String> values) {
            addCriterion("device_city_address not in", values, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressBetween(String value1, String value2) {
            addCriterion("device_city_address between", value1, value2, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceCityAddressNotBetween(String value1, String value2) {
            addCriterion("device_city_address not between", value1, value2, "deviceCityAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressIsNull() {
            addCriterion("device_area_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressIsNotNull() {
            addCriterion("device_area_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressEqualTo(String value) {
            addCriterion("device_area_address =", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressNotEqualTo(String value) {
            addCriterion("device_area_address <>", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressGreaterThan(String value) {
            addCriterion("device_area_address >", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_area_address >=", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressLessThan(String value) {
            addCriterion("device_area_address <", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressLessThanOrEqualTo(String value) {
            addCriterion("device_area_address <=", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressLike(String value) {
            addCriterion("device_area_address like", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressNotLike(String value) {
            addCriterion("device_area_address not like", value, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressIn(List<String> values) {
            addCriterion("device_area_address in", values, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressNotIn(List<String> values) {
            addCriterion("device_area_address not in", values, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressBetween(String value1, String value2) {
            addCriterion("device_area_address between", value1, value2, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAreaAddressNotBetween(String value1, String value2) {
            addCriterion("device_area_address not between", value1, value2, "deviceAreaAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressIsNull() {
            addCriterion("device_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressIsNotNull() {
            addCriterion("device_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressEqualTo(String value) {
            addCriterion("device_detail_address =", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressNotEqualTo(String value) {
            addCriterion("device_detail_address <>", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressGreaterThan(String value) {
            addCriterion("device_detail_address >", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_detail_address >=", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressLessThan(String value) {
            addCriterion("device_detail_address <", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("device_detail_address <=", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressLike(String value) {
            addCriterion("device_detail_address like", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressNotLike(String value) {
            addCriterion("device_detail_address not like", value, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressIn(List<String> values) {
            addCriterion("device_detail_address in", values, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressNotIn(List<String> values) {
            addCriterion("device_detail_address not in", values, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressBetween(String value1, String value2) {
            addCriterion("device_detail_address between", value1, value2, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceDetailAddressNotBetween(String value1, String value2) {
            addCriterion("device_detail_address not between", value1, value2, "deviceDetailAddress");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcIsNull() {
            addCriterion("max_charge_time_dc is null");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcIsNotNull() {
            addCriterion("max_charge_time_dc is not null");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcEqualTo(Integer value) {
            addCriterion("max_charge_time_dc =", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcNotEqualTo(Integer value) {
            addCriterion("max_charge_time_dc <>", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcGreaterThan(Integer value) {
            addCriterion("max_charge_time_dc >", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_charge_time_dc >=", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcLessThan(Integer value) {
            addCriterion("max_charge_time_dc <", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcLessThanOrEqualTo(Integer value) {
            addCriterion("max_charge_time_dc <=", value, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcIn(List<Integer> values) {
            addCriterion("max_charge_time_dc in", values, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcNotIn(List<Integer> values) {
            addCriterion("max_charge_time_dc not in", values, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcBetween(Integer value1, Integer value2) {
            addCriterion("max_charge_time_dc between", value1, value2, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andMaxChargeTimeDcNotBetween(Integer value1, Integer value2) {
            addCriterion("max_charge_time_dc not between", value1, value2, "maxChargeTimeDc");
            return (Criteria) this;
        }

        public Criteria andPower1250wIsNull() {
            addCriterion("power1_250W is null");
            return (Criteria) this;
        }

        public Criteria andPower1250wIsNotNull() {
            addCriterion("power1_250W is not null");
            return (Criteria) this;
        }

        public Criteria andPower1250wEqualTo(Integer value) {
            addCriterion("power1_250W =", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wNotEqualTo(Integer value) {
            addCriterion("power1_250W <>", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wGreaterThan(Integer value) {
            addCriterion("power1_250W >", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wGreaterThanOrEqualTo(Integer value) {
            addCriterion("power1_250W >=", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wLessThan(Integer value) {
            addCriterion("power1_250W <", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wLessThanOrEqualTo(Integer value) {
            addCriterion("power1_250W <=", value, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wIn(List<Integer> values) {
            addCriterion("power1_250W in", values, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wNotIn(List<Integer> values) {
            addCriterion("power1_250W not in", values, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wBetween(Integer value1, Integer value2) {
            addCriterion("power1_250W between", value1, value2, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower1250wNotBetween(Integer value1, Integer value2) {
            addCriterion("power1_250W not between", value1, value2, "power1250w");
            return (Criteria) this;
        }

        public Criteria andPower2350wIsNull() {
            addCriterion("power2_350W is null");
            return (Criteria) this;
        }

        public Criteria andPower2350wIsNotNull() {
            addCriterion("power2_350W is not null");
            return (Criteria) this;
        }

        public Criteria andPower2350wEqualTo(Integer value) {
            addCriterion("power2_350W =", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wNotEqualTo(Integer value) {
            addCriterion("power2_350W <>", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wGreaterThan(Integer value) {
            addCriterion("power2_350W >", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wGreaterThanOrEqualTo(Integer value) {
            addCriterion("power2_350W >=", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wLessThan(Integer value) {
            addCriterion("power2_350W <", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wLessThanOrEqualTo(Integer value) {
            addCriterion("power2_350W <=", value, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wIn(List<Integer> values) {
            addCriterion("power2_350W in", values, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wNotIn(List<Integer> values) {
            addCriterion("power2_350W not in", values, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wBetween(Integer value1, Integer value2) {
            addCriterion("power2_350W between", value1, value2, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower2350wNotBetween(Integer value1, Integer value2) {
            addCriterion("power2_350W not between", value1, value2, "power2350w");
            return (Criteria) this;
        }

        public Criteria andPower3600wIsNull() {
            addCriterion("power3_600W is null");
            return (Criteria) this;
        }

        public Criteria andPower3600wIsNotNull() {
            addCriterion("power3_600W is not null");
            return (Criteria) this;
        }

        public Criteria andPower3600wEqualTo(Integer value) {
            addCriterion("power3_600W =", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wNotEqualTo(Integer value) {
            addCriterion("power3_600W <>", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wGreaterThan(Integer value) {
            addCriterion("power3_600W >", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wGreaterThanOrEqualTo(Integer value) {
            addCriterion("power3_600W >=", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wLessThan(Integer value) {
            addCriterion("power3_600W <", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wLessThanOrEqualTo(Integer value) {
            addCriterion("power3_600W <=", value, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wIn(List<Integer> values) {
            addCriterion("power3_600W in", values, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wNotIn(List<Integer> values) {
            addCriterion("power3_600W not in", values, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wBetween(Integer value1, Integer value2) {
            addCriterion("power3_600W between", value1, value2, "power3600w");
            return (Criteria) this;
        }

        public Criteria andPower3600wNotBetween(Integer value1, Integer value2) {
            addCriterion("power3_600W not between", value1, value2, "power3600w");
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