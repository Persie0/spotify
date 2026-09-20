package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xzv0 extends b0w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f267815a;

    public xzv0(boolean z) {
        this.f267815a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzv0) && this.f267815a == ((xzv0) obj).f267815a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267815a);
    }
}
