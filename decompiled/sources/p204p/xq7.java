package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xq7 {

    /* JADX INFO: renamed from: a */
    public final boolean f264886a;

    public xq7(boolean z) {
        this.f264886a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq7) && this.f264886a == ((xq7) obj).f264886a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264886a);
    }
}
