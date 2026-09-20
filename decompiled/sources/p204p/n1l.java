package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f149469a;

    public n1l(boolean z) {
        this.f149469a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63517a() {
        return this.f149469a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1l) && this.f149469a == ((n1l) obj).f149469a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149469a);
    }
}
