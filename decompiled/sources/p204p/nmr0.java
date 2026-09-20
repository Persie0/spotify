package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nmr0 {

    /* JADX INFO: renamed from: a */
    public final vum0 f156252a = new vum0(0);

    /* JADX INFO: renamed from: b */
    public final vum0 f156253b = new vum0(0);

    /* JADX INFO: renamed from: c */
    public final uum0 f156254c = new uum0(0.0f);

    /* JADX INFO: renamed from: d */
    public final qze f156255d = new qze(this, 1);

    /* JADX INFO: renamed from: a */
    public final float m65156a() {
        int iM86437v = this.f156252a.m86437v() - this.f156253b.m86437v();
        if (iM86437v < 0) {
            iM86437v = 0;
        }
        return iM86437v;
    }

    /* JADX INFO: renamed from: b */
    public final void m65157b(int i, int i2) {
        vum0 vum0Var = this.f156252a;
        int iM86437v = vum0Var.m86437v();
        vum0 vum0Var2 = this.f156253b;
        if (iM86437v == i && vum0Var2.m86437v() == i2) {
            return;
        }
        float fM65156a = m65156a();
        uum0 uum0Var = this.f156254c;
        float fM63436m = fM65156a != 0.0f ? n0e1.m63436m((-uum0Var.m84031v()) / m65156a(), 0.0f, 1.0f) : 0.0f;
        vum0Var.m86438w(i);
        vum0Var2.m86438w(i2);
        uum0Var.m84032w((-m65156a()) * fM63436m);
    }
}
