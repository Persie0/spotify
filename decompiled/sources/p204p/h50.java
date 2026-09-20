package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class h50 {

    /* JADX INFO: renamed from: a */
    public final String f87682a;

    /* JADX INFO: renamed from: b */
    public final String f87683b;

    /* JADX INFO: renamed from: c */
    public final String f87684c;

    /* JADX INFO: renamed from: d */
    public final String f87685d;

    /* JADX INFO: renamed from: e */
    public final String f87686e;

    /* JADX INFO: renamed from: f */
    public final float f87687f;

    /* JADX INFO: renamed from: g */
    public final String f87688g;

    /* JADX INFO: renamed from: h */
    public final String f87689h;

    /* JADX INFO: renamed from: i */
    public final String f87690i;

    /* JADX INFO: renamed from: j */
    public final int f87691j;

    /* JADX INFO: renamed from: k */
    public final String f87692k;

    public h50(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, int i, String str9, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "#FFFFFF" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        str4 = (i2 & 8) != 0 ? "" : str4;
        str5 = (i2 & 16) != 0 ? "" : str5;
        f = (i2 & 32) != 0 ? 0.0f : f;
        str6 = (i2 & 64) != 0 ? "" : str6;
        str7 = (i2 & 128) != 0 ? "" : str7;
        str8 = (i2 & 256) != 0 ? "" : str8;
        i = (i2 & 512) != 0 ? 4 : i;
        str9 = (i2 & 1024) != 0 ? "" : str9;
        this.f87682a = str;
        this.f87683b = str2;
        this.f87684c = str3;
        this.f87685d = str4;
        this.f87686e = str5;
        this.f87687f = f;
        this.f87688g = str6;
        this.f87689h = str7;
        this.f87690i = str8;
        this.f87691j = i;
        this.f87692k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50Var = (h50) obj;
        return wj50.m88271j(this.f87682a, h50Var.f87682a) && wj50.m88271j(this.f87683b, h50Var.f87683b) && wj50.m88271j(this.f87684c, h50Var.f87684c) && wj50.m88271j(this.f87685d, h50Var.f87685d) && wj50.m88271j(this.f87686e, h50Var.f87686e) && Float.compare(this.f87687f, h50Var.f87687f) == 0 && wj50.m88271j(this.f87688g, h50Var.f87688g) && wj50.m88271j(this.f87689h, h50Var.f87689h) && wj50.m88271j(this.f87690i, h50Var.f87690i) && this.f87691j == h50Var.f87691j && wj50.m88271j(this.f87692k, h50Var.f87692k);
    }

    public final int hashCode() {
        return this.f87692k.hashCode() + f710.m40938f(this.f87691j, s571.m77243b(s571.m77243b(s571.m77243b(AbstractC0000a.m8g(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f87682a.hashCode() * 31, 31, this.f87683b), 31, this.f87684c), 31, this.f87685d), 31, this.f87686e), 31, this.f87687f), 31, this.f87688g), 31, this.f87689h), 31, this.f87690i), 31);
    }
}
