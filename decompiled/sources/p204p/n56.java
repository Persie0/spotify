package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n56 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f150493a;

    /* JADX INFO: renamed from: b */
    public final q56 f150494b;

    /* JADX INFO: renamed from: c */
    public final pgo f150495c;

    /* JADX INFO: renamed from: d */
    public final er70 f150496d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f150497e;

    public n56(cbm0 cbm0Var, doh dohVar, q56 q56Var, pgo pgoVar, er70 er70Var) {
        String str = q56Var.f185407b;
        this.f150493a = dohVar;
        this.f150494b = q56Var;
        this.f150495c = pgoVar;
        this.f150496d = er70Var;
        this.f150497e = new pfm0(new qfm0[]{new q040(cbm0Var, !q56Var.f185409d.isEmpty() ? xoc1.f264213v6.m83614b(str) : xoc1.f264205u6.m83614b(str), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f150497e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f150493a.m36532a(new fyf(new z23(this, 2), true, -1860995155));
    }
}
