package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x3o0 {

    /* JADX INFO: renamed from: a */
    public final String f257837a;

    /* JADX INFO: renamed from: b */
    public final String f257838b;

    /* JADX INFO: renamed from: c */
    public final String f257839c;

    /* JADX INFO: renamed from: d */
    public final aub1 f257840d;

    /* JADX INFO: renamed from: e */
    public final e340 f257841e;

    /* JADX INFO: renamed from: f */
    public final String f257842f;

    /* JADX INFO: renamed from: g */
    public final String f257843g;

    /* JADX INFO: renamed from: h */
    public final Integer f257844h;

    /* JADX INFO: renamed from: i */
    public final String f257845i;

    /* JADX INFO: renamed from: j */
    public final boolean f257846j;

    /* JADX INFO: renamed from: k */
    public final e340 f257847k;

    public x3o0(String str, String str2, String str3, aub1 aub1Var, e340 e340Var, String str4, String str5, Integer num, String str6, boolean z, e340 e340Var2) {
        this.f257837a = str;
        this.f257838b = str2;
        this.f257839c = str3;
        this.f257840d = aub1Var;
        this.f257841e = e340Var;
        this.f257842f = str4;
        this.f257843g = str5;
        this.f257844h = num;
        this.f257845i = str6;
        this.f257846j = z;
        this.f257847k = e340Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3o0)) {
            return false;
        }
        x3o0 x3o0Var = (x3o0) obj;
        return wj50.m88271j(this.f257837a, x3o0Var.f257837a) && wj50.m88271j(this.f257838b, x3o0Var.f257838b) && wj50.m88271j(this.f257839c, x3o0Var.f257839c) && wj50.m88271j(this.f257840d, x3o0Var.f257840d) && wj50.m88271j(this.f257841e, x3o0Var.f257841e) && wj50.m88271j(this.f257842f, x3o0Var.f257842f) && wj50.m88271j(this.f257843g, x3o0Var.f257843g) && wj50.m88271j(this.f257844h, x3o0Var.f257844h) && wj50.m88271j(this.f257845i, x3o0Var.f257845i) && this.f257846j == x3o0Var.f257846j && wj50.m88271j(this.f257847k, x3o0Var.f257847k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.f257841e.hashCode() + ((this.f257840d.hashCode() + s571.m77243b(s571.m77243b(this.f257837a.hashCode() * 31, 31, this.f257838b), 31, this.f257839c)) * 31)) * 31, 31, this.f257842f), 31, this.f257843g);
        Integer num = this.f257844h;
        int iM77245d = s571.m77245d(s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f257845i), 31, this.f257846j);
        e340 e340Var = this.f257847k;
        return iM77245d + (e340Var != null ? e340Var.hashCode() : 0);
    }
}
