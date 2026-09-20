package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ebd0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57906a;

    public ebd0(boolean z) {
        this.f57906a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebd0) && this.f57906a == ((ebd0) obj).f57906a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57906a);
    }
}
