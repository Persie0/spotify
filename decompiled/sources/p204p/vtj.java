package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class vtj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f244678a;

    /* JADX INFO: renamed from: b */
    public final String f244679b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f244680c;

    public vtj(String str, String str2, ArrayList arrayList) {
        this.f244678a = str;
        this.f244679b = str2;
        this.f244680c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtj)) {
            return false;
        }
        vtj vtjVar = (vtj) obj;
        return this.f244678a.equals(vtjVar.f244678a) && wj50.m88271j(this.f244679b, vtjVar.f244679b) && this.f244680c.equals(vtjVar.f244680c);
    }

    public final int hashCode() {
        int iHashCode = this.f244678a.hashCode() * 31;
        String str = this.f244679b;
        return this.f244680c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
