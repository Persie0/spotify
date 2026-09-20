package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class swe0 {

    /* JADX INFO: renamed from: a */
    public final boolean f214655a;

    public swe0(boolean z) {
        this.f214655a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swe0) && this.f214655a == ((swe0) obj).f214655a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214655a);
    }
}
