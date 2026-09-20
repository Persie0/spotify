package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gki implements sli {

    /* JADX INFO: renamed from: a */
    public final g86 f80809a;

    /* JADX INFO: renamed from: b */
    public final int f80810b;

    public gki(g86 g86Var, int i) {
        this.f80809a = g86Var;
        this.f80810b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gki)) {
            return false;
        }
        gki gkiVar = (gki) obj;
        return wj50.m88271j(this.f80809a, gkiVar.f80809a) && this.f80810b == gkiVar.f80810b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80810b) + (this.f80809a.hashCode() * 31);
    }
}
