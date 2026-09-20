package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class faf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final boolean f67551b;

    public faf0(boolean z) {
        super(true);
        this.f67551b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof faf0) && this.f67551b == ((faf0) obj).f67551b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67551b);
    }
}
