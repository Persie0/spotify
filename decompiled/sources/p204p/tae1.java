package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tae1 {

    /* JADX INFO: renamed from: a */
    public final z3e1 f218567a;

    /* JADX INFO: renamed from: b */
    public final List f218568b;

    /* JADX INFO: renamed from: c */
    public final String f218569c;

    public tae1(z3e1 z3e1Var, ro80 ro80Var, String str) {
        this.f218567a = z3e1Var;
        this.f218568b = ro80Var;
        this.f218569c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tae1)) {
            return false;
        }
        tae1 tae1Var = (tae1) obj;
        return wj50.m88271j(this.f218567a, tae1Var.f218567a) && wj50.m88271j(this.f218568b, tae1Var.f218568b) && wj50.m88271j(this.f218569c, tae1Var.f218569c);
    }

    public final int hashCode() {
        z3e1 z3e1Var = this.f218567a;
        int iM77244c = s571.m77244c((z3e1Var == null ? 0 : z3e1Var.hashCode()) * 31, 31, this.f218568b);
        String str = this.f218569c;
        return iM77244c + (str != null ? str.hashCode() : 0);
    }
}
