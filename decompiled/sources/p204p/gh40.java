package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gh40 implements ih40 {

    /* JADX INFO: renamed from: a */
    public final String f79797a;

    /* JADX INFO: renamed from: b */
    public final String f79798b;

    /* JADX INFO: renamed from: c */
    public final String f79799c;

    /* JADX INFO: renamed from: d */
    public final boolean f79800d;

    /* JADX INFO: renamed from: e */
    public final qp51 f79801e;

    public gh40(String str, String str2, String str3, boolean z, qp51 qp51Var) {
        this.f79797a = str;
        this.f79798b = str2;
        this.f79799c = str3;
        this.f79800d = z;
        this.f79801e = qp51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh40)) {
            return false;
        }
        gh40 gh40Var = (gh40) obj;
        return wj50.m88271j(this.f79797a, gh40Var.f79797a) && wj50.m88271j(this.f79798b, gh40Var.f79798b) && wj50.m88271j(this.f79799c, gh40Var.f79799c) && this.f79800d == gh40Var.f79800d && wj50.m88271j(this.f79801e, gh40Var.f79801e);
    }

    public final int hashCode() {
        return this.f79801e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f79797a.hashCode() * 31, 31, this.f79798b), 31, this.f79799c), 31, this.f79800d);
    }
}
