package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jan0 implements kan0 {

    /* JADX INFO: renamed from: a */
    public final String f110492a;

    /* JADX INFO: renamed from: b */
    public final String f110493b;

    /* JADX INFO: renamed from: c */
    public final String f110494c;

    /* JADX INFO: renamed from: d */
    public final String f110495d;

    /* JADX INFO: renamed from: e */
    public final fan0 f110496e;

    /* JADX INFO: renamed from: f */
    public final long f110497f;

    /* JADX INFO: renamed from: g */
    public final fan0 f110498g;

    /* JADX INFO: renamed from: h */
    public final String f110499h;

    /* JADX INFO: renamed from: i */
    public final String f110500i;

    public jan0(String str, String str2, String str3, String str4, fan0 fan0Var, long j, fan0 fan0Var2, String str5, String str6) {
        this.f110492a = str;
        this.f110493b = str2;
        this.f110494c = str3;
        this.f110495d = str4;
        this.f110496e = fan0Var;
        this.f110497f = j;
        this.f110498g = fan0Var2;
        this.f110499h = str5;
        this.f110500i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jan0)) {
            return false;
        }
        jan0 jan0Var = (jan0) obj;
        return wj50.m88271j(this.f110492a, jan0Var.f110492a) && wj50.m88271j(this.f110493b, jan0Var.f110493b) && wj50.m88271j(this.f110494c, jan0Var.f110494c) && wj50.m88271j(this.f110495d, jan0Var.f110495d) && wj50.m88271j(this.f110496e, jan0Var.f110496e) && this.f110497f == jan0Var.f110497f && wj50.m88271j(this.f110498g, jan0Var.f110498g) && wj50.m88271j(this.f110499h, jan0Var.f110499h) && wj50.m88271j(this.f110500i, jan0Var.f110500i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f110492a.hashCode() * 31, 31, this.f110493b), 31, this.f110494c);
        String str = this.f110495d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        fan0 fan0Var = this.f110496e;
        int iM36605e = dq60.m36605e((iHashCode + (fan0Var == null ? 0 : fan0Var.hashCode())) * 31, this.f110497f, 31);
        fan0 fan0Var2 = this.f110498g;
        return this.f110500i.hashCode() + s571.m77243b((iM36605e + (fan0Var2 != null ? fan0Var2.hashCode() : 0)) * 31, 31, this.f110499h);
    }
}
