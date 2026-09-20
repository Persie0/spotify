package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class im80 {

    /* JADX INFO: renamed from: a */
    public final String f103640a;

    /* JADX INFO: renamed from: b */
    public final String f103641b;

    public im80(String str, String str2) {
        this.f103640a = str;
        this.f103641b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im80)) {
            return false;
        }
        im80 im80Var = (im80) obj;
        return wj50.m88271j(this.f103640a, im80Var.f103640a) && wj50.m88271j(this.f103641b, im80Var.f103641b);
    }

    public final int hashCode() {
        String str = this.f103640a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.f103641b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
