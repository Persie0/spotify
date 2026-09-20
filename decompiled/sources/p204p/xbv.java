package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xbv {

    /* JADX INFO: renamed from: a */
    public final String f260012a;

    /* JADX INFO: renamed from: b */
    public final String f260013b;

    /* JADX INFO: renamed from: c */
    public final String f260014c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f260015d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f260016e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f260017f;

    /* JADX INFO: renamed from: g */
    public final Boolean f260018g;

    public xbv(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bool) {
        this.f260012a = str;
        this.f260013b = str2;
        this.f260014c = str3;
        this.f260015d = arrayList;
        this.f260016e = arrayList2;
        this.f260017f = arrayList3;
        this.f260018g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbv)) {
            return false;
        }
        xbv xbvVar = (xbv) obj;
        return wj50.m88271j(this.f260012a, xbvVar.f260012a) && wj50.m88271j(this.f260013b, xbvVar.f260013b) && wj50.m88271j(this.f260014c, xbvVar.f260014c) && this.f260015d.equals(xbvVar.f260015d) && this.f260016e.equals(xbvVar.f260016e) && this.f260017f.equals(xbvVar.f260017f) && this.f260018g.equals(xbvVar.f260018g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f260012a.hashCode() * 31, 31, this.f260013b);
        String str = this.f260014c;
        return this.f260018g.hashCode() + lq51.m59700f(this.f260017f, lq51.m59700f(this.f260016e, lq51.m59700f(this.f260015d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }
}
