package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vgl implements chl {

    /* JADX INFO: renamed from: a */
    public final String f241260a;

    /* JADX INFO: renamed from: b */
    public final String f241261b;

    /* JADX INFO: renamed from: c */
    public final String f241262c;

    /* JADX INFO: renamed from: d */
    public final dhl f241263d;

    /* JADX INFO: renamed from: e */
    public final boolean f241264e;

    public vgl(String str, String str2, String str3, dhl dhlVar, boolean z) {
        this.f241260a = str;
        this.f241261b = str2;
        this.f241262c = str3;
        this.f241263d = dhlVar;
        this.f241264e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgl)) {
            return false;
        }
        vgl vglVar = (vgl) obj;
        return wj50.m88271j(this.f241260a, vglVar.f241260a) && wj50.m88271j(this.f241261b, vglVar.f241261b) && wj50.m88271j(this.f241262c, vglVar.f241262c) && this.f241263d.equals(vglVar.f241263d) && this.f241264e == vglVar.f241264e;
    }

    public final int hashCode() {
        int iHashCode = this.f241260a.hashCode() * 31;
        String str = this.f241261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f241262c;
        return Boolean.hashCode(this.f241264e) + ((this.f241263d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
