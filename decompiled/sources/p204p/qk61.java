package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qk61 {

    /* JADX INFO: renamed from: a */
    public final pk61 f189477a;

    /* JADX INFO: renamed from: b */
    public final gxb f189478b;

    /* JADX INFO: renamed from: c */
    public final int f189479c;

    /* JADX INFO: renamed from: d */
    public final String f189480d;

    public qk61(pk61 pk61Var, gxb gxbVar, int i, String str) {
        this.f189477a = pk61Var;
        this.f189478b = gxbVar;
        this.f189479c = i;
        this.f189480d = str;
    }

    /* JADX INFO: renamed from: a */
    public static qk61 m73041a(qk61 qk61Var, gxb gxbVar, int i, String str, int i2) {
        pk61 pk61Var = qk61Var.f189477a;
        if ((i2 & 2) != 0) {
            gxbVar = qk61Var.f189478b;
        }
        if ((i2 & 8) != 0) {
            str = qk61Var.f189480d;
        }
        return new qk61(pk61Var, gxbVar, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk61)) {
            return false;
        }
        qk61 qk61Var = (qk61) obj;
        return wj50.m88271j(this.f189477a, qk61Var.f189477a) && wj50.m88271j(this.f189478b, qk61Var.f189478b) && this.f189479c == qk61Var.f189479c && wj50.m88271j(this.f189480d, qk61Var.f189480d);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f189479c, (this.f189478b.hashCode() + (this.f189477a.hashCode() * 31)) * 31, 31);
        String str = this.f189480d;
        return iM40938f + (str == null ? 0 : str.hashCode());
    }
}
