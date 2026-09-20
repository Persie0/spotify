package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ja81 {

    /* JADX INFO: renamed from: a */
    public final String f110405a;

    /* JADX INFO: renamed from: b */
    public final String f110406b;

    /* JADX INFO: renamed from: c */
    public final String f110407c;

    /* JADX INFO: renamed from: d */
    public final String f110408d;

    /* JADX INFO: renamed from: e */
    public final String f110409e;

    public ja81(String str, String str2, String str3, String str4, String str5) {
        this.f110405a = str;
        this.f110406b = str2;
        this.f110407c = str3;
        this.f110408d = str4;
        this.f110409e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja81)) {
            return false;
        }
        ja81 ja81Var = (ja81) obj;
        return wj50.m88271j(this.f110405a, ja81Var.f110405a) && this.f110406b.equals(ja81Var.f110406b) && wj50.m88271j(this.f110407c, ja81Var.f110407c) && wj50.m88271j(this.f110408d, ja81Var.f110408d) && wj50.m88271j(this.f110409e, ja81Var.f110409e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f110405a.hashCode() * 31, 31, this.f110406b), 31, this.f110407c), 31, this.f110408d);
        String str = this.f110409e;
        return Boolean.hashCode(false) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
