package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gfu0 implements hfu0 {

    /* JADX INFO: renamed from: a */
    public final String f79472a;

    /* JADX INFO: renamed from: b */
    public final dfu0 f79473b;

    /* JADX INFO: renamed from: c */
    public final boolean f79474c;

    /* JADX INFO: renamed from: d */
    public final String f79475d;

    /* JADX INFO: renamed from: e */
    public final weu0 f79476e;

    public gfu0(String str, dfu0 dfu0Var, boolean z, String str2, weu0 weu0Var) {
        this.f79472a = str;
        this.f79473b = dfu0Var;
        this.f79474c = z;
        this.f79475d = str2;
        this.f79476e = weu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfu0)) {
            return false;
        }
        gfu0 gfu0Var = (gfu0) obj;
        return wj50.m88271j(this.f79472a, gfu0Var.f79472a) && wj50.m88271j(this.f79473b, gfu0Var.f79473b) && this.f79474c == gfu0Var.f79474c && wj50.m88271j(this.f79475d, gfu0Var.f79475d) && wj50.m88271j(this.f79476e, gfu0Var.f79476e);
    }

    public final int hashCode() {
        return this.f79476e.hashCode() + s571.m77243b(s571.m77245d((this.f79473b.hashCode() + (this.f79472a.hashCode() * 31)) * 31, 31, this.f79474c), 31, this.f79475d);
    }
}
