package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pk2 {

    /* JADX INFO: renamed from: a */
    public final String f178367a;

    /* JADX INFO: renamed from: b */
    public final String f178368b;

    /* JADX INFO: renamed from: c */
    public final String f178369c;

    /* JADX INFO: renamed from: d */
    public final int f178370d;

    public pk2(String str, String str2, int i, String str3) {
        this.f178367a = str;
        this.f178368b = str2;
        this.f178369c = str3;
        this.f178370d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2)) {
            return false;
        }
        pk2 pk2Var = (pk2) obj;
        return wj50.m88271j(this.f178367a, pk2Var.f178367a) && wj50.m88271j(this.f178368b, pk2Var.f178368b) && this.f178369c.equals(pk2Var.f178369c) && this.f178370d == pk2Var.f178370d;
    }

    public final int hashCode() {
        int iHashCode = this.f178367a.hashCode() * 31;
        String str = this.f178368b;
        return edb.m38547C(this.f178370d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f178369c);
    }
}
