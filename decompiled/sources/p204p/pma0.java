package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class pma0 extends rma0 {

    /* JADX INFO: renamed from: a */
    public final String f179014a;

    /* JADX INFO: renamed from: b */
    public final String f179015b;

    /* JADX INFO: renamed from: c */
    public final String f179016c;

    /* JADX INFO: renamed from: d */
    public final String f179017d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f179018e;

    public pma0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f179014a = str;
        this.f179015b = str2;
        this.f179016c = str3;
        this.f179017d = str4;
        this.f179018e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pma0)) {
            return false;
        }
        pma0 pma0Var = (pma0) obj;
        return wj50.m88271j(this.f179014a, pma0Var.f179014a) && wj50.m88271j(this.f179015b, pma0Var.f179015b) && wj50.m88271j(this.f179016c, pma0Var.f179016c) && wj50.m88271j(this.f179017d, pma0Var.f179017d) && this.f179018e.equals(pma0Var.f179018e);
    }

    public final int hashCode() {
        String str = this.f179014a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f179015b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f179016c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f179017d;
        return this.f179018e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
