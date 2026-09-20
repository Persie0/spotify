package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qg80 implements hwf {

    /* JADX INFO: renamed from: a */
    public final fyf f188405a;

    /* JADX INFO: renamed from: b */
    public final fyf f188406b;

    public qg80(fyf fyfVar, fyf fyfVar2) {
        this.f188405a = fyfVar;
        this.f188406b = fyfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg80)) {
            return false;
        }
        qg80 qg80Var = (qg80) obj;
        return this.f188405a.equals(qg80Var.f188405a) && this.f188406b.equals(qg80Var.f188406b);
    }

    public final int hashCode() {
        return this.f188406b.hashCode() + (this.f188405a.hashCode() * 31);
    }
}
