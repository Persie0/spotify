package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sv10 implements wv10 {

    /* JADX INFO: renamed from: a */
    public final boolean f214294a;

    public sv10(boolean z) {
        this.f214294a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv10) && this.f214294a == ((sv10) obj).f214294a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214294a);
    }
}
