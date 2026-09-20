package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xcw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f260294a;

    /* JADX INFO: renamed from: b */
    public final boolean f260295b;

    public xcw0(boolean z, boolean z2) {
        this.f260294a = z;
        this.f260295b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcw0)) {
            return false;
        }
        xcw0 xcw0Var = (xcw0) obj;
        return this.f260294a == xcw0Var.f260294a && this.f260295b == xcw0Var.f260295b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260295b) + (Boolean.hashCode(this.f260294a) * 31);
    }
}
