package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i630 {

    /* JADX INFO: renamed from: a */
    public final boolean f99094a;

    public i630(boolean z) {
        this.f99094a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49793a() {
        return this.f99094a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i630) && this.f99094a == ((i630) obj).f99094a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99094a);
    }
}
