package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class urm0 {

    /* JADX INFO: renamed from: a */
    public final long f233406a;

    /* JADX INFO: renamed from: b */
    public final float f233407b;

    /* JADX INFO: renamed from: c */
    public final float f233408c;

    /* JADX INFO: renamed from: d */
    public final bsm0 f233409d;

    public urm0() {
        this(n6f.f150870j, 0, 0, new bsm0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urm0)) {
            return false;
        }
        urm0 urm0Var = (urm0) obj;
        long j = urm0Var.f233406a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f233406a, j) && ybs.m93301b(this.f233407b, urm0Var.f233407b) && ybs.m93301b(this.f233408c, urm0Var.f233408c) && wj50.m88271j(this.f233409d, urm0Var.f233409d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return this.f233409d.hashCode() + AbstractC0000a.m8g(AbstractC0000a.m8g(Long.hashCode(this.f233406a) * 31, 31, this.f233407b), 31, this.f233408c);
    }

    public urm0(long j, float f, float f2, bsm0 bsm0Var) {
        this.f233406a = j;
        this.f233407b = f;
        this.f233408c = f2;
        this.f233409d = bsm0Var;
    }
}
