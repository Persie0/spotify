package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c63 {

    /* JADX INFO: renamed from: a */
    public final boolean f34356a;

    public c63(boolean z) {
        this.f34356a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c63) && this.f34356a == ((c63) obj).f34356a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34356a);
    }
}
