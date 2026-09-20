package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class c91 {

    /* JADX INFO: renamed from: a */
    public final String f35362a;

    /* JADX INFO: renamed from: b */
    public final String f35363b;

    /* JADX INFO: renamed from: c */
    public final uqr0 f35364c;

    /* JADX INFO: renamed from: d */
    public final String f35365d;

    /* JADX INFO: renamed from: e */
    public final List f35366e;

    /* JADX INFO: renamed from: f */
    public final String f35367f;

    /* JADX INFO: renamed from: g */
    public final List f35368g;

    public c91(String str, String str2, uqr0 uqr0Var, String str3, ae50 ae50Var, String str4, ae50 ae50Var2) {
        this.f35362a = str;
        this.f35363b = str2;
        this.f35364c = uqr0Var;
        this.f35365d = str3;
        this.f35366e = ae50Var;
        this.f35367f = str4;
        this.f35368g = ae50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return wj50.m88271j(this.f35362a, c91Var.f35362a) && wj50.m88271j(this.f35363b, c91Var.f35363b) && wj50.m88271j(this.f35364c, c91Var.f35364c) && wj50.m88271j(this.f35365d, c91Var.f35365d) && wj50.m88271j(this.f35366e, c91Var.f35366e) && wj50.m88271j(this.f35367f, c91Var.f35367f) && wj50.m88271j(this.f35368g, c91Var.f35368g);
    }

    public final int hashCode() {
        return this.f35368g.hashCode() + s571.m77243b(s571.m77244c(s571.m77243b((this.f35364c.hashCode() + s571.m77243b(this.f35362a.hashCode() * 31, 31, this.f35363b)) * 31, 31, this.f35365d), 31, this.f35366e), 31, this.f35367f);
    }
}
