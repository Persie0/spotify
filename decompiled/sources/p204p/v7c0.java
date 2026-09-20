package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f238138a;

    public v7c0(boolean z) {
        this.f238138a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7c0) && this.f238138a == ((v7c0) obj).f238138a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238138a);
    }
}
