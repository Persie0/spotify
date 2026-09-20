package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e8z extends f8z {

    /* JADX INFO: renamed from: a */
    public final boolean f57313a;

    public e8z(boolean z) {
        this.f57313a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8z) && this.f57313a == ((e8z) obj).f57313a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57313a);
    }
}
