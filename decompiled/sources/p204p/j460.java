package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j460 implements l460 {

    /* JADX INFO: renamed from: a */
    public final hx50 f108609a;

    /* JADX INFO: renamed from: b */
    public final int f108610b;

    public j460(hx50 hx50Var, int i) {
        this.f108609a = hx50Var;
        this.f108610b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j460)) {
            return false;
        }
        j460 j460Var = (j460) obj;
        return wj50.m88271j(this.f108609a, j460Var.f108609a) && this.f108610b == j460Var.f108610b;
    }

    public final int hashCode() {
        hx50 hx50Var = this.f108609a;
        int iHashCode = (hx50Var == null ? 0 : hx50Var.hashCode()) * 31;
        int i = this.f108610b;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
