package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g1k {

    /* JADX INFO: renamed from: a */
    public final String f75641a;

    /* JADX INFO: renamed from: b */
    public final String f75642b;

    /* JADX INFO: renamed from: c */
    public final String f75643c;

    /* JADX INFO: renamed from: d */
    public final String f75644d;

    /* JADX INFO: renamed from: e */
    public final String f75645e;

    /* JADX INFO: renamed from: f */
    public final List f75646f;

    public g1k(String str, String str2, String str3, String str4, List list, String str5) {
        this.f75641a = str;
        this.f75642b = str2;
        this.f75643c = str3;
        this.f75644d = str4;
        this.f75645e = str5;
        this.f75646f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1k)) {
            return false;
        }
        g1k g1kVar = (g1k) obj;
        return wj50.m88271j(this.f75641a, g1kVar.f75641a) && wj50.m88271j(this.f75642b, g1kVar.f75642b) && wj50.m88271j(this.f75643c, g1kVar.f75643c) && wj50.m88271j(this.f75644d, g1kVar.f75644d) && wj50.m88271j(this.f75645e, g1kVar.f75645e) && this.f75646f.equals(g1kVar.f75646f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f75641a.hashCode() * 31, 31, this.f75642b), 31, this.f75643c), 31, this.f75644d);
        String str = this.f75645e;
        return this.f75646f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
