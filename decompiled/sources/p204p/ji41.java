package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ji41 {

    /* JADX INFO: renamed from: a */
    public final boolean f112641a;

    /* JADX INFO: renamed from: b */
    public final String f112642b;

    public ji41(boolean z, String str) {
        this.f112641a = z;
        this.f112642b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji41)) {
            return false;
        }
        ji41 ji41Var = (ji41) obj;
        return this.f112641a == ji41Var.f112641a && wj50.m88271j(this.f112642b, ji41Var.f112642b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112641a) * 31;
        String str = this.f112642b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
