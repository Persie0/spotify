package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cgf0 implements egf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37656a;

    public cgf0(boolean z) {
        this.f37656a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgf0) && this.f37656a == ((cgf0) obj).f37656a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37656a);
    }
}
