package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class prf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f180584a;

    /* JADX INFO: renamed from: b */
    public final boolean f180585b;

    /* JADX INFO: renamed from: c */
    public final boolean f180586c;

    /* JADX INFO: renamed from: d */
    public final boolean f180587d;

    /* JADX INFO: renamed from: e */
    public final boolean f180588e;

    public prf0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f180584a = z;
        this.f180585b = z2;
        this.f180586c = z3;
        this.f180587d = z4;
        this.f180588e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prf0)) {
            return false;
        }
        prf0 prf0Var = (prf0) obj;
        return this.f180584a == prf0Var.f180584a && this.f180585b == prf0Var.f180585b && this.f180586c == prf0Var.f180586c && this.f180587d == prf0Var.f180587d && this.f180588e == prf0Var.f180588e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180588e) + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f180584a) * 31, 31, this.f180585b), 31, this.f180586c), 31, this.f180587d);
    }
}
