package com.es.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HolidayExample {
  
	protected String orderByClause;
	
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */public HolidayExample(){oredCriteria=new ArrayList<Criteria>();}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */public List<Criteria> getOredCriteria(){return oredCriteria;}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}protected void addCriterionForJDBCDate(String condition,Date value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}addCriterion(condition,new java.sql.Date(value.getTime()),property);}protected void addCriterionForJDBCDate(String condition,List<Date> values,String property){if (values == null || values.size() == 0){throw new RuntimeException("Value list for " + property + " cannot be null or empty");}List<java.sql.Date> dateList=new ArrayList<java.sql.Date>();Iterator<Date> iter=values.iterator();while (iter.hasNext()){dateList.add(new java.sql.Date(iter.next().getTime()));}addCriterion(condition,dateList,property);}protected void addCriterionForJDBCDate(String condition,Date value1,Date value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}addCriterion(condition,new java.sql.Date(value1.getTime()),new java.sql.Date(value2.getTime()),property);}public Criteria andHolidayIdIsNull(){addCriterion("holiday_id is null");return (Criteria)this;}public Criteria andHolidayIdIsNotNull(){addCriterion("holiday_id is not null");return (Criteria)this;}public Criteria andHolidayIdEqualTo(Integer value){addCriterion("holiday_id =",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdNotEqualTo(Integer value){addCriterion("holiday_id <>",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdGreaterThan(Integer value){addCriterion("holiday_id >",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdGreaterThanOrEqualTo(Integer value){addCriterion("holiday_id >=",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdLessThan(Integer value){addCriterion("holiday_id <",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdLessThanOrEqualTo(Integer value){addCriterion("holiday_id <=",value,"holidayId");return (Criteria)this;}public Criteria andHolidayIdIn(List<Integer> values){addCriterion("holiday_id in",values,"holidayId");return (Criteria)this;}public Criteria andHolidayIdNotIn(List<Integer> values){addCriterion("holiday_id not in",values,"holidayId");return (Criteria)this;}public Criteria andHolidayIdBetween(Integer value1,Integer value2){addCriterion("holiday_id between",value1,value2,"holidayId");return (Criteria)this;}public Criteria andHolidayIdNotBetween(Integer value1,Integer value2){addCriterion("holiday_id not between",value1,value2,"holidayId");return (Criteria)this;}public Criteria andDaysIsNull(){addCriterion("days is null");return (Criteria)this;}public Criteria andDaysIsNotNull(){addCriterion("days is not null");return (Criteria)this;}public Criteria andDaysEqualTo(Integer value){addCriterion("days =",value,"days");return (Criteria)this;}public Criteria andDaysNotEqualTo(Integer value){addCriterion("days <>",value,"days");return (Criteria)this;}public Criteria andDaysGreaterThan(Integer value){addCriterion("days >",value,"days");return (Criteria)this;}public Criteria andDaysGreaterThanOrEqualTo(Integer value){addCriterion("days >=",value,"days");return (Criteria)this;}public Criteria andDaysLessThan(Integer value){addCriterion("days <",value,"days");return (Criteria)this;}public Criteria andDaysLessThanOrEqualTo(Integer value){addCriterion("days <=",value,"days");return (Criteria)this;}public Criteria andDaysIn(List<Integer> values){addCriterion("days in",values,"days");return (Criteria)this;}public Criteria andDaysNotIn(List<Integer> values){addCriterion("days not in",values,"days");return (Criteria)this;}public Criteria andDaysBetween(Integer value1,Integer value2){addCriterion("days between",value1,value2,"days");return (Criteria)this;}public Criteria andDaysNotBetween(Integer value1,Integer value2){addCriterion("days not between",value1,value2,"days");return (Criteria)this;}public Criteria andStartTimeIsNull(){addCriterion("start_time is null");return (Criteria)this;}public Criteria andStartTimeIsNotNull(){addCriterion("start_time is not null");return (Criteria)this;}public Criteria andStartTimeEqualTo(Date value){addCriterionForJDBCDate("start_time =",value,"startTime");return (Criteria)this;}public Criteria andStartTimeNotEqualTo(Date value){addCriterionForJDBCDate("start_time <>",value,"startTime");return (Criteria)this;}public Criteria andStartTimeGreaterThan(Date value){addCriterionForJDBCDate("start_time >",value,"startTime");return (Criteria)this;}public Criteria andStartTimeGreaterThanOrEqualTo(Date value){addCriterionForJDBCDate("start_time >=",value,"startTime");return (Criteria)this;}public Criteria andStartTimeLessThan(Date value){addCriterionForJDBCDate("start_time <",value,"startTime");return (Criteria)this;}public Criteria andStartTimeLessThanOrEqualTo(Date value){addCriterionForJDBCDate("start_time <=",value,"startTime");return (Criteria)this;}public Criteria andStartTimeIn(List<Date> values){addCriterionForJDBCDate("start_time in",values,"startTime");return (Criteria)this;}public Criteria andStartTimeNotIn(List<Date> values){addCriterionForJDBCDate("start_time not in",values,"startTime");return (Criteria)this;}public Criteria andStartTimeBetween(Date value1,Date value2){addCriterionForJDBCDate("start_time between",value1,value2,"startTime");return (Criteria)this;}public Criteria andStartTimeNotBetween(Date value1,Date value2){addCriterionForJDBCDate("start_time not between",value1,value2,"startTime");return (Criteria)this;}public Criteria andEndTimeIsNull(){addCriterion("end_time is null");return (Criteria)this;}public Criteria andEndTimeIsNotNull(){addCriterion("end_time is not null");return (Criteria)this;}public Criteria andEndTimeEqualTo(Date value){addCriterionForJDBCDate("end_time =",value,"endTime");return (Criteria)this;}public Criteria andEndTimeNotEqualTo(Date value){addCriterionForJDBCDate("end_time <>",value,"endTime");return (Criteria)this;}public Criteria andEndTimeGreaterThan(Date value){addCriterionForJDBCDate("end_time >",value,"endTime");return (Criteria)this;}public Criteria andEndTimeGreaterThanOrEqualTo(Date value){addCriterionForJDBCDate("end_time >=",value,"endTime");return (Criteria)this;}public Criteria andEndTimeLessThan(Date value){addCriterionForJDBCDate("end_time <",value,"endTime");return (Criteria)this;}public Criteria andEndTimeLessThanOrEqualTo(Date value){addCriterionForJDBCDate("end_time <=",value,"endTime");return (Criteria)this;}public Criteria andEndTimeIn(List<Date> values){addCriterionForJDBCDate("end_time in",values,"endTime");return (Criteria)this;}public Criteria andEndTimeNotIn(List<Date> values){addCriterionForJDBCDate("end_time not in",values,"endTime");return (Criteria)this;}public Criteria andEndTimeBetween(Date value1,Date value2){addCriterionForJDBCDate("end_time between",value1,value2,"endTime");return (Criteria)this;}public Criteria andEndTimeNotBetween(Date value1,Date value2){addCriterionForJDBCDate("end_time not between",value1,value2,"endTime");return (Criteria)this;}public Criteria andAlidIsNull(){addCriterion("alid is null");return (Criteria)this;}public Criteria andAlidIsNotNull(){addCriterion("alid is not null");return (Criteria)this;}public Criteria andAlidEqualTo(String value){addCriterion("alid =",value,"alid");return (Criteria)this;}public Criteria andAlidNotEqualTo(String value){addCriterion("alid <>",value,"alid");return (Criteria)this;}public Criteria andAlidGreaterThan(String value){addCriterion("alid >",value,"alid");return (Criteria)this;}public Criteria andAlidGreaterThanOrEqualTo(String value){addCriterion("alid >=",value,"alid");return (Criteria)this;}public Criteria andAlidLessThan(String value){addCriterion("alid <",value,"alid");return (Criteria)this;}public Criteria andAlidLessThanOrEqualTo(String value){addCriterion("alid <=",value,"alid");return (Criteria)this;}public Criteria andAlidLike(String value){addCriterion("alid like",value,"alid");return (Criteria)this;}public Criteria andAlidNotLike(String value){addCriterion("alid not like",value,"alid");return (Criteria)this;}public Criteria andAlidIn(List<String> values){addCriterion("alid in",values,"alid");return (Criteria)this;}public Criteria andAlidNotIn(List<String> values){addCriterion("alid not in",values,"alid");return (Criteria)this;}public Criteria andAlidBetween(String value1,String value2){addCriterion("alid between",value1,value2,"alid");return (Criteria)this;}public Criteria andAlidNotBetween(String value1,String value2){addCriterion("alid not between",value1,value2,"alid");return (Criteria)this;}public Criteria andAuditGnatureIsNull(){addCriterion("audit_gnature is null");return (Criteria)this;}public Criteria andAuditGnatureIsNotNull(){addCriterion("audit_gnature is not null");return (Criteria)this;}public Criteria andAuditGnatureEqualTo(String value){addCriterion("audit_gnature =",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureNotEqualTo(String value){addCriterion("audit_gnature <>",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureGreaterThan(String value){addCriterion("audit_gnature >",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureGreaterThanOrEqualTo(String value){addCriterion("audit_gnature >=",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureLessThan(String value){addCriterion("audit_gnature <",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureLessThanOrEqualTo(String value){addCriterion("audit_gnature <=",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureLike(String value){addCriterion("audit_gnature like",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureNotLike(String value){addCriterion("audit_gnature not like",value,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureIn(List<String> values){addCriterion("audit_gnature in",values,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureNotIn(List<String> values){addCriterion("audit_gnature not in",values,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureBetween(String value1,String value2){addCriterion("audit_gnature between",value1,value2,"auditGnature");return (Criteria)this;}public Criteria andAuditGnatureNotBetween(String value1,String value2){addCriterion("audit_gnature not between",value1,value2,"auditGnature");return (Criteria)this;}public Criteria andCreatedtimeIsNull(){addCriterion("createdtime is null");return (Criteria)this;}public Criteria andCreatedtimeIsNotNull(){addCriterion("createdtime is not null");return (Criteria)this;}public Criteria andCreatedtimeEqualTo(Date value){addCriterion("createdtime =",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeNotEqualTo(Date value){addCriterion("createdtime <>",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeGreaterThan(Date value){addCriterion("createdtime >",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value){addCriterion("createdtime >=",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeLessThan(Date value){addCriterion("createdtime <",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeLessThanOrEqualTo(Date value){addCriterion("createdtime <=",value,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeIn(List<Date> values){addCriterion("createdtime in",values,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeNotIn(List<Date> values){addCriterion("createdtime not in",values,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeBetween(Date value1,Date value2){addCriterion("createdtime between",value1,value2,"createdtime");return (Criteria)this;}public Criteria andCreatedtimeNotBetween(Date value1,Date value2){addCriterion("createdtime not between",value1,value2,"createdtime");return (Criteria)this;}public Criteria andReasonIsNull(){addCriterion("reason is null");return (Criteria)this;}public Criteria andReasonIsNotNull(){addCriterion("reason is not null");return (Criteria)this;}public Criteria andReasonEqualTo(String value){addCriterion("reason =",value,"reason");return (Criteria)this;}public Criteria andReasonNotEqualTo(String value){addCriterion("reason <>",value,"reason");return (Criteria)this;}public Criteria andReasonGreaterThan(String value){addCriterion("reason >",value,"reason");return (Criteria)this;}public Criteria andReasonGreaterThanOrEqualTo(String value){addCriterion("reason >=",value,"reason");return (Criteria)this;}public Criteria andReasonLessThan(String value){addCriterion("reason <",value,"reason");return (Criteria)this;}public Criteria andReasonLessThanOrEqualTo(String value){addCriterion("reason <=",value,"reason");return (Criteria)this;}public Criteria andReasonLike(String value){addCriterion("reason like",value,"reason");return (Criteria)this;}public Criteria andReasonNotLike(String value){addCriterion("reason not like",value,"reason");return (Criteria)this;}public Criteria andReasonIn(List<String> values){addCriterion("reason in",values,"reason");return (Criteria)this;}public Criteria andReasonNotIn(List<String> values){addCriterion("reason not in",values,"reason");return (Criteria)this;}public Criteria andReasonBetween(String value1,String value2){addCriterion("reason between",value1,value2,"reason");return (Criteria)this;}public Criteria andReasonNotBetween(String value1,String value2){addCriterion("reason not between",value1,value2,"reason");return (Criteria)this;}public Criteria andModifiedtimeIsNull(){addCriterion("modifiedTime is null");return (Criteria)this;}public Criteria andModifiedtimeIsNotNull(){addCriterion("modifiedTime is not null");return (Criteria)this;}public Criteria andModifiedtimeEqualTo(Date value){addCriterion("modifiedTime =",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeNotEqualTo(Date value){addCriterion("modifiedTime <>",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeGreaterThan(Date value){addCriterion("modifiedTime >",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeGreaterThanOrEqualTo(Date value){addCriterion("modifiedTime >=",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeLessThan(Date value){addCriterion("modifiedTime <",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeLessThanOrEqualTo(Date value){addCriterion("modifiedTime <=",value,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeIn(List<Date> values){addCriterion("modifiedTime in",values,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeNotIn(List<Date> values){addCriterion("modifiedTime not in",values,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeBetween(Date value1,Date value2){addCriterion("modifiedTime between",value1,value2,"modifiedtime");return (Criteria)this;}public Criteria andModifiedtimeNotBetween(Date value1,Date value2){addCriterion("modifiedTime not between",value1,value2,"modifiedtime");return (Criteria)this;}}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table Holiday
	 * @mbggenerated  Sat Mar 02 11:06:11 CST 2019
	 */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Holiday
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 28 14:56:16 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}