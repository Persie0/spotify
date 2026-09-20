package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j6c0 extends fpg1 {

    /* JADX INFO: renamed from: c */
    public final String f109276c;

    /* JADX INFO: renamed from: d */
    public final z5c0 f109277d;

    /* JADX INFO: renamed from: e */
    public final boolean f109278e;

    public j6c0(String str, z5c0 z5c0Var, boolean z) {
        this.f109276c = str;
        this.f109277d = z5c0Var;
        this.f109278e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6c0)) {
            return false;
        }
        j6c0 j6c0Var = (j6c0) obj;
        return wj50.m88271j(this.f109276c, j6c0Var.f109276c) && this.f109277d == j6c0Var.f109277d && this.f109278e == j6c0Var.f109278e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109278e) + ((this.f109277d.hashCode() + (this.f109276c.hashCode() * 31)) * 31);
    }
}
