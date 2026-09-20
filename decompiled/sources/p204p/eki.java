package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eki {

    /* JADX INFO: renamed from: a */
    public final String f60454a;

    /* JADX INFO: renamed from: b */
    public final String f60455b;

    /* JADX INFO: renamed from: c */
    public final fmi f60456c;

    /* JADX INFO: renamed from: d */
    public final String f60457d;

    public eki(String str, String str2, fmi fmiVar, String str3) {
        this.f60454a = str;
        this.f60455b = str2;
        this.f60456c = fmiVar;
        this.f60457d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eki)) {
            return false;
        }
        eki ekiVar = (eki) obj;
        return wj50.m88271j(this.f60454a, ekiVar.f60454a) && wj50.m88271j(this.f60455b, ekiVar.f60455b) && wj50.m88271j(this.f60456c, ekiVar.f60456c) && wj50.m88271j(this.f60457d, ekiVar.f60457d);
    }

    public final int hashCode() {
        int iHashCode = (this.f60456c.hashCode() + s571.m77243b(this.f60454a.hashCode() * 31, 31, this.f60455b)) * 31;
        String str = this.f60457d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
