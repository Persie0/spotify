package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ywz {

    /* JADX INFO: renamed from: a */
    public final boolean f277079a;

    public ywz(boolean z) {
        this.f277079a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywz) && this.f277079a == ((ywz) obj).f277079a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277079a);
    }
}
