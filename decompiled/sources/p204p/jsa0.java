package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jsa0 {

    /* JADX INFO: renamed from: a */
    public final String f115457a;

    /* JADX INFO: renamed from: b */
    public final int f115458b;

    /* JADX INFO: renamed from: c */
    public final String f115459c;

    /* JADX INFO: renamed from: d */
    public final String f115460d;

    public jsa0(String str, String str2, int i, String str3) {
        this.f115457a = str;
        this.f115458b = i;
        this.f115459c = str2;
        this.f115460d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsa0)) {
            return false;
        }
        jsa0 jsa0Var = (jsa0) obj;
        return wj50.m88271j(this.f115457a, jsa0Var.f115457a) && this.f115458b == jsa0Var.f115458b && wj50.m88271j(this.f115459c, jsa0Var.f115459c) && wj50.m88271j(this.f115460d, jsa0Var.f115460d);
    }

    public final int hashCode() {
        String str = this.f115457a;
        int iM62800g = mt60.m62800g(this.f115458b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f115459c;
        int iHashCode = (iM62800g + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f115460d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
