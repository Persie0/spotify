package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rqx implements irx {

    /* JADX INFO: renamed from: a */
    public final boolean f201902a;

    public rqx(boolean z) {
        this.f201902a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqx) && this.f201902a == ((rqx) obj).f201902a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201902a);
    }
}
