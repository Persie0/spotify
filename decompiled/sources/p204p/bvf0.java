package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bvf0 {

    /* JADX INFO: renamed from: a */
    public final avf0 f31355a;

    /* JADX INFO: renamed from: b */
    public final cvf0 f31356b;

    /* JADX INFO: renamed from: c */
    public final cvf0 f31357c;

    public bvf0(avf0 avf0Var, cvf0 cvf0Var, cvf0 cvf0Var2) {
        this.f31355a = avf0Var;
        this.f31356b = cvf0Var;
        this.f31357c = cvf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvf0)) {
            return false;
        }
        bvf0 bvf0Var = (bvf0) obj;
        return wj50.m88271j(this.f31355a, bvf0Var.f31355a) && wj50.m88271j(this.f31356b, bvf0Var.f31356b) && wj50.m88271j(this.f31357c, bvf0Var.f31357c);
    }

    public final int hashCode() {
        int iHashCode = this.f31355a.hashCode() * 31;
        cvf0 cvf0Var = this.f31356b;
        int iHashCode2 = (iHashCode + (cvf0Var == null ? 0 : cvf0Var.hashCode())) * 31;
        cvf0 cvf0Var2 = this.f31357c;
        return iHashCode2 + (cvf0Var2 != null ? cvf0Var2.hashCode() : 0);
    }
}
