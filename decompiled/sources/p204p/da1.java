package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class da1 {

    /* JADX INFO: renamed from: a */
    public final boolean f46957a;

    public da1(boolean z) {
        this.f46957a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da1) && this.f46957a == ((da1) obj).f46957a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46957a);
    }
}
