package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xe60 {

    /* JADX INFO: renamed from: d */
    public static final xe60 f260648d = new xe60(new i641(ye60.m93527b(0.26d, 1.0d)), new i641(ye60.m93527b(0.219d, 0.4d)), new i641(ye60.m93527b(0.0d, 0.1d)));

    /* JADX INFO: renamed from: a */
    public final i641 f260649a;

    /* JADX INFO: renamed from: b */
    public final i641 f260650b;

    /* JADX INFO: renamed from: c */
    public final i641 f260651c;

    public xe60(i641 i641Var, i641 i641Var2, i641 i641Var3) {
        this.f260649a = i641Var;
        this.f260650b = i641Var2;
        this.f260651c = i641Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe60)) {
            return false;
        }
        xe60 xe60Var = (xe60) obj;
        return wj50.m88271j(this.f260649a, xe60Var.f260649a) && wj50.m88271j(this.f260650b, xe60Var.f260650b) && wj50.m88271j(this.f260651c, xe60Var.f260651c);
    }

    public final int hashCode() {
        return this.f260651c.hashCode() + ((this.f260650b.hashCode() + (this.f260649a.hashCode() * 31)) * 31);
    }
}
