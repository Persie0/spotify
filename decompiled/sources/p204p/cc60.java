package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cc60 {

    /* JADX INFO: renamed from: a */
    public final by50 f36329a;

    /* JADX INFO: renamed from: b */
    public final lx50 f36330b;

    public cc60(by50 by50Var, lx50 lx50Var) {
        this.f36329a = by50Var;
        this.f36330b = lx50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc60)) {
            return false;
        }
        cc60 cc60Var = (cc60) obj;
        return wj50.m88271j(this.f36329a, cc60Var.f36329a) && wj50.m88271j(this.f36330b, cc60Var.f36330b);
    }

    public final int hashCode() {
        return this.f36330b.hashCode() + (this.f36329a.hashCode() * 31);
    }
}
