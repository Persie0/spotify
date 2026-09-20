package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class eua1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f62929a;

    /* JADX INFO: renamed from: b */
    public final String f62930b;

    /* JADX INFO: renamed from: c */
    public final String f62931c;

    /* JADX INFO: renamed from: d */
    public final String f62932d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f62933e;

    /* JADX INFO: renamed from: f */
    public final Integer f62934f;

    public eua1(String str, String str2, String str3, String str4, ArrayList arrayList, Integer num) {
        this.f62929a = str;
        this.f62930b = str2;
        this.f62931c = str3;
        this.f62932d = str4;
        this.f62933e = arrayList;
        this.f62934f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eua1)) {
            return false;
        }
        eua1 eua1Var = (eua1) obj;
        return wj50.m88271j(this.f62929a, eua1Var.f62929a) && wj50.m88271j(this.f62930b, eua1Var.f62930b) && wj50.m88271j(this.f62931c, eua1Var.f62931c) && wj50.m88271j(this.f62932d, eua1Var.f62932d) && this.f62933e.equals(eua1Var.f62933e) && wj50.m88271j(this.f62934f, eua1Var.f62934f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f62929a.hashCode() * 31, 31, this.f62930b);
        String str = this.f62931c;
        int iM59700f = lq51.m59700f(this.f62933e, s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f62932d), 31);
        Integer num = this.f62934f;
        return iM59700f + (num != null ? num.hashCode() : 0);
    }
}
