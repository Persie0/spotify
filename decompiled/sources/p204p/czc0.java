package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class czc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f43529a;

    /* JADX INFO: renamed from: b */
    public final String f43530b;

    /* JADX INFO: renamed from: c */
    public final String f43531c;

    /* JADX INFO: renamed from: d */
    public final nyc0 f43532d;

    public czc0(String str, String str2, String str3, nyc0 nyc0Var) {
        this.f43529a = str;
        this.f43530b = str2;
        this.f43531c = str3;
        this.f43532d = nyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czc0)) {
            return false;
        }
        czc0 czc0Var = (czc0) obj;
        return wj50.m88271j(this.f43529a, czc0Var.f43529a) && this.f43530b.equals(czc0Var.f43530b) && wj50.m88271j(this.f43531c, czc0Var.f43531c) && this.f43532d.equals(czc0Var.f43532d);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f43529a;
    }

    public final int hashCode() {
        return this.f43532d.hashCode() + s571.m77243b(s571.m77243b(this.f43529a.hashCode() * 961, 31, this.f43530b), 31, this.f43531c);
    }
}
