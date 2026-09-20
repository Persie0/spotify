package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i1c {

    /* JADX INFO: renamed from: a */
    public final String f97464a;

    /* JADX INFO: renamed from: b */
    public final String f97465b;

    /* JADX INFO: renamed from: c */
    public final String f97466c;

    /* JADX INFO: renamed from: d */
    public final String f97467d;

    /* JADX INFO: renamed from: e */
    public final List f97468e;

    /* JADX INFO: renamed from: f */
    public final String f97469f;

    /* JADX INFO: renamed from: g */
    public final e1c f97470g;

    /* JADX INFO: renamed from: h */
    public final String f97471h;

    /* JADX INFO: renamed from: i */
    public final boolean f97472i;

    public i1c(String str, String str2, String str3, String str4, List list, String str5, String str6, boolean z) {
        e1c e1cVar = e1c.f55174c;
        this.f97464a = str;
        this.f97465b = str2;
        this.f97466c = str3;
        this.f97467d = str4;
        this.f97468e = list;
        this.f97469f = str5;
        this.f97470g = e1cVar;
        this.f97471h = str6;
        this.f97472i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1c)) {
            return false;
        }
        i1c i1cVar = (i1c) obj;
        return wj50.m88271j(this.f97464a, i1cVar.f97464a) && wj50.m88271j(this.f97465b, i1cVar.f97465b) && wj50.m88271j(this.f97466c, i1cVar.f97466c) && wj50.m88271j(this.f97467d, i1cVar.f97467d) && wj50.m88271j(this.f97468e, i1cVar.f97468e) && wj50.m88271j(this.f97469f, i1cVar.f97469f) && wj50.m88271j(this.f97470g, i1cVar.f97470g) && wj50.m88271j(this.f97471h, i1cVar.f97471h) && this.f97472i == i1cVar.f97472i;
    }

    public final int hashCode() {
        int iHashCode = (this.f97470g.hashCode() + s571.m77243b(s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(this.f97464a.hashCode() * 31, 31, this.f97465b), 31, this.f97466c), 31, this.f97467d), 31, this.f97468e), 31, this.f97469f)) * 31;
        String str = this.f97471h;
        return Boolean.hashCode(this.f97472i) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1c(String str, String str2, String str3, String str4, List list, String str5, String str6, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? lau.f131415a : list, str5, (i & 128) != 0 ? null : str6, false);
        e1c e1cVar = e1c.f55174c;
    }
}
