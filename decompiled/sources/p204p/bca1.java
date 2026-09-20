package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bca1 {

    /* JADX INFO: renamed from: a */
    public final qf40 f25817a;

    /* JADX INFO: renamed from: b */
    public final String f25818b;

    /* JADX INFO: renamed from: c */
    public final String f25819c;

    /* JADX INFO: renamed from: d */
    public final String f25820d;

    public bca1(String str, String str2, String str3, qf40 qf40Var) {
        this.f25817a = qf40Var;
        this.f25818b = str;
        this.f25819c = str2;
        this.f25820d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bca1)) {
            return false;
        }
        bca1 bca1Var = (bca1) obj;
        return wj50.m88271j(this.f25817a, bca1Var.f25817a) && wj50.m88271j(this.f25818b, bca1Var.f25818b) && wj50.m88271j(this.f25819c, bca1Var.f25819c) && wj50.m88271j(this.f25820d, bca1Var.f25820d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f25817a.hashCode() * 31, 31, this.f25818b), 31, this.f25819c);
        String str = this.f25820d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
