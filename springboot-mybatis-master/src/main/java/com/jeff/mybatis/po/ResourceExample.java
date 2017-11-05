package com.jeff.mybatis.po;

import java.util.ArrayList;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andResnameIsNull() {
            addCriterion("resname is null");
            return (Criteria) this;
        }

        public Criteria andResnameIsNotNull() {
            addCriterion("resname is not null");
            return (Criteria) this;
        }

        public Criteria andResnameEqualTo(String value) {
            addCriterion("resname =", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotEqualTo(String value) {
            addCriterion("resname <>", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThan(String value) {
            addCriterion("resname >", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThanOrEqualTo(String value) {
            addCriterion("resname >=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThan(String value) {
            addCriterion("resname <", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThanOrEqualTo(String value) {
            addCriterion("resname <=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLike(String value) {
            addCriterion("resname like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotLike(String value) {
            addCriterion("resname not like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameIn(List<String> values) {
            addCriterion("resname in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotIn(List<String> values) {
            addCriterion("resname not in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameBetween(String value1, String value2) {
            addCriterion("resname between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotBetween(String value1, String value2) {
            addCriterion("resname not between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andResurlIsNull() {
            addCriterion("resurl is null");
            return (Criteria) this;
        }

        public Criteria andResurlIsNotNull() {
            addCriterion("resurl is not null");
            return (Criteria) this;
        }

        public Criteria andResurlEqualTo(String value) {
            addCriterion("resurl =", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotEqualTo(String value) {
            addCriterion("resurl <>", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlGreaterThan(String value) {
            addCriterion("resurl >", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlGreaterThanOrEqualTo(String value) {
            addCriterion("resurl >=", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLessThan(String value) {
            addCriterion("resurl <", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLessThanOrEqualTo(String value) {
            addCriterion("resurl <=", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLike(String value) {
            addCriterion("resurl like", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotLike(String value) {
            addCriterion("resurl not like", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlIn(List<String> values) {
            addCriterion("resurl in", values, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotIn(List<String> values) {
            addCriterion("resurl not in", values, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlBetween(String value1, String value2) {
            addCriterion("resurl between", value1, value2, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotBetween(String value1, String value2) {
            addCriterion("resurl not between", value1, value2, "resurl");
            return (Criteria) this;
        }

        public Criteria andResdepIsNull() {
            addCriterion("resdep is null");
            return (Criteria) this;
        }

        public Criteria andResdepIsNotNull() {
            addCriterion("resdep is not null");
            return (Criteria) this;
        }

        public Criteria andResdepEqualTo(Integer value) {
            addCriterion("resdep =", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepNotEqualTo(Integer value) {
            addCriterion("resdep <>", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepGreaterThan(Integer value) {
            addCriterion("resdep >", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepGreaterThanOrEqualTo(Integer value) {
            addCriterion("resdep >=", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepLessThan(Integer value) {
            addCriterion("resdep <", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepLessThanOrEqualTo(Integer value) {
            addCriterion("resdep <=", value, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepIn(List<Integer> values) {
            addCriterion("resdep in", values, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepNotIn(List<Integer> values) {
            addCriterion("resdep not in", values, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepBetween(Integer value1, Integer value2) {
            addCriterion("resdep between", value1, value2, "resdep");
            return (Criteria) this;
        }

        public Criteria andResdepNotBetween(Integer value1, Integer value2) {
            addCriterion("resdep not between", value1, value2, "resdep");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andRestypeIsNull() {
            addCriterion("restype is null");
            return (Criteria) this;
        }

        public Criteria andRestypeIsNotNull() {
            addCriterion("restype is not null");
            return (Criteria) this;
        }

        public Criteria andRestypeEqualTo(Integer value) {
            addCriterion("restype =", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotEqualTo(Integer value) {
            addCriterion("restype <>", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeGreaterThan(Integer value) {
            addCriterion("restype >", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("restype >=", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeLessThan(Integer value) {
            addCriterion("restype <", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeLessThanOrEqualTo(Integer value) {
            addCriterion("restype <=", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeIn(List<Integer> values) {
            addCriterion("restype in", values, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotIn(List<Integer> values) {
            addCriterion("restype not in", values, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeBetween(Integer value1, Integer value2) {
            addCriterion("restype between", value1, value2, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotBetween(Integer value1, Integer value2) {
            addCriterion("restype not between", value1, value2, "restype");
            return (Criteria) this;
        }

        public Criteria andResorderIsNull() {
            addCriterion("resorder is null");
            return (Criteria) this;
        }

        public Criteria andResorderIsNotNull() {
            addCriterion("resorder is not null");
            return (Criteria) this;
        }

        public Criteria andResorderEqualTo(Integer value) {
            addCriterion("resorder =", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderNotEqualTo(Integer value) {
            addCriterion("resorder <>", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderGreaterThan(Integer value) {
            addCriterion("resorder >", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("resorder >=", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderLessThan(Integer value) {
            addCriterion("resorder <", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderLessThanOrEqualTo(Integer value) {
            addCriterion("resorder <=", value, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderIn(List<Integer> values) {
            addCriterion("resorder in", values, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderNotIn(List<Integer> values) {
            addCriterion("resorder not in", values, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderBetween(Integer value1, Integer value2) {
            addCriterion("resorder between", value1, value2, "resorder");
            return (Criteria) this;
        }

        public Criteria andResorderNotBetween(Integer value1, Integer value2) {
            addCriterion("resorder not between", value1, value2, "resorder");
            return (Criteria) this;
        }

        public Criteria andResauthIsNull() {
            addCriterion("resauth is null");
            return (Criteria) this;
        }

        public Criteria andResauthIsNotNull() {
            addCriterion("resauth is not null");
            return (Criteria) this;
        }

        public Criteria andResauthEqualTo(Integer value) {
            addCriterion("resauth =", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthNotEqualTo(Integer value) {
            addCriterion("resauth <>", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthGreaterThan(Integer value) {
            addCriterion("resauth >", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("resauth >=", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthLessThan(Integer value) {
            addCriterion("resauth <", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthLessThanOrEqualTo(Integer value) {
            addCriterion("resauth <=", value, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthIn(List<Integer> values) {
            addCriterion("resauth in", values, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthNotIn(List<Integer> values) {
            addCriterion("resauth not in", values, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthBetween(Integer value1, Integer value2) {
            addCriterion("resauth between", value1, value2, "resauth");
            return (Criteria) this;
        }

        public Criteria andResauthNotBetween(Integer value1, Integer value2) {
            addCriterion("resauth not between", value1, value2, "resauth");
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