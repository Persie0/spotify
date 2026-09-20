package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c0c0 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final wg7 f32736a;

    /* JADX INFO: renamed from: b */
    public g450 f32737b;

    /* JADX INFO: renamed from: c */
    public ko70 f32738c;

    /* JADX INFO: renamed from: d */
    public g450 f32739d;

    /* JADX INFO: renamed from: e */
    public y350 f32740e;

    public c0c0(wg7 wg7Var) {
        this.f32736a = wg7Var;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        y350 y350Var = this.f32740e;
        if (y350Var != null) {
            g450 g450Var = this.f32737b;
            if ((g450Var == null ? false : g450.m43520b(g450Var.f76347a, j)) && this.f32738c == ko70Var) {
                g450 g450Var2 = this.f32739d;
                if (g450Var2 != null ? g450.m43520b(g450Var2.f76347a, j2) : false) {
                    return y350Var.f268755a;
                }
            }
        }
        long jMo26626a = this.f32736a.mo26626a(c450Var, j, ko70Var, j2);
        this.f32737b = new g450(j);
        this.f32738c = ko70Var;
        this.f32739d = new g450(j2);
        this.f32740e = new y350(jMo26626a);
        return jMo26626a;
    }
}
