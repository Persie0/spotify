package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class dme0 {

    /* JADX INFO: renamed from: a */
    public final String f50499a;

    /* JADX INFO: renamed from: b */
    public final String f50500b;

    /* JADX INFO: renamed from: c */
    public final String f50501c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f50502d;

    public dme0(String str, String str2, String str3, ArrayList arrayList) {
        this.f50499a = str;
        this.f50500b = str2;
        this.f50501c = str3;
        this.f50502d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dme0)) {
            return false;
        }
        dme0 dme0Var = (dme0) obj;
        return wj50.m88271j(this.f50499a, dme0Var.f50499a) && wj50.m88271j(this.f50500b, dme0Var.f50500b) && wj50.m88271j(this.f50501c, dme0Var.f50501c) && this.f50502d.equals(dme0Var.f50502d);
    }

    public final int hashCode() {
        int iHashCode = this.f50499a.hashCode() * 31;
        String str = this.f50500b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50501c;
        return this.f50502d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
