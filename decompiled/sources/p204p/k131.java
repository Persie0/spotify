package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k131 extends gue {

    /* JADX INFO: renamed from: f */
    public final boolean f118199f;

    public k131(boolean z) {
        this.f118199f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k131) && this.f118199f == ((k131) obj).f118199f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118199f);
    }
}
