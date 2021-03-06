package com.yanblog.model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SnsCategoryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SnsCategoryExample() {
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

        public Criteria andSnsCategoryIdIsNull() {
            addCriterion("sns_category_id is null");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdIsNotNull() {
            addCriterion("sns_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdEqualTo(Long value) {
            addCriterion("sns_category_id =", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdNotEqualTo(Long value) {
            addCriterion("sns_category_id <>", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdGreaterThan(Long value) {
            addCriterion("sns_category_id >", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sns_category_id >=", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdLessThan(Long value) {
            addCriterion("sns_category_id <", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("sns_category_id <=", value, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdIn(List<Long> values) {
            addCriterion("sns_category_id in", values, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdNotIn(List<Long> values) {
            addCriterion("sns_category_id not in", values, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdBetween(Long value1, Long value2) {
            addCriterion("sns_category_id between", value1, value2, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("sns_category_id not between", value1, value2, "snsCategoryId");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameIsNull() {
            addCriterion("sns_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameIsNotNull() {
            addCriterion("sns_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameEqualTo(String value) {
            addCriterion("sns_category_name =", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameNotEqualTo(String value) {
            addCriterion("sns_category_name <>", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameGreaterThan(String value) {
            addCriterion("sns_category_name >", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("sns_category_name >=", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameLessThan(String value) {
            addCriterion("sns_category_name <", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("sns_category_name <=", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameLike(String value) {
            addCriterion("sns_category_name like", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameNotLike(String value) {
            addCriterion("sns_category_name not like", value, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameIn(List<String> values) {
            addCriterion("sns_category_name in", values, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameNotIn(List<String> values) {
            addCriterion("sns_category_name not in", values, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameBetween(String value1, String value2) {
            addCriterion("sns_category_name between", value1, value2, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andSnsCategoryNameNotBetween(String value1, String value2) {
            addCriterion("sns_category_name not between", value1, value2, "snsCategoryName");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdIsNull() {
            addCriterion("last_sns_category_id is null");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdIsNotNull() {
            addCriterion("last_sns_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdEqualTo(Long value) {
            addCriterion("last_sns_category_id =", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdNotEqualTo(Long value) {
            addCriterion("last_sns_category_id <>", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdGreaterThan(Long value) {
            addCriterion("last_sns_category_id >", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_sns_category_id >=", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdLessThan(Long value) {
            addCriterion("last_sns_category_id <", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("last_sns_category_id <=", value, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdIn(List<Long> values) {
            addCriterion("last_sns_category_id in", values, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdNotIn(List<Long> values) {
            addCriterion("last_sns_category_id not in", values, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdBetween(Long value1, Long value2) {
            addCriterion("last_sns_category_id between", value1, value2, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastSnsCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("last_sns_category_id not between", value1, value2, "lastSnsCategoryId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
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