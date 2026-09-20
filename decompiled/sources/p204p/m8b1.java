package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class m8b1 {

    /* JADX INFO: renamed from: a */
    public final String f141004a;

    /* JADX INFO: renamed from: b */
    public final String f141005b;

    /* JADX INFO: renamed from: c */
    public final String f141006c;

    /* JADX INFO: renamed from: d */
    public final String f141007d;

    /* JADX INFO: renamed from: e */
    public final String f141008e;

    /* JADX INFO: renamed from: f */
    public final String f141009f;

    /* JADX INFO: renamed from: g */
    public final String f141010g;

    /* JADX INFO: renamed from: h */
    public final String f141011h;

    /* JADX INFO: renamed from: i */
    public final String f141012i;

    /* JADX INFO: renamed from: j */
    public final List f141013j;

    /* JADX INFO: renamed from: k */
    public final l8b1 f141014k;

    public m8b1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, l8b1 l8b1Var) {
        this.f141004a = str;
        this.f141005b = str2;
        this.f141006c = str3;
        this.f141007d = str4;
        this.f141008e = str5;
        this.f141009f = str6;
        this.f141010g = str7;
        this.f141011h = str8;
        this.f141012i = str9;
        this.f141013j = list;
        this.f141014k = l8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8b1)) {
            return false;
        }
        m8b1 m8b1Var = (m8b1) obj;
        return wj50.m88271j(this.f141004a, m8b1Var.f141004a) && wj50.m88271j(this.f141005b, m8b1Var.f141005b) && wj50.m88271j(this.f141006c, m8b1Var.f141006c) && wj50.m88271j(this.f141007d, m8b1Var.f141007d) && wj50.m88271j(this.f141008e, m8b1Var.f141008e) && wj50.m88271j(this.f141009f, m8b1Var.f141009f) && this.f141010g.equals(m8b1Var.f141010g) && this.f141011h.equals(m8b1Var.f141011h) && wj50.m88271j(this.f141012i, m8b1Var.f141012i) && wj50.m88271j(this.f141013j, m8b1Var.f141013j) && wj50.m88271j(this.f141014k, m8b1Var.f141014k);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f141004a.hashCode() * 31, 31, this.f141005b);
        String str = this.f141006c;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f141007d), 31, this.f141008e);
        String str2 = this.f141009f;
        int iM77243b3 = s571.m77243b(s571.m77243b(s571.m77245d((iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false), 31, this.f141010g), 31, this.f141011h);
        String str3 = this.f141012i;
        int iM77244c = s571.m77244c((iM77243b3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f141013j);
        l8b1 l8b1Var = this.f141014k;
        return iM77244c + (l8b1Var != null ? l8b1Var.hashCode() : 0);
    }
}
