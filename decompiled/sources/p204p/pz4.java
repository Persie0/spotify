package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pz4 {

    /* JADX INFO: renamed from: a */
    public final rz4 f183594a;

    /* JADX INFO: renamed from: b */
    public final rq91 f183595b;

    public pz4(rz4 rz4Var, rq91 rq91Var) {
        this.f183594a = rz4Var;
        this.f183595b = rq91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz4)) {
            return false;
        }
        pz4 pz4Var = (pz4) obj;
        return this.f183594a.equals(pz4Var.f183594a) && this.f183595b.equals(pz4Var.f183595b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183595b.f201781b) + ((this.f183594a.hashCode() - 368338282) * 31);
    }
}
