package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q8r0 extends l8r0 {

    /* JADX INFO: renamed from: a */
    public final int f186368a;

    /* JADX INFO: renamed from: b */
    public final r511 f186369b;

    public q8r0(int i, r511 r511Var) {
        this.f186368a = i;
        this.f186369b = r511Var;
    }

    @Override // p204p.s8r0
    /* JADX INFO: renamed from: a */
    public final int mo55753a() {
        return this.f186368a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8r0)) {
            return false;
        }
        q8r0 q8r0Var = (q8r0) obj;
        return this.f186368a == q8r0Var.f186368a && this.f186369b.equals(q8r0Var.f186369b);
    }

    public final int hashCode() {
        return this.f186369b.hashCode() + (Integer.hashCode(this.f186368a) * 31);
    }
}
