package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gna1 {

    /* JADX INFO: renamed from: a */
    public final int f82666a;

    /* JADX INFO: renamed from: b */
    public final Object f82667b;

    public gna1(int i, Object obj) {
        this.f82666a = i;
        this.f82667b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gna1)) {
            return false;
        }
        gna1 gna1Var = (gna1) obj;
        return this.f82666a == gna1Var.f82666a && wj50.m88271j(this.f82667b, gna1Var.f82667b);
    }

    public final int hashCode() {
        return this.f82667b.hashCode() + (Integer.hashCode(this.f82666a) * 31);
    }
}
