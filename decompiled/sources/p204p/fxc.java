package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fxc implements lxc {

    /* JADX INFO: renamed from: a */
    public final String f74332a;

    /* JADX INFO: renamed from: b */
    public final boolean f74333b;

    public fxc(String str, boolean z) {
        this.f74332a = str;
        this.f74333b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxc)) {
            return false;
        }
        fxc fxcVar = (fxc) obj;
        return wj50.m88271j(this.f74332a, fxcVar.f74332a) && this.f74333b == fxcVar.f74333b;
    }

    public final int hashCode() {
        String str = this.f74332a;
        return Boolean.hashCode(this.f74333b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
