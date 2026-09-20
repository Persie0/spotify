package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class f71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f66529a;

    /* JADX INFO: renamed from: b */
    public final List f66530b;

    /* JADX INFO: renamed from: c */
    public final ss8 f66531c;

    /* JADX INFO: renamed from: d */
    public final ss8 f66532d;

    /* JADX INFO: renamed from: e */
    public final boolean f66533e;

    public f71(String str, List list, ss8 ss8Var, ss8 ss8Var2, boolean z) {
        this.f66529a = str;
        this.f66530b = list;
        this.f66531c = ss8Var;
        this.f66532d = ss8Var2;
        this.f66533e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f71)) {
            return false;
        }
        f71 f71Var = (f71) obj;
        return wj50.m88271j(this.f66529a, f71Var.f66529a) && wj50.m88271j(this.f66530b, f71Var.f66530b) && this.f66531c == f71Var.f66531c && this.f66532d == f71Var.f66532d && this.f66533e == f71Var.f66533e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66533e) + ((this.f66532d.hashCode() + ((this.f66531c.hashCode() + s571.m77244c(this.f66529a.hashCode() * 31, 31, this.f66530b)) * 31)) * 31);
    }
}
