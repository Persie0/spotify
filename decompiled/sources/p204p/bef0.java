package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bef0 extends xdf0 {

    /* JADX INFO: renamed from: d */
    public static final bef0 f26344d = new bef0(1, 2, 0);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bef0(int i, int i2, int i3) {
        super(i, i2);
        this.f26345c = i3;
    }

    @Override // p204p.xdf0
    /* JADX INFO: renamed from: a */
    public final void mo25720a(u561 u561Var) {
        switch (this.f26345c) {
            case 0:
                u561Var.mo82386F("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                u561Var.mo82386F("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                u561Var.mo82386F("DROP TABLE IF EXISTS alarmInfo");
                u561Var.mo82386F("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                break;
            default:
                u561Var.mo82386F("ALTER TABLE device_ids ADD createdAt INTEGER");
                break;
        }
    }
}
