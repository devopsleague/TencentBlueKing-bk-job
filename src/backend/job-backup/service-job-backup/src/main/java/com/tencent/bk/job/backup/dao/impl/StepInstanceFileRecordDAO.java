package com.tencent.bk.job.backup.dao.impl;

import com.tencent.bk.job.common.mysql.dynamic.ds.DSLContextProvider;
import com.tencent.bk.job.execute.model.tables.StepInstanceFile;
import com.tencent.bk.job.execute.model.tables.records.StepInstanceFileRecord;
import org.jooq.Table;
import org.jooq.TableField;

/**
 * step_instance_file DAO
 */
public class StepInstanceFileRecordDAO extends AbstractExecuteRecordDAO<StepInstanceFileRecord> {

    private static final StepInstanceFile TABLE = StepInstanceFile.STEP_INSTANCE_FILE;

    public StepInstanceFileRecordDAO(DSLContextProvider dslContextProvider) {
        super(dslContextProvider, TABLE.getName());
    }

    @Override
    public Table<StepInstanceFileRecord> getTable() {
        return TABLE;
    }

    @Override
    public TableField<StepInstanceFileRecord, Long> getArchiveIdField() {
        return TABLE.STEP_INSTANCE_ID;
    }
}
