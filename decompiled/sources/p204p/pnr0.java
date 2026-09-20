package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pnr0 {

    /* JADX INFO: renamed from: a */
    public final String f179512a;

    /* JADX INFO: renamed from: b */
    public final boolean f179513b;

    public pnr0(String str, boolean z) {
        this.f179512a = str;
        this.f179513b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnr0)) {
            return false;
        }
        pnr0 pnr0Var = (pnr0) obj;
        return wj50.m88271j(this.f179512a, pnr0Var.f179512a) && this.f179513b == pnr0Var.f179513b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179513b) + (this.f179512a.hashCode() * 31);
    }
}
