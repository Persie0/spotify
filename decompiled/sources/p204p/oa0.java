package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oa0 extends ta0 implements ra0 {

    /* JADX INFO: renamed from: a */
    public final hp20 f163171a;

    /* JADX INFO: renamed from: b */
    public final boolean f163172b;

    public oa0(hp20 hp20Var, boolean z) {
        this.f163171a = hp20Var;
        this.f163172b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return wj50.m88271j(this.f163171a, oa0Var.f163171a) && this.f163172b == oa0Var.f163172b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163172b) + (this.f163171a.hashCode() * 31);
    }
}
