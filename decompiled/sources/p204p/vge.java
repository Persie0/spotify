package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vge extends jjx0 {

    /* JADX INFO: renamed from: a */
    public final qbn0 f241231a;

    public vge(qbn0 qbn0Var) {
        this.f241231a = qbn0Var;
    }

    @Override // p204p.jjx0
    /* JADX INFO: renamed from: a */
    public final void mo45017a(u561 u561Var) {
        u561Var.mo82384C();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f241231a.getClass();
            sb.append(System.currentTimeMillis() - a0e1.f11068a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            u561Var.mo82386F(sb.toString());
            u561Var.mo82392W();
        } finally {
            u561Var.mo82395f0();
        }
    }
}
