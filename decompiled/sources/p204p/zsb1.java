package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zsb1 {

    /* JADX INFO: renamed from: a */
    public final hmm0 f285914a;

    /* JADX INFO: renamed from: b */
    public final btb1 f285915b;

    public zsb1(hmm0 hmm0Var, btb1 btb1Var) {
        this.f285914a = hmm0Var;
        this.f285915b = btb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsb1)) {
            return false;
        }
        zsb1 zsb1Var = (zsb1) obj;
        return this.f285914a.equals(zsb1Var.f285914a) && this.f285915b.equals(zsb1Var.f285915b);
    }

    public final int hashCode() {
        return this.f285915b.hashCode() + (this.f285914a.hashCode() * 31);
    }
}
