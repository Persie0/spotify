package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fz70 implements rvd1 {

    /* JADX INFO: renamed from: a */
    public eh00 f74937a;

    /* JADX INFO: renamed from: b */
    public yum0 f74938b;

    /* JADX INFO: renamed from: c */
    public final yum0 f74939c = sam.m77645B(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public final long m43172a() {
        otq otqVar;
        if (this.f74938b == null) {
            eh00 eh00Var = this.f74937a;
            if (eh00Var == null || (otqVar = (otq) eh00Var.invoke()) == null) {
                otqVar = otq.f170066c;
            }
            this.f74938b = sam.m77645B(otqVar);
            this.f74937a = null;
        }
        yum0 yum0Var = this.f74938b;
        wj50.m88279p(yum0Var);
        return ((otq) yum0Var.getValue()).m68067a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43173b() {
        return ((Boolean) this.f74939c.getValue()).booleanValue();
    }
}
