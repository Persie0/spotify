package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class nio0 {

    /* JADX INFO: renamed from: a */
    public final f4m0 f154290a;

    /* JADX INFO: renamed from: b */
    public final String f154291b;

    /* JADX INFO: renamed from: c */
    public final String f154292c;

    /* JADX INFO: renamed from: d */
    public final List f154293d;

    /* JADX INFO: renamed from: e */
    public final i8b0 f154294e;

    public nio0(f4m0 f4m0Var, String str, String str2, List list, i8b0 i8b0Var) {
        this.f154290a = f4m0Var;
        this.f154291b = str;
        this.f154292c = str2;
        this.f154293d = list;
        this.f154294e = i8b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nio0)) {
            return false;
        }
        nio0 nio0Var = (nio0) obj;
        return wj50.m88271j(this.f154290a, nio0Var.f154290a) && wj50.m88271j(this.f154291b, nio0Var.f154291b) && wj50.m88271j(this.f154292c, nio0Var.f154292c) && wj50.m88271j(this.f154293d, nio0Var.f154293d) && wj50.m88271j(this.f154294e, nio0Var.f154294e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f154290a.hashCode() * 31, 31, this.f154291b);
        String str = this.f154292c;
        int iM77244c = s571.m77244c((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154293d);
        i8b0 i8b0Var = this.f154294e;
        return iM77244c + (i8b0Var != null ? i8b0Var.hashCode() : 0);
    }
}
