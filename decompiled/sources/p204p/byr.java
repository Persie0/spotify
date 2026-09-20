package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class byr implements uw70 {

    /* JADX INFO: renamed from: a */
    public final int f32305a;

    /* JADX INFO: renamed from: b */
    public final uw70 f32306b;

    /* JADX INFO: renamed from: c */
    public boolean f32307c = true;

    public byr(int i, uw70 uw70Var) {
        this.f32305a = i;
        this.f32306b = uw70Var;
    }

    @Override // p204p.uw70
    /* JADX INFO: renamed from: a */
    public final void mo30900a(Object obj, Object obj2, xh00 xh00Var) {
        this.f32306b.mo30900a(obj, obj2, xh00Var);
    }

    @Override // p204p.uw70
    /* JADX INFO: renamed from: d */
    public final void mo30901d(Object obj, Object obj2, vh00 vh00Var) {
        this.f32306b.mo30901d(obj, obj2, new fyf(new yxr(this.f32307c ? 1 : this.f32305a, vh00Var), true, 1727002620));
        this.f32307c = false;
    }

    @Override // p204p.uw70
    /* JADX INFO: renamed from: e */
    public final void mo30902e(int i, gh00 gh00Var, gh00 gh00Var2, fyf fyfVar) {
        boolean z = this.f32307c;
        uw70 uw70Var = this.f32306b;
        if (z) {
            uw70Var.mo30902e(i, gh00Var, gh00Var2, new fyf(new ayr(this, fyfVar, 0), true, 945595079));
        } else {
            uw70Var.mo30902e(i, gh00Var, gh00Var2, new fyf(new ayr(this, fyfVar, 1), true, -1799166178));
        }
        this.f32307c = false;
    }
}
