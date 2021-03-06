package shard.jdbc.common.entity;

import java.util.ArrayList;
import java.util.List;

public class TableTwoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableTwoExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andBackOneIsNull() {
            addCriterion("back_one is null");
            return (Criteria) this;
        }

        public Criteria andBackOneIsNotNull() {
            addCriterion("back_one is not null");
            return (Criteria) this;
        }

        public Criteria andBackOneEqualTo(String value) {
            addCriterion("back_one =", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneNotEqualTo(String value) {
            addCriterion("back_one <>", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneGreaterThan(String value) {
            addCriterion("back_one >", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneGreaterThanOrEqualTo(String value) {
            addCriterion("back_one >=", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneLessThan(String value) {
            addCriterion("back_one <", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneLessThanOrEqualTo(String value) {
            addCriterion("back_one <=", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneLike(String value) {
            addCriterion("back_one like", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneNotLike(String value) {
            addCriterion("back_one not like", value, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneIn(List<String> values) {
            addCriterion("back_one in", values, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneNotIn(List<String> values) {
            addCriterion("back_one not in", values, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneBetween(String value1, String value2) {
            addCriterion("back_one between", value1, value2, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackOneNotBetween(String value1, String value2) {
            addCriterion("back_one not between", value1, value2, "backOne");
            return (Criteria) this;
        }

        public Criteria andBackTwoIsNull() {
            addCriterion("back_two is null");
            return (Criteria) this;
        }

        public Criteria andBackTwoIsNotNull() {
            addCriterion("back_two is not null");
            return (Criteria) this;
        }

        public Criteria andBackTwoEqualTo(String value) {
            addCriterion("back_two =", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoNotEqualTo(String value) {
            addCriterion("back_two <>", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoGreaterThan(String value) {
            addCriterion("back_two >", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoGreaterThanOrEqualTo(String value) {
            addCriterion("back_two >=", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoLessThan(String value) {
            addCriterion("back_two <", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoLessThanOrEqualTo(String value) {
            addCriterion("back_two <=", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoLike(String value) {
            addCriterion("back_two like", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoNotLike(String value) {
            addCriterion("back_two not like", value, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoIn(List<String> values) {
            addCriterion("back_two in", values, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoNotIn(List<String> values) {
            addCriterion("back_two not in", values, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoBetween(String value1, String value2) {
            addCriterion("back_two between", value1, value2, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackTwoNotBetween(String value1, String value2) {
            addCriterion("back_two not between", value1, value2, "backTwo");
            return (Criteria) this;
        }

        public Criteria andBackThreeIsNull() {
            addCriterion("back_three is null");
            return (Criteria) this;
        }

        public Criteria andBackThreeIsNotNull() {
            addCriterion("back_three is not null");
            return (Criteria) this;
        }

        public Criteria andBackThreeEqualTo(String value) {
            addCriterion("back_three =", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeNotEqualTo(String value) {
            addCriterion("back_three <>", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeGreaterThan(String value) {
            addCriterion("back_three >", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeGreaterThanOrEqualTo(String value) {
            addCriterion("back_three >=", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeLessThan(String value) {
            addCriterion("back_three <", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeLessThanOrEqualTo(String value) {
            addCriterion("back_three <=", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeLike(String value) {
            addCriterion("back_three like", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeNotLike(String value) {
            addCriterion("back_three not like", value, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeIn(List<String> values) {
            addCriterion("back_three in", values, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeNotIn(List<String> values) {
            addCriterion("back_three not in", values, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeBetween(String value1, String value2) {
            addCriterion("back_three between", value1, value2, "backThree");
            return (Criteria) this;
        }

        public Criteria andBackThreeNotBetween(String value1, String value2) {
            addCriterion("back_three not between", value1, value2, "backThree");
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