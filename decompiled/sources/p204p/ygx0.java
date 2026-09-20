package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class ygx0 implements ho40 {

    /* JADX INFO: renamed from: a */
    public final boolean f272688a;

    /* JADX INFO: renamed from: b */
    public final long f272689b;

    public ygx0(boolean z, long j) {
        this.f272688a = z;
        this.f272689b = j;
    }

    @Override // p204p.ho40
    /* JADX INFO: renamed from: a */
    public final jlq mo42260a(voi0 voi0Var) {
        return new smq(voi0Var, this.f272688a, new rmq(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygx0)) {
            return false;
        }
        ygx0 ygx0Var = (ygx0) obj;
        if (this.f272688a != ygx0Var.f272688a || !ybs.m93301b(Float.NaN, Float.NaN)) {
            return false;
        }
        long j = ygx0Var.f272689b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f272689b, j);
    }

    @Override // p204p.ho40
    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(Boolean.hashCode(this.f272688a) * 31, 961, Float.NaN);
        int i = n6f.f150872l;
        return Long.hashCode(this.f272689b) + iM8g;
    }
}
