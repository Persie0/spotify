package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xil0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f261912a;

    public xil0(boolean z) {
        this.f261912a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xil0) && this.f261912a == ((xil0) obj).f261912a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261912a);
    }
}
