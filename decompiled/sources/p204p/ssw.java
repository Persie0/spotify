package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ssw implements c3x {

    /* JADX INFO: renamed from: a */
    public final boolean f213722a;

    public ssw(boolean z) {
        this.f213722a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssw) && this.f213722a == ((ssw) obj).f213722a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213722a);
    }
}
