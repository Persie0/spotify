package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a8i {

    /* JADX INFO: renamed from: a */
    public final sj71 f13301a;

    public a8i(sj71 sj71Var) {
        this.f13301a = sj71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8i) && wj50.m88271j(this.f13301a, ((a8i) obj).f13301a);
    }

    public final int hashCode() {
        sj71 sj71Var = this.f13301a;
        if (sj71Var == null) {
            return 0;
        }
        return sj71Var.hashCode();
    }
}
