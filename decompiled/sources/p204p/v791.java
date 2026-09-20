package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v791 {

    /* JADX INFO: renamed from: a */
    public final b791 f238106a;

    /* JADX INFO: renamed from: b */
    public final Float f238107b;

    /* JADX INFO: renamed from: c */
    public final int f238108c;

    /* JADX INFO: renamed from: d */
    public final int f238109d;

    /* JADX INFO: renamed from: e */
    public final boolean f238110e;

    /* JADX INFO: renamed from: f */
    public final b791 f238111f;

    public v791(b791 b791Var, Float f, int i, int i2, boolean z, b791 b791Var2) {
        this.f238106a = b791Var;
        this.f238107b = f;
        this.f238108c = i;
        this.f238109d = i2;
        this.f238110e = z;
        this.f238111f = b791Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v791)) {
            return false;
        }
        v791 v791Var = (v791) obj;
        return wj50.m88271j(this.f238106a, v791Var.f238106a) && wj50.m88271j(this.f238107b, v791Var.f238107b) && this.f238108c == v791Var.f238108c && this.f238109d == v791Var.f238109d && this.f238110e == v791Var.f238110e && wj50.m88271j(this.f238111f, v791Var.f238111f);
    }

    public final int hashCode() {
        int iHashCode = this.f238106a.hashCode() * 31;
        Float f = this.f238107b;
        int iM77245d = s571.m77245d(mt60.m62800g(this.f238109d, mt60.m62800g(this.f238108c, (iHashCode + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31, this.f238110e);
        b791 b791Var = this.f238111f;
        return iM77245d + (b791Var != null ? b791Var.hashCode() : 0);
    }
}
