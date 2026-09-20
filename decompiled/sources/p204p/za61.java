package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class za61 {

    /* JADX INFO: renamed from: a */
    public final String f280987a;

    /* JADX INFO: renamed from: b */
    public final int f280988b;

    /* JADX INFO: renamed from: c */
    public final String f280989c;

    /* JADX INFO: renamed from: d */
    public final String f280990d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f280991e;

    public za61(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.f280987a = str;
        this.f280988b = i;
        this.f280989c = str2;
        this.f280990d = str3;
        this.f280991e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za61)) {
            return false;
        }
        za61 za61Var = (za61) obj;
        return wj50.m88271j(this.f280987a, za61Var.f280987a) && this.f280988b == za61Var.f280988b && wj50.m88271j(this.f280989c, za61Var.f280989c) && wj50.m88271j(this.f280990d, za61Var.f280990d) && this.f280991e.equals(za61Var.f280991e);
    }

    public final int hashCode() {
        return this.f280991e.hashCode() + s571.m77243b(s571.m77243b(f710.m40938f(this.f280988b, this.f280987a.hashCode() * 31, 31), 31, this.f280989c), 31, this.f280990d);
    }
}
