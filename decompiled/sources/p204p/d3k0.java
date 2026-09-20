package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class d3k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final String f44922a;

    /* JADX INFO: renamed from: b */
    public final String f44923b;

    /* JADX INFO: renamed from: c */
    public final String f44924c;

    /* JADX INFO: renamed from: d */
    public final String f44925d;

    /* JADX INFO: renamed from: e */
    public final String f44926e;

    public d3k0(String str, String str2, String str3, String str4, String str5) {
        this.f44922a = str;
        this.f44923b = str2;
        this.f44924c = str3;
        this.f44925d = str4;
        this.f44926e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3k0)) {
            return false;
        }
        d3k0 d3k0Var = (d3k0) obj;
        return wj50.m88271j(this.f44922a, d3k0Var.f44922a) && wj50.m88271j(this.f44923b, d3k0Var.f44923b) && wj50.m88271j(this.f44924c, d3k0Var.f44924c) && wj50.m88271j(this.f44925d, d3k0Var.f44925d) && wj50.m88271j(this.f44926e, d3k0Var.f44926e);
    }

    public final int hashCode() {
        String str = this.f44922a;
        return this.f44926e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f44923b), 31, this.f44924c), 31, this.f44925d);
    }
}
