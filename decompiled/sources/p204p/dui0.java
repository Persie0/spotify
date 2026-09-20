package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dui0 extends gui0 {

    /* JADX INFO: renamed from: a */
    public final boolean f53060a;

    public dui0(boolean z) {
        this.f53060a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dui0) && this.f53060a == ((dui0) obj).f53060a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53060a);
    }
}
