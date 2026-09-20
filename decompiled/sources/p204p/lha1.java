package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lha1 {

    /* JADX INFO: renamed from: a */
    public final String f133454a;

    /* JADX INFO: renamed from: b */
    public final String f133455b;

    /* JADX INFO: renamed from: c */
    public final String f133456c;

    /* JADX INFO: renamed from: d */
    public final String f133457d;

    /* JADX INFO: renamed from: e */
    public final String f133458e;

    public lha1(String str, String str2, String str3, String str4, String str5) {
        this.f133454a = str;
        this.f133455b = str2;
        this.f133456c = str3;
        this.f133457d = str4;
        this.f133458e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lha1)) {
            return false;
        }
        lha1 lha1Var = (lha1) obj;
        return wj50.m88271j(this.f133454a, lha1Var.f133454a) && wj50.m88271j(this.f133455b, lha1Var.f133455b) && wj50.m88271j(this.f133456c, lha1Var.f133456c) && wj50.m88271j(this.f133457d, lha1Var.f133457d) && wj50.m88271j(this.f133458e, lha1Var.f133458e);
    }

    public final int hashCode() {
        return this.f133458e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f133454a.hashCode() * 31, 31, this.f133455b), 31, this.f133456c), 31, this.f133457d);
    }
}
