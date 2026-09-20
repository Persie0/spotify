package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yw50 {

    /* JADX INFO: renamed from: a */
    public final boolean f276867a;

    public yw50(boolean z) {
        this.f276867a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw50) && this.f276867a == ((yw50) obj).f276867a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276867a);
    }
}
