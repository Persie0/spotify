package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t8b1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f218043a;

    /* JADX INFO: renamed from: b */
    public final String f218044b;

    /* JADX INFO: renamed from: c */
    public final String f218045c;

    /* JADX INFO: renamed from: d */
    public final String f218046d;

    /* JADX INFO: renamed from: e */
    public final String f218047e;

    /* JADX INFO: renamed from: f */
    public final double f218048f;

    /* JADX INFO: renamed from: g */
    public final double f218049g;

    /* JADX INFO: renamed from: h */
    public final String f218050h;

    /* JADX INFO: renamed from: i */
    public final String f218051i;

    public t8b1(String str, String str2, String str3, String str4, String str5, double d, double d2, String str6, String str7) {
        this.f218043a = str;
        this.f218044b = str2;
        this.f218045c = str3;
        this.f218046d = str4;
        this.f218047e = str5;
        this.f218048f = d;
        this.f218049g = d2;
        this.f218050h = str6;
        this.f218051i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8b1)) {
            return false;
        }
        t8b1 t8b1Var = (t8b1) obj;
        return wj50.m88271j(this.f218043a, t8b1Var.f218043a) && wj50.m88271j(this.f218044b, t8b1Var.f218044b) && wj50.m88271j(this.f218045c, t8b1Var.f218045c) && wj50.m88271j(this.f218046d, t8b1Var.f218046d) && wj50.m88271j(this.f218047e, t8b1Var.f218047e) && Double.compare(this.f218048f, t8b1Var.f218048f) == 0 && Double.compare(this.f218049g, t8b1Var.f218049g) == 0 && wj50.m88271j(this.f218050h, t8b1Var.f218050h) && wj50.m88271j(this.f218051i, t8b1Var.f218051i);
    }

    public final int hashCode() {
        String str = this.f218043a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f218044b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f218045c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f218046d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f218047e;
        int iM91399h = xl81.m91399h(this.f218049g, xl81.m91399h(this.f218048f, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.f218050h;
        int iHashCode5 = (iM91399h + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f218051i;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }
}
