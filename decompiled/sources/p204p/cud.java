package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cud implements ktx {

    /* JADX INFO: renamed from: a */
    public final bud f42092a;

    /* JADX INFO: renamed from: b */
    public final String f42093b;

    /* JADX INFO: renamed from: c */
    public final String f42094c;

    public cud(bud budVar, String str, String str2) {
        this.f42092a = budVar;
        this.f42093b = str;
        this.f42094c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cud)) {
            return false;
        }
        cud cudVar = (cud) obj;
        return this.f42092a.equals(cudVar.f42092a) && wj50.m88271j(this.f42093b, cudVar.f42093b) && wj50.m88271j(this.f42094c, cudVar.f42094c);
    }

    public final int hashCode() {
        int iHashCode = this.f42092a.hashCode() * 31;
        String str = this.f42093b;
        return Boolean.hashCode(false) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f42094c);
    }
}
