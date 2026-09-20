package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fct0 {

    /* JADX INFO: renamed from: a */
    public final boolean f68256a;

    public fct0(boolean z) {
        this.f68256a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fct0) && this.f68256a == ((fct0) obj).f68256a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68256a);
    }
}
