package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jhb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f112376a;

    /* JADX INFO: renamed from: b */
    public final String f112377b;

    public jhb(boolean z, String str) {
        this.f112376a = z;
        this.f112377b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhb)) {
            return false;
        }
        jhb jhbVar = (jhb) obj;
        return this.f112376a == jhbVar.f112376a && wj50.m88271j(this.f112377b, jhbVar.f112377b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112376a) * 31;
        String str = this.f112377b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
