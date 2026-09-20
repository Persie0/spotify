package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ec51 {

    /* JADX INFO: renamed from: a */
    public final int f58228a;

    /* JADX INFO: renamed from: b */
    public final kyf1 f58229b;

    /* JADX INFO: renamed from: c */
    public final String f58230c;

    /* JADX INFO: renamed from: d */
    public final dj01 f58231d;

    /* JADX INFO: renamed from: e */
    public final boolean f58232e;

    /* JADX INFO: renamed from: f */
    public final String f58233f;

    /* JADX INFO: renamed from: g */
    public final boolean f58234g;

    public ec51(int i, kyf1 kyf1Var, String str, dj01 dj01Var, boolean z, String str2, boolean z2) {
        this.f58228a = i;
        this.f58229b = kyf1Var;
        this.f58230c = str;
        this.f58231d = dj01Var;
        this.f58232e = z;
        this.f58233f = str2;
        this.f58234g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec51)) {
            return false;
        }
        ec51 ec51Var = (ec51) obj;
        return this.f58228a == ec51Var.f58228a && wj50.m88271j(this.f58229b, ec51Var.f58229b) && wj50.m88271j(this.f58230c, ec51Var.f58230c) && wj50.m88271j(this.f58231d, ec51Var.f58231d) && this.f58232e == ec51Var.f58232e && wj50.m88271j(this.f58233f, ec51Var.f58233f) && this.f58234g == ec51Var.f58234g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58234g) + s571.m77243b(s571.m77245d((this.f58231d.hashCode() + s571.m77243b((this.f58229b.hashCode() + (Integer.hashCode(this.f58228a) * 31)) * 31, 31, this.f58230c)) * 31, 31, this.f58232e), 31, this.f58233f);
    }
}
