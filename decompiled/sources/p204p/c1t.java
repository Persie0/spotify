package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c1t implements f1t {

    /* JADX INFO: renamed from: a */
    public final boolean f33183a;

    public c1t(boolean z) {
        this.f33183a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1t) && this.f33183a == ((c1t) obj).f33183a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33183a);
    }
}
