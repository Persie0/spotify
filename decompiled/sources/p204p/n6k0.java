package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class n6k0 implements h7k0 {

    /* JADX INFO: renamed from: a */
    public final String f150900a;

    /* JADX INFO: renamed from: b */
    public final String f150901b;

    /* JADX INFO: renamed from: c */
    public final String f150902c;

    /* JADX INFO: renamed from: d */
    public final String f150903d;

    /* JADX INFO: renamed from: e */
    public final List f150904e;

    /* JADX INFO: renamed from: f */
    public final List f150905f;

    public n6k0(String str, String str2, String str3, String str4, ae50 ae50Var, ae50 ae50Var2) {
        this.f150900a = str;
        this.f150901b = str2;
        this.f150902c = str3;
        this.f150903d = str4;
        this.f150904e = ae50Var;
        this.f150905f = ae50Var2;
    }

    @Override // p204p.h7k0
    /* JADX INFO: renamed from: a */
    public final List mo24867a() {
        return this.f150905f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6k0)) {
            return false;
        }
        n6k0 n6k0Var = (n6k0) obj;
        return wj50.m88271j(this.f150900a, n6k0Var.f150900a) && wj50.m88271j(this.f150901b, n6k0Var.f150901b) && wj50.m88271j(this.f150902c, n6k0Var.f150902c) && wj50.m88271j(this.f150903d, n6k0Var.f150903d) && wj50.m88271j(this.f150904e, n6k0Var.f150904e) && wj50.m88271j(this.f150905f, n6k0Var.f150905f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f150900a.hashCode() * 31, 31, this.f150901b);
        String str = this.f150902c;
        return this.f150905f.hashCode() + s571.m77244c(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f150903d), 31, this.f150904e);
    }
}
