package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w271 implements y271 {

    /* JADX INFO: renamed from: a */
    public final String f247260a;

    /* JADX INFO: renamed from: b */
    public final String f247261b;

    /* JADX INFO: renamed from: c */
    public final String f247262c;

    /* JADX INFO: renamed from: d */
    public final String f247263d;

    /* JADX INFO: renamed from: e */
    public final String f247264e;

    /* JADX INFO: renamed from: f */
    public final int f247265f;

    /* JADX INFO: renamed from: g */
    public final om01 f247266g;

    public w271(String str, String str2, String str3, String str4, String str5, int i, om01 om01Var) {
        this.f247260a = str;
        this.f247261b = str2;
        this.f247262c = str3;
        this.f247263d = str4;
        this.f247264e = str5;
        this.f247265f = i;
        this.f247266g = om01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w271)) {
            return false;
        }
        w271 w271Var = (w271) obj;
        return wj50.m88271j(this.f247260a, w271Var.f247260a) && wj50.m88271j(this.f247261b, w271Var.f247261b) && wj50.m88271j(this.f247262c, w271Var.f247262c) && wj50.m88271j(this.f247263d, w271Var.f247263d) && wj50.m88271j(this.f247264e, w271Var.f247264e) && this.f247265f == w271Var.f247265f && wj50.m88271j(this.f247266g, w271Var.f247266g);
    }

    public final int hashCode() {
        int iHashCode = this.f247260a.hashCode() * 31;
        String str = this.f247261b;
        int iM62800g = mt60.m62800g(this.f247265f, s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f247262c), 31, this.f247263d), 31, this.f247264e), 31);
        om01 om01Var = this.f247266g;
        return iM62800g + (om01Var != null ? om01Var.hashCode() : 0);
    }
}
