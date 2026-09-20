package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f8t0 {

    /* JADX INFO: renamed from: a */
    public final boolean f67084a;

    public f8t0(boolean z) {
        this.f67084a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8t0) && this.f67084a == ((f8t0) obj).f67084a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67084a);
    }
}
