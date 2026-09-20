package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class c661 extends d661 {

    /* JADX INFO: renamed from: d */
    public final int f34406d;

    public c661(u561 u561Var, String str, int i) {
        super(u561Var, str);
        this.f34406d = i;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: E1 */
    public final boolean mo24841E1() {
        int iM38547C = edb.m38547C(this.f34406d);
        u561 u561Var = this.f45612a;
        if (iM38547C == 0) {
            u561Var.mo82392W();
            u561Var.mo82395f0();
            return false;
        }
        if (iM38547C == 1) {
            u561Var.mo82395f0();
            return false;
        }
        if (iM38547C == 2) {
            u561Var.mo82384C();
            return false;
        }
        if (iM38547C == 3) {
            u561Var.mo82393a0();
            return false;
        }
        if (iM38547C != 4) {
            throw new NoWhenBranchMatchedException();
        }
        u561Var.mo82389Q0();
        return false;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: R */
    public final void mo24842R(int i, String str) {
        m35056a();
        mif1.m61859L(25, "column index out of range");
        throw null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: Y */
    public final void mo24843Y(double d) {
        m35056a();
        mif1.m61859L(25, "column index out of range");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
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
        mif1.m61859L(25, "column index out of range");
        throw null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: u */
    public final void mo24846u(int i, long j) {
        m35056a();
        mif1.m61859L(25, "column index out of range");
        throw null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: v */
    public final void mo24847v(int i) {
        m35056a();
        mif1.m61859L(25, "column index out of range");
        throw null;
    }
}
