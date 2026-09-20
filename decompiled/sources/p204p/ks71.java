package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ks71 {

    /* JADX INFO: renamed from: a */
    public final int f125862a;

    /* JADX INFO: renamed from: b */
    public final Long f125863b;

    public ks71(int i, Long l) {
        this.f125862a = i;
        this.f125863b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks71)) {
            return false;
        }
        ks71 ks71Var = (ks71) obj;
        return this.f125862a == ks71Var.f125862a && wj50.m88271j(this.f125863b, ks71Var.f125863b);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f125862a) * 31;
        Long l = this.f125863b;
        return iM38547C + (l == null ? 0 : l.hashCode());
    }
}
