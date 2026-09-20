package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gk50 {

    /* JADX INFO: renamed from: a */
    public final String f80735a;

    /* JADX INFO: renamed from: b */
    public final String f80736b;

    public gk50(String str, String str2) {
        this.f80735a = str;
        this.f80736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk50)) {
            return false;
        }
        gk50 gk50Var = (gk50) obj;
        return wj50.m88271j(this.f80735a, gk50Var.f80735a) && wj50.m88271j(this.f80736b, gk50Var.f80736b);
    }

    public final int hashCode() {
        String str = this.f80735a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80736b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
