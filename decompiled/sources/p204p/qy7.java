package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qy7 {

    /* JADX INFO: renamed from: a */
    public final o2d0 f193840a;

    /* JADX INFO: renamed from: b */
    public final pyu f193841b;

    public qy7(o2d0 o2d0Var, pyu pyuVar) {
        if (o2d0Var == null) {
            throw new NullPointerException("Null matcher");
        }
        this.f193840a = o2d0Var;
        this.f193841b = pyuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qy7)) {
            return false;
        }
        qy7 qy7Var = (qy7) obj;
        return this.f193840a.equals(qy7Var.f193840a) && this.f193841b.equals(qy7Var.f193841b);
    }

    public final int hashCode() {
        return ((this.f193840a.hashCode() ^ 1000003) * 1000003) ^ this.f193841b.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("CommandRoute{matcher=", String.valueOf(this.f193840a), ", factory=", String.valueOf(this.f193841b), "}");
    }
}
