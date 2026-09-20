package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o16 {

    /* JADX INFO: renamed from: a */
    public final h66 f160621a;

    /* JADX INFO: renamed from: b */
    public final String f160622b;

    /* JADX INFO: renamed from: c */
    public final String f160623c;

    /* JADX INFO: renamed from: d */
    public final String f160624d;

    /* JADX INFO: renamed from: e */
    public final String f160625e;

    /* JADX INFO: renamed from: f */
    public final String f160626f;

    public o16(h66 h66Var, String str, String str2, String str3, String str4, String str5) {
        this.f160621a = h66Var;
        this.f160622b = str;
        this.f160623c = str2;
        this.f160624d = str3;
        this.f160625e = str4;
        this.f160626f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o16)) {
            return false;
        }
        o16 o16Var = (o16) obj;
        return this.f160621a.equals(o16Var.f160621a) && wj50.m88271j(this.f160622b, o16Var.f160622b) && wj50.m88271j(this.f160623c, o16Var.f160623c) && wj50.m88271j(this.f160624d, o16Var.f160624d) && wj50.m88271j(this.f160625e, o16Var.f160625e) && wj50.m88271j(this.f160626f, o16Var.f160626f);
    }

    public final int hashCode() {
        int iHashCode = this.f160621a.hashCode() * 31;
        String str = this.f160622b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160623c), 961, this.f160624d), 31, this.f160625e);
        String str2 = this.f160626f;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
