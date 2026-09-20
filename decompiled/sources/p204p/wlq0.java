package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlq0 {

    /* JADX INFO: renamed from: a */
    public final smq0 f252600a;

    /* JADX INFO: renamed from: b */
    public final int f252601b;

    public wlq0(smq0 smq0Var, int i) {
        this.f252600a = smq0Var;
        this.f252601b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlq0)) {
            return false;
        }
        wlq0 wlq0Var = (wlq0) obj;
        return wj50.m88271j(this.f252600a, wlq0Var.f252600a) && this.f252601b == wlq0Var.f252601b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f252601b) + (this.f252600a.hashCode() * 31);
    }
}
