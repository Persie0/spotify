package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bm01 implements em01 {

    /* JADX INFO: renamed from: a */
    public final boolean f28345a;

    public bm01(boolean z) {
        this.f28345a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm01) && this.f28345a == ((bm01) obj).f28345a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28345a);
    }
}
