package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a661 extends d661 {

    /* JADX INFO: renamed from: d */
    public final fa00 f12704d;

    public a661(u561 u561Var, String str) {
        super(u561Var, str);
        this.f12704d = u561Var.mo82388N0(str);
    }

    @Override // p204p.d661, p204p.ezx0
    /* JADX INFO: renamed from: A */
    public final void mo24840A() {
        m35056a();
        this.f12704d.mo38268A();
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: E1 */
    public final boolean mo24841E1() {
        m35056a();
        this.f12704d.f67402b.execute();
        return false;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: R */
    public final void mo24842R(int i, String str) {
        m35056a();
        this.f12704d.mo38269L0(i, str);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: Y */
    public final void mo24843Y(double d) {
        m35056a();
        this.f12704d.mo38270l1(d, 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12704d.close();
        this.f45614c = true;
    }

    @Override // p204p.ezx0
    public final byte[] getBlob(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    public final int getColumnCount() {
        m35056a();
        return 0;
    }

    @Override // p204p.ezx0
    public final String getColumnName(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    public final double getDouble(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    public final long getLong(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: h1 */
    public final String mo24844h1(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    public final boolean isNull(int i) {
        m35056a();
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: q */
    public final void mo24845q(byte[] bArr, int i) {
        m35056a();
        this.f12704d.mo38271q(bArr, i);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: u */
    public final void mo24846u(int i, long j) {
        m35056a();
        this.f12704d.mo38272u(i, j);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: v */
    public final void mo24847v(int i) {
        m35056a();
        this.f12704d.mo38273v(i);
    }
}
