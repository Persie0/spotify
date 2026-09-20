package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class du41 implements hv41 {

    /* JADX INFO: renamed from: a */
    public final String f52974a;

    /* JADX INFO: renamed from: b */
    public final String f52975b;

    public du41(String str, String str2) {
        this.f52974a = str;
        this.f52975b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du41)) {
            return false;
        }
        du41 du41Var = (du41) obj;
        return wj50.m88271j(this.f52974a, du41Var.f52974a) && wj50.m88271j(this.f52975b, du41Var.f52975b);
    }

    public final int hashCode() {
        return this.f52975b.hashCode() + (this.f52974a.hashCode() * 31);
    }
}
