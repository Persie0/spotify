package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class gab1 {

    /* JADX INFO: renamed from: a */
    public final String f78021a;

    /* JADX INFO: renamed from: b */
    public final String f78022b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f78023c;

    /* JADX INFO: renamed from: d */
    public final String f78024d;

    public gab1(String str, String str2, String str3, ArrayList arrayList) {
        this.f78021a = str;
        this.f78022b = str2;
        this.f78023c = arrayList;
        this.f78024d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gab1)) {
            return false;
        }
        gab1 gab1Var = (gab1) obj;
        return wj50.m88271j(this.f78021a, gab1Var.f78021a) && wj50.m88271j(this.f78022b, gab1Var.f78022b) && wj50.m88271j(this.f78023c, gab1Var.f78023c) && wj50.m88271j(this.f78024d, gab1Var.f78024d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f78023c, s571.m77243b(this.f78021a.hashCode() * 31, 31, this.f78022b), 31);
        String str = this.f78024d;
        return iM59700f + (str == null ? 0 : str.hashCode());
    }
}
