package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fcm0 {

    /* JADX INFO: renamed from: a */
    public final eh00 f68147a;

    /* JADX INFO: renamed from: b */
    public final hc80 f68148b;

    /* JADX INFO: renamed from: c */
    public final hc80 f68149c;

    /* JADX INFO: renamed from: d */
    public final ijc1 f68150d;

    /* JADX INFO: renamed from: e */
    public final z5m0 f68151e;

    /* JADX INFO: renamed from: f */
    public final s6m0 f68152f;

    /* JADX INFO: renamed from: g */
    public final w5j0 f68153g;

    /* JADX INFO: renamed from: h */
    public final dcm0 f68154h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f68155i;

    /* JADX INFO: renamed from: j */
    public final ecm0 f68156j;

    /* JADX INFO: renamed from: k */
    public final r4m0 f68157k;

    /* JADX INFO: renamed from: l */
    public final wg61 f68158l;

    public fcm0(tpk0 tpk0Var, tpk0 tpk0Var2, eh00 eh00Var, hc80 hc80Var, hc80 hc80Var2, ijc1 ijc1Var, vh00 vh00Var, z5m0 z5m0Var, s6m0 s6m0Var, w5j0 w5j0Var) {
        r4m0 r4m0VarMo61282m;
        this.f68147a = eh00Var;
        this.f68148b = hc80Var;
        this.f68149c = hc80Var2;
        this.f68150d = ijc1Var;
        this.f68151e = z5m0Var;
        this.f68152f = s6m0Var;
        this.f68153g = w5j0Var;
        dcm0 dcm0Var = new dcm0(this);
        this.f68154h = dcm0Var;
        this.f68156j = new ecm0(this);
        this.f68158l = new wg61(new pr0(20, vh00Var, this));
        if (tpk0Var2 != null) {
            orq0 orq0Var = (orq0) tpk0Var2.invoke(dcm0Var);
            this.f68155i = orq0Var.mo61278a();
            r4m0VarMo61282m = orq0Var.mo61282m();
            if (r4m0VarMo61282m.mo24326a() != orq0Var.mo61278a()) {
                throw new IllegalStateException(r4m0VarMo61282m.getClass().getName().concat(" prepared a PagePropertySet before construction but exposes a different instance through Page.properties. Inject the prepared PagePropertySet instead of constructing a new one.").toString());
            }
        } else {
            r4m0VarMo61282m = (r4m0) tpk0Var.invoke(dcm0Var);
        }
        this.f68157k = r4m0VarMo61282m;
        z5m0Var.mo64343b(r4m0VarMo61282m.mo24326a());
        m41328a().mo60823g(r4m0VarMo61282m.mo24326a());
    }

    /* JADX INFO: renamed from: a */
    public final obm0 m41328a() {
        return (obm0) this.f68158l.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final r4m0 m41329b() {
        r4m0 r4m0Var = this.f68157k;
        if (r4m0Var != null) {
            return r4m0Var;
        }
        throw new IllegalStateException("can't access the Page instance while it's being constructed");
    }
}
