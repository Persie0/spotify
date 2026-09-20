package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o2y {

    /* JADX INFO: renamed from: a */
    public final boolean f161174a;

    public o2y(boolean z) {
        this.f161174a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2y) && this.f161174a == ((o2y) obj).f161174a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161174a);
    }
}
