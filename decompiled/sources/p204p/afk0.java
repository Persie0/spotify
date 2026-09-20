package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class afk0 implements bfk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15170a;

    public afk0(boolean z) {
        this.f15170a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afk0) && this.f15170a == ((afk0) obj).f15170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15170a);
    }
}
