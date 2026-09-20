package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f127076a;

    /* JADX INFO: renamed from: b */
    public final String f127077b;

    /* JADX INFO: renamed from: c */
    public final d850 f127078c;

    public kwc0(String str, String str2, d850 d850Var) {
        this.f127076a = str;
        this.f127077b = str2;
        this.f127078c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc0)) {
            return false;
        }
        kwc0 kwc0Var = (kwc0) obj;
        return wj50.m88271j(this.f127076a, kwc0Var.f127076a) && wj50.m88271j(this.f127077b, kwc0Var.f127077b) && wj50.m88271j(this.f127078c, kwc0Var.f127078c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f127076a.hashCode() * 31, 31, this.f127077b);
        d850 d850Var = this.f127078c;
        return iM77243b + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
