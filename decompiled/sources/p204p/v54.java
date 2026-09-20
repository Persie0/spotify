package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v54 {

    /* JADX INFO: renamed from: a */
    public final boolean f237309a;

    public v54(boolean z) {
        this.f237309a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v54) && this.f237309a == ((v54) obj).f237309a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237309a);
    }
}
