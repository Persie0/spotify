package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ds6 implements is6 {

    /* JADX INFO: renamed from: a */
    public final boolean f52495a;

    public ds6(boolean z) {
        this.f52495a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds6) && this.f52495a == ((ds6) obj).f52495a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52495a);
    }
}
