package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class zjk {

    /* JADX INFO: renamed from: a */
    public final String f283454a;

    /* JADX INFO: renamed from: b */
    public final String f283455b;

    /* JADX INFO: renamed from: c */
    public final String f283456c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f283457d;

    public zjk(String str, String str2, String str3, ArrayList arrayList) {
        this.f283454a = str;
        this.f283455b = str2;
        this.f283456c = str3;
        this.f283457d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjk)) {
            return false;
        }
        zjk zjkVar = (zjk) obj;
        return wj50.m88271j(this.f283454a, zjkVar.f283454a) && wj50.m88271j(this.f283455b, zjkVar.f283455b) && wj50.m88271j(this.f283456c, zjkVar.f283456c) && this.f283457d.equals(zjkVar.f283457d);
    }

    public final int hashCode() {
        int iHashCode = this.f283454a.hashCode() * 31;
        String str = this.f283455b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283456c;
        return this.f283457d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
