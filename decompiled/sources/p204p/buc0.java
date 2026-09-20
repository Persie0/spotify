package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class buc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final long f31080a;

    /* JADX INFO: renamed from: b */
    public final r37 f31081b;

    /* JADX INFO: renamed from: c */
    public final String f31082c;

    public buc0(long j, r37 r37Var, String str) {
        this.f31080a = j;
        this.f31081b = r37Var;
        this.f31082c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buc0)) {
            return false;
        }
        buc0 buc0Var = (buc0) obj;
        return this.f31080a == buc0Var.f31080a && wj50.m88271j(this.f31081b, buc0Var.f31081b) && wj50.m88271j(this.f31082c, buc0Var.f31082c);
    }

    public final int hashCode() {
        return this.f31082c.hashCode() + ((this.f31081b.hashCode() + (Long.hashCode(this.f31080a) * 31)) * 31);
    }
}
