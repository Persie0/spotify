package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class uo31 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f232323a;

    public uo31(boolean z) {
        this.f232323a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo31) && this.f232323a == ((uo31) obj).f232323a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232323a);
    }
}
