package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wim0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f251683a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f251684b;

    public wim0(String str, gkm0 gkm0Var) {
        this.f251683a = str;
        this.f251684b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wim0)) {
            return false;
        }
        wim0 wim0Var = (wim0) obj;
        return wj50.m88271j(this.f251683a, wim0Var.f251683a) && wj50.m88271j(this.f251684b, wim0Var.f251684b);
    }

    public final int hashCode() {
        return this.f251684b.hashCode() + (this.f251683a.hashCode() * 31);
    }
}
