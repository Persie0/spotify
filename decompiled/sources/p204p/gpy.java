package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gpy extends hpy {

    /* JADX INFO: renamed from: a */
    public final Object f83268a;

    /* JADX INFO: renamed from: b */
    public final String f83269b;

    public gpy(Object obj, String str) {
        this.f83268a = obj;
        this.f83269b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpy)) {
            return false;
        }
        gpy gpyVar = (gpy) obj;
        return wj50.m88271j(this.f83268a, gpyVar.f83268a) && wj50.m88271j(this.f83269b, gpyVar.f83269b);
    }

    public final int hashCode() {
        Object obj = this.f83268a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f83269b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
