package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xeu0 implements afu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f260775a;

    public xeu0(boolean z) {
        this.f260775a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xeu0) && this.f260775a == ((xeu0) obj).f260775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260775a);
    }
}
