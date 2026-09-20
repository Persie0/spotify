package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zgy {

    /* JADX INFO: renamed from: a */
    public final String f282733a;

    /* JADX INFO: renamed from: b */
    public final String f282734b;

    /* JADX INFO: renamed from: c */
    public final jhy f282735c;

    public zgy(String str, String str2, jhy jhyVar) {
        this.f282733a = str;
        this.f282734b = str2;
        this.f282735c = jhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgy)) {
            return false;
        }
        zgy zgyVar = (zgy) obj;
        return wj50.m88271j(this.f282733a, zgyVar.f282733a) && wj50.m88271j(this.f282734b, zgyVar.f282734b) && wj50.m88271j(this.f282735c, zgyVar.f282735c);
    }

    public final int hashCode() {
        int iHashCode = this.f282733a.hashCode() * 31;
        String str = this.f282734b;
        return this.f282735c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
