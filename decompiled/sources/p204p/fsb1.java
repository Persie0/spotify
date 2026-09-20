package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fsb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f72824a;

    public fsb1(boolean z) {
        this.f72824a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fsb1) && this.f72824a == ((fsb1) obj).f72824a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72824a);
    }
}
