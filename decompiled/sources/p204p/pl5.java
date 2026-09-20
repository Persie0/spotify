package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class pl5 {

    /* JADX INFO: renamed from: a */
    public final String f178637a;

    /* JADX INFO: renamed from: b */
    public final String f178638b;

    /* JADX INFO: renamed from: c */
    public final String f178639c;

    /* JADX INFO: renamed from: d */
    public final ykz0 f178640d;

    /* JADX INFO: renamed from: e */
    public final vda1 f178641e;

    /* JADX INFO: renamed from: f */
    public final Set f178642f;

    /* JADX INFO: renamed from: g */
    public final String f178643g;

    public pl5(String str, String str2, String str3, ykz0 ykz0Var, vda1 vda1Var, Set set, String str4) {
        this.f178637a = str;
        this.f178638b = str2;
        this.f178639c = str3;
        this.f178640d = ykz0Var;
        this.f178641e = vda1Var;
        this.f178642f = set;
        this.f178643g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl5)) {
            return false;
        }
        pl5 pl5Var = (pl5) obj;
        return wj50.m88271j(this.f178637a, pl5Var.f178637a) && wj50.m88271j(this.f178638b, pl5Var.f178638b) && wj50.m88271j(this.f178639c, pl5Var.f178639c) && wj50.m88271j(this.f178640d, pl5Var.f178640d) && wj50.m88271j(this.f178641e, pl5Var.f178641e) && wj50.m88271j(this.f178642f, pl5Var.f178642f) && wj50.m88271j(this.f178643g, pl5Var.f178643g);
    }

    public final int hashCode() {
        int iHashCode = this.f178637a.hashCode() * 31;
        String str = this.f178638b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f178639c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ykz0 ykz0Var = this.f178640d;
        int iHashCode4 = (this.f178641e.hashCode() + ((iHashCode3 + (ykz0Var == null ? 0 : ykz0Var.hashCode())) * 31)) * 31;
        Set set = this.f178642f;
        int iHashCode5 = (iHashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        String str3 = this.f178643g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
