package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final boolean f261192a;

    public xg31(boolean z) {
        this.f261192a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg31) && this.f261192a == ((xg31) obj).f261192a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261192a);
    }
}
