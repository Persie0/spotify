package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class fez implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final float f68855a;

    /* JADX INFO: renamed from: b */
    public final float f68856b;

    /* JADX INFO: renamed from: c */
    public final float f68857c;

    /* JADX INFO: renamed from: d */
    public final float f68858d;

    public fez(float f, float f2, float f3, float f4) {
        this.f68855a = f;
        this.f68856b = f2;
        this.f68857c = f3;
        this.f68858d = f4;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f68857c);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        return yqqVar.mo35990l0(this.f68855a);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f68856b);
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        return yqqVar.mo35990l0(this.f68858d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fez)) {
            return false;
        }
        fez fezVar = (fez) obj;
        return ybs.m93301b(this.f68855a, fezVar.f68855a) && ybs.m93301b(this.f68856b, fezVar.f68856b) && ybs.m93301b(this.f68857c, fezVar.f68857c) && ybs.m93301b(this.f68858d, fezVar.f68858d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f68858d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f68855a) * 31, 31, this.f68856b), 31, this.f68857c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        pi9.m70086k(this.f68855a, sb, ", top=");
        pi9.m70086k(this.f68856b, sb, ", right=");
        pi9.m70086k(this.f68857c, sb, ", bottom=");
        sb.append((Object) ybs.m93302c(this.f68858d));
        sb.append(')');
        return sb.toString();
    }
}
