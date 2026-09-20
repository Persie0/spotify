package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ceu0 {

    /* JADX INFO: renamed from: a */
    public final String f37178a;

    /* JADX INFO: renamed from: b */
    public final int f37179b;

    /* JADX INFO: renamed from: c */
    public final List f37180c;

    public ceu0(int i, String str, ae50 ae50Var) {
        this.f37178a = str;
        this.f37179b = i;
        this.f37180c = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceu0)) {
            return false;
        }
        ceu0 ceu0Var = (ceu0) obj;
        return wj50.m88271j(this.f37178a, ceu0Var.f37178a) && this.f37179b == ceu0Var.f37179b && wj50.m88271j(this.f37180c, ceu0Var.f37180c);
    }

    public final int hashCode() {
        return this.f37180c.hashCode() + mt60.m62800g(this.f37179b, this.f37178a.hashCode() * 31, 31);
    }
}
