package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class n310 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f149900a;

    /* JADX INFO: renamed from: b */
    public final String f149901b;

    /* JADX INFO: renamed from: c */
    public final String f149902c;

    /* JADX INFO: renamed from: d */
    public final String f149903d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f149904e;

    /* JADX INFO: renamed from: f */
    public final String f149905f;

    public n310(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.f149900a = str;
        this.f149901b = str2;
        this.f149902c = str3;
        this.f149903d = str4;
        this.f149904e = arrayList;
        this.f149905f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n310)) {
            return false;
        }
        n310 n310Var = (n310) obj;
        return wj50.m88271j(this.f149900a, n310Var.f149900a) && wj50.m88271j(this.f149901b, n310Var.f149901b) && wj50.m88271j(this.f149902c, n310Var.f149902c) && wj50.m88271j(this.f149903d, n310Var.f149903d) && this.f149904e.equals(n310Var.f149904e) && wj50.m88271j(this.f149905f, n310Var.f149905f);
    }

    public final int hashCode() {
        return this.f149905f.hashCode() + lq51.m59700f(this.f149904e, s571.m77243b(s571.m77243b(s571.m77243b(this.f149900a.hashCode() * 31, 31, this.f149901b), 31, this.f149902c), 31, this.f149903d), 31);
    }
}
