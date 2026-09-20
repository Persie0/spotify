package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l131 extends gue {

    /* JADX INFO: renamed from: f */
    public final boolean f128613f;

    public l131(boolean z) {
        this.f128613f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l131) && this.f128613f == ((l131) obj).f128613f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128613f);
    }
}
