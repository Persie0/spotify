package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class abf0 {

    /* JADX INFO: renamed from: a */
    public final String f14105a;

    /* JADX INFO: renamed from: b */
    public final String f14106b;

    public abf0(String str, String str2) {
        this.f14105a = str;
        this.f14106b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abf0)) {
            return false;
        }
        abf0 abf0Var = (abf0) obj;
        return wj50.m88271j(this.f14105a, abf0Var.f14105a) && wj50.m88271j(this.f14106b, abf0Var.f14106b);
    }

    public final int hashCode() {
        int iHashCode = this.f14105a.hashCode() * 31;
        String str = this.f14106b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
