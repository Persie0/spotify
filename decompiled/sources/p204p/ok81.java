package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ok81 implements qk81 {

    /* JADX INFO: renamed from: a */
    public final String f166300a;

    /* JADX INFO: renamed from: b */
    public final String f166301b;

    /* JADX INFO: renamed from: c */
    public final int f166302c;

    public ok81(String str, String str2, int i) {
        this.f166300a = str;
        this.f166301b = str2;
        this.f166302c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok81)) {
            return false;
        }
        ok81 ok81Var = (ok81) obj;
        return wj50.m88271j(this.f166300a, ok81Var.f166300a) && wj50.m88271j(this.f166301b, ok81Var.f166301b) && this.f166302c == ok81Var.f166302c;
    }

    public final int hashCode() {
        int iHashCode = this.f166300a.hashCode() * 31;
        String str = this.f166301b;
        return edb.m38547C(this.f166302c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
