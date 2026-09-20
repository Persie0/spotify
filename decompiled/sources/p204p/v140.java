package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v140 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f236243a;

    /* JADX INFO: renamed from: b */
    public final String f236244b;

    /* JADX INFO: renamed from: c */
    public final String f236245c;

    /* JADX INFO: renamed from: d */
    public final List f236246d;

    /* JADX INFO: renamed from: e */
    public final u140 f236247e;

    public v140(String str, String str2, String str3, List list, u140 u140Var) {
        this.f236243a = str;
        this.f236244b = str2;
        this.f236245c = str3;
        this.f236246d = list;
        this.f236247e = u140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v140)) {
            return false;
        }
        v140 v140Var = (v140) obj;
        return wj50.m88271j(this.f236243a, v140Var.f236243a) && wj50.m88271j(this.f236244b, v140Var.f236244b) && wj50.m88271j(this.f236245c, v140Var.f236245c) && wj50.m88271j(this.f236246d, v140Var.f236246d) && wj50.m88271j(this.f236247e, v140Var.f236247e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f236243a.hashCode() * 31, 31, this.f236244b), 31, this.f236245c), 31, this.f236246d);
        u140 u140Var = this.f236247e;
        return iM77244c + (u140Var == null ? 0 : u140Var.hashCode());
    }

    public /* synthetic */ v140(String str, String str2, String str3, List list, u140 u140Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? lau.f131415a : list, (i & 16) != 0 ? null : u140Var);
    }
}
