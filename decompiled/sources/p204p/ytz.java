package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ytz {

    /* JADX INFO: renamed from: a */
    public final boolean f276232a;

    public ytz(boolean z) {
        this.f276232a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytz) && this.f276232a == ((ytz) obj).f276232a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276232a);
    }
}
