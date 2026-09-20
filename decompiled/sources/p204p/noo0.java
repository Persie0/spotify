package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class noo0 {

    /* JADX INFO: renamed from: a */
    public final long f156766a;

    /* JADX INFO: renamed from: b */
    public final long f156767b;

    /* JADX INFO: renamed from: c */
    public final boolean f156768c;

    /* JADX INFO: renamed from: d */
    public final boolean f156769d;

    /* JADX INFO: renamed from: e */
    public final ww6 f156770e;

    /* JADX INFO: renamed from: f */
    public final rm71 f156771f;

    /* JADX INFO: renamed from: g */
    public final boolean f156772g;

    public noo0(long j, long j2, boolean z, boolean z2, ww6 ww6Var, rm71 rm71Var, boolean z3) {
        this.f156766a = j;
        this.f156767b = j2;
        this.f156768c = z;
        this.f156769d = z2;
        this.f156770e = ww6Var;
        this.f156771f = rm71Var;
        this.f156772g = z3;
    }

    /* JADX INFO: renamed from: a */
    public static noo0 m65250a(noo0 noo0Var) {
        long j = noo0Var.f156766a;
        long j2 = noo0Var.f156767b;
        boolean z = noo0Var.f156769d;
        ww6 ww6Var = noo0Var.f156770e;
        noo0Var.getClass();
        rm71 rm71Var = noo0Var.f156771f;
        boolean z2 = noo0Var.f156772g;
        noo0Var.getClass();
        return new noo0(j, j2, true, z, ww6Var, rm71Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noo0)) {
            return false;
        }
        noo0 noo0Var = (noo0) obj;
        return this.f156766a == noo0Var.f156766a && this.f156767b == noo0Var.f156767b && this.f156768c == noo0Var.f156768c && this.f156769d == noo0Var.f156769d && wj50.m88271j(this.f156770e, noo0Var.f156770e) && wj50.m88271j(this.f156771f, noo0Var.f156771f) && this.f156772g == noo0Var.f156772g;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(dq60.m36605e(Long.hashCode(this.f156766a) * 31, this.f156767b, 31), 31, this.f156768c), 31, this.f156769d);
        ww6 ww6Var = this.f156770e;
        int iHashCode = (iM77245d + (ww6Var == null ? 0 : ww6Var.hashCode())) * 961;
        rm71 rm71Var = this.f156771f;
        return Boolean.hashCode(this.f156772g) + ((iHashCode + (rm71Var != null ? rm71Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ noo0(long j, long j2, boolean z, boolean z2, ww6 ww6Var, rm71 rm71Var, boolean z3, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : ww6Var, (i & 64) != 0 ? null : rm71Var, (i & 128) != 0 ? true : z3);
    }
}
