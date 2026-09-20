package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class n031 {

    /* JADX INFO: renamed from: a */
    public final int f148874a;

    /* JADX INFO: renamed from: b */
    public final String f148875b;

    /* JADX INFO: renamed from: c */
    public final uv11 f148876c;

    /* JADX INFO: renamed from: d */
    public final uv11 f148877d;

    /* JADX INFO: renamed from: e */
    public final uv11 f148878e;

    /* JADX INFO: renamed from: f */
    public final uv11 f148879f;

    /* JADX INFO: renamed from: g */
    public final uv11 f148880g;

    /* JADX INFO: renamed from: h */
    public final int f148881h;

    /* JADX INFO: renamed from: i */
    public final uv11 f148882i;

    /* JADX INFO: renamed from: j */
    public final uv11 f148883j;

    /* JADX INFO: renamed from: k */
    public final int f148884k;

    /* JADX INFO: renamed from: l */
    public final Set f148885l;

    /* JADX INFO: renamed from: m */
    public final boolean f148886m;

    /* JADX INFO: renamed from: n */
    public final int f148887n;

    public n031(int i, String str, uv11 uv11Var, uv11 uv11Var2, uv11 uv11Var3, uv11 uv11Var4, uv11 uv11Var5, int i2, uv11 uv11Var6, uv11 uv11Var7, int i3, Set set, boolean z, int i4) {
        this.f148874a = i;
        this.f148875b = str;
        this.f148876c = uv11Var;
        this.f148877d = uv11Var2;
        this.f148878e = uv11Var3;
        this.f148879f = uv11Var4;
        this.f148880g = uv11Var5;
        this.f148881h = i2;
        this.f148882i = uv11Var6;
        this.f148883j = uv11Var7;
        this.f148884k = i3;
        this.f148885l = set;
        this.f148886m = z;
        this.f148887n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n031)) {
            return false;
        }
        n031 n031Var = (n031) obj;
        return this.f148874a == n031Var.f148874a && wj50.m88271j(this.f148875b, n031Var.f148875b) && this.f148876c == n031Var.f148876c && this.f148877d == n031Var.f148877d && this.f148878e == n031Var.f148878e && this.f148879f == n031Var.f148879f && this.f148880g == n031Var.f148880g && this.f148881h == n031Var.f148881h && this.f148882i == n031Var.f148882i && this.f148883j == n031Var.f148883j && this.f148884k == n031Var.f148884k && this.f148885l.equals(n031Var.f148885l) && this.f148886m == n031Var.f148886m && this.f148887n == n031Var.f148887n;
    }

    public final int hashCode() {
        int iHashCode = (this.f148878e.hashCode() + ((this.f148877d.hashCode() + ((this.f148876c.hashCode() + s571.m77243b(Integer.hashCode(this.f148874a) * 31, 31, this.f148875b)) * 31)) * 31)) * 31;
        uv11 uv11Var = this.f148879f;
        int iHashCode2 = (iHashCode + (uv11Var == null ? 0 : uv11Var.hashCode())) * 31;
        uv11 uv11Var2 = this.f148880g;
        int iHashCode3 = (iHashCode2 + (uv11Var2 == null ? 0 : uv11Var2.hashCode())) * 31;
        int i = this.f148881h;
        int iM38547C = (iHashCode3 + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        uv11 uv11Var3 = this.f148882i;
        int iHashCode4 = (iM38547C + (uv11Var3 == null ? 0 : uv11Var3.hashCode())) * 31;
        uv11 uv11Var4 = this.f148883j;
        int iHashCode5 = (iHashCode4 + (uv11Var4 == null ? 0 : uv11Var4.hashCode())) * 31;
        int i2 = this.f148884k;
        return edb.m38547C(this.f148887n) + s571.m77245d(klh.m56830b((iHashCode5 + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31, 31, this.f148885l), 31, this.f148886m);
    }
}
