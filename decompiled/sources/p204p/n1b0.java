package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n1b0 {

    /* JADX INFO: renamed from: a */
    public final sh7 f149387a;

    /* JADX INFO: renamed from: b */
    public final int f149388b;

    public n1b0(sh7 sh7Var, int i) {
        this.f149387a = sh7Var;
        this.f149388b = i;
    }

    /* JADX INFO: renamed from: a */
    public final sh7 m63479a() {
        return this.f149387a;
    }

    /* JADX INFO: renamed from: b */
    public final int m63480b() {
        return this.f149388b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1b0)) {
            return false;
        }
        n1b0 n1b0Var = (n1b0) obj;
        return this.f149387a == n1b0Var.f149387a && this.f149388b == n1b0Var.f149388b;
    }

    public final int hashCode() {
        int iHashCode = this.f149387a.hashCode() * 31;
        int i = this.f149388b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
