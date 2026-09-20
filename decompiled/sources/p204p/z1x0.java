package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z1x0 {

    /* JADX INFO: renamed from: a */
    public auw0 f278422a;

    /* JADX INFO: renamed from: b */
    public r3t0 f278423b;

    /* JADX INFO: renamed from: d */
    public String f278425d;

    /* JADX INFO: renamed from: e */
    public dc20 f278426e;

    /* JADX INFO: renamed from: h */
    public ck31 f278429h;

    /* JADX INFO: renamed from: i */
    public n2x0 f278430i;

    /* JADX INFO: renamed from: j */
    public n2x0 f278431j;

    /* JADX INFO: renamed from: k */
    public n2x0 f278432k;

    /* JADX INFO: renamed from: l */
    public long f278433l;

    /* JADX INFO: renamed from: m */
    public long f278434m;

    /* JADX INFO: renamed from: n */
    public qp4 f278435n;

    /* JADX INFO: renamed from: c */
    public int f278424c = -1;

    /* JADX INFO: renamed from: g */
    public p3x0 f278428g = p3x0.f173765a;

    /* JADX INFO: renamed from: o */
    public hw81 f278436o = hw81.f95887w0;

    /* JADX INFO: renamed from: f */
    public sep f278427f = new sep(1, false);

    /* JADX INFO: renamed from: b */
    public static void m95163b(String str, n2x0 n2x0Var) {
        if (n2x0Var != null) {
            if (n2x0Var.f149865i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (n2x0Var.f149866t != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (n2x0Var.f149854X != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final n2x0 m95164a() {
        int i = this.f278424c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f278424c).toString());
        }
        auw0 auw0Var = this.f278422a;
        if (auw0Var == null) {
            throw new IllegalStateException("request == null");
        }
        r3t0 r3t0Var = this.f278423b;
        if (r3t0Var == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f278425d;
        if (str != null) {
            return new n2x0(auw0Var, r3t0Var, str, i, this.f278426e, this.f278427f.m77935i(), this.f278428g, this.f278429h, this.f278430i, this.f278431j, this.f278432k, this.f278433l, this.f278434m, this.f278435n, this.f278436o);
        }
        throw new IllegalStateException("message == null");
    }
}
