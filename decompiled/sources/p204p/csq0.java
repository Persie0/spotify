package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class csq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f41676a;

    /* JADX INFO: renamed from: b */
    public final String f41677b;

    /* JADX INFO: renamed from: c */
    public final String f41678c;

    /* JADX INFO: renamed from: d */
    public final String f41679d;

    /* JADX INFO: renamed from: e */
    public final jba0 f41680e;

    /* JADX INFO: renamed from: f */
    public final long f41681f;

    /* JADX INFO: renamed from: g */
    public final int f41682g;

    /* JADX INFO: renamed from: h */
    public final int f41683h;

    public csq0(boolean z, String str, String str2, String str3, jba0 jba0Var, long j, int i, int i2) {
        this.f41676a = z;
        this.f41677b = str;
        this.f41678c = str2;
        this.f41679d = str3;
        this.f41680e = jba0Var;
        this.f41681f = j;
        this.f41682g = i;
        this.f41683h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csq0)) {
            return false;
        }
        csq0 csq0Var = (csq0) obj;
        return this.f41676a == csq0Var.f41676a && wj50.m88271j(this.f41677b, csq0Var.f41677b) && wj50.m88271j(this.f41678c, csq0Var.f41678c) && wj50.m88271j(this.f41679d, csq0Var.f41679d) && pjf1.m70152i(this.f41680e, csq0Var.f41680e) && this.f41681f == csq0Var.f41681f && this.f41682g == csq0Var.f41682g && this.f41683h == csq0Var.f41683h;
    }

    public final int hashCode() {
        return edb.m38547C(this.f41683h) + mt60.m62800g(this.f41682g, dq60.m36605e((pjf1.m70154k(this.f41680e) + s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f41676a) * 31, 31, this.f41677b), 31, this.f41678c), 31, this.f41679d)) * 31, this.f41681f, 31), 31);
    }
}
