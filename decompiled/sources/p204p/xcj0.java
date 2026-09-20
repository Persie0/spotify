package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xcj0 {

    /* JADX INFO: renamed from: a */
    public final int f260244a;

    /* JADX INFO: renamed from: b */
    public final int f260245b;

    public xcj0(int i, int i2) {
        this.f260244a = i;
        this.f260245b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcj0)) {
            return false;
        }
        xcj0 xcj0Var = (xcj0) obj;
        return this.f260244a == xcj0Var.f260244a && this.f260245b == xcj0Var.f260245b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260245b) + (Integer.hashCode(this.f260244a) * 31);
    }
}
