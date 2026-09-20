package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f010 {

    /* JADX INFO: renamed from: a */
    public final String f64524a;

    /* JADX INFO: renamed from: b */
    public final String f64525b;

    public f010(String str, String str2) {
        this.f64524a = str;
        this.f64525b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f010)) {
            return false;
        }
        f010 f010Var = (f010) obj;
        return wj50.m88271j(this.f64524a, f010Var.f64524a) && wj50.m88271j(this.f64525b, f010Var.f64525b);
    }

    public final int hashCode() {
        String str = this.f64524a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64525b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
