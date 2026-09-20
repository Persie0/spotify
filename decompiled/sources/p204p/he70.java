package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class he70 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f90338a;

    /* JADX INFO: renamed from: b */
    public final String f90339b;

    /* JADX INFO: renamed from: c */
    public final String f90340c;

    /* JADX INFO: renamed from: d */
    public final String f90341d;

    /* JADX INFO: renamed from: e */
    public final String f90342e;

    /* JADX INFO: renamed from: f */
    public final vta f90343f;

    /* JADX INFO: renamed from: g */
    public final vsa f90344g;

    public he70(String str, String str2, String str3, String str4, String str5, vsa vsaVar, vta vtaVar) {
        this.f90338a = str;
        this.f90339b = str2;
        this.f90340c = str3;
        this.f90341d = str4;
        this.f90342e = str5;
        this.f90343f = vtaVar;
        this.f90344g = vsaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he70)) {
            return false;
        }
        he70 he70Var = (he70) obj;
        return wj50.m88271j(this.f90338a, he70Var.f90338a) && wj50.m88271j(this.f90339b, he70Var.f90339b) && wj50.m88271j(this.f90340c, he70Var.f90340c) && wj50.m88271j(this.f90341d, he70Var.f90341d) && wj50.m88271j(this.f90342e, he70Var.f90342e) && this.f90343f == he70Var.f90343f && this.f90344g == he70Var.f90344g;
    }

    public final int hashCode() {
        return this.f90344g.hashCode() + ((this.f90343f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f90338a.hashCode() * 31, 31, this.f90339b), 31, this.f90340c), 31, this.f90341d), 31, this.f90342e)) * 31);
    }
}
