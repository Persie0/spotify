package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class xgx0 implements ho40 {

    /* JADX INFO: renamed from: a */
    public final boolean f261389a;

    /* JADX INFO: renamed from: b */
    public final float f261390b;

    /* JADX INFO: renamed from: c */
    public final long f261391c;

    public xgx0(float f, long j, boolean z) {
        this.f261389a = z;
        this.f261390b = f;
        this.f261391c = j;
    }

    @Override // p204p.ho40
    /* JADX INFO: renamed from: a */
    public final jlq mo42260a(voi0 voi0Var) {
        return new smq(voi0Var, this.f261389a, this.f261390b, new rmq(this, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgx0)) {
            return false;
        }
        xgx0 xgx0Var = (xgx0) obj;
        if (this.f261389a != xgx0Var.f261389a || !ybs.m93301b(this.f261390b, xgx0Var.f261390b)) {
            return false;
        }
        long j = xgx0Var.f261391c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f261391c, j);
    }

    @Override // p204p.ho40
    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(Boolean.hashCode(this.f261389a) * 31, 961, this.f261390b);
        int i = n6f.f150872l;
        return as91.m27075c(this.f261391c) + iM8g;
    }
}
