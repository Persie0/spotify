package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fxb {

    /* JADX INFO: renamed from: a */
    public final h8b f74314a;

    /* JADX INFO: renamed from: b */
    public final h8b f74315b;

    /* JADX INFO: renamed from: c */
    public final c7b f74316c;

    /* JADX INFO: renamed from: d */
    public final g70 f74317d;

    /* JADX INFO: renamed from: e */
    public final boolean f74318e;

    /* JADX INFO: renamed from: f */
    public final iw81 f74319f;

    /* JADX INFO: renamed from: g */
    public final Float f74320g;

    public fxb(h8b h8bVar, h8b h8bVar2, c7b c7bVar, g70 g70Var, iw81 iw81Var, Float f, int i) {
        h8bVar = (i & 1) != 0 ? null : h8bVar;
        h8bVar2 = (i & 2) != 0 ? null : h8bVar2;
        g70Var = (i & 8) != 0 ? f70.f66526a : g70Var;
        boolean z = (i & 16) != 0;
        iw81Var = (i & 32) != 0 ? null : iw81Var;
        f = (i & 64) != 0 ? null : f;
        this.f74314a = h8bVar;
        this.f74315b = h8bVar2;
        this.f74316c = c7bVar;
        this.f74317d = g70Var;
        this.f74318e = z;
        this.f74319f = iw81Var;
        this.f74320g = f;
    }

    /* JADX INFO: renamed from: a */
    public final g70 m42997a() {
        return this.f74317d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        return wj50.m88271j(this.f74314a, fxbVar.f74314a) && wj50.m88271j(this.f74315b, fxbVar.f74315b) && wj50.m88271j(this.f74316c, fxbVar.f74316c) && wj50.m88271j(this.f74317d, fxbVar.f74317d) && this.f74318e == fxbVar.f74318e && wj50.m88271j(this.f74319f, fxbVar.f74319f) && wj50.m88271j(this.f74320g, fxbVar.f74320g);
    }

    public final int hashCode() {
        h8b h8bVar = this.f74314a;
        int iHashCode = (h8bVar == null ? 0 : h8bVar.hashCode()) * 31;
        h8b h8bVar2 = this.f74315b;
        int iM77245d = s571.m77245d((this.f74317d.hashCode() + ((this.f74316c.hashCode() + ((iHashCode + (h8bVar2 == null ? 0 : h8bVar2.hashCode())) * 31)) * 31)) * 31, 31, this.f74318e);
        iw81 iw81Var = this.f74319f;
        int iHashCode2 = (iM77245d + (iw81Var == null ? 0 : iw81Var.hashCode())) * 31;
        Float f = this.f74320g;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }
}
