package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sck0 {

    /* JADX INFO: renamed from: a */
    public final String f207763a;

    /* JADX INFO: renamed from: b */
    public final String f207764b;

    public sck0(String str, String str2) {
        this.f207763a = str;
        this.f207764b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sck0)) {
            return false;
        }
        sck0 sck0Var = (sck0) obj;
        return wj50.m88271j(this.f207763a, sck0Var.f207763a) && wj50.m88271j(this.f207764b, sck0Var.f207764b);
    }

    public final int hashCode() {
        return this.f207764b.hashCode() + (this.f207763a.hashCode() * 31);
    }
}
