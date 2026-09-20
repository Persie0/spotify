package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pkt0 implements xkt0 {

    /* JADX INFO: renamed from: a */
    public final jjt0 f178549a;

    public pkt0(jjt0 jjt0Var) {
        this.f178549a = jjt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkt0) && wj50.m88271j(this.f178549a, ((pkt0) obj).f178549a);
    }

    public final int hashCode() {
        jjt0 jjt0Var = this.f178549a;
        if (jjt0Var == null) {
            return 0;
        }
        return jjt0Var.hashCode();
    }
}
