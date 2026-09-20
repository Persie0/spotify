package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rzn0 {

    /* JADX INFO: renamed from: a */
    public final boolean f204190a;

    public rzn0(boolean z) {
        this.f204190a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzn0) && this.f204190a == ((rzn0) obj).f204190a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(this.f204190a) * 31);
    }
}
