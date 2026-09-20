package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kkp0 implements y210 {

    /* JADX INFO: renamed from: a */
    public final String f123679a;

    /* JADX INFO: renamed from: b */
    public final String f123680b;

    /* JADX INFO: renamed from: c */
    public final String f123681c;

    /* JADX INFO: renamed from: d */
    public final String f123682d;

    /* JADX INFO: renamed from: e */
    public final String f123683e;

    /* JADX INFO: renamed from: f */
    public final boolean f123684f;

    /* JADX INFO: renamed from: g */
    public final zus0 f123685g;

    /* JADX INFO: renamed from: h */
    public final boolean f123686h;

    public kkp0(String str, String str2, String str3, String str4, String str5, boolean z, zus0 zus0Var, boolean z2) {
        this.f123679a = str;
        this.f123680b = str2;
        this.f123681c = str3;
        this.f123682d = str4;
        this.f123683e = str5;
        this.f123684f = z;
        this.f123685g = zus0Var;
        this.f123686h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkp0)) {
            return false;
        }
        kkp0 kkp0Var = (kkp0) obj;
        return wj50.m88271j(this.f123679a, kkp0Var.f123679a) && wj50.m88271j(this.f123680b, kkp0Var.f123680b) && wj50.m88271j(this.f123681c, kkp0Var.f123681c) && wj50.m88271j(this.f123682d, kkp0Var.f123682d) && wj50.m88271j(this.f123683e, kkp0Var.f123683e) && this.f123684f == kkp0Var.f123684f && wj50.m88271j(this.f123685g, kkp0Var.f123685g) && this.f123686h == kkp0Var.f123686h;
    }

    public final int hashCode() {
        int iHashCode = this.f123679a.hashCode() * 31;
        String str = this.f123680b;
        int iM77243b = s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123681c);
        String str2 = this.f123682d;
        int iHashCode2 = (iM77243b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123683e;
        return Boolean.hashCode(this.f123686h) + ((this.f123685g.hashCode() + s571.m77245d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f123684f)) * 31);
    }
}
