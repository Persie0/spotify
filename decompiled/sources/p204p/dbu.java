package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dbu {

    /* JADX INFO: renamed from: a */
    public final String f47365a;

    /* JADX INFO: renamed from: b */
    public final String f47366b;

    /* JADX INFO: renamed from: c */
    public final int f47367c;

    /* JADX INFO: renamed from: d */
    public final String f47368d;

    public dbu(String str, String str2, int i, String str3) {
        this.f47365a = str;
        this.f47366b = str2;
        this.f47367c = i;
        this.f47368d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbu)) {
            return false;
        }
        dbu dbuVar = (dbu) obj;
        return wj50.m88271j(this.f47365a, dbuVar.f47365a) && wj50.m88271j(this.f47366b, dbuVar.f47366b) && this.f47367c == dbuVar.f47367c && wj50.m88271j(this.f47368d, dbuVar.f47368d);
    }

    public final int hashCode() {
        String str = this.f47365a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f47366b;
        int iM40938f = f710.m40938f(this.f47367c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f47368d;
        return iM40938f + (str3 != null ? str3.hashCode() : 0);
    }
}
