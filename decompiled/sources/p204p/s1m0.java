package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s1m0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final r1m0 f204746a;

    public s1m0(ket ketVar) {
        this.f204746a = ketVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1m0) && wj50.m88271j(this.f204746a, ((s1m0) obj).f204746a);
    }

    public final int hashCode() {
        r1m0 r1m0Var = this.f204746a;
        if (r1m0Var == null) {
            return 0;
        }
        return r1m0Var.hashCode();
    }
}
