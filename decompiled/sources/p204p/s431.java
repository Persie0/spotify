package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s431 {

    /* JADX INFO: renamed from: a */
    public final r431 f205428a;

    /* JADX INFO: renamed from: b */
    public final r431 f205429b;

    /* JADX INFO: renamed from: c */
    public final r431 f205430c;

    /* JADX INFO: renamed from: d */
    public final r431 f205431d;

    /* JADX INFO: renamed from: e */
    public final r431 f205432e;

    /* JADX INFO: renamed from: f */
    public final int f205433f;

    /* JADX INFO: renamed from: g */
    public final r431 f205434g;

    /* JADX INFO: renamed from: h */
    public final int f205435h;

    /* JADX INFO: renamed from: i */
    public final Set f205436i;

    /* JADX INFO: renamed from: j */
    public final boolean f205437j;

    /* JADX INFO: renamed from: k */
    public final int f205438k;

    public /* synthetic */ s431(r431 r431Var, r431 r431Var2, r431 r431Var3) {
        this(r431Var, r431Var2, r431Var3, null, null, 0, null, 0, gbu.f78413a, false, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s431)) {
            return false;
        }
        s431 s431Var = (s431) obj;
        return this.f205428a == s431Var.f205428a && this.f205429b == s431Var.f205429b && this.f205430c == s431Var.f205430c && this.f205431d == s431Var.f205431d && this.f205432e == s431Var.f205432e && this.f205433f == s431Var.f205433f && this.f205434g == s431Var.f205434g && this.f205435h == s431Var.f205435h && wj50.m88271j(this.f205436i, s431Var.f205436i) && this.f205437j == s431Var.f205437j && this.f205438k == s431Var.f205438k;
    }

    public final int hashCode() {
        int iHashCode = (this.f205430c.hashCode() + ((this.f205429b.hashCode() + (this.f205428a.hashCode() * 31)) * 31)) * 31;
        r431 r431Var = this.f205431d;
        int iHashCode2 = (iHashCode + (r431Var == null ? 0 : r431Var.hashCode())) * 31;
        r431 r431Var2 = this.f205432e;
        int iHashCode3 = (iHashCode2 + (r431Var2 == null ? 0 : r431Var2.hashCode())) * 31;
        int i = this.f205433f;
        int iM38547C = (iHashCode3 + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        r431 r431Var3 = this.f205434g;
        int iHashCode4 = (iM38547C + (r431Var3 == null ? 0 : r431Var3.hashCode())) * 31;
        int i2 = this.f205435h;
        return edb.m38547C(this.f205438k) + s571.m77245d(klh.m56830b((iHashCode4 + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31, 31, this.f205436i), 31, this.f205437j);
    }

    public s431(r431 r431Var, r431 r431Var2, r431 r431Var3, r431 r431Var4, r431 r431Var5, int i, r431 r431Var6, int i2, Set set, boolean z, int i3) {
        this.f205428a = r431Var;
        this.f205429b = r431Var2;
        this.f205430c = r431Var3;
        this.f205431d = r431Var4;
        this.f205432e = r431Var5;
        this.f205433f = i;
        this.f205434g = r431Var6;
        this.f205435h = i2;
        this.f205436i = set;
        this.f205437j = z;
        this.f205438k = i3;
    }
}
