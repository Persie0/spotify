package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h060 {

    /* JADX INFO: renamed from: a */
    public final lx50 f86158a;

    /* JADX INFO: renamed from: b */
    public final aej0 f86159b;

    public h060(lx50 lx50Var, aej0 aej0Var) {
        this.f86158a = lx50Var;
        this.f86159b = aej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h060)) {
            return false;
        }
        h060 h060Var = (h060) obj;
        return wj50.m88271j(this.f86158a, h060Var.f86158a) && wj50.m88271j(this.f86159b, h060Var.f86159b);
    }

    public final int hashCode() {
        return this.f86159b.hashCode() + (this.f86158a.hashCode() * 31);
    }
}
