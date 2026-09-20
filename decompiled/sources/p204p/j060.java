package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j060 implements k060 {

    /* JADX INFO: renamed from: a */
    public final aej0 f107359a;

    /* JADX INFO: renamed from: b */
    public final boolean f107360b;

    /* JADX INFO: renamed from: c */
    public final String f107361c;

    /* JADX INFO: renamed from: d */
    public final jx50 f107362d;

    public j060(aej0 aej0Var, boolean z, String str, jx50 jx50Var) {
        this.f107359a = aej0Var;
        this.f107360b = z;
        this.f107361c = str;
        this.f107362d = jx50Var;
    }

    @Override // p204p.k060
    /* JADX INFO: renamed from: a */
    public final jx50 mo49298a() {
        return this.f107362d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j060)) {
            return false;
        }
        j060 j060Var = (j060) obj;
        return wj50.m88271j(this.f107359a, j060Var.f107359a) && this.f107360b == j060Var.f107360b && wj50.m88271j(this.f107361c, j060Var.f107361c) && this.f107362d == j060Var.f107362d;
    }

    public final int hashCode() {
        return this.f107362d.hashCode() + s571.m77243b(s571.m77245d(this.f107359a.hashCode() * 31, 31, this.f107360b), 31, this.f107361c);
    }
}
