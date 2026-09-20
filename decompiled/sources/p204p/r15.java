package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r15 {

    /* JADX INFO: renamed from: a */
    public final xxf f194764a;

    /* JADX INFO: renamed from: b */
    public final z601 f194765b;

    public r15(xxf xxfVar, z601 z601Var) {
        this.f194764a = xxfVar;
        this.f194765b = z601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r15)) {
            return false;
        }
        r15 r15Var = (r15) obj;
        return wj50.m88271j(this.f194764a, r15Var.f194764a) && this.f194765b.equals(r15Var.f194765b);
    }

    public final int hashCode() {
        return this.f194765b.hashCode() + (this.f194764a.hashCode() * 31);
    }
}
