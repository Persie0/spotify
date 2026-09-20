package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f43906a;

    public d0l(boolean z) {
        this.f43906a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34543a() {
        return this.f43906a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0l) && this.f43906a == ((d0l) obj).f43906a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43906a);
    }
}
