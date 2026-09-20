package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l321 extends n321 {

    /* JADX INFO: renamed from: a */
    public final String f129192a;

    /* JADX INFO: renamed from: b */
    public final String f129193b;

    public l321(String str, String str2) {
        this.f129192a = str;
        this.f129193b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l321)) {
            return false;
        }
        l321 l321Var = (l321) obj;
        return wj50.m88271j(this.f129192a, l321Var.f129192a) && wj50.m88271j(this.f129193b, l321Var.f129193b);
    }

    public final int hashCode() {
        String str = this.f129192a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f129193b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
