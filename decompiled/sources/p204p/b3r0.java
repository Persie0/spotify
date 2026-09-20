package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b3r0 implements f3r0 {

    /* JADX INFO: renamed from: a */
    public final String f23114a;

    /* JADX INFO: renamed from: b */
    public final String f23115b;

    /* JADX INFO: renamed from: c */
    public final String f23116c;

    /* JADX INFO: renamed from: d */
    public final Integer f23117d;

    /* JADX INFO: renamed from: e */
    public final boolean f23118e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f23119f;

    /* JADX INFO: renamed from: g */
    public final String f23120g;

    /* JADX INFO: renamed from: h */
    public final List f23121h;

    public b3r0(String str, String str2, String str3, Integer num, boolean z, ArrayList arrayList, String str4, ae50 ae50Var) {
        this.f23114a = str;
        this.f23115b = str2;
        this.f23116c = str3;
        this.f23117d = num;
        this.f23118e = z;
        this.f23119f = arrayList;
        this.f23120g = str4;
        this.f23121h = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3r0)) {
            return false;
        }
        b3r0 b3r0Var = (b3r0) obj;
        return wj50.m88271j(this.f23114a, b3r0Var.f23114a) && wj50.m88271j(this.f23115b, b3r0Var.f23115b) && wj50.m88271j(this.f23116c, b3r0Var.f23116c) && wj50.m88271j(this.f23117d, b3r0Var.f23117d) && this.f23118e == b3r0Var.f23118e && this.f23119f.equals(b3r0Var.f23119f) && wj50.m88271j(this.f23120g, b3r0Var.f23120g) && wj50.m88271j(this.f23121h, b3r0Var.f23121h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f23114a.hashCode() * 31, 31, this.f23115b), 31, this.f23116c);
        Integer num = this.f23117d;
        int iM59700f = lq51.m59700f(this.f23119f, s571.m77245d((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f23118e), 31);
        String str = this.f23120g;
        return this.f23121h.hashCode() + ((iM59700f + (str != null ? str.hashCode() : 0)) * 31);
    }
}
