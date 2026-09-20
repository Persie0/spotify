package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b2w0 implements f2w0 {

    /* JADX INFO: renamed from: a */
    public final String f22730a;

    /* JADX INFO: renamed from: b */
    public final String f22731b;

    /* JADX INFO: renamed from: c */
    public final String f22732c;

    /* JADX INFO: renamed from: d */
    public final List f22733d;

    /* JADX INFO: renamed from: e */
    public final String f22734e;

    /* JADX INFO: renamed from: f */
    public final String f22735f;

    /* JADX INFO: renamed from: g */
    public final dhl f22736g;

    public b2w0(String str, String str2, String str3, List list, String str4, String str5, dhl dhlVar) {
        this.f22730a = str;
        this.f22731b = str2;
        this.f22732c = str3;
        this.f22733d = list;
        this.f22734e = str4;
        this.f22735f = str5;
        this.f22736g = dhlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2w0)) {
            return false;
        }
        b2w0 b2w0Var = (b2w0) obj;
        return wj50.m88271j(this.f22730a, b2w0Var.f22730a) && wj50.m88271j(this.f22731b, b2w0Var.f22731b) && wj50.m88271j(this.f22732c, b2w0Var.f22732c) && wj50.m88271j(this.f22733d, b2w0Var.f22733d) && wj50.m88271j(this.f22734e, b2w0Var.f22734e) && wj50.m88271j(this.f22735f, b2w0Var.f22735f) && wj50.m88271j(this.f22736g, b2w0Var.f22736g);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f22730a.hashCode() * 31, 31, this.f22731b), 31, this.f22732c), 31, this.f22733d);
        String str = this.f22734e;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22735f;
        return this.f22736g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
