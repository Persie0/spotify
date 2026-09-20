package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zfd0 {

    /* JADX INFO: renamed from: a */
    public final sfd0 f282284a;

    /* JADX INFO: renamed from: b */
    public final jga1 f282285b;

    /* JADX INFO: renamed from: c */
    public final boolean f282286c;

    public zfd0(sfd0 sfd0Var, jga1 jga1Var, boolean z) {
        this.f282284a = sfd0Var;
        this.f282285b = jga1Var;
        this.f282286c = z;
    }

    /* JADX INFO: renamed from: a */
    public static zfd0 m96006a(zfd0 zfd0Var, jga1 jga1Var, boolean z, int i) {
        sfd0 sfd0Var = zfd0Var.f282284a;
        if ((i & 2) != 0) {
            jga1Var = zfd0Var.f282285b;
        }
        if ((i & 4) != 0) {
            z = zfd0Var.f282286c;
        }
        zfd0Var.getClass();
        return new zfd0(sfd0Var, jga1Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfd0)) {
            return false;
        }
        zfd0 zfd0Var = (zfd0) obj;
        return wj50.m88271j(this.f282284a, zfd0Var.f282284a) && wj50.m88271j(this.f282285b, zfd0Var.f282285b) && this.f282286c == zfd0Var.f282286c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282286c) + ((this.f282285b.hashCode() + (this.f282284a.hashCode() * 31)) * 31);
    }
}
