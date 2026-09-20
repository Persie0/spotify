package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class es6 implements is6 {

    /* JADX INFO: renamed from: a */
    public final boolean f62294a;

    public es6(boolean z) {
        this.f62294a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es6) && this.f62294a == ((es6) obj).f62294a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62294a);
    }
}
