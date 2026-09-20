package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bls0 {

    /* JADX INFO: renamed from: a */
    public final String f28278a;

    /* JADX INFO: renamed from: b */
    public final String f28279b;

    /* JADX INFO: renamed from: c */
    public final String f28280c;

    /* JADX INFO: renamed from: d */
    public final String f28281d;

    /* JADX INFO: renamed from: e */
    public final fuy f28282e;

    /* JADX INFO: renamed from: f */
    public final String f28283f;

    /* JADX INFO: renamed from: g */
    public final String f28284g;

    public bls0(String str, String str2, String str3, String str4, fuy fuyVar, String str5, String str6) {
        this.f28278a = str;
        this.f28279b = str2;
        this.f28280c = str3;
        this.f28281d = str4;
        this.f28282e = fuyVar;
        this.f28283f = str5;
        this.f28284g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bls0)) {
            return false;
        }
        bls0 bls0Var = (bls0) obj;
        return wj50.m88271j(this.f28278a, bls0Var.f28278a) && wj50.m88271j(this.f28279b, bls0Var.f28279b) && wj50.m88271j(this.f28280c, bls0Var.f28280c) && wj50.m88271j(this.f28281d, bls0Var.f28281d) && wj50.m88271j(this.f28282e, bls0Var.f28282e) && wj50.m88271j(this.f28283f, bls0Var.f28283f) && wj50.m88271j(this.f28284g, bls0Var.f28284g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f28278a.hashCode() * 31, 31, this.f28279b), 31, this.f28280c);
        String str = this.f28281d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        fuy fuyVar = this.f28282e;
        return this.f28284g.hashCode() + s571.m77243b((iHashCode + (fuyVar != null ? fuyVar.hashCode() : 0)) * 31, 31, this.f28283f);
    }
}
