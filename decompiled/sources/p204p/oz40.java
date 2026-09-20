package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oz40 {

    /* JADX INFO: renamed from: a */
    public final String f172071a;

    /* JADX INFO: renamed from: b */
    public final List f172072b;

    /* JADX INFO: renamed from: c */
    public final String f172073c;

    /* JADX INFO: renamed from: d */
    public final List f172074d;

    /* JADX INFO: renamed from: e */
    public final boolean f172075e;

    /* JADX INFO: renamed from: f */
    public final boolean f172076f;

    /* JADX INFO: renamed from: g */
    public final List f172077g;

    public oz40(String str, List list, String str2, List list2, boolean z, boolean z2, List list3) {
        this.f172071a = str;
        this.f172072b = list;
        this.f172073c = str2;
        this.f172074d = list2;
        this.f172075e = z;
        this.f172076f = z2;
        this.f172077g = list3;
    }

    /* JADX INFO: renamed from: a */
    public static oz40 m68613a(oz40 oz40Var, String str, ArrayList arrayList, String str2, List list, boolean z, boolean z2, List list2, int i) {
        if ((i & 1) != 0) {
            str = oz40Var.f172071a;
        }
        String str3 = str;
        List list3 = arrayList;
        if ((i & 2) != 0) {
            list3 = oz40Var.f172072b;
        }
        List list4 = list3;
        if ((i & 4) != 0) {
            str2 = oz40Var.f172073c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = oz40Var.f172074d;
        }
        List list5 = list;
        if ((i & 16) != 0) {
            z = oz40Var.f172075e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = oz40Var.f172076f;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            list2 = oz40Var.f172077g;
        }
        oz40Var.getClass();
        return new oz40(str3, list4, str4, list5, z3, z4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz40)) {
            return false;
        }
        oz40 oz40Var = (oz40) obj;
        return wj50.m88271j(this.f172071a, oz40Var.f172071a) && wj50.m88271j(this.f172072b, oz40Var.f172072b) && wj50.m88271j(this.f172073c, oz40Var.f172073c) && wj50.m88271j(this.f172074d, oz40Var.f172074d) && this.f172075e == oz40Var.f172075e && this.f172076f == oz40Var.f172076f && wj50.m88271j(this.f172077g, oz40Var.f172077g);
    }

    public final int hashCode() {
        return this.f172077g.hashCode() + s571.m77245d(s571.m77245d(s571.m77244c(s571.m77243b(s571.m77244c(this.f172071a.hashCode() * 31, 31, this.f172072b), 31, this.f172073c), 31, this.f172074d), 31, this.f172075e), 31, this.f172076f);
    }
}
