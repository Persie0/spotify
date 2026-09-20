package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final boolean f57374a;

    public e960(boolean z) {
        this.f57374a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e960) && this.f57374a == ((e960) obj).f57374a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57374a);
    }
}
