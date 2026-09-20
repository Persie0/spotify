package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ae6 {

    /* JADX INFO: renamed from: a */
    public final String f14752a;

    /* JADX INFO: renamed from: b */
    public final String f14753b;

    public ae6(String str, String str2) {
        this.f14752a = str;
        this.f14753b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae6)) {
            return false;
        }
        ae6 ae6Var = (ae6) obj;
        return wj50.m88271j(this.f14752a, ae6Var.f14752a) && wj50.m88271j(this.f14753b, ae6Var.f14753b);
    }

    public final int hashCode() {
        int iHashCode = this.f14752a.hashCode() * 31;
        String str = this.f14753b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
