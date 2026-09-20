package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fbt implements hbt {

    /* JADX INFO: renamed from: a */
    public final boolean f67882a;

    public fbt(boolean z) {
        this.f67882a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbt) && this.f67882a == ((fbt) obj).f67882a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67882a);
    }
}
