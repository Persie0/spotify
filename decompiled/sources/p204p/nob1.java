package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nob1 {

    /* JADX INFO: renamed from: a */
    public final String f156649a;

    /* JADX INFO: renamed from: b */
    public final mob1 f156650b;

    /* JADX INFO: renamed from: c */
    public final boolean f156651c;

    /* JADX INFO: renamed from: d */
    public final boolean f156652d;

    /* JADX INFO: renamed from: e */
    public final boolean f156653e;

    /* JADX INFO: renamed from: f */
    public final int f156654f;

    public nob1(String str, mob1 mob1Var, boolean z, boolean z2, boolean z3, int i) {
        this.f156649a = str;
        this.f156650b = mob1Var;
        this.f156651c = z;
        this.f156652d = z2;
        this.f156653e = z3;
        this.f156654f = i;
    }

    /* JADX INFO: renamed from: a */
    public static nob1 m65234a(nob1 nob1Var, boolean z, boolean z2, int i) {
        String str = nob1Var.f156649a;
        mob1 mob1Var = nob1Var.f156650b;
        if ((i & 4) != 0) {
            z = nob1Var.f156651c;
        }
        boolean z3 = z;
        boolean z4 = nob1Var.f156652d;
        if ((i & 16) != 0) {
            z2 = nob1Var.f156653e;
        }
        int i2 = nob1Var.f156654f;
        nob1Var.getClass();
        return new nob1(str, mob1Var, z3, z4, z2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nob1)) {
            return false;
        }
        nob1 nob1Var = (nob1) obj;
        return this.f156649a.equals(nob1Var.f156649a) && this.f156650b.equals(nob1Var.f156650b) && this.f156651c == nob1Var.f156651c && this.f156652d == nob1Var.f156652d && this.f156653e == nob1Var.f156653e && this.f156654f == nob1Var.f156654f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((this.f156650b.hashCode() + (this.f156649a.hashCode() * 31)) * 31, 31, this.f156651c), 31, this.f156652d), 31, this.f156653e);
        int i = this.f156654f;
        return iM77245d + (i == 0 ? 0 : edb.m38547C(i));
    }
}
