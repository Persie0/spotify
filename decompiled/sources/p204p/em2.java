package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class em2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f60796a;

    /* JADX INFO: renamed from: b */
    public final String f60797b;

    /* JADX INFO: renamed from: c */
    public final String f60798c;

    public em2(String str, String str2, ArrayList arrayList) {
        this.f60796a = arrayList;
        this.f60797b = str;
        this.f60798c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em2)) {
            return false;
        }
        em2 em2Var = (em2) obj;
        return this.f60796a.equals(em2Var.f60796a) && wj50.m88271j(this.f60797b, em2Var.f60797b) && wj50.m88271j(this.f60798c, em2Var.f60798c);
    }

    public final int hashCode() {
        int iHashCode = this.f60796a.hashCode() * 31;
        String str = this.f60797b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60798c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
