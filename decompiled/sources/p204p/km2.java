package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class km2 {

    /* JADX INFO: renamed from: a */
    public final String f124032a;

    /* JADX INFO: renamed from: b */
    public final String f124033b;

    /* JADX INFO: renamed from: c */
    public final Long f124034c;

    /* JADX INFO: renamed from: d */
    public final String f124035d;

    /* JADX INFO: renamed from: e */
    public final List f124036e;

    /* JADX INFO: renamed from: f */
    public final String f124037f;

    public km2(String str, String str2, Long l, String str3, ae50 ae50Var, String str4) {
        this.f124032a = str;
        this.f124033b = str2;
        this.f124034c = l;
        this.f124035d = str3;
        this.f124036e = ae50Var;
        this.f124037f = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m56870a() {
        return this.f124033b;
    }

    /* JADX INFO: renamed from: b */
    public final List m56871b() {
        return this.f124036e;
    }

    /* JADX INFO: renamed from: c */
    public final Long m56872c() {
        return this.f124034c;
    }

    /* JADX INFO: renamed from: d */
    public final String m56873d() {
        return this.f124035d;
    }

    /* JADX INFO: renamed from: e */
    public final String m56874e() {
        return this.f124032a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2)) {
            return false;
        }
        km2 km2Var = (km2) obj;
        return wj50.m88271j(this.f124032a, km2Var.f124032a) && wj50.m88271j(this.f124033b, km2Var.f124033b) && wj50.m88271j(this.f124034c, km2Var.f124034c) && wj50.m88271j(this.f124035d, km2Var.f124035d) && wj50.m88271j(this.f124036e, km2Var.f124036e) && wj50.m88271j(this.f124037f, km2Var.f124037f);
    }

    public final int hashCode() {
        int iHashCode = this.f124032a.hashCode() * 31;
        String str = this.f124033b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f124034c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f124035d;
        int iM77244c = s571.m77244c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f124036e);
        String str3 = this.f124037f;
        return iM77244c + (str3 != null ? str3.hashCode() : 0);
    }
}
