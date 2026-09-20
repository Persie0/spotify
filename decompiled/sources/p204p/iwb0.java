package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iwb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f106375a;

    public iwb0(boolean z) {
        this.f106375a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwb0) && this.f106375a == ((iwb0) obj).f106375a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106375a);
    }
}
