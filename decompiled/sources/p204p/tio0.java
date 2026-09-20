package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tio0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220714a;

    /* JADX INFO: renamed from: b */
    public final boolean f220715b;

    /* JADX INFO: renamed from: c */
    public final sio0 f220716c;

    /* JADX INFO: renamed from: d */
    public final oio0 f220717d;

    /* JADX INFO: renamed from: e */
    public final rio0 f220718e;

    public tio0(boolean z, boolean z2, sio0 sio0Var, oio0 oio0Var, rio0 rio0Var) {
        this.f220714a = z;
        this.f220715b = z2;
        this.f220716c = sio0Var;
        this.f220717d = oio0Var;
        this.f220718e = rio0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tio0)) {
            return false;
        }
        tio0 tio0Var = (tio0) obj;
        return this.f220714a == tio0Var.f220714a && this.f220715b == tio0Var.f220715b && this.f220716c == tio0Var.f220716c && wj50.m88271j(this.f220717d, tio0Var.f220717d) && wj50.m88271j(this.f220718e, tio0Var.f220718e);
    }

    public final int hashCode() {
        return this.f220718e.hashCode() + ((this.f220717d.hashCode() + ((this.f220716c.hashCode() + s571.m77245d(Boolean.hashCode(this.f220714a) * 31, 31, this.f220715b)) * 31)) * 31);
    }
}
