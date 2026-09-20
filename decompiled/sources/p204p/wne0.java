package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wne0 {

    /* JADX INFO: renamed from: a */
    public final ntt0 f253166a;

    /* JADX INFO: renamed from: b */
    public final int f253167b;

    public wne0(ntt0 ntt0Var, int i) {
        this.f253166a = ntt0Var;
        this.f253167b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wne0)) {
            return false;
        }
        wne0 wne0Var = (wne0) obj;
        return wj50.m88271j(this.f253166a, wne0Var.f253166a) && this.f253167b == wne0Var.f253167b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f253167b) + (this.f253166a.hashCode() * 31);
    }
}
