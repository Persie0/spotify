package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nfy0 extends dxf1 {

    /* JADX INFO: renamed from: d */
    public final String f153439d;

    /* JADX INFO: renamed from: e */
    public final String f153440e;

    public nfy0(String str, String str2) {
        this.f153439d = str;
        this.f153440e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfy0)) {
            return false;
        }
        nfy0 nfy0Var = (nfy0) obj;
        return wj50.m88271j(this.f153439d, nfy0Var.f153439d) && wj50.m88271j(this.f153440e, nfy0Var.f153440e);
    }

    public final int hashCode() {
        String str = this.f153439d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f153440e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: r */
    public final String mo37251r() {
        return this.f153440e;
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: u */
    public final String mo37252u() {
        return this.f153439d;
    }
}
