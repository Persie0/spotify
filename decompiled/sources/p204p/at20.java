package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class at20 implements bt20 {

    /* JADX INFO: renamed from: a */
    public final String f19564a;

    /* JADX INFO: renamed from: b */
    public final pt20 f19565b;

    /* JADX INFO: renamed from: c */
    public final pt20 f19566c;

    /* JADX INFO: renamed from: d */
    public final pt20 f19567d;

    public at20(String str, pt20 pt20Var, pt20 pt20Var2, pt20 pt20Var3) {
        this.f19564a = str;
        this.f19565b = pt20Var;
        this.f19566c = pt20Var2;
        this.f19567d = pt20Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at20)) {
            return false;
        }
        at20 at20Var = (at20) obj;
        return wj50.m88271j(this.f19564a, at20Var.f19564a) && wj50.m88271j(this.f19565b, at20Var.f19565b) && wj50.m88271j(this.f19566c, at20Var.f19566c) && wj50.m88271j(this.f19567d, at20Var.f19567d);
    }

    public final int hashCode() {
        return this.f19567d.hashCode() + ((this.f19566c.hashCode() + ((this.f19565b.hashCode() + (this.f19564a.hashCode() * 31)) * 31)) * 31);
    }
}
