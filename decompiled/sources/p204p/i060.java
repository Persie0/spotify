package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i060 implements k060 {

    /* JADX INFO: renamed from: a */
    public final String f97143a;

    /* JADX INFO: renamed from: b */
    public final jx50 f97144b;

    public i060(String str, jx50 jx50Var) {
        this.f97143a = str;
        this.f97144b = jx50Var;
    }

    @Override // p204p.k060
    /* JADX INFO: renamed from: a */
    public final jx50 mo49298a() {
        return this.f97144b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i060)) {
            return false;
        }
        i060 i060Var = (i060) obj;
        return wj50.m88271j(this.f97143a, i060Var.f97143a) && this.f97144b == i060Var.f97144b;
    }

    public final int hashCode() {
        return this.f97144b.hashCode() + (this.f97143a.hashCode() * 31);
    }
}
