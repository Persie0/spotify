package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y9f1 extends fhv0 {

    /* JADX INFO: renamed from: a */
    public final ehv0 f270586a;

    public y9f1(ehv0 ehv0Var) {
        this.f270586a = ehv0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fhv0)) {
            return false;
        }
        return this.f270586a.equals(((y9f1) ((fhv0) obj)).f270586a);
    }

    public final int hashCode() {
        return this.f270586a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s571.m77251j("RecordingInfo{status=", this.f270586a.toString(), "}");
    }
}
