package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z561 extends d661 {

    /* JADX INFO: renamed from: d */
    public final b661 f279486d;

    public z561(u561 u561Var, String str, b661 b661Var) {
        super(u561Var, str);
        this.f279486d = b661Var;
    }

    @Override // p204p.d661, p204p.ezx0
    /* JADX INFO: renamed from: A */
    public final void mo24840A() {
        this.f279486d.mo24840A();
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: E1 */
    public final boolean mo24841E1() {
        b661 b661Var = this.f279486d;
        boolean zMo24841E1 = b661Var.mo24841E1();
        boolean zEqualsIgnoreCase = b661Var.mo24844h1(0).equalsIgnoreCase("wal");
        u561 u561Var = this.f45612a;
        if (zEqualsIgnoreCase) {
            u561Var.mo82390T();
            return zMo24841E1;
        }
        u561Var.mo82385E();
        return zMo24841E1;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: R */
    public final void mo24842R(int i, String str) {
        this.f279486d.mo24842R(i, str);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: Y */
    public final void mo24843Y(double d) {
        this.f279486d.mo24843Y(d);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f279486d.close();
    }

    @Override // p204p.ezx0
    public final byte[] getBlob(int i) {
        return this.f279486d.getBlob(i);
    }

    @Override // p204p.ezx0
    public final boolean getBoolean() {
        return this.f279486d.getBoolean();
    }

    @Override // p204p.ezx0
    public final int getColumnCount() {
        return this.f279486d.getColumnCount();
    }

    @Override // p204p.ezx0
    public final String getColumnName(int i) {
        return this.f279486d.getColumnName(i);
    }

    @Override // p204p.ezx0
    public final double getDouble(int i) {
        return this.f279486d.getDouble(i);
    }

    @Override // p204p.ezx0
    public final long getLong(int i) {
        return this.f279486d.getLong(i);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: h1 */
    public final String mo24844h1(int i) {
        return this.f279486d.mo24844h1(i);
    }

    @Override // p204p.ezx0
    public final boolean isNull(int i) {
        return this.f279486d.isNull(i);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: q */
    public final void mo24845q(byte[] bArr, int i) {
        this.f279486d.mo24845q(bArr, i);
    }

    @Override // p204p.d661, p204p.ezx0
    public final void reset() {
        this.f279486d.reset();
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: u */
    public final void mo24846u(int i, long j) {
        this.f279486d.mo24846u(i, j);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: v */
    public final void mo24847v(int i) {
        this.f279486d.mo24847v(i);
    }
}
