package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f120033a;

    public k7b0(boolean z) {
        this.f120033a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7b0) && this.f120033a == ((k7b0) obj).f120033a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120033a);
    }
}
