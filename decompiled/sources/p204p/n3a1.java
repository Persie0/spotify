package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n3a1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f149986a;

    /* JADX INFO: renamed from: b */
    public final List f149987b;

    /* JADX INFO: renamed from: c */
    public final List f149988c;

    public n3a1(ae50 ae50Var, ae50 ae50Var2, ae50 ae50Var3) {
        this.f149986a = ae50Var;
        this.f149987b = ae50Var2;
        this.f149988c = ae50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3a1)) {
            return false;
        }
        n3a1 n3a1Var = (n3a1) obj;
        return wj50.m88271j(this.f149986a, n3a1Var.f149986a) && wj50.m88271j(this.f149987b, n3a1Var.f149987b) && wj50.m88271j(this.f149988c, n3a1Var.f149988c);
    }

    public final int hashCode() {
        return this.f149988c.hashCode() + s571.m77244c(this.f149986a.hashCode() * 31, 31, this.f149987b);
    }
}
