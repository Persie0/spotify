package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ykk0 {

    /* JADX INFO: renamed from: a */
    public final hau0 f273746a;

    public ykk0(hau0 hau0Var) {
        this.f273746a = hau0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykk0) && this.f273746a.equals(((ykk0) obj).f273746a);
    }

    public final int hashCode() {
        return this.f273746a.hashCode();
    }

    public final String toString() {
        return "TrackFingerprint(callback=" + this.f273746a + ")";
    }
}
