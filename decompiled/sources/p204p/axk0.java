package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class axk0 {

    /* JADX INFO: renamed from: a */
    public final String f20892a;

    /* JADX INFO: renamed from: b */
    public final String f20893b;

    public axk0(String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.f20892a = str;
        this.f20893b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axk0)) {
            return false;
        }
        axk0 axk0Var = (axk0) obj;
        return wj50.m88271j(this.f20892a, axk0Var.f20892a) && wj50.m88271j(this.f20893b, axk0Var.f20893b);
    }

    public final int hashCode() {
        String str = this.f20892a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20893b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
