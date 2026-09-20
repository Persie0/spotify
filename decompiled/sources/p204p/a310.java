package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class a310 {

    /* JADX INFO: renamed from: a */
    public final String f11817a;

    /* JADX INFO: renamed from: b */
    public final String f11818b;

    /* JADX INFO: renamed from: c */
    public final String f11819c;

    /* JADX INFO: renamed from: d */
    public final String f11820d;

    /* JADX INFO: renamed from: e */
    public final String f11821e;

    /* JADX INFO: renamed from: f */
    public final String f11822f;

    /* JADX INFO: renamed from: g */
    public final vda1 f11823g;

    /* JADX INFO: renamed from: h */
    public final boolean f11824h;

    /* JADX INFO: renamed from: i */
    public final Set f11825i;

    /* JADX INFO: renamed from: j */
    public final String f11826j;

    public a310(String str, String str2, String str3, String str4, String str5, String str6, vda1 vda1Var, boolean z, Set set, String str7, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        vda1Var = (i & 64) != 0 ? tda1.f219274a : vda1Var;
        z = (i & 128) != 0 ? false : z;
        set = (i & 256) != 0 ? null : set;
        str7 = (i & 512) != 0 ? null : str7;
        this.f11817a = str;
        this.f11818b = str2;
        this.f11819c = str3;
        this.f11820d = str4;
        this.f11821e = str5;
        this.f11822f = str6;
        this.f11823g = vda1Var;
        this.f11824h = z;
        this.f11825i = set;
        this.f11826j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a310)) {
            return false;
        }
        a310 a310Var = (a310) obj;
        return wj50.m88271j(this.f11817a, a310Var.f11817a) && wj50.m88271j(this.f11818b, a310Var.f11818b) && wj50.m88271j(this.f11819c, a310Var.f11819c) && wj50.m88271j(this.f11820d, a310Var.f11820d) && wj50.m88271j(this.f11821e, a310Var.f11821e) && wj50.m88271j(this.f11822f, a310Var.f11822f) && wj50.m88271j(this.f11823g, a310Var.f11823g) && this.f11824h == a310Var.f11824h && wj50.m88271j(this.f11825i, a310Var.f11825i) && wj50.m88271j(this.f11826j, a310Var.f11826j);
    }

    public final int hashCode() {
        int iHashCode = this.f11817a.hashCode() * 31;
        String str = this.f11818b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11819c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11820d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11821e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11822f;
        int iM77245d = s571.m77245d((this.f11823g.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.f11824h);
        Set set = this.f11825i;
        int iHashCode6 = (iM77245d + (set == null ? 0 : set.hashCode())) * 31;
        String str6 = this.f11826j;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }
}
