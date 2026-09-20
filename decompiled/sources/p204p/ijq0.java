package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ijq0 {

    /* JADX INFO: renamed from: a */
    public final String f102866a;

    /* JADX INFO: renamed from: b */
    public final String f102867b;

    public ijq0(String str, String str2) {
        this.f102866a = str;
        this.f102867b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijq0)) {
            return false;
        }
        ijq0 ijq0Var = (ijq0) obj;
        return wj50.m88271j(this.f102866a, ijq0Var.f102866a) && wj50.m88271j(this.f102867b, ijq0Var.f102867b);
    }

    public final int hashCode() {
        String str = this.f102866a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f102867b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
