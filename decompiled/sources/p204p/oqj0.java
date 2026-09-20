package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oqj0 {

    /* JADX INFO: renamed from: a */
    public final String f168301a;

    /* JADX INFO: renamed from: b */
    public final String f168302b;

    public oqj0(String str, String str2) {
        this.f168301a = str;
        this.f168302b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqj0)) {
            return false;
        }
        oqj0 oqj0Var = (oqj0) obj;
        return wj50.m88271j(this.f168301a, oqj0Var.f168301a) && wj50.m88271j(this.f168302b, oqj0Var.f168302b);
    }

    public final int hashCode() {
        String str = this.f168301a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f168302b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
