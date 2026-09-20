package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class d4m0 implements f4m0 {

    /* JADX INFO: renamed from: b */
    public final float f45206b;

    /* JADX INFO: renamed from: c */
    public final float f45207c;

    /* JADX INFO: renamed from: d */
    public final float f45208d;

    /* JADX INFO: renamed from: e */
    public final float f45209e;

    public d4m0(float f, int i) {
        f = (i & 1) != 0 ? 0 : f;
        float f2 = 0;
        float f3 = 0;
        float f4 = 0;
        this.f45206b = f;
        this.f45207c = f2;
        this.f45208d = f3;
        this.f45209e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            kt40.m57301a("Padding must be non-negative");
        }
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: a */
    public final float mo29185a() {
        return this.f45209e;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: b */
    public final float mo29186b(ko70 ko70Var) {
        return this.f45206b;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: c */
    public final float mo29187c(ko70 ko70Var) {
        return this.f45208d;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: d */
    public final float mo29188d() {
        return this.f45207c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d4m0)) {
            return false;
        }
        d4m0 d4m0Var = (d4m0) obj;
        return ybs.m93301b(this.f45206b, d4m0Var.f45206b) && ybs.m93301b(this.f45207c, d4m0Var.f45207c) && ybs.m93301b(this.f45208d, d4m0Var.f45208d) && ybs.m93301b(this.f45209e, d4m0Var.f45209e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f45209e) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f45206b) * 31, 31, this.f45207c), 31, this.f45208d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues.Absolute(left=");
        pi9.m70086k(this.f45206b, sb, ", top=");
        pi9.m70086k(this.f45207c, sb, ", right=");
        pi9.m70086k(this.f45208d, sb, ", bottom=");
        sb.append((Object) ybs.m93302c(this.f45209e));
        sb.append(')');
        return sb.toString();
    }
}
