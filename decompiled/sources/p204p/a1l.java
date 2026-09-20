package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f11437a;

    public a1l(boolean z) {
        this.f11437a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24456a() {
        return this.f11437a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1l) && this.f11437a == ((a1l) obj).f11437a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11437a);
    }
}
