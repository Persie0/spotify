package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j4k {

    /* JADX INFO: renamed from: a */
    public final f4k f108719a;

    /* JADX INFO: renamed from: b */
    public final v6k f108720b;

    /* JADX INFO: renamed from: c */
    public final eh00 f108721c;

    public j4k(f4k f4kVar, v6k v6kVar, eh00 eh00Var) {
        this.f108719a = f4kVar;
        this.f108720b = v6kVar;
        this.f108721c = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4k)) {
            return false;
        }
        j4k j4kVar = (j4k) obj;
        return wj50.m88271j(this.f108719a, j4kVar.f108719a) && wj50.m88271j(this.f108720b, j4kVar.f108720b) && wj50.m88271j(this.f108721c, j4kVar.f108721c);
    }

    public final int hashCode() {
        int iHashCode = this.f108719a.hashCode() * 31;
        v6k v6kVar = this.f108720b;
        return this.f108721c.hashCode() + ((iHashCode + (v6kVar == null ? 0 : v6kVar.hashCode())) * 31);
    }
}
