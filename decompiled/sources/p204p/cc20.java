package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cc20 {

    /* JADX INFO: renamed from: a */
    public final String f36282a;

    /* JADX INFO: renamed from: b */
    public final String f36283b;

    /* JADX INFO: renamed from: c */
    public final Long f36284c;

    /* JADX INFO: renamed from: d */
    public final r891 f36285d;

    /* JADX INFO: renamed from: e */
    public final List f36286e;

    /* JADX INFO: renamed from: f */
    public final String f36287f;

    public cc20(String str, String str2, Long l, r891 r891Var, List list, String str3) {
        this.f36282a = str;
        this.f36283b = str2;
        this.f36284c = l;
        this.f36285d = r891Var;
        this.f36286e = list;
        this.f36287f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc20)) {
            return false;
        }
        cc20 cc20Var = (cc20) obj;
        return wj50.m88271j(this.f36282a, cc20Var.f36282a) && wj50.m88271j(this.f36283b, cc20Var.f36283b) && wj50.m88271j(this.f36284c, cc20Var.f36284c) && this.f36285d == cc20Var.f36285d && wj50.m88271j(this.f36286e, cc20Var.f36286e) && wj50.m88271j(this.f36287f, cc20Var.f36287f);
    }

    public final int hashCode() {
        int iHashCode = this.f36282a.hashCode() * 31;
        String str = this.f36283b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f36284c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        r891 r891Var = this.f36285d;
        int iM77244c = s571.m77244c((iHashCode3 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f36286e);
        String str2 = this.f36287f;
        return iM77244c + (str2 != null ? str2.hashCode() : 0);
    }
}
