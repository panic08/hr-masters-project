/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.tables.ParsedCandidatesTable;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParsedCandidatesTableRecord extends UpdatableRecordImpl<ParsedCandidatesTableRecord> implements Record7<UUID, UUID, String, String, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.parsed_candidates_table.id</code>.
     */
    public ParsedCandidatesTableRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.user_id</code>.
     */
    public ParsedCandidatesTableRecord setUserId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.fido</code>.
     */
    public ParsedCandidatesTableRecord setFido(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.fido</code>.
     */
    public String getFido() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.picture_url</code>.
     */
    public ParsedCandidatesTableRecord setPictureUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.picture_url</code>.
     */
    public String getPictureUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.position_name</code>.
     */
    public ParsedCandidatesTableRecord setPositionName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.position_name</code>.
     */
    public String getPositionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.salary</code>.
     */
    public ParsedCandidatesTableRecord setSalary(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.salary</code>.
     */
    public Integer getSalary() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.parsed_candidates_table.cv_url</code>.
     */
    public ParsedCandidatesTableRecord setCvUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.parsed_candidates_table.cv_url</code>.
     */
    public String getCvUrl() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, UUID, String, String, String, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<UUID, UUID, String, String, String, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.ID;
    }

    @Override
    public Field<UUID> field2() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.FIDO;
    }

    @Override
    public Field<String> field4() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.PICTURE_URL;
    }

    @Override
    public Field<String> field5() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.POSITION_NAME;
    }

    @Override
    public Field<Integer> field6() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.SALARY;
    }

    @Override
    public Field<String> field7() {
        return ParsedCandidatesTable.PARSED_CANDIDATES_TABLE.CV_URL;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getFido();
    }

    @Override
    public String component4() {
        return getPictureUrl();
    }

    @Override
    public String component5() {
        return getPositionName();
    }

    @Override
    public Integer component6() {
        return getSalary();
    }

    @Override
    public String component7() {
        return getCvUrl();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getFido();
    }

    @Override
    public String value4() {
        return getPictureUrl();
    }

    @Override
    public String value5() {
        return getPositionName();
    }

    @Override
    public Integer value6() {
        return getSalary();
    }

    @Override
    public String value7() {
        return getCvUrl();
    }

    @Override
    public ParsedCandidatesTableRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value2(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value3(String value) {
        setFido(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value4(String value) {
        setPictureUrl(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value5(String value) {
        setPositionName(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value6(Integer value) {
        setSalary(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord value7(String value) {
        setCvUrl(value);
        return this;
    }

    @Override
    public ParsedCandidatesTableRecord values(UUID value1, UUID value2, String value3, String value4, String value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParsedCandidatesTableRecord
     */
    public ParsedCandidatesTableRecord() {
        super(ParsedCandidatesTable.PARSED_CANDIDATES_TABLE);
    }

    /**
     * Create a detached, initialised ParsedCandidatesTableRecord
     */
    public ParsedCandidatesTableRecord(UUID id, UUID userId, String fido, String pictureUrl, String positionName, Integer salary, String cvUrl) {
        super(ParsedCandidatesTable.PARSED_CANDIDATES_TABLE);

        setId(id);
        setUserId(userId);
        setFido(fido);
        setPictureUrl(pictureUrl);
        setPositionName(positionName);
        setSalary(salary);
        setCvUrl(cvUrl);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ParsedCandidatesTableRecord
     */
    public ParsedCandidatesTableRecord(org.jooq.generated.tables.pojos.ParsedCandidatesTable value) {
        super(ParsedCandidatesTable.PARSED_CANDIDATES_TABLE);

        if (value != null) {
            setId(value.getId());
            setUserId(value.getUserId());
            setFido(value.getFido());
            setPictureUrl(value.getPictureUrl());
            setPositionName(value.getPositionName());
            setSalary(value.getSalary());
            setCvUrl(value.getCvUrl());
            resetChangedOnNotNull();
        }
    }
}