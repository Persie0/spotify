package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dkt implements ymt {

    /* JADX INFO: renamed from: a */
    public final boolean f50022a;

    public dkt(boolean z) {
        this.f50022a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkt) && this.f50022a == ((dkt) obj).f50022a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50022a);
    }
}
