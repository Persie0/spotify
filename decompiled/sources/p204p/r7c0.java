package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196494a;

    public r7c0(boolean z) {
        this.f196494a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7c0) && this.f196494a == ((r7c0) obj).f196494a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196494a);
    }
}
