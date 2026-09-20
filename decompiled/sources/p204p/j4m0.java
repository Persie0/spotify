package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class j4m0 implements f4m0 {

    /* JADX INFO: renamed from: b */
    public final float f108727b;

    /* JADX INFO: renamed from: c */
    public final float f108728c;

    /* JADX INFO: renamed from: d */
    public final float f108729d;

    /* JADX INFO: renamed from: e */
    public final float f108730e;

    public j4m0(float f, float f2, float f3, float f4) {
        this.f108727b = f;
        this.f108728c = f2;
        this.f108729d = f3;
        this.f108730e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            kt40.m57301a("Padding must be non-negative");
        }
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: a */
    public final float mo29185a() {
        return this.f108730e;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: b */
    public final float mo29186b(ko70 ko70Var) {
        return ko70Var == ko70.f124556a ? this.f108727b : this.f108729d;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: c */
    public final float mo29187c(ko70 ko70Var) {
        return ko70Var == ko70.f124556a ? this.f108729d : this.f108727b;
    }

    @Override // p204p.f4m0
    /* JADX INFO: renamed from: d */
    public final float mo29188d() {
        return this.f108728c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j4m0)) {
            return false;
        }
        j4m0 j4m0Var = (j4m0) obj;
        return ybs.m93301b(this.f108727b, j4m0Var.f108727b) && ybs.m93301b(this.f108728c, j4m0Var.f108728c) && ybs.m93301b(this.f108729d, j4m0Var.f108729d) && ybs.m93301b(this.f108730e, j4m0Var.f108730e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f108730e) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f108727b) * 31, 31, this.f108728c), 31, this.f108729d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        pi9.m70086k(this.f108727b, sb, ", top=");
        pi9.m70086k(this.f108728c, sb, ", end=");
        pi9.m70086k(this.f108729d, sb, ", bottom=");
        sb.append((Object) ybs.m93302c(this.f108730e));
        sb.append(')');
        return sb.toString();
    }
}
