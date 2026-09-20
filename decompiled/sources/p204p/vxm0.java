package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vxm0 {

    /* JADX INFO: renamed from: a */
    public final String f245782a;

    /* JADX INFO: renamed from: b */
    public final long f245783b;

    /* JADX INFO: renamed from: c */
    public final long f245784c;

    /* JADX INFO: renamed from: d */
    public final String f245785d;

    /* JADX INFO: renamed from: e */
    public final String f245786e;

    /* JADX INFO: renamed from: f */
    public final int f245787f;

    /* JADX INFO: renamed from: g */
    public final boolean f245788g;

    public vxm0(String str, long j, long j2, String str2, String str3, int i, boolean z) {
        this.f245782a = str;
        this.f245783b = j;
        this.f245784c = j2;
        this.f245785d = str2;
        this.f245786e = str3;
        this.f245787f = i;
        this.f245788g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxm0)) {
            return false;
        }
        vxm0 vxm0Var = (vxm0) obj;
        return this.f245782a.equals(vxm0Var.f245782a) && this.f245783b == vxm0Var.f245783b && this.f245784c == vxm0Var.f245784c && this.f245785d.equals(vxm0Var.f245785d) && this.f245786e.equals(vxm0Var.f245786e) && this.f245787f == vxm0Var.f245787f && this.f245788g == vxm0Var.f245788g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245788g) + f710.m40938f(this.f245787f, s571.m77243b(s571.m77243b(dq60.m36605e(dq60.m36605e(this.f245782a.hashCode() * 31, this.f245783b, 31), this.f245784c, 31), 31, this.f245785d), 31, this.f245786e), 31);
    }
}
