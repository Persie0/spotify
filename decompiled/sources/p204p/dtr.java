package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dtr {

    /* JADX INFO: renamed from: a */
    public final boolean f52894a;

    public dtr(boolean z) {
        this.f52894a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtr) && this.f52894a == ((dtr) obj).f52894a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52894a);
    }
}
