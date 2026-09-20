package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i8f1 extends b8e0 {

    /* JADX INFO: renamed from: a */
    public final a8e0 f99779a;

    /* JADX INFO: renamed from: b */
    public final fhv0 f99780b;

    public i8f1(a8e0 a8e0Var, fhv0 fhv0Var) {
        this.f99779a = a8e0Var;
        this.f99780b = fhv0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b8e0) {
            i8f1 i8f1Var = (i8f1) ((b8e0) obj);
            if (this.f99779a.equals(i8f1Var.f99779a) && this.f99780b.equals(i8f1Var.f99780b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f99779a.hashCode() ^ 1000003) * 1000003) ^ this.f99780b.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("MeetingStatus{status=", this.f99779a.toString(), ", recordingInfo=", this.f99780b.toString(), "}");
    }
}
