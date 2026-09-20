package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pfy0 extends dxf1 {

    /* JADX INFO: renamed from: d */
    public final String f177159d;

    /* JADX INFO: renamed from: e */
    public final String f177160e;

    public pfy0(String str, String str2) {
        this.f177159d = str;
        this.f177160e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfy0)) {
            return false;
        }
        pfy0 pfy0Var = (pfy0) obj;
        return wj50.m88271j(this.f177159d, pfy0Var.f177159d) && wj50.m88271j(this.f177160e, pfy0Var.f177160e);
    }

    public final int hashCode() {
        String str = this.f177159d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f177160e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: r */
    public final String mo37251r() {
        return this.f177160e;
    }

    @Override // p204p.dxf1
    /* JADX INFO: renamed from: u */
    public final String mo37252u() {
        return this.f177159d;
    }
}
