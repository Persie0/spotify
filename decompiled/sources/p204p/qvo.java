package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qvo {

    /* JADX INFO: renamed from: a */
    public final String f193067a;

    /* JADX INFO: renamed from: b */
    public final String f193068b;

    /* JADX INFO: renamed from: c */
    public final String f193069c;

    /* JADX INFO: renamed from: d */
    public final boolean f193070d;

    /* JADX INFO: renamed from: e */
    public final xfr f193071e;

    /* JADX INFO: renamed from: f */
    public final boolean f193072f;

    /* JADX INFO: renamed from: g */
    public final o9r f193073g;

    /* JADX INFO: renamed from: h */
    public final List f193074h;

    /* JADX INFO: renamed from: i */
    public final boolean f193075i;

    public qvo(String str, String str2, String str3, boolean z, xfr xfrVar, boolean z2, o9r o9rVar, List list, boolean z3) {
        this.f193067a = str;
        this.f193068b = str2;
        this.f193069c = str3;
        this.f193070d = z;
        this.f193071e = xfrVar;
        this.f193072f = z2;
        this.f193073g = o9rVar;
        this.f193074h = list;
        this.f193075i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvo)) {
            return false;
        }
        qvo qvoVar = (qvo) obj;
        return wj50.m88271j(this.f193067a, qvoVar.f193067a) && wj50.m88271j(this.f193068b, qvoVar.f193068b) && wj50.m88271j(this.f193069c, qvoVar.f193069c) && this.f193070d == qvoVar.f193070d && this.f193071e == qvoVar.f193071e && this.f193072f == qvoVar.f193072f && wj50.m88271j(this.f193073g, qvoVar.f193073g) && wj50.m88271j(this.f193074h, qvoVar.f193074h) && this.f193075i == qvoVar.f193075i;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f193071e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f193067a.hashCode() * 31, 31, this.f193068b), 31, this.f193069c), 31, this.f193070d)) * 31, 31, this.f193072f);
        o9r o9rVar = this.f193073g;
        int iHashCode = (iM77245d + (o9rVar == null ? 0 : o9rVar.hashCode())) * 31;
        List list = this.f193074h;
        return Boolean.hashCode(this.f193075i) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }
}
