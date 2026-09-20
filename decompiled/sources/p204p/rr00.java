package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rr00 implements xr00 {

    /* JADX INFO: renamed from: a */
    public final boolean f201917a;

    public rr00(boolean z) {
        this.f201917a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr00) && this.f201917a == ((rr00) obj).f201917a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201917a);
    }
}
