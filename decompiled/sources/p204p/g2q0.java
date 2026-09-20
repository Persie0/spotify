package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class g2q0 extends h2q0 {

    /* JADX INFO: renamed from: a */
    public final String f75989a;

    /* JADX INFO: renamed from: b */
    public final String f75990b;

    /* JADX INFO: renamed from: c */
    public final List f75991c;

    /* JADX INFO: renamed from: d */
    public final z650 f75992d;

    /* JADX INFO: renamed from: e */
    public final fqo0 f75993e;

    public g2q0(String str, String str2, List list, z650 z650Var, fqo0 fqo0Var) {
        this.f75989a = str;
        this.f75990b = str2;
        this.f75991c = list;
        this.f75992d = z650Var;
        this.f75993e = fqo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2q0)) {
            return false;
        }
        g2q0 g2q0Var = (g2q0) obj;
        return wj50.m88271j(this.f75989a, g2q0Var.f75989a) && wj50.m88271j(this.f75990b, g2q0Var.f75990b) && wj50.m88271j(this.f75991c, g2q0Var.f75991c) && wj50.m88271j(this.f75992d, g2q0Var.f75992d) && wj50.m88271j(this.f75993e, g2q0Var.f75993e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f75989a.hashCode() * 31, 31, this.f75990b), 31, this.f75991c);
        z650 z650Var = this.f75992d;
        return this.f75993e.hashCode() + ((iM77244c + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31);
    }
}
