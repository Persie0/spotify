package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bit {

    /* JADX INFO: renamed from: a */
    public final String f27539a;

    /* JADX INFO: renamed from: b */
    public final String f27540b;

    /* JADX INFO: renamed from: c */
    public final String f27541c;

    /* JADX INFO: renamed from: d */
    public final boolean f27542d;

    /* JADX INFO: renamed from: e */
    public final Long f27543e;

    /* JADX INFO: renamed from: f */
    public final d850 f27544f;

    /* JADX INFO: renamed from: g */
    public final String f27545g;

    public bit(Long l, String str, String str2, String str3, String str4, d850 d850Var, boolean z) {
        this.f27539a = str;
        this.f27540b = str2;
        this.f27541c = str3;
        this.f27542d = z;
        this.f27543e = l;
        this.f27544f = d850Var;
        this.f27545g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bit)) {
            return false;
        }
        bit bitVar = (bit) obj;
        return wj50.m88271j(this.f27539a, bitVar.f27539a) && wj50.m88271j(this.f27540b, bitVar.f27540b) && wj50.m88271j(this.f27541c, bitVar.f27541c) && this.f27542d == bitVar.f27542d && wj50.m88271j(this.f27543e, bitVar.f27543e) && wj50.m88271j(this.f27544f, bitVar.f27544f) && wj50.m88271j(this.f27545g, bitVar.f27545g);
    }

    public final int hashCode() {
        int iHashCode = this.f27539a.hashCode() * 31;
        String str = this.f27540b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27541c;
        int iM77245d = s571.m77245d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f27542d);
        Long l = this.f27543e;
        int iHashCode3 = (this.f27544f.hashCode() + ((iM77245d + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str3 = this.f27545g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
