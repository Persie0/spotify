package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class esz0 {

    /* JADX INFO: renamed from: a */
    public final String f62530a;

    /* JADX INFO: renamed from: b */
    public final String f62531b;

    /* JADX INFO: renamed from: c */
    public final ba8 f62532c;

    public esz0(String str, String str2, ba8 ba8Var) {
        this.f62530a = str;
        this.f62531b = str2;
        this.f62532c = ba8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esz0)) {
            return false;
        }
        esz0 esz0Var = (esz0) obj;
        return wj50.m88271j(this.f62530a, esz0Var.f62530a) && wj50.m88271j(this.f62531b, esz0Var.f62531b) && wj50.m88271j(this.f62532c, esz0Var.f62532c);
    }

    public final int hashCode() {
        int iHashCode = this.f62530a.hashCode() * 31;
        String str = this.f62531b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ba8 ba8Var = this.f62532c;
        return iHashCode2 + (ba8Var != null ? ba8Var.hashCode() : 0);
    }
}
