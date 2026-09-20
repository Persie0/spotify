package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final f1f f194842a;

    /* JADX INFO: renamed from: b */
    public final d850 f194843b;

    public r1f(f1f f1fVar, d850 d850Var) {
        this.f194842a = f1fVar;
        this.f194843b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1f)) {
            return false;
        }
        r1f r1fVar = (r1f) obj;
        return wj50.m88271j(this.f194842a, r1fVar.f194842a) && wj50.m88271j(this.f194843b, r1fVar.f194843b);
    }

    public final int hashCode() {
        return this.f194843b.hashCode() + (this.f194842a.hashCode() * 31);
    }
}
