package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qff extends sff {

    /* JADX INFO: renamed from: a */
    public final qdz0 f188193a;

    /* JADX INFO: renamed from: b */
    public final int f188194b;

    /* JADX INFO: renamed from: c */
    public final boolean f188195c;

    public qff(qdz0 qdz0Var, int i, boolean z) {
        this.f188193a = qdz0Var;
        this.f188194b = i;
        this.f188195c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qff)) {
            return false;
        }
        qff qffVar = (qff) obj;
        return wj50.m88271j(this.f188193a, qffVar.f188193a) && this.f188194b == qffVar.f188194b && this.f188195c == qffVar.f188195c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188195c) + mt60.m62800g(this.f188194b, this.f188193a.hashCode() * 31, 31);
    }
}
