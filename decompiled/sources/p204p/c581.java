package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class c581 {

    /* JADX INFO: renamed from: d */
    public static final t9y0 f34104d = l7l.m58436q(new b771(11), new rd61(9));

    /* JADX INFO: renamed from: a */
    public float f34105a;

    /* JADX INFO: renamed from: b */
    public final uum0 f34106b;

    /* JADX INFO: renamed from: c */
    public final uum0 f34107c;

    public c581(float f, float f2, float f3) {
        this.f34105a = f;
        this.f34106b = stf1.m79253m(f3);
        this.f34107c = stf1.m79253m(f2);
    }

    /* JADX INFO: renamed from: a */
    public final float m31457a() {
        if (this.f34105a == 0.0f) {
            return 0.0f;
        }
        return this.f34107c.m84031v() / this.f34105a;
    }

    /* JADX INFO: renamed from: b */
    public final void m31458b(float f) {
        this.f34107c.m84032w(n0e1.m63436m(f, this.f34105a, 0.0f));
    }
}
