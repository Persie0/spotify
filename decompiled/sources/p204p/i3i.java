package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i3i implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f98182a;

    /* JADX INFO: renamed from: b */
    public final String f98183b;

    /* JADX INFO: renamed from: c */
    public final String f98184c;

    /* JADX INFO: renamed from: d */
    public final String f98185d;

    public i3i(String str, String str2, String str3, String str4) {
        this.f98182a = str;
        this.f98183b = str2;
        this.f98184c = str3;
        this.f98185d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3i)) {
            return false;
        }
        i3i i3iVar = (i3i) obj;
        return wj50.m88271j(this.f98182a, i3iVar.f98182a) && wj50.m88271j(this.f98183b, i3iVar.f98183b) && wj50.m88271j(this.f98184c, i3iVar.f98184c) && wj50.m88271j(this.f98185d, i3iVar.f98185d);
    }

    public final int hashCode() {
        int iHashCode = this.f98182a.hashCode() * 31;
        String str = this.f98183b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98184c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98185d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
