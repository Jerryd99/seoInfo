package com.winndoo.seoinfo.po;

import java.util.ArrayList;
import java.util.List;

public class ProjtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjtypeExample() {
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

        public Criteria andProjnameIsNull() {
            addCriterion("projName is null");
            return (Criteria) this;
        }

        public Criteria andProjnameIsNotNull() {
            addCriterion("projName is not null");
            return (Criteria) this;
        }

        public Criteria andProjnameEqualTo(String value) {
            addCriterion("projName =", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotEqualTo(String value) {
            addCriterion("projName <>", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameGreaterThan(String value) {
            addCriterion("projName >", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameGreaterThanOrEqualTo(String value) {
            addCriterion("projName >=", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLessThan(String value) {
            addCriterion("projName <", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLessThanOrEqualTo(String value) {
            addCriterion("projName <=", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLike(String value) {
            addCriterion("projName like", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotLike(String value) {
            addCriterion("projName not like", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameIn(List<String> values) {
            addCriterion("projName in", values, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotIn(List<String> values) {
            addCriterion("projName not in", values, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameBetween(String value1, String value2) {
            addCriterion("projName between", value1, value2, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotBetween(String value1, String value2) {
            addCriterion("projName not between", value1, value2, "projname");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdIsNull() {
            addCriterion("tabletype_id is null");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdIsNotNull() {
            addCriterion("tabletype_id is not null");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdEqualTo(Integer value) {
            addCriterion("tabletype_id =", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdNotEqualTo(Integer value) {
            addCriterion("tabletype_id <>", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdGreaterThan(Integer value) {
            addCriterion("tabletype_id >", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabletype_id >=", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdLessThan(Integer value) {
            addCriterion("tabletype_id <", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("tabletype_id <=", value, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdIn(List<Integer> values) {
            addCriterion("tabletype_id in", values, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdNotIn(List<Integer> values) {
            addCriterion("tabletype_id not in", values, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdBetween(Integer value1, Integer value2) {
            addCriterion("tabletype_id between", value1, value2, "tabletypeId");
            return (Criteria) this;
        }

        public Criteria andTabletypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tabletype_id not between", value1, value2, "tabletypeId");
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