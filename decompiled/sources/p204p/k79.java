package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class k79 {

    /* JADX INFO: renamed from: a */
    public final String f120017a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f120018b;

    /* JADX INFO: renamed from: c */
    public final String f120019c;

    /* JADX INFO: renamed from: d */
    public final String f120020d;

    public k79(String str, String str2, String str3, ArrayList arrayList) {
        this.f120017a = str;
        this.f120018b = arrayList;
        this.f120019c = str2;
        this.f120020d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k79)) {
            return false;
        }
        k79 k79Var = (k79) obj;
        return wj50.m88271j(this.f120017a, k79Var.f120017a) && this.f120018b.equals(k79Var.f120018b) && this.f120019c.equals(k79Var.f120019c) && wj50.m88271j(this.f120020d, k79Var.f120020d);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77245d(lq51.m59700f(this.f120018b, this.f120017a.hashCode() * 31, 31), 31, false), 31, this.f120019c), 961, this.f120020d);
    }
}
