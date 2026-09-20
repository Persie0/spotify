package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a8r0 implements c8r0 {

    /* JADX INFO: renamed from: a */
    public final String f13345a;

    /* JADX INFO: renamed from: b */
    public final String f13346b;

    /* JADX INFO: renamed from: c */
    public final String f13347c;

    /* JADX INFO: renamed from: d */
    public final String f13348d;

    /* JADX INFO: renamed from: e */
    public final String f13349e;

    /* JADX INFO: renamed from: f */
    public final qsj f13350f;

    /* JADX INFO: renamed from: g */
    public final boolean f13351g;

    /* JADX INFO: renamed from: h */
    public final n8w f13352h;

    /* JADX INFO: renamed from: i */
    public final q8w f13353i;

    /* JADX INFO: renamed from: j */
    public final o8w f13354j;

    /* JADX INFO: renamed from: k */
    public final h8r0 f13355k;

    public a8r0(String str, String str2, String str3, String str4, String str5, qsj qsjVar, boolean z, n8w n8wVar, q8w q8wVar, o8w o8wVar, h8r0 h8r0Var) {
        this.f13345a = str;
        this.f13346b = str2;
        this.f13347c = str3;
        this.f13348d = str4;
        this.f13349e = str5;
        this.f13350f = qsjVar;
        this.f13351g = z;
        this.f13352h = n8wVar;
        this.f13353i = q8wVar;
        this.f13354j = o8wVar;
        this.f13355k = h8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8r0)) {
            return false;
        }
        a8r0 a8r0Var = (a8r0) obj;
        return wj50.m88271j(this.f13345a, a8r0Var.f13345a) && wj50.m88271j(this.f13346b, a8r0Var.f13346b) && this.f13347c.equals(a8r0Var.f13347c) && wj50.m88271j(this.f13348d, a8r0Var.f13348d) && wj50.m88271j(this.f13349e, a8r0Var.f13349e) && this.f13350f == a8r0Var.f13350f && this.f13351g == a8r0Var.f13351g && wj50.m88271j(this.f13352h, a8r0Var.f13352h) && wj50.m88271j(this.f13353i, a8r0Var.f13353i) && wj50.m88271j(this.f13354j, a8r0Var.f13354j) && this.f13355k.equals(a8r0Var.f13355k);
    }

    public final int hashCode() {
        String str = this.f13345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13346b;
        int iM77243b = s571.m77243b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f13347c);
        String str3 = this.f13348d;
        int iHashCode2 = (iM77243b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13349e;
        int iM77245d = s571.m77245d(s571.m77245d(xl81.m91401j(this.f13350f, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, false), 31, this.f13351g);
        n8w n8wVar = this.f13352h;
        int iHashCode3 = (iM77245d + (n8wVar == null ? 0 : n8wVar.hashCode())) * 31;
        q8w q8wVar = this.f13353i;
        int iHashCode4 = (iHashCode3 + (q8wVar == null ? 0 : q8wVar.hashCode())) * 961;
        o8w o8wVar = this.f13354j;
        return this.f13355k.hashCode() + ((iHashCode4 + (o8wVar != null ? o8wVar.hashCode() : 0)) * 31);
    }
}
