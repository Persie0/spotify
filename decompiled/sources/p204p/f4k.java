package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f4k {

    /* JADX INFO: renamed from: a */
    public final String f65794a;

    /* JADX INFO: renamed from: b */
    public final z2h1 f65795b;

    /* JADX INFO: renamed from: c */
    public final String f65796c;

    public f4k(String str, z2h1 z2h1Var, String str2) {
        this.f65794a = str;
        this.f65795b = z2h1Var;
        this.f65796c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4k)) {
            return false;
        }
        f4k f4kVar = (f4k) obj;
        return wj50.m88271j(this.f65794a, f4kVar.f65794a) && wj50.m88271j(this.f65795b, f4kVar.f65795b) && wj50.m88271j(this.f65796c, f4kVar.f65796c);
    }

    public final int hashCode() {
        int iHashCode = this.f65794a.hashCode() * 31;
        z2h1 z2h1Var = this.f65795b;
        int iHashCode2 = (iHashCode + (z2h1Var == null ? 0 : z2h1Var.hashCode())) * 31;
        String str = this.f65796c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ f4k(String str, z2h1 z2h1Var, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : z2h1Var, (i & 4) != 0 ? null : str2);
    }
}
