package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class vs11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f244310a;

    /* JADX INFO: renamed from: b */
    public final String f244311b;

    /* JADX INFO: renamed from: c */
    public final String f244312c;

    /* JADX INFO: renamed from: d */
    public final String f244313d;

    /* JADX INFO: renamed from: e */
    public final String f244314e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f244315f;

    /* JADX INFO: renamed from: g */
    public final String f244316g;

    /* JADX INFO: renamed from: h */
    public final boolean f244317h;

    public vs11(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, boolean z) {
        this.f244310a = str;
        this.f244311b = str2;
        this.f244312c = str3;
        this.f244313d = str4;
        this.f244314e = str5;
        this.f244315f = arrayList;
        this.f244316g = str6;
        this.f244317h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs11)) {
            return false;
        }
        vs11 vs11Var = (vs11) obj;
        return this.f244310a.equals(vs11Var.f244310a) && wj50.m88271j(this.f244311b, vs11Var.f244311b) && wj50.m88271j(this.f244312c, vs11Var.f244312c) && wj50.m88271j(this.f244313d, vs11Var.f244313d) && wj50.m88271j(this.f244314e, vs11Var.f244314e) && this.f244315f.equals(vs11Var.f244315f) && wj50.m88271j(this.f244316g, vs11Var.f244316g) && this.f244317h == vs11Var.f244317h;
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f244315f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f244310a.hashCode() * 31, 31, this.f244311b), 31, this.f244312c), 31, this.f244313d), 31, this.f244314e), 31);
        String str = this.f244316g;
        return ((Boolean.hashCode(this.f244317h) + ((iM59700f + (str == null ? 0 : str.hashCode())) * 31)) * 31) - 1346034426;
    }
}
