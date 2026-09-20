package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x6w {

    /* JADX INFO: renamed from: a */
    public final boolean f258759a;

    /* JADX INFO: renamed from: b */
    public final boolean f258760b;

    /* JADX INFO: renamed from: c */
    public final boolean f258761c;

    /* JADX INFO: renamed from: d */
    public final boolean f258762d;

    /* JADX INFO: renamed from: e */
    public final boolean f258763e;

    /* JADX INFO: renamed from: f */
    public final uhw0 f258764f;

    /* JADX INFO: renamed from: g */
    public final String f258765g;

    public x6w(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uhw0 uhw0Var, String str) {
        this.f258759a = z;
        this.f258760b = z2;
        this.f258761c = z3;
        this.f258762d = z4;
        this.f258763e = z5;
        this.f258764f = uhw0Var;
        this.f258765g = str;
    }

    /* JADX INFO: renamed from: a */
    public static x6w m90104a(x6w x6wVar, String str) {
        boolean z = x6wVar.f258759a;
        boolean z2 = x6wVar.f258760b;
        boolean z3 = x6wVar.f258761c;
        boolean z4 = x6wVar.f258762d;
        boolean z5 = x6wVar.f258763e;
        uhw0 uhw0Var = x6wVar.f258764f;
        x6wVar.getClass();
        return new x6w(z, z2, z3, z4, z5, uhw0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6w)) {
            return false;
        }
        x6w x6wVar = (x6w) obj;
        return this.f258759a == x6wVar.f258759a && this.f258760b == x6wVar.f258760b && this.f258761c == x6wVar.f258761c && this.f258762d == x6wVar.f258762d && this.f258763e == x6wVar.f258763e && wj50.m88271j(this.f258764f, x6wVar.f258764f) && wj50.m88271j(this.f258765g, x6wVar.f258765g);
    }

    public final int hashCode() {
        int iHashCode = (this.f258764f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f258759a) * 31, 31, this.f258760b), 31, this.f258761c), 31, this.f258762d), 31, this.f258763e)) * 31;
        String str = this.f258765g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ x6w(boolean z, boolean z2, boolean z3, uhw0 uhw0Var, int i) {
        this((i & 1) != 0 ? false : z, true, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0, (i & 32) != 0 ? thw0.f220511a : uhw0Var, null);
    }
}
