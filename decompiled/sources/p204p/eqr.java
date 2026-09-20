package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eqr implements fqr {

    /* JADX INFO: renamed from: a */
    public final int f61942a;

    public final boolean equals(Object obj) {
        if (obj instanceof eqr) {
            return this.f61942a == ((eqr) obj).f61942a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61942a);
    }

    public final String toString() {
        return edb.m38563l("StopFailed(errorCode=", this.f61942a, ")");
    }
}
