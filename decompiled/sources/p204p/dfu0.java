package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dfu0 {

    /* JADX INFO: renamed from: a */
    public final bfu0 f48650a;

    /* JADX INFO: renamed from: b */
    public final bfu0 f48651b;

    /* JADX INFO: renamed from: c */
    public final String f48652c;

    /* JADX INFO: renamed from: d */
    public final boolean f48653d;

    public dfu0(bfu0 bfu0Var, bfu0 bfu0Var2, String str, boolean z) {
        this.f48650a = bfu0Var;
        this.f48651b = bfu0Var2;
        this.f48652c = str;
        this.f48653d = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m35909a() {
        return wj50.m88271j(this.f48650a.f26785a, this.f48652c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfu0)) {
            return false;
        }
        dfu0 dfu0Var = (dfu0) obj;
        return wj50.m88271j(this.f48650a, dfu0Var.f48650a) && wj50.m88271j(this.f48651b, dfu0Var.f48651b) && wj50.m88271j(this.f48652c, dfu0Var.f48652c) && this.f48653d == dfu0Var.f48653d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48653d) + s571.m77243b((this.f48651b.hashCode() + (this.f48650a.hashCode() * 31)) * 31, 31, this.f48652c);
    }
}
