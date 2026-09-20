package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class l79 {

    /* JADX INFO: renamed from: a */
    public final String f130609a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f130610b;

    /* JADX INFO: renamed from: c */
    public final String f130611c;

    /* JADX INFO: renamed from: d */
    public final String f130612d;

    public l79(String str, String str2, String str3, ArrayList arrayList) {
        this.f130609a = str;
        this.f130610b = arrayList;
        this.f130611c = str2;
        this.f130612d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l79)) {
            return false;
        }
        l79 l79Var = (l79) obj;
        return this.f130609a.equals(l79Var.f130609a) && this.f130610b.equals(l79Var.f130610b) && wj50.m88271j(this.f130611c, l79Var.f130611c) && wj50.m88271j(this.f130612d, l79Var.f130612d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f130610b, this.f130609a.hashCode() * 31, 31);
        String str = this.f130611c;
        int iHashCode = (iM59700f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130612d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
