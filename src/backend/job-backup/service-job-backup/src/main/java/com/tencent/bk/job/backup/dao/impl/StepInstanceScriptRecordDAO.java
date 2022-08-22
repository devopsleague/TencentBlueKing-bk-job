package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.backup.config.ArchiveConfig;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.generated.tables.StepInstanceScript;
import org.jooq.generated.tables.records.StepInstanceScriptRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepInstanceScriptRecordDAO extends AbstractExecuteRecordDAO<StepInstanceScriptRecord> {

    private static final StepInstanceScript TABLE = StepInstanceScript.STEP_INSTANCE_SCRIPT;

    private static final List<Field<?>> FIELDS =
        Arrays.asList(
            TABLE.STEP_INSTANCE_ID,
            TABLE.SCRIPT_CONTENT,
            TABLE.SCRIPT_TYPE,
            TABLE.SCRIPT_PARAM,
            TABLE.RESOLVED_SCRIPT_PARAM,
            TABLE.EXECUTION_TIMEOUT,
            TABLE.SYSTEM_ACCOUNT_ID,
            TABLE.SYSTEM_ACCOUNT,
            TABLE.DB_ACCOUNT_ID,
            TABLE.DB_TYPE,
            TABLE.DB_ACCOUNT,
            TABLE.DB_PASSWORD,
            TABLE.DB_PORT,
            TABLE.ROW_CREATE_TIME,
            TABLE.ROW_UPDATE_TIME,
            TABLE.SCRIPT_SOURCE,
            TABLE.SCRIPT_ID,
            TABLE.SCRIPT_VERSION_ID,
            TABLE.IS_SECURE_PARAM
        );

    public StepInstanceScriptRecordDAO(DSLContext context, ArchiveConfig archiveConfig) {
        super(context, archiveConfig);
    }

    @Override
    public List<Field<?>> listFields() {
        return FIELDS;
    }

    @Override
    protected final List<Condition> buildConditions(Long start, Long end) {
        List<Condition> conditions = new ArrayList<>();
        conditions.add(TABLE.STEP_INSTANCE_ID.greaterThan(start));
        conditions.add(TABLE.STEP_INSTANCE_ID.lessOrEqual(end));
        return conditions;
    }

    @Override
    protected Table<StepInstanceScriptRecord> getTable() {
        return TABLE;
    }
}
