package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cqr implements fqr {

    /* JADX INFO: renamed from: a */
    public final int f40974a;

    public final boolean equals(Object obj) {
        if (obj instanceof cqr) {
            return this.f40974a == ((cqr) obj).f40974a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40974a);
    }

    public final String toString() {
        return edb.m38563l("StartFailed(errorCode=", this.f40974a, ")");
    }
}
