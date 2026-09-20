package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f206320a;

    public s7b0(boolean z) {
        this.f206320a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7b0) && this.f206320a == ((s7b0) obj).f206320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206320a);
    }
}
