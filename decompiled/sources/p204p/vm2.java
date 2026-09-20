package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vm2 {

    /* JADX INFO: renamed from: a */
    public final List f242678a;

    /* JADX INFO: renamed from: b */
    public final String f242679b;

    /* JADX INFO: renamed from: c */
    public final String f242680c;

    /* JADX INFO: renamed from: d */
    public final String f242681d;

    public vm2(String str, String str2, String str3, ae50 ae50Var) {
        this.f242678a = ae50Var;
        this.f242679b = str;
        this.f242680c = str2;
        this.f242681d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm2)) {
            return false;
        }
        vm2 vm2Var = (vm2) obj;
        return wj50.m88271j(this.f242678a, vm2Var.f242678a) && wj50.m88271j(this.f242679b, vm2Var.f242679b) && wj50.m88271j(this.f242680c, vm2Var.f242680c) && wj50.m88271j(this.f242681d, vm2Var.f242681d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f242678a.hashCode() * 31, 31, this.f242679b), 31, this.f242680c);
        String str = this.f242681d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
