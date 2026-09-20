package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d1t implements f1t {

    /* JADX INFO: renamed from: a */
    public final boolean f44353a;

    public d1t(boolean z) {
        this.f44353a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1t) && this.f44353a == ((d1t) obj).f44353a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44353a);
    }
}
