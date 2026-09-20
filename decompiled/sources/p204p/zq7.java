package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zq7 implements er7 {

    /* JADX INFO: renamed from: a */
    public final String f285319a;

    /* JADX INFO: renamed from: b */
    public final String f285320b;

    /* JADX INFO: renamed from: c */
    public final int f285321c;

    /* JADX INFO: renamed from: d */
    public final String f285322d;

    public zq7(String str, String str2, int i, String str3) {
        this.f285319a = str;
        this.f285320b = str2;
        this.f285321c = i;
        this.f285322d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq7)) {
            return false;
        }
        zq7 zq7Var = (zq7) obj;
        return wj50.m88271j(this.f285319a, zq7Var.f285319a) && wj50.m88271j(this.f285320b, zq7Var.f285320b) && this.f285321c == zq7Var.f285321c && wj50.m88271j(this.f285322d, zq7Var.f285322d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f285321c, s571.m77243b(this.f285319a.hashCode() * 31, 31, this.f285320b), 31);
        String str = this.f285322d;
        return iM62800g + (str == null ? 0 : str.hashCode());
    }
}
