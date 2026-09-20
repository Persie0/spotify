package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n8r0 extends l8r0 {

    /* JADX INFO: renamed from: a */
    public final int f151583a;

    /* JADX INFO: renamed from: b */
    public final u511 f151584b;

    public n8r0(int i, u511 u511Var) {
        this.f151583a = i;
        this.f151584b = u511Var;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        return this.f151583a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8r0)) {
            return false;
        }
        n8r0 n8r0Var = (n8r0) obj;
        return this.f151583a == n8r0Var.f151583a && wj50.m88271j(this.f151584b, n8r0Var.f151584b);
    }

    public final int hashCode() {
        return this.f151584b.f226878a.hashCode() + (Integer.hashCode(this.f151583a) * 31);
    }
}
