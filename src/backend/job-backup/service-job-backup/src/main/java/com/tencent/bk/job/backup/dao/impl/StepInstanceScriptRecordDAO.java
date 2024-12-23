package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.common.mysql.dynamic.ds.DSLContextProvider;
import com.tencent.bk.job.execute.model.tables.StepInstanceScript;
import com.tencent.bk.job.execute.model.tables.records.StepInstanceScriptRecord;
import org.jooq.Table;
import org.jooq.TableField;

/**
 * step_instance_script DAO
 */
public class StepInstanceScriptRecordDAO extends AbstractExecuteRecordDAO<StepInstanceScriptRecord> {

    private static final StepInstanceScript TABLE = StepInstanceScript.STEP_INSTANCE_SCRIPT;

    public StepInstanceScriptRecordDAO(DSLContextProvider dslContextProvider) {
        super(dslContextProvider, TABLE.getName());
    }

    @Override
    public Table<StepInstanceScriptRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<StepInstanceScriptRecord, Long> getArchiveIdField() {
        return TABLE.STEP_INSTANCE_ID;
    }
}
