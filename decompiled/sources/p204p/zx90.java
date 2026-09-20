package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zx90 implements ay90 {

    /* JADX INFO: renamed from: a */
    public final String f287254a;

    /* JADX INFO: renamed from: b */
    public final String f287255b;

    /* JADX INFO: renamed from: c */
    public final String f287256c;

    /* JADX INFO: renamed from: d */
    public final int f287257d;

    /* JADX INFO: renamed from: e */
    public final ey90 f287258e;

    public zx90(String str, String str2, String str3, int i, ey90 ey90Var) {
        this.f287254a = str;
        this.f287255b = str2;
        this.f287256c = str3;
        this.f287257d = i;
        this.f287258e = ey90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx90)) {
            return false;
        }
        zx90 zx90Var = (zx90) obj;
        return wj50.m88271j(this.f287254a, zx90Var.f287254a) && wj50.m88271j(this.f287255b, zx90Var.f287255b) && wj50.m88271j(this.f287256c, zx90Var.f287256c) && this.f287257d == zx90Var.f287257d && this.f287258e.equals(zx90Var.f287258e);
    }

    public final int hashCode() {
        return this.f287258e.hashCode() + f710.m40938f(this.f287257d, s571.m77243b(s571.m77243b(this.f287254a.hashCode() * 31, 31, this.f287255b), 31, this.f287256c), 31);
    }
}
