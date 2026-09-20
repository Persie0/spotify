package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o3a {

    /* JADX INFO: renamed from: a */
    public final boolean f161330a;

    public o3a(boolean z) {
        this.f161330a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3a) && this.f161330a == ((o3a) obj).f161330a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161330a);
    }
}
