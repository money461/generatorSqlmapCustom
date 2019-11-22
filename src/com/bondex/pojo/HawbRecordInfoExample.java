package com.bondex.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HawbRecordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HawbRecordInfoExample() {
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

        public Criteria andBoardIdIsNull() {
            addCriterion("board_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardIdIsNotNull() {
            addCriterion("board_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardIdEqualTo(String value) {
            addCriterion("board_id =", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotEqualTo(String value) {
            addCriterion("board_id <>", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThan(String value) {
            addCriterion("board_id >", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdGreaterThanOrEqualTo(String value) {
            addCriterion("board_id >=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThan(String value) {
            addCriterion("board_id <", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLessThanOrEqualTo(String value) {
            addCriterion("board_id <=", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdLike(String value) {
            addCriterion("board_id like", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotLike(String value) {
            addCriterion("board_id not like", value, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdIn(List<String> values) {
            addCriterion("board_id in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotIn(List<String> values) {
            addCriterion("board_id not in", values, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdBetween(String value1, String value2) {
            addCriterion("board_id between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andBoardIdNotBetween(String value1, String value2) {
            addCriterion("board_id not between", value1, value2, "boardId");
            return (Criteria) this;
        }

        public Criteria andMawbIdIsNull() {
            addCriterion("mawb_id is null");
            return (Criteria) this;
        }

        public Criteria andMawbIdIsNotNull() {
            addCriterion("mawb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMawbIdEqualTo(String value) {
            addCriterion("mawb_id =", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdNotEqualTo(String value) {
            addCriterion("mawb_id <>", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdGreaterThan(String value) {
            addCriterion("mawb_id >", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdGreaterThanOrEqualTo(String value) {
            addCriterion("mawb_id >=", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdLessThan(String value) {
            addCriterion("mawb_id <", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdLessThanOrEqualTo(String value) {
            addCriterion("mawb_id <=", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdLike(String value) {
            addCriterion("mawb_id like", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdNotLike(String value) {
            addCriterion("mawb_id not like", value, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdIn(List<String> values) {
            addCriterion("mawb_id in", values, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdNotIn(List<String> values) {
            addCriterion("mawb_id not in", values, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdBetween(String value1, String value2) {
            addCriterion("mawb_id between", value1, value2, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIdNotBetween(String value1, String value2) {
            addCriterion("mawb_id not between", value1, value2, "mawbId");
            return (Criteria) this;
        }

        public Criteria andMawbIsNull() {
            addCriterion("mawb is null");
            return (Criteria) this;
        }

        public Criteria andMawbIsNotNull() {
            addCriterion("mawb is not null");
            return (Criteria) this;
        }

        public Criteria andMawbEqualTo(String value) {
            addCriterion("mawb =", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbNotEqualTo(String value) {
            addCriterion("mawb <>", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbGreaterThan(String value) {
            addCriterion("mawb >", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbGreaterThanOrEqualTo(String value) {
            addCriterion("mawb >=", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbLessThan(String value) {
            addCriterion("mawb <", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbLessThanOrEqualTo(String value) {
            addCriterion("mawb <=", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbLike(String value) {
            addCriterion("mawb like", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbNotLike(String value) {
            addCriterion("mawb not like", value, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbIn(List<String> values) {
            addCriterion("mawb in", values, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbNotIn(List<String> values) {
            addCriterion("mawb not in", values, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbBetween(String value1, String value2) {
            addCriterion("mawb between", value1, value2, "mawb");
            return (Criteria) this;
        }

        public Criteria andMawbNotBetween(String value1, String value2) {
            addCriterion("mawb not between", value1, value2, "mawb");
            return (Criteria) this;
        }

        public Criteria andHawbIdIsNull() {
            addCriterion("hawb_id is null");
            return (Criteria) this;
        }

        public Criteria andHawbIdIsNotNull() {
            addCriterion("hawb_id is not null");
            return (Criteria) this;
        }

        public Criteria andHawbIdEqualTo(String value) {
            addCriterion("hawb_id =", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdNotEqualTo(String value) {
            addCriterion("hawb_id <>", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdGreaterThan(String value) {
            addCriterion("hawb_id >", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdGreaterThanOrEqualTo(String value) {
            addCriterion("hawb_id >=", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdLessThan(String value) {
            addCriterion("hawb_id <", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdLessThanOrEqualTo(String value) {
            addCriterion("hawb_id <=", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdLike(String value) {
            addCriterion("hawb_id like", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdNotLike(String value) {
            addCriterion("hawb_id not like", value, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdIn(List<String> values) {
            addCriterion("hawb_id in", values, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdNotIn(List<String> values) {
            addCriterion("hawb_id not in", values, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdBetween(String value1, String value2) {
            addCriterion("hawb_id between", value1, value2, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIdNotBetween(String value1, String value2) {
            addCriterion("hawb_id not between", value1, value2, "hawbId");
            return (Criteria) this;
        }

        public Criteria andHawbIsNull() {
            addCriterion("hawb is null");
            return (Criteria) this;
        }

        public Criteria andHawbIsNotNull() {
            addCriterion("hawb is not null");
            return (Criteria) this;
        }

        public Criteria andHawbEqualTo(String value) {
            addCriterion("hawb =", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbNotEqualTo(String value) {
            addCriterion("hawb <>", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbGreaterThan(String value) {
            addCriterion("hawb >", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbGreaterThanOrEqualTo(String value) {
            addCriterion("hawb >=", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbLessThan(String value) {
            addCriterion("hawb <", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbLessThanOrEqualTo(String value) {
            addCriterion("hawb <=", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbLike(String value) {
            addCriterion("hawb like", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbNotLike(String value) {
            addCriterion("hawb not like", value, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbIn(List<String> values) {
            addCriterion("hawb in", values, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbNotIn(List<String> values) {
            addCriterion("hawb not in", values, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbBetween(String value1, String value2) {
            addCriterion("hawb between", value1, value2, "hawb");
            return (Criteria) this;
        }

        public Criteria andHawbNotBetween(String value1, String value2) {
            addCriterion("hawb not between", value1, value2, "hawb");
            return (Criteria) this;
        }

        public Criteria andPercentumIsNull() {
            addCriterion("percentum is null");
            return (Criteria) this;
        }

        public Criteria andPercentumIsNotNull() {
            addCriterion("percentum is not null");
            return (Criteria) this;
        }

        public Criteria andPercentumEqualTo(String value) {
            addCriterion("percentum =", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumNotEqualTo(String value) {
            addCriterion("percentum <>", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumGreaterThan(String value) {
            addCriterion("percentum >", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumGreaterThanOrEqualTo(String value) {
            addCriterion("percentum >=", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumLessThan(String value) {
            addCriterion("percentum <", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumLessThanOrEqualTo(String value) {
            addCriterion("percentum <=", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumLike(String value) {
            addCriterion("percentum like", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumNotLike(String value) {
            addCriterion("percentum not like", value, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumIn(List<String> values) {
            addCriterion("percentum in", values, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumNotIn(List<String> values) {
            addCriterion("percentum not in", values, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumBetween(String value1, String value2) {
            addCriterion("percentum between", value1, value2, "percentum");
            return (Criteria) this;
        }

        public Criteria andPercentumNotBetween(String value1, String value2) {
            addCriterion("percentum not between", value1, value2, "percentum");
            return (Criteria) this;
        }

        public Criteria andBoxIsNull() {
            addCriterion("box is null");
            return (Criteria) this;
        }

        public Criteria andBoxIsNotNull() {
            addCriterion("box is not null");
            return (Criteria) this;
        }

        public Criteria andBoxEqualTo(Integer value) {
            addCriterion("box =", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotEqualTo(Integer value) {
            addCriterion("box <>", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxGreaterThan(Integer value) {
            addCriterion("box >", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxGreaterThanOrEqualTo(Integer value) {
            addCriterion("box >=", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxLessThan(Integer value) {
            addCriterion("box <", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxLessThanOrEqualTo(Integer value) {
            addCriterion("box <=", value, "box");
            return (Criteria) this;
        }

        public Criteria andBoxIn(List<Integer> values) {
            addCriterion("box in", values, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotIn(List<Integer> values) {
            addCriterion("box not in", values, "box");
            return (Criteria) this;
        }

        public Criteria andBoxBetween(Integer value1, Integer value2) {
            addCriterion("box between", value1, value2, "box");
            return (Criteria) this;
        }

        public Criteria andBoxNotBetween(Integer value1, Integer value2) {
            addCriterion("box not between", value1, value2, "box");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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