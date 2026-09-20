package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f52104a;

    /* JADX INFO: renamed from: b */
    public final int f52105b;

    /* JADX INFO: renamed from: c */
    public final String f52106c;

    /* JADX INFO: renamed from: d */
    public final String f52107d;

    /* JADX INFO: renamed from: e */
    public final String f52108e;

    /* JADX INFO: renamed from: f */
    public final String f52109f;

    /* JADX INFO: renamed from: g */
    public final String f52110g;

    /* JADX INFO: renamed from: h */
    public final Double f52111h;

    /* JADX INFO: renamed from: i */
    public final String f52112i;

    public dqx0(int i, int i2, String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.f52104a = i;
        this.f52105b = i2;
        this.f52106c = str;
        this.f52107d = str2;
        this.f52108e = str3;
        this.f52109f = str4;
        this.f52110g = str5;
        this.f52111h = d;
        this.f52112i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqx0)) {
            return false;
        }
        dqx0 dqx0Var = (dqx0) obj;
        return this.f52104a == dqx0Var.f52104a && this.f52105b == dqx0Var.f52105b && wj50.m88271j(this.f52106c, dqx0Var.f52106c) && wj50.m88271j(this.f52107d, dqx0Var.f52107d) && wj50.m88271j(this.f52108e, dqx0Var.f52108e) && wj50.m88271j(this.f52109f, dqx0Var.f52109f) && wj50.m88271j(this.f52110g, dqx0Var.f52110g) && wj50.m88271j(this.f52111h, dqx0Var.f52111h) && wj50.m88271j(this.f52112i, dqx0Var.f52112i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f52105b, Integer.hashCode(this.f52104a) * 31, 31), 31, this.f52106c), 31, this.f52107d), 31, this.f52108e);
        String str = this.f52109f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f52110g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f52111h;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f52112i;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f52104a;
    }
}
