package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bh51 {

    /* JADX INFO: renamed from: a */
    public final String f27084a;

    /* JADX INFO: renamed from: b */
    public final voc1 f27085b;

    /* JADX INFO: renamed from: c */
    public final String f27086c;

    /* JADX INFO: renamed from: d */
    public final String f27087d;

    /* JADX INFO: renamed from: e */
    public final String f27088e;

    /* JADX INFO: renamed from: f */
    public final String f27089f;

    public bh51(String str, String str2, String str3, String str4, String str5, voc1 voc1Var) {
        this.f27084a = str;
        this.f27085b = voc1Var;
        this.f27086c = str2;
        this.f27087d = str3;
        this.f27088e = str4;
        this.f27089f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh51)) {
            return false;
        }
        bh51 bh51Var = (bh51) obj;
        return wj50.m88271j(this.f27084a, bh51Var.f27084a) && wj50.m88271j(this.f27085b, bh51Var.f27085b) && wj50.m88271j(this.f27086c, bh51Var.f27086c) && wj50.m88271j(this.f27087d, bh51Var.f27087d) && wj50.m88271j(this.f27088e, bh51Var.f27088e) && wj50.m88271j(this.f27089f, bh51Var.f27089f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f27084a.hashCode() * 31, 31, this.f27085b.f243453a), 31, this.f27086c);
        String str = this.f27087d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27088e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27089f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
