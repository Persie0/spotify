package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5o0 {

    /* JADX INFO: renamed from: a */
    public int f217322a;

    /* JADX INFO: renamed from: b */
    public int f217323b;

    /* JADX INFO: renamed from: c */
    public long f217324c;

    /* JADX INFO: renamed from: d */
    public long f217325d = u5o0.f227075a;

    /* JADX INFO: renamed from: e */
    public long f217326e = 0;

    public t5o0() {
        long j = 0;
        this.f217324c = (j & 4294967295L) | (j << 32);
    }

    /* JADX INFO: renamed from: R */
    public abstract int mo34818R(pb3 pb3Var);

    /* JADX INFO: renamed from: U */
    public int mo49586U() {
        return (int) (this.f217324c & 4294967295L);
    }

    /* JADX INFO: renamed from: V */
    public int mo49587V() {
        return (int) (this.f217324c >> 32);
    }

    /* JADX INFO: renamed from: W */
    public final void m80118W() {
        this.f217322a = n0e1.m63437n((int) (this.f217324c >> 32), b8j.m28432k(this.f217325d), b8j.m28430i(this.f217325d));
        int iM63437n = n0e1.m63437n((int) (this.f217324c & 4294967295L), b8j.m28431j(this.f217325d), b8j.m28429h(this.f217325d));
        this.f217323b = iM63437n;
        int i = this.f217322a;
        long j = this.f217324c;
        this.f217326e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM63437n - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo40646X(long j, float f, gh00 gh00Var);

    /* JADX INFO: renamed from: b0 */
    public void mo30019b0(long j, float f, rx10 rx10Var) {
        mo40646X(j, f, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m80119c0(long j) {
        if (g450.m43520b(this.f217324c, j)) {
            return;
        }
        this.f217324c = j;
        m80118W();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m80120d0(long j) {
        if (b8j.m28424c(this.f217325d, j)) {
            return;
        }
        this.f217325d = j;
        m80118W();
    }

    /* JADX INFO: renamed from: g */
    public Object mo30025g() {
        return null;
    }
}
