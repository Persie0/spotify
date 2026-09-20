package p204p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1f1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h1f1 f75611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f75612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f75613c;

    public /* synthetic */ g1f1(h1f1 h1f1Var, long j, long j2) {
        this.f75611a = h1f1Var;
        this.f75612b = j;
        this.f75613c = j2;
    }

    /* JADX INFO: renamed from: a */
    public final y7h1 m43356a(s2f1 s2f1Var) {
        d1f1 d1f1Var = this.f75611a.f86622a;
        long j = this.f75613c;
        d1f1Var.f44255a.m31382b("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        ev61 ev61Var = new ev61();
        a1f1 a1f1Var = new a1f1(d1f1Var, ev61Var, s2f1Var, this.f75612b, j, ev61Var);
        f0f1 f0f1Var = d1f1Var.f44259e;
        f0f1Var.getClass();
        f0f1Var.m40478a().post(new f3f1(f0f1Var, ev61Var, ev61Var, a1f1Var));
        return ev61Var.f63172a;
    }
}
