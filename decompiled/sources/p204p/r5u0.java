package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class r5u0 {

    /* JADX INFO: renamed from: a */
    public final int f196130a;

    /* JADX INFO: renamed from: b */
    public final float f196131b;

    /* JADX INFO: renamed from: c */
    public final float f196132c;

    /* JADX INFO: renamed from: d */
    public final j4m0 f196133d;

    /* JADX INFO: renamed from: e */
    public final j4m0 f196134e;

    public r5u0(int i, float f, float f2, j4m0 j4m0Var, j4m0 j4m0Var2) {
        this.f196130a = i;
        this.f196131b = f;
        this.f196132c = f2;
        this.f196133d = j4m0Var;
        this.f196134e = j4m0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5u0)) {
            return false;
        }
        r5u0 r5u0Var = (r5u0) obj;
        return this.f196130a == r5u0Var.f196130a && Float.compare(this.f196131b, r5u0Var.f196131b) == 0 && Float.compare(this.f196132c, r5u0Var.f196132c) == 0 && this.f196133d.equals(r5u0Var.f196133d) && this.f196134e.equals(r5u0Var.f196134e);
    }

    public final int hashCode() {
        return this.f196134e.hashCode() + ((this.f196133d.hashCode() + AbstractC0000a.m8g(AbstractC0000a.m8g(edb.m38547C(this.f196130a) * 31, 31, this.f196131b), 31, this.f196132c)) * 31);
    }
}
