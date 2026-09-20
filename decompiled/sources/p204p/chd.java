package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class chd {

    /* JADX INFO: renamed from: a */
    public final String f37992a;

    /* JADX INFO: renamed from: b */
    public final String f37993b;

    public chd(String str, String str2) {
        this.f37992a = str;
        this.f37993b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chd)) {
            return false;
        }
        chd chdVar = (chd) obj;
        return wj50.m88271j(this.f37992a, chdVar.f37992a) && wj50.m88271j(this.f37993b, chdVar.f37993b);
    }

    public final int hashCode() {
        int iHashCode = this.f37992a.hashCode() * 31;
        String str = this.f37993b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
