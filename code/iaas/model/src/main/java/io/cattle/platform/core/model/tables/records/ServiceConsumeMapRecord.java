/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ServiceConsumeMap;
import io.cattle.platform.core.model.tables.ServiceConsumeMapTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "service_consume_map", schema = "cattle")
public class ServiceConsumeMapRecord extends UpdatableRecordImpl<ServiceConsumeMapRecord> implements TableRecordJaxb, Record13<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long, Long>, ServiceConsumeMap {

    private static final long serialVersionUID = 2119529230;

    /**
     * Setter for <code>cattle.service_consume_map.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.service_consume_map.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.service_consume_map.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.service_consume_map.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.service_consume_map.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.service_consume_map.state</code>.
     */
    @Override
    public void setState(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.service_consume_map.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.service_consume_map.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.service_consume_map.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.service_consume_map.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(9);
    }

    /**
     * Setter for <code>cattle.service_consume_map.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>cattle.service_consume_map.consumed_service_id</code>.
     */
    @Override
    public void setConsumedServiceId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.consumed_service_id</code>.
     */
    @Column(name = "consumed_service_id", precision = 19)
    @Override
    public Long getConsumedServiceId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>cattle.service_consume_map.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.service_consume_map.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, Long, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field10() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.CONSUMED_SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ServiceConsumeMapTable.SERVICE_CONSUME_MAP.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value10() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getConsumedServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value6(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value7(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value8(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value9(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value10(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value11(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value12(Long value) {
        setConsumedServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord value13(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceConsumeMapRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Date value7, Date value8, Date value9, Map<String,Object> value10, Long value11, Long value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ServiceConsumeMap from) {
        setId(from.getId());
        setName(from.getName());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setServiceId(from.getServiceId());
        setConsumedServiceId(from.getConsumedServiceId());
        setAccountId(from.getAccountId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ServiceConsumeMap> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceConsumeMapRecord
     */
    public ServiceConsumeMapRecord() {
        super(ServiceConsumeMapTable.SERVICE_CONSUME_MAP);
    }

    /**
     * Create a detached, initialised ServiceConsumeMapRecord
     */
    public ServiceConsumeMapRecord(Long id, String name, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Long serviceId, Long consumedServiceId, Long accountId) {
        super(ServiceConsumeMapTable.SERVICE_CONSUME_MAP);

        set(0, id);
        set(1, name);
        set(2, kind);
        set(3, uuid);
        set(4, description);
        set(5, state);
        set(6, created);
        set(7, removed);
        set(8, removeTime);
        set(9, data);
        set(10, serviceId);
        set(11, consumedServiceId);
        set(12, accountId);
    }
}
