package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eu41 implements hv41 {

    /* JADX INFO: renamed from: a */
    public final String f62870a;

    /* JADX INFO: renamed from: b */
    public final String f62871b;

    public eu41(String str, String str2) {
        this.f62870a = str;
        this.f62871b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu41)) {
            return false;
        }
        eu41 eu41Var = (eu41) obj;
        return wj50.m88271j(this.f62870a, eu41Var.f62870a) && wj50.m88271j(this.f62871b, eu41Var.f62871b);
    }

    public final int hashCode() {
        return this.f62871b.hashCode() + (this.f62870a.hashCode() * 31);
    }
}
