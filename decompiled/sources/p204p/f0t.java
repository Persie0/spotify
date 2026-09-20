package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f0t implements h0t {

    /* JADX INFO: renamed from: a */
    public final boolean f64713a;

    public f0t(boolean z) {
        this.f64713a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0t) && this.f64713a == ((f0t) obj).f64713a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64713a);
    }
}
