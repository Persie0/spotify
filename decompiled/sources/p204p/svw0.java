package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class svw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f214523a;

    /* JADX INFO: renamed from: b */
    public final int f214524b;

    /* JADX INFO: renamed from: c */
    public final String f214525c;

    /* JADX INFO: renamed from: d */
    public final String f214526d;

    public svw0(int i, String str, String str2, ArrayList arrayList) {
        this.f214523a = arrayList;
        this.f214524b = i;
        this.f214525c = str;
        this.f214526d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svw0)) {
            return false;
        }
        svw0 svw0Var = (svw0) obj;
        return this.f214523a.equals(svw0Var.f214523a) && this.f214524b == svw0Var.f214524b && wj50.m88271j(this.f214525c, svw0Var.f214525c) && wj50.m88271j(this.f214526d, svw0Var.f214526d);
    }

    public final int hashCode() {
        int iHashCode = this.f214523a.hashCode() * 31;
        int i = this.f214524b;
        int iM38547C = (iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        String str = this.f214525c;
        int iHashCode2 = (iM38547C + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f214526d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
