package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rgn0 implements tgn0 {

    /* JADX INFO: renamed from: a */
    public final String f198984a;

    /* JADX INFO: renamed from: b */
    public final String f198985b;

    public rgn0(String str, String str2) {
        this.f198984a = str;
        this.f198985b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgn0)) {
            return false;
        }
        rgn0 rgn0Var = (rgn0) obj;
        return wj50.m88271j(this.f198984a, rgn0Var.f198984a) && wj50.m88271j(this.f198985b, rgn0Var.f198985b);
    }

    public final int hashCode() {
        int iHashCode = this.f198984a.hashCode() * 31;
        String str = this.f198985b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
