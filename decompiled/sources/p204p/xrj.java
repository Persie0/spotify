package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xrj extends dsj {

    /* JADX INFO: renamed from: a */
    public final int f265354a;

    /* JADX INFO: renamed from: b */
    public final int f265355b;

    public xrj(int i, int i2) {
        this.f265354a = i;
        this.f265355b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrj)) {
            return false;
        }
        xrj xrjVar = (xrj) obj;
        return this.f265354a == xrjVar.f265354a && this.f265355b == xrjVar.f265355b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265355b) + (Integer.hashCode(this.f265354a) * 31);
    }
}
