package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b0t implements h0t {

    /* JADX INFO: renamed from: a */
    public final boolean f22094a;

    public b0t(boolean z) {
        this.f22094a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0t) && this.f22094a == ((b0t) obj).f22094a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22094a);
    }
}
