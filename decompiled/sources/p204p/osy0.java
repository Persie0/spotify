package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class osy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f168918a;

    /* JADX INFO: renamed from: b */
    public final String f168919b;

    /* JADX INFO: renamed from: c */
    public final List f168920c;

    /* JADX INFO: renamed from: d */
    public final d850 f168921d;

    /* JADX INFO: renamed from: e */
    public final String f168922e;

    public osy0(String str, String str2, List list, d850 d850Var, String str3) {
        this.f168918a = str;
        this.f168919b = str2;
        this.f168920c = list;
        this.f168921d = d850Var;
        this.f168922e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osy0)) {
            return false;
        }
        osy0 osy0Var = (osy0) obj;
        return wj50.m88271j(this.f168918a, osy0Var.f168918a) && wj50.m88271j(this.f168919b, osy0Var.f168919b) && wj50.m88271j(this.f168920c, osy0Var.f168920c) && wj50.m88271j(this.f168921d, osy0Var.f168921d) && wj50.m88271j(this.f168922e, osy0Var.f168922e);
    }

    public final int hashCode() {
        String str = this.f168918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f168919b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f168920c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        d850 d850Var = this.f168921d;
        int iHashCode4 = (iHashCode3 + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
        String str3 = this.f168922e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
