package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p960 {

    /* JADX INFO: renamed from: a */
    public final boolean f175169a;

    /* JADX INFO: renamed from: b */
    public final boolean f175170b;

    /* JADX INFO: renamed from: c */
    public final boolean f175171c;

    /* JADX INFO: renamed from: d */
    public final boolean f175172d;

    /* JADX INFO: renamed from: e */
    public final boolean f175173e;

    public p960(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f175169a = z;
        this.f175170b = z2;
        this.f175171c = z3;
        this.f175172d = z4;
        this.f175173e = z5;
    }

    /* JADX INFO: renamed from: a */
    public static p960 m69359a(p960 p960Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = p960Var.f175169a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = p960Var.f175170b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = p960Var.f175171c;
        }
        boolean z6 = p960Var.f175172d;
        boolean z7 = p960Var.f175173e;
        p960Var.getClass();
        return new p960(z4, z5, z3, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p960)) {
            return false;
        }
        p960 p960Var = (p960) obj;
        return this.f175169a == p960Var.f175169a && this.f175170b == p960Var.f175170b && this.f175171c == p960Var.f175171c && this.f175172d == p960Var.f175172d && this.f175173e == p960Var.f175173e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175173e) + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f175169a) * 31, 31, this.f175170b), 31, this.f175171c), 31, this.f175172d);
    }
}
