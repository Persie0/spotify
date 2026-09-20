package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class p691 implements rv41 {

    /* JADX INFO: renamed from: a */
    public final w691 f174327a;

    /* JADX INFO: renamed from: b */
    public gh00 f174328b;

    /* JADX INFO: renamed from: c */
    public qe70 f174329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ q691 f174330d;

    /* JADX WARN: Multi-variable type inference failed */
    public p691(q691 q691Var, w691 w691Var, gh00 gh00Var, gh00 gh00Var2) {
        this.f174330d = q691Var;
        this.f174327a = w691Var;
        this.f174328b = gh00Var;
        this.f174329c = (qe70) gh00Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public final void m69194a(u691 u691Var) {
        Object objInvoke = this.f174329c.invoke(u691Var.mo60167a());
        boolean zM31693g = this.f174330d.f185711c.m31693g();
        w691 w691Var = this.f174327a;
        if (zM31693g) {
            w691Var.m87275e(this.f174329c.invoke(u691Var.mo60168c()), objInvoke, (w9z) this.f174328b.invoke(u691Var));
        } else {
            w691Var.m87276f(objInvoke, (w9z) this.f174328b.invoke(u691Var));
        }
    }

    @Override // p204p.rv41
    public final Object getValue() {
        m69194a(this.f174330d.f185711c.m31692f());
        return this.f174327a.f248305t.getValue();
    }
}
