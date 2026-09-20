package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wm80 {

    /* JADX INFO: renamed from: a */
    public final ocl0 f252753a;

    /* JADX INFO: renamed from: b */
    public final String f252754b;

    public wm80(ocl0 ocl0Var, String str) {
        this.f252753a = ocl0Var;
        this.f252754b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm80)) {
            return false;
        }
        wm80 wm80Var = (wm80) obj;
        return wj50.m88271j(this.f252753a, wm80Var.f252753a) && wj50.m88271j(this.f252754b, wm80Var.f252754b);
    }

    public final int hashCode() {
        return this.f252754b.hashCode() + (this.f252753a.hashCode() * 31);
    }
}
