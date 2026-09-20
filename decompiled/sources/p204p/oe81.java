package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oe81 implements te81 {

    /* JADX INFO: renamed from: a */
    public final boolean f164382a;

    public oe81(boolean z) {
        this.f164382a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe81) && this.f164382a == ((oe81) obj).f164382a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164382a);
    }
}
