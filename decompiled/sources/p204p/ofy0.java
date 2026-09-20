package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ofy0 extends dxf1 {

    /* JADX INFO: renamed from: d */
    public final String f164947d;

    /* JADX INFO: renamed from: e */
    public final String f164948e;

    public ofy0(String str, String str2) {
        this.f164947d = str;
        this.f164948e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofy0)) {
            return false;
        }
        ofy0 ofy0Var = (ofy0) obj;
        return wj50.m88271j(this.f164947d, ofy0Var.f164947d) && wj50.m88271j(this.f164948e, ofy0Var.f164948e);
    }

    public final int hashCode() {
        String str = this.f164947d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f164948e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: r */
    public final String mo37251r() {
        return this.f164948e;
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: u */
    public final String mo37252u() {
        return this.f164947d;
    }
}
