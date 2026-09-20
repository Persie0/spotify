package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lg11 {

    /* JADX INFO: renamed from: a */
    public final boolean f133052a;

    public lg11(boolean z) {
        this.f133052a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg11) && this.f133052a == ((lg11) obj).f133052a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133052a);
    }
}
