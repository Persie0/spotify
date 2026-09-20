package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xgj {

    /* JADX INFO: renamed from: a */
    public final boolean f261327a;

    public xgj(boolean z) {
        this.f261327a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgj) && this.f261327a == ((xgj) obj).f261327a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261327a);
    }
}
