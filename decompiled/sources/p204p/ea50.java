package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ea50 implements la50 {

    /* JADX INFO: renamed from: a */
    public final String f57586a;

    /* JADX INFO: renamed from: b */
    public final String f57587b;

    public ea50(String str, String str2) {
        this.f57586a = str;
        this.f57587b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea50)) {
            return false;
        }
        ea50 ea50Var = (ea50) obj;
        return wj50.m88271j(this.f57586a, ea50Var.f57586a) && wj50.m88271j(this.f57587b, ea50Var.f57587b);
    }

    public final int hashCode() {
        String str = this.f57586a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57587b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
