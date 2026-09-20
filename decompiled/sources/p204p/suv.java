package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class suv {

    /* JADX INFO: renamed from: a */
    public final String f214224a;

    /* JADX INFO: renamed from: b */
    public final String f214225b;

    public suv(String str, String str2) {
        this.f214224a = str;
        this.f214225b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suv)) {
            return false;
        }
        suv suvVar = (suv) obj;
        return wj50.m88271j(this.f214224a, suvVar.f214224a) && wj50.m88271j(this.f214225b, suvVar.f214225b);
    }

    public final int hashCode() {
        String str = this.f214224a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f214225b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
