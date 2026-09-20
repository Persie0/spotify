package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p8r0 extends l8r0 {

    /* JADX INFO: renamed from: a */
    public final int f175022a;

    /* JADX INFO: renamed from: b */
    public final u511 f175023b;

    public p8r0(int i, u511 u511Var) {
        this.f175022a = i;
        this.f175023b = u511Var;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        return this.f175022a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8r0)) {
            return false;
        }
        p8r0 p8r0Var = (p8r0) obj;
        return this.f175022a == p8r0Var.f175022a && wj50.m88271j(this.f175023b, p8r0Var.f175023b);
    }

    public final int hashCode() {
        return this.f175023b.f226878a.hashCode() + (Integer.hashCode(this.f175022a) * 31);
    }
}
