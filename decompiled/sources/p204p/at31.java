package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class at31 {

    /* JADX INFO: renamed from: a */
    public Object[] f19583a;

    /* JADX INFO: renamed from: b */
    public Object[] f19584b;

    /* JADX INFO: renamed from: c */
    public int f19585c;

    /* JADX INFO: renamed from: d */
    public int f19586d;

    /* JADX INFO: renamed from: e */
    public int f19587e;

    /* JADX INFO: renamed from: f */
    public zs31 f19588f;

    /* JADX INFO: renamed from: g */
    public ys31 f19589g;

    /* JADX INFO: renamed from: h */
    public int f19590h;

    /* JADX INFO: renamed from: a */
    public final void m27111a() {
        if (this.f19584b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        zs31 zs31Var = this.f19588f;
        if (zs31Var instanceof ys31) {
            ((ys31) zs31Var).f275669b.m72191b();
        }
        zs31 zs31Var2 = this.f19588f;
        ys31 ys31Var = this.f19589g;
        if (zs31Var2 == ys31Var) {
            this.f19588f = ys31Var.f275668a;
        }
    }
}
