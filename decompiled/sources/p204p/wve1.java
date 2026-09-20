package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wve1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f255485a;

    public wve1(boolean z) {
        this.f255485a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wve1) && this.f255485a == ((wve1) obj).f255485a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255485a);
    }
}
