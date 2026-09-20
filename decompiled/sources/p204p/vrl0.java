package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vrl0 extends l4k0 {

    /* JADX INFO: renamed from: a */
    public final String f244225a;

    /* JADX INFO: renamed from: b */
    public final boolean f244226b;

    public vrl0(String str, boolean z) {
        this.f244225a = str;
        this.f244226b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrl0)) {
            return false;
        }
        vrl0 vrl0Var = (vrl0) obj;
        return wj50.m88271j(this.f244225a, vrl0Var.f244225a) && this.f244226b == vrl0Var.f244226b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244226b) + (this.f244225a.hashCode() * 31);
    }
}
