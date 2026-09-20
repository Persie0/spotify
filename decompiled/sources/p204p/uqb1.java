package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uqb1 extends arb1 {

    /* JADX INFO: renamed from: a */
    public final String f232970a;

    /* JADX INFO: renamed from: b */
    public final String f232971b;

    /* JADX INFO: renamed from: c */
    public final om01 f232972c;

    /* JADX INFO: renamed from: d */
    public final String f232973d;

    /* JADX INFO: renamed from: e */
    public final gcr0 f232974e;

    public uqb1(String str, String str2, om01 om01Var, String str3, gcr0 gcr0Var) {
        this.f232970a = str;
        this.f232971b = str2;
        this.f232972c = om01Var;
        this.f232973d = str3;
        this.f232974e = gcr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqb1)) {
            return false;
        }
        uqb1 uqb1Var = (uqb1) obj;
        return wj50.m88271j(this.f232970a, uqb1Var.f232970a) && wj50.m88271j(this.f232971b, uqb1Var.f232971b) && wj50.m88271j(this.f232972c, uqb1Var.f232972c) && wj50.m88271j(this.f232973d, uqb1Var.f232973d) && wj50.m88271j(this.f232974e, uqb1Var.f232974e);
    }

    public final int hashCode() {
        int iHashCode = (this.f232972c.hashCode() + s571.m77243b(this.f232970a.hashCode() * 31, 31, this.f232971b)) * 31;
        String str = this.f232973d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gcr0 gcr0Var = this.f232974e;
        return iHashCode2 + (gcr0Var != null ? gcr0Var.hashCode() : 0);
    }
}
