package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ss3 implements l630 {

    /* JADX INFO: renamed from: a */
    public final vs3 f213472a;

    /* JADX INFO: renamed from: b */
    public final String f213473b;

    /* JADX INFO: renamed from: c */
    public final b250 f213474c;

    public ss3(vs3 vs3Var, String str, b250 b250Var) {
        this.f213472a = vs3Var;
        this.f213473b = str;
        this.f213474c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss3)) {
            return false;
        }
        ss3 ss3Var = (ss3) obj;
        return wj50.m88271j(this.f213472a, ss3Var.f213472a) && wj50.m88271j(this.f213473b, ss3Var.f213473b) && wj50.m88271j(this.f213474c, ss3Var.f213474c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f213473b;
    }

    public final int hashCode() {
        return this.f213474c.hashCode() + s571.m77243b(this.f213472a.hashCode() * 31, 31, this.f213473b);
    }
}
