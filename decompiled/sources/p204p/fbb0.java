package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fbb0 implements jbb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67778a;

    public fbb0(boolean z) {
        this.f67778a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbb0) && this.f67778a == ((fbb0) obj).f67778a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67778a);
    }
}
