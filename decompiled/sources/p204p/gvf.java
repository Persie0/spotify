package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gvf extends rvf {

    /* JADX INFO: renamed from: a */
    public final int f84742a;

    /* JADX INFO: renamed from: b */
    public final u79 f84743b;

    /* JADX INFO: renamed from: c */
    public final a89 f84744c;

    public gvf(int i, u79 u79Var, a89 a89Var) {
        this.f84742a = i;
        this.f84743b = u79Var;
        this.f84744c = a89Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvf)) {
            return false;
        }
        gvf gvfVar = (gvf) obj;
        return this.f84742a == gvfVar.f84742a && this.f84743b.equals(gvfVar.f84743b) && this.f84744c.equals(gvfVar.f84744c);
    }

    public final int hashCode() {
        return this.f84744c.hashCode() + ((this.f84743b.hashCode() + (edb.m38547C(this.f84742a) * 31)) * 31);
    }
}
