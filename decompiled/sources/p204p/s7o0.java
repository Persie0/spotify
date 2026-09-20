package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class s7o0 {

    /* JADX INFO: renamed from: a */
    public final String f206442a;

    /* JADX INFO: renamed from: b */
    public final boolean f206443b;

    /* JADX INFO: renamed from: c */
    public final String f206444c;

    /* JADX INFO: renamed from: d */
    public final String f206445d;

    /* JADX INFO: renamed from: e */
    public final List f206446e;

    /* JADX INFO: renamed from: f */
    public final h50 f206447f;

    /* JADX INFO: renamed from: g */
    public final List f206448g;

    public s7o0(String str, boolean z, String str2, String str3, List list, h50 h50Var, List list2) {
        this.f206442a = str;
        this.f206443b = z;
        this.f206444c = str2;
        this.f206445d = str3;
        this.f206446e = list;
        this.f206447f = h50Var;
        this.f206448g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7o0)) {
            return false;
        }
        s7o0 s7o0Var = (s7o0) obj;
        return wj50.m88271j(this.f206442a, s7o0Var.f206442a) && this.f206443b == s7o0Var.f206443b && wj50.m88271j(this.f206444c, s7o0Var.f206444c) && wj50.m88271j(this.f206445d, s7o0Var.f206445d) && wj50.m88271j(this.f206446e, s7o0Var.f206446e) && wj50.m88271j(this.f206447f, s7o0Var.f206447f) && wj50.m88271j(this.f206448g, s7o0Var.f206448g);
    }

    public final int hashCode() {
        return this.f206448g.hashCode() + ((this.f206447f.hashCode() + s571.m77244c(s571.m77243b(s571.m77243b(s571.m77245d(this.f206442a.hashCode() * 31, 31, this.f206443b), 31, this.f206444c), 31, this.f206445d), 31, this.f206446e)) * 31);
    }
}
