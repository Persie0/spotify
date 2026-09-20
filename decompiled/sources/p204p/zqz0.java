package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zqz0 {

    /* JADX INFO: renamed from: a */
    public final String f285487a;

    /* JADX INFO: renamed from: b */
    public final String f285488b;

    /* JADX INFO: renamed from: c */
    public final String f285489c;

    /* JADX INFO: renamed from: d */
    public final int f285490d;

    /* JADX INFO: renamed from: e */
    public final arz0 f285491e;

    /* JADX INFO: renamed from: f */
    public final boolean f285492f;

    public zqz0(String str, String str2, String str3, int i, arz0 arz0Var, boolean z) {
        this.f285487a = str;
        this.f285488b = str2;
        this.f285489c = str3;
        this.f285490d = i;
        this.f285491e = arz0Var;
        this.f285492f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqz0)) {
            return false;
        }
        zqz0 zqz0Var = (zqz0) obj;
        return wj50.m88271j(this.f285487a, zqz0Var.f285487a) && wj50.m88271j(this.f285488b, zqz0Var.f285488b) && wj50.m88271j(this.f285489c, zqz0Var.f285489c) && this.f285490d == zqz0Var.f285490d && this.f285491e.equals(zqz0Var.f285491e) && this.f285492f == zqz0Var.f285492f;
    }

    public final int hashCode() {
        String str = this.f285487a;
        return Boolean.hashCode(this.f285492f) + ((this.f285491e.hashCode() + mt60.m62800g(this.f285490d, s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f285488b), 31, this.f285489c), 31)) * 31);
    }
}
