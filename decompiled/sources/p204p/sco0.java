package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sco0 {

    /* JADX INFO: renamed from: a */
    public final String f207774a;

    /* JADX INFO: renamed from: b */
    public final String f207775b;

    /* JADX INFO: renamed from: c */
    public final String f207776c;

    /* JADX INFO: renamed from: d */
    public final String f207777d;

    /* JADX INFO: renamed from: e */
    public final String f207778e;

    /* JADX INFO: renamed from: f */
    public final String f207779f;

    /* JADX INFO: renamed from: g */
    public final int f207780g;

    public sco0(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f207774a = str;
        this.f207775b = str2;
        this.f207776c = str3;
        this.f207777d = str4;
        this.f207778e = str5;
        this.f207779f = str6;
        this.f207780g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sco0)) {
            return false;
        }
        sco0 sco0Var = (sco0) obj;
        return wj50.m88271j(this.f207774a, sco0Var.f207774a) && wj50.m88271j(this.f207775b, sco0Var.f207775b) && wj50.m88271j(this.f207776c, sco0Var.f207776c) && wj50.m88271j(this.f207777d, sco0Var.f207777d) && wj50.m88271j(this.f207778e, sco0Var.f207778e) && wj50.m88271j(this.f207779f, sco0Var.f207779f) && this.f207780g == sco0Var.f207780g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207780g) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(false) * 31, 31, this.f207774a), 31, this.f207775b), 31, this.f207776c), 31, this.f207777d), 31, this.f207778e), 31, this.f207779f);
    }
}
