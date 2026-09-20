package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fm2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f70926a;

    /* JADX INFO: renamed from: b */
    public final String f70927b;

    /* JADX INFO: renamed from: c */
    public final List f70928c;

    /* JADX INFO: renamed from: d */
    public final String f70929d;

    /* JADX INFO: renamed from: e */
    public final String f70930e;

    public fm2(ArrayList arrayList, String str, ArrayList arrayList2, String str2, String str3) {
        this.f70926a = arrayList;
        this.f70927b = str;
        this.f70928c = arrayList2;
        this.f70929d = str2;
        this.f70930e = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m42044a() {
        return this.f70930e;
    }

    /* JADX INFO: renamed from: b */
    public final List m42045b() {
        return this.f70926a;
    }

    /* JADX INFO: renamed from: c */
    public final List m42046c() {
        return this.f70928c;
    }

    /* JADX INFO: renamed from: d */
    public final String m42047d() {
        return this.f70929d;
    }

    /* JADX INFO: renamed from: e */
    public final String m42048e() {
        return this.f70927b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm2)) {
            return false;
        }
        fm2 fm2Var = (fm2) obj;
        return this.f70926a.equals(fm2Var.f70926a) && wj50.m88271j(this.f70927b, fm2Var.f70927b) && wj50.m88271j(this.f70928c, fm2Var.f70928c) && wj50.m88271j(this.f70929d, fm2Var.f70929d) && wj50.m88271j(this.f70930e, fm2Var.f70930e);
    }

    public final int hashCode() {
        int iHashCode = this.f70926a.hashCode() * 31;
        String str = this.f70927b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f70928c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f70929d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70930e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
