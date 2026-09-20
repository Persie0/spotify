package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ot11 {

    /* JADX INFO: renamed from: a */
    public final String f168949a;

    /* JADX INFO: renamed from: b */
    public final String f168950b;

    /* JADX INFO: renamed from: c */
    public final boolean f168951c;

    public ot11(String str, String str2, boolean z) {
        this.f168949a = str;
        this.f168950b = str2;
        this.f168951c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot11)) {
            return false;
        }
        ot11 ot11Var = (ot11) obj;
        return wj50.m88271j(this.f168949a, ot11Var.f168949a) && wj50.m88271j(this.f168950b, ot11Var.f168950b) && this.f168951c == ot11Var.f168951c;
    }

    public final int hashCode() {
        String str = this.f168949a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f168950b;
        return Boolean.hashCode(this.f168951c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
