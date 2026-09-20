package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z681 {

    /* JADX INFO: renamed from: a */
    public final String f279754a;

    /* JADX INFO: renamed from: b */
    public final String f279755b;

    /* JADX INFO: renamed from: c */
    public final xuo0 f279756c;

    /* JADX INFO: renamed from: d */
    public final String f279757d;

    /* JADX INFO: renamed from: e */
    public final int f279758e;

    /* JADX INFO: renamed from: f */
    public final boolean f279759f;

    /* JADX INFO: renamed from: g */
    public final boolean f279760g;

    public z681(String str, String str2, xuo0 xuo0Var, String str3, int i, boolean z, boolean z2) {
        this.f279754a = str;
        this.f279755b = str2;
        this.f279756c = xuo0Var;
        this.f279757d = str3;
        this.f279758e = i;
        this.f279759f = z;
        this.f279760g = z2;
    }

    /* JADX INFO: renamed from: a */
    public final int m95474a() {
        return this.f279758e;
    }

    /* JADX INFO: renamed from: b */
    public final xuo0 m95475b() {
        return this.f279756c;
    }

    /* JADX INFO: renamed from: c */
    public final String m95476c() {
        return this.f279757d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z681)) {
            return false;
        }
        z681 z681Var = (z681) obj;
        return wj50.m88271j(this.f279754a, z681Var.f279754a) && wj50.m88271j(this.f279755b, z681Var.f279755b) && wj50.m88271j(this.f279756c, z681Var.f279756c) && wj50.m88271j(this.f279757d, z681Var.f279757d) && this.f279758e == z681Var.f279758e && this.f279759f == z681Var.f279759f && this.f279760g == z681Var.f279760g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f279754a.hashCode() * 31, 31, this.f279755b);
        xuo0 xuo0Var = this.f279756c;
        return Boolean.hashCode(this.f279760g) + s571.m77245d(mt60.m62800g(this.f279758e, s571.m77243b((iM77243b + (xuo0Var == null ? 0 : xuo0Var.hashCode())) * 31, 31, this.f279757d), 31), 31, this.f279759f);
    }
}
