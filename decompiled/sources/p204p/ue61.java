package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ue61 implements fn41 {

    /* JADX INFO: renamed from: a */
    public final me61 f229439a;

    /* JADX INFO: renamed from: b */
    public final te61 f229440b;

    public ue61(me61 me61Var, te61 te61Var) {
        this.f229439a = me61Var;
        this.f229440b = te61Var;
    }

    @Override // p204p.fn41
    /* JADX INFO: renamed from: a */
    public final en41 mo41039a() {
        return this.f229439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue61)) {
            return false;
        }
        ue61 ue61Var = (ue61) obj;
        return wj50.m88271j(this.f229439a, ue61Var.f229439a) && wj50.m88271j(this.f229440b, ue61Var.f229440b);
    }

    public final int hashCode() {
        return this.f229440b.hashCode() + (this.f229439a.hashCode() * 31);
    }
}
