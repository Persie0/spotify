package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ee71 implements ge71 {

    /* JADX INFO: renamed from: a */
    public final de71 f58702a;

    /* JADX INFO: renamed from: b */
    public final int f58703b;

    public ee71(de71 de71Var, int i) {
        this.f58702a = de71Var;
        this.f58703b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee71)) {
            return false;
        }
        ee71 ee71Var = (ee71) obj;
        return this.f58702a == ee71Var.f58702a && this.f58703b == ee71Var.f58703b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58703b) + (this.f58702a.hashCode() * 31);
    }
}
