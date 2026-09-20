package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ccq0 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f36594a;

    /* JADX INFO: renamed from: b */
    public final String f36595b;

    /* JADX INFO: renamed from: c */
    public final String f36596c;

    /* JADX INFO: renamed from: d */
    public final String f36597d;

    /* JADX INFO: renamed from: e */
    public final e340 f36598e;

    /* JADX INFO: renamed from: f */
    public final e340 f36599f;

    /* JADX INFO: renamed from: g */
    public final long f36600g;

    /* JADX INFO: renamed from: h */
    public final String f36601h;

    /* JADX INFO: renamed from: i */
    public final String f36602i;

    public ccq0(String str, String str2, String str3, String str4, e340 e340Var, e340 e340Var2, long j, String str5, String str6) {
        this.f36594a = str;
        this.f36595b = str2;
        this.f36596c = str3;
        this.f36597d = str4;
        this.f36598e = e340Var;
        this.f36599f = e340Var2;
        this.f36600g = j;
        this.f36601h = str5;
        this.f36602i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccq0)) {
            return false;
        }
        ccq0 ccq0Var = (ccq0) obj;
        return wj50.m88271j(this.f36594a, ccq0Var.f36594a) && wj50.m88271j(this.f36595b, ccq0Var.f36595b) && wj50.m88271j(this.f36596c, ccq0Var.f36596c) && wj50.m88271j(this.f36597d, ccq0Var.f36597d) && wj50.m88271j(this.f36598e, ccq0Var.f36598e) && wj50.m88271j(this.f36599f, ccq0Var.f36599f) && this.f36600g == ccq0Var.f36600g && wj50.m88271j(this.f36601h, ccq0Var.f36601h) && wj50.m88271j(this.f36602i, ccq0Var.f36602i);
    }

    public final int hashCode() {
        return this.f36602i.hashCode() + s571.m77243b(dq60.m36605e((this.f36599f.hashCode() + ((this.f36598e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f36594a.hashCode() * 31, 31, this.f36595b), 31, this.f36596c), 31, this.f36597d)) * 31)) * 31, this.f36600g, 31), 31, this.f36601h);
    }
}
