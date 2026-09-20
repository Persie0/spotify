package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i2i implements ktx {

    /* JADX INFO: renamed from: a */
    public final cjb f97846a;

    /* JADX INFO: renamed from: b */
    public final String f97847b;

    public i2i(cjb cjbVar, String str) {
        this.f97846a = cjbVar;
        this.f97847b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2i)) {
            return false;
        }
        i2i i2iVar = (i2i) obj;
        return wj50.m88271j(this.f97846a, i2iVar.f97846a) && wj50.m88271j(this.f97847b, i2iVar.f97847b);
    }

    public final int hashCode() {
        int iHashCode = this.f97846a.hashCode() * 31;
        String str = this.f97847b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
