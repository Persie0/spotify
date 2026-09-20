package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f217748a;

    public t7c0(boolean z) {
        this.f217748a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7c0) && this.f217748a == ((t7c0) obj).f217748a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217748a);
    }
}
