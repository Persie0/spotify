package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b97 {

    /* JADX INFO: renamed from: a */
    public final boolean f24786a;

    public b97(boolean z) {
        this.f24786a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28458a() {
        return this.f24786a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b97) && this.f24786a == ((b97) obj).f24786a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24786a);
    }
}
