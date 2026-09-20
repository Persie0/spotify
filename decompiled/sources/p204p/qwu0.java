package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qwu0 {

    /* JADX INFO: renamed from: a */
    public final y6s0 f193423a;

    /* JADX INFO: renamed from: b */
    public final lwu0 f193424b;

    public qwu0(y6s0 y6s0Var, lwu0 lwu0Var) {
        this.f193423a = y6s0Var;
        this.f193424b = lwu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwu0)) {
            return false;
        }
        qwu0 qwu0Var = (qwu0) obj;
        return wj50.m88271j(this.f193423a, qwu0Var.f193423a) && wj50.m88271j(this.f193424b, qwu0Var.f193424b);
    }

    public final int hashCode() {
        return this.f193424b.hashCode() + (this.f193423a.hashCode() * 31);
    }
}
