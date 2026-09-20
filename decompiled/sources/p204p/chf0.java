package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class chf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final f2z f38008a;

    /* JADX INFO: renamed from: b */
    public final int f38009b;

    public chf0(f2z f2zVar, int i) {
        this.f38008a = f2zVar;
        this.f38009b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chf0)) {
            return false;
        }
        chf0 chf0Var = (chf0) obj;
        return this.f38008a == chf0Var.f38008a && this.f38009b == chf0Var.f38009b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38009b) + (this.f38008a.hashCode() * 31);
    }
}
