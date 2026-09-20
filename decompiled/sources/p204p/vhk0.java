package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vhk0 implements yhk0 {

    /* JADX INFO: renamed from: a */
    public final int f241531a;

    public final boolean equals(Object obj) {
        if (obj instanceof vhk0) {
            return this.f241531a == ((vhk0) obj).f241531a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241531a);
    }

    public final String toString() {
        return edb.m38563l("StartFailed(errorCode=", this.f241531a, ")");
    }
}
