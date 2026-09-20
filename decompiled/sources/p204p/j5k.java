package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j5k {

    /* JADX INFO: renamed from: a */
    public final f5k f108990a;

    /* JADX INFO: renamed from: b */
    public final e5k f108991b;

    /* JADX INFO: renamed from: c */
    public final flw0 f108992c;

    /* JADX INFO: renamed from: d */
    public final eh00 f108993d;

    public j5k(f5k f5kVar, e5k e5kVar, flw0 flw0Var, eh00 eh00Var) {
        this.f108990a = f5kVar;
        this.f108991b = e5kVar;
        this.f108992c = flw0Var;
        this.f108993d = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5k)) {
            return false;
        }
        j5k j5kVar = (j5k) obj;
        return wj50.m88271j(this.f108990a, j5kVar.f108990a) && wj50.m88271j(this.f108991b, j5kVar.f108991b) && wj50.m88271j(this.f108992c, j5kVar.f108992c) && wj50.m88271j(this.f108993d, j5kVar.f108993d);
    }

    public final int hashCode() {
        int iHashCode = (this.f108991b.hashCode() + (this.f108990a.hashCode() * 31)) * 31;
        flw0 flw0Var = this.f108992c;
        return this.f108993d.hashCode() + ((iHashCode + (flw0Var == null ? 0 : flw0Var.hashCode())) * 31);
    }
}
