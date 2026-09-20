package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kp51 implements pp51 {

    /* JADX INFO: renamed from: a */
    public final String f124993a;

    /* JADX INFO: renamed from: b */
    public final String f124994b;

    /* JADX INFO: renamed from: c */
    public final String f124995c;

    /* JADX INFO: renamed from: d */
    public final String f124996d;

    /* JADX INFO: renamed from: e */
    public final String f124997e;

    /* JADX INFO: renamed from: f */
    public final String f124998f;

    /* JADX INFO: renamed from: g */
    public final int f124999g;

    public kp51(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f124993a = str;
        this.f124994b = str2;
        this.f124995c = str3;
        this.f124996d = str4;
        this.f124997e = str5;
        this.f124998f = str6;
        this.f124999g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp51)) {
            return false;
        }
        kp51 kp51Var = (kp51) obj;
        return wj50.m88271j(this.f124993a, kp51Var.f124993a) && wj50.m88271j(this.f124994b, kp51Var.f124994b) && wj50.m88271j(this.f124995c, kp51Var.f124995c) && wj50.m88271j(this.f124996d, kp51Var.f124996d) && wj50.m88271j(this.f124997e, kp51Var.f124997e) && wj50.m88271j(this.f124998f, kp51Var.f124998f) && this.f124999g == kp51Var.f124999g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f124993a.hashCode() * 31, 31, this.f124994b), 31, this.f124995c);
        String str = this.f124996d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124997e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124998f;
        return Integer.hashCode(this.f124999g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
