package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class je71 {

    /* JADX INFO: renamed from: a */
    public final ie71 f111490a;

    /* JADX INFO: renamed from: b */
    public final List f111491b;

    /* JADX INFO: renamed from: c */
    public final List f111492c;

    /* JADX INFO: renamed from: d */
    public final boolean f111493d;

    /* JADX INFO: renamed from: e */
    public final int f111494e;

    /* JADX INFO: renamed from: f */
    public final de71 f111495f;

    /* JADX INFO: renamed from: g */
    public final List f111496g;

    /* JADX INFO: renamed from: h */
    public final String f111497h;

    public je71(ie71 ie71Var, List list, List list2, boolean z, int i, de71 de71Var, List list3, String str) {
        this.f111490a = ie71Var;
        this.f111491b = list;
        this.f111492c = list2;
        this.f111493d = z;
        this.f111494e = i;
        this.f111495f = de71Var;
        this.f111496g = list3;
        this.f111497h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je71)) {
            return false;
        }
        je71 je71Var = (je71) obj;
        return wj50.m88271j(this.f111490a, je71Var.f111490a) && wj50.m88271j(this.f111491b, je71Var.f111491b) && wj50.m88271j(this.f111492c, je71Var.f111492c) && this.f111493d == je71Var.f111493d && this.f111494e == je71Var.f111494e && this.f111495f == je71Var.f111495f && wj50.m88271j(this.f111496g, je71Var.f111496g) && wj50.m88271j(this.f111497h, je71Var.f111497h);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f111494e, s571.m77245d(s571.m77244c(s571.m77244c(this.f111490a.f101342a.hashCode() * 31, 31, this.f111491b), 31, this.f111492c), 31, this.f111493d), 31);
        de71 de71Var = this.f111495f;
        int iM77244c = s571.m77244c((iM62800g + (de71Var == null ? 0 : de71Var.hashCode())) * 31, 31, this.f111496g);
        String str = this.f111497h;
        return iM77244c + (str != null ? str.hashCode() : 0);
    }
}
