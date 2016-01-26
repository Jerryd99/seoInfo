package com.winndoo.seoinfo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjinfoExample() {
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

        public Criteria andProjtypeIdIsNull() {
            addCriterion("projtype_id is null");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdIsNotNull() {
            addCriterion("projtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdEqualTo(Integer value) {
            addCriterion("projtype_id =", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdNotEqualTo(Integer value) {
            addCriterion("projtype_id <>", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdGreaterThan(Integer value) {
            addCriterion("projtype_id >", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("projtype_id >=", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdLessThan(Integer value) {
            addCriterion("projtype_id <", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("projtype_id <=", value, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdIn(List<Integer> values) {
            addCriterion("projtype_id in", values, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdNotIn(List<Integer> values) {
            addCriterion("projtype_id not in", values, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("projtype_id between", value1, value2, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andProjtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("projtype_id not between", value1, value2, "projtypeId");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andRateresultIsNull() {
            addCriterion("rateResult is null");
            return (Criteria) this;
        }

        public Criteria andRateresultIsNotNull() {
            addCriterion("rateResult is not null");
            return (Criteria) this;
        }

        public Criteria andRateresultEqualTo(String value) {
            addCriterion("rateResult =", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultNotEqualTo(String value) {
            addCriterion("rateResult <>", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultGreaterThan(String value) {
            addCriterion("rateResult >", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultGreaterThanOrEqualTo(String value) {
            addCriterion("rateResult >=", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultLessThan(String value) {
            addCriterion("rateResult <", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultLessThanOrEqualTo(String value) {
            addCriterion("rateResult <=", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultLike(String value) {
            addCriterion("rateResult like", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultNotLike(String value) {
            addCriterion("rateResult not like", value, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultIn(List<String> values) {
            addCriterion("rateResult in", values, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultNotIn(List<String> values) {
            addCriterion("rateResult not in", values, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultBetween(String value1, String value2) {
            addCriterion("rateResult between", value1, value2, "rateresult");
            return (Criteria) this;
        }

        public Criteria andRateresultNotBetween(String value1, String value2) {
            addCriterion("rateResult not between", value1, value2, "rateresult");
            return (Criteria) this;
        }

        public Criteria andPricedesIsNull() {
            addCriterion("priceDes is null");
            return (Criteria) this;
        }

        public Criteria andPricedesIsNotNull() {
            addCriterion("priceDes is not null");
            return (Criteria) this;
        }

        public Criteria andPricedesEqualTo(String value) {
            addCriterion("priceDes =", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesNotEqualTo(String value) {
            addCriterion("priceDes <>", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesGreaterThan(String value) {
            addCriterion("priceDes >", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesGreaterThanOrEqualTo(String value) {
            addCriterion("priceDes >=", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesLessThan(String value) {
            addCriterion("priceDes <", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesLessThanOrEqualTo(String value) {
            addCriterion("priceDes <=", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesLike(String value) {
            addCriterion("priceDes like", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesNotLike(String value) {
            addCriterion("priceDes not like", value, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesIn(List<String> values) {
            addCriterion("priceDes in", values, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesNotIn(List<String> values) {
            addCriterion("priceDes not in", values, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesBetween(String value1, String value2) {
            addCriterion("priceDes between", value1, value2, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricedesNotBetween(String value1, String value2) {
            addCriterion("priceDes not between", value1, value2, "pricedes");
            return (Criteria) this;
        }

        public Criteria andPricefilenameIsNull() {
            addCriterion("priceFileName is null");
            return (Criteria) this;
        }

        public Criteria andPricefilenameIsNotNull() {
            addCriterion("priceFileName is not null");
            return (Criteria) this;
        }

        public Criteria andPricefilenameEqualTo(String value) {
            addCriterion("priceFileName =", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameNotEqualTo(String value) {
            addCriterion("priceFileName <>", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameGreaterThan(String value) {
            addCriterion("priceFileName >", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameGreaterThanOrEqualTo(String value) {
            addCriterion("priceFileName >=", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameLessThan(String value) {
            addCriterion("priceFileName <", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameLessThanOrEqualTo(String value) {
            addCriterion("priceFileName <=", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameLike(String value) {
            addCriterion("priceFileName like", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameNotLike(String value) {
            addCriterion("priceFileName not like", value, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameIn(List<String> values) {
            addCriterion("priceFileName in", values, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameNotIn(List<String> values) {
            addCriterion("priceFileName not in", values, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameBetween(String value1, String value2) {
            addCriterion("priceFileName between", value1, value2, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andPricefilenameNotBetween(String value1, String value2) {
            addCriterion("priceFileName not between", value1, value2, "pricefilename");
            return (Criteria) this;
        }

        public Criteria andDetaildesIsNull() {
            addCriterion("detailDes is null");
            return (Criteria) this;
        }

        public Criteria andDetaildesIsNotNull() {
            addCriterion("detailDes is not null");
            return (Criteria) this;
        }

        public Criteria andDetaildesEqualTo(String value) {
            addCriterion("detailDes =", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesNotEqualTo(String value) {
            addCriterion("detailDes <>", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesGreaterThan(String value) {
            addCriterion("detailDes >", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesGreaterThanOrEqualTo(String value) {
            addCriterion("detailDes >=", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesLessThan(String value) {
            addCriterion("detailDes <", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesLessThanOrEqualTo(String value) {
            addCriterion("detailDes <=", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesLike(String value) {
            addCriterion("detailDes like", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesNotLike(String value) {
            addCriterion("detailDes not like", value, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesIn(List<String> values) {
            addCriterion("detailDes in", values, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesNotIn(List<String> values) {
            addCriterion("detailDes not in", values, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesBetween(String value1, String value2) {
            addCriterion("detailDes between", value1, value2, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetaildesNotBetween(String value1, String value2) {
            addCriterion("detailDes not between", value1, value2, "detaildes");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameIsNull() {
            addCriterion("detailFileName is null");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameIsNotNull() {
            addCriterion("detailFileName is not null");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameEqualTo(String value) {
            addCriterion("detailFileName =", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameNotEqualTo(String value) {
            addCriterion("detailFileName <>", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameGreaterThan(String value) {
            addCriterion("detailFileName >", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("detailFileName >=", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameLessThan(String value) {
            addCriterion("detailFileName <", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameLessThanOrEqualTo(String value) {
            addCriterion("detailFileName <=", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameLike(String value) {
            addCriterion("detailFileName like", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameNotLike(String value) {
            addCriterion("detailFileName not like", value, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameIn(List<String> values) {
            addCriterion("detailFileName in", values, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameNotIn(List<String> values) {
            addCriterion("detailFileName not in", values, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameBetween(String value1, String value2) {
            addCriterion("detailFileName between", value1, value2, "detailfilename");
            return (Criteria) this;
        }

        public Criteria andDetailfilenameNotBetween(String value1, String value2) {
            addCriterion("detailFileName not between", value1, value2, "detailfilename");
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