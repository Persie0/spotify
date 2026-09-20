package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o3w0 {

    /* JADX INFO: renamed from: a */
    public final String f161461a;

    /* JADX INFO: renamed from: b */
    public final String f161462b;

    /* JADX INFO: renamed from: c */
    public final String f161463c;

    /* JADX INFO: renamed from: d */
    public final String f161464d;

    /* JADX INFO: renamed from: e */
    public final boolean f161465e;

    /* JADX INFO: renamed from: f */
    public final boolean f161466f;

    /* JADX INFO: renamed from: g */
    public final boolean f161467g;

    public o3w0(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str4 = (i & 8) != 0 ? null : str4;
        boolean z3 = (i & 16) == 0;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        this.f161461a = str;
        this.f161462b = str2;
        this.f161463c = str3;
        this.f161464d = str4;
        this.f161465e = z3;
        this.f161466f = z;
        this.f161467g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3w0)) {
            return false;
        }
        o3w0 o3w0Var = (o3w0) obj;
        return wj50.m88271j(this.f161461a, o3w0Var.f161461a) && wj50.m88271j(this.f161462b, o3w0Var.f161462b) && wj50.m88271j(this.f161463c, o3w0Var.f161463c) && wj50.m88271j(this.f161464d, o3w0Var.f161464d) && this.f161465e == o3w0Var.f161465e && this.f161466f == o3w0Var.f161466f && this.f161467g == o3w0Var.f161467g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f161461a.hashCode() * 31, 31, this.f161462b), 31, this.f161463c);
        String str = this.f161464d;
        return Boolean.hashCode(this.f161467g) + s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f161465e), 31, this.f161466f);
    }
}
