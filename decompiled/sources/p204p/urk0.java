package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class urk0 implements zrk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f233396a;

    public urk0(boolean z) {
        this.f233396a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urk0) && this.f233396a == ((urk0) obj).f233396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233396a);
    }
}
