package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b4k0 {

    /* JADX INFO: renamed from: a */
    public final pj31 f23378a;

    /* JADX INFO: renamed from: b */
    public final w90 f23379b;

    /* JADX INFO: renamed from: c */
    public final h3k0 f23380c;

    /* JADX INFO: renamed from: d */
    public final boolean f23381d;

    /* JADX INFO: renamed from: e */
    public final nx50 f23382e;

    /* JADX INFO: renamed from: f */
    public final boolean f23383f;

    public b4k0(pj31 pj31Var, w90 w90Var, h3k0 h3k0Var, boolean z, nx50 nx50Var, boolean z2) {
        this.f23378a = pj31Var;
        this.f23379b = w90Var;
        this.f23380c = h3k0Var;
        this.f23381d = z;
        this.f23382e = nx50Var;
        this.f23383f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static b4k0 m28098a(b4k0 b4k0Var, pj31 pj31Var, w90 w90Var, h3k0 h3k0Var, boolean z, nx50 nx50Var, int i) {
        if ((i & 1) != 0) {
            pj31Var = b4k0Var.f23378a;
        }
        pj31 pj31Var2 = pj31Var;
        if ((i & 2) != 0) {
            w90Var = b4k0Var.f23379b;
        }
        w90 w90Var2 = w90Var;
        if ((i & 4) != 0) {
            h3k0Var = b4k0Var.f23380c;
        }
        h3k0 h3k0Var2 = h3k0Var;
        if ((i & 8) != 0) {
            z = b4k0Var.f23381d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            nx50Var = b4k0Var.f23382e;
        }
        boolean z3 = b4k0Var.f23383f;
        b4k0Var.getClass();
        return new b4k0(pj31Var2, w90Var2, h3k0Var2, z2, nx50Var, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4k0)) {
            return false;
        }
        b4k0 b4k0Var = (b4k0) obj;
        return wj50.m88271j(this.f23378a, b4k0Var.f23378a) && wj50.m88271j(this.f23379b, b4k0Var.f23379b) && wj50.m88271j(this.f23380c, b4k0Var.f23380c) && this.f23381d == b4k0Var.f23381d && wj50.m88271j(this.f23382e, b4k0Var.f23382e) && this.f23383f == b4k0Var.f23383f;
    }

    public final int hashCode() {
        int iHashCode = this.f23378a.hashCode() * 31;
        w90 w90Var = this.f23379b;
        int iHashCode2 = (iHashCode + (w90Var == null ? 0 : w90Var.hashCode())) * 31;
        h3k0 h3k0Var = this.f23380c;
        return Boolean.hashCode(this.f23383f) + ((this.f23382e.hashCode() + s571.m77245d((iHashCode2 + (h3k0Var != null ? h3k0Var.hashCode() : 0)) * 31, 31, this.f23381d)) * 31);
    }
}
