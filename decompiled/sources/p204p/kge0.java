package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kge0 implements lge0 {

    /* JADX INFO: renamed from: a */
    public final String f122378a;

    /* JADX INFO: renamed from: b */
    public final String f122379b;

    /* JADX INFO: renamed from: c */
    public final String f122380c;

    /* JADX INFO: renamed from: d */
    public final String f122381d;

    /* JADX INFO: renamed from: e */
    public final String f122382e;

    public kge0(String str, String str2, String str3, String str4, String str5) {
        this.f122378a = str;
        this.f122379b = str2;
        this.f122380c = str3;
        this.f122381d = str4;
        this.f122382e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kge0)) {
            return false;
        }
        kge0 kge0Var = (kge0) obj;
        return wj50.m88271j(this.f122378a, kge0Var.f122378a) && wj50.m88271j(this.f122379b, kge0Var.f122379b) && wj50.m88271j(this.f122380c, kge0Var.f122380c) && wj50.m88271j(this.f122381d, kge0Var.f122381d) && wj50.m88271j(this.f122382e, kge0Var.f122382e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f122378a.hashCode() * 31, 31, this.f122379b), 31, this.f122380c);
        String str = this.f122381d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f122382e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
