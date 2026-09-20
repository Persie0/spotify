package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class s53 {

    /* JADX INFO: renamed from: a */
    public final String f205692a;

    /* JADX INFO: renamed from: b */
    public final String f205693b;

    /* JADX INFO: renamed from: c */
    public final String f205694c;

    /* JADX INFO: renamed from: d */
    public final String f205695d;

    /* JADX INFO: renamed from: e */
    public final boolean f205696e;

    /* JADX INFO: renamed from: f */
    public final boolean f205697f;

    /* JADX INFO: renamed from: g */
    public final boolean f205698g;

    /* JADX INFO: renamed from: h */
    public final int f205699h;

    /* JADX INFO: renamed from: i */
    public final List f205700i;

    /* JADX INFO: renamed from: j */
    public final String f205701j;

    public s53(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i, List list, String str5) {
        this.f205692a = str;
        this.f205693b = str2;
        this.f205694c = str3;
        this.f205695d = str4;
        this.f205696e = z;
        this.f205697f = z2;
        this.f205698g = z3;
        this.f205699h = i;
        this.f205700i = list;
        this.f205701j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s53)) {
            return false;
        }
        s53 s53Var = (s53) obj;
        return wj50.m88271j(this.f205692a, s53Var.f205692a) && wj50.m88271j(this.f205693b, s53Var.f205693b) && wj50.m88271j(this.f205694c, s53Var.f205694c) && wj50.m88271j(this.f205695d, s53Var.f205695d) && this.f205696e == s53Var.f205696e && this.f205697f == s53Var.f205697f && this.f205698g == s53Var.f205698g && this.f205699h == s53Var.f205699h && this.f205700i.equals(s53Var.f205700i) && wj50.m88271j(this.f205701j, s53Var.f205701j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f205692a.hashCode() * 31, 31, this.f205693b), 31, this.f205694c);
        String str = this.f205695d;
        return this.f205701j.hashCode() + s571.m77244c(f710.m40938f(this.f205699h, s571.m77245d(s571.m77245d(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f205696e), 31, this.f205697f), 31, this.f205698g), 31), 31, this.f205700i);
    }
}
