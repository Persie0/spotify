package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final boolean f161658a;

    public o4d1(boolean z) {
        this.f161658a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4d1) && this.f161658a == ((o4d1) obj).f161658a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161658a);
    }
}
