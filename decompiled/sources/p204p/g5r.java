package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g5r {

    /* JADX INFO: renamed from: a */
    public final String f76726a;

    /* JADX INFO: renamed from: b */
    public final String f76727b;

    /* JADX INFO: renamed from: c */
    public final String f76728c;

    /* JADX INFO: renamed from: d */
    public final String f76729d;

    /* JADX INFO: renamed from: e */
    public final List f76730e;

    /* JADX INFO: renamed from: f */
    public final String f76731f;

    public g5r(String str, String str2, String str3, String str4, List list, String str5) {
        this.f76726a = str;
        this.f76727b = str2;
        this.f76728c = str3;
        this.f76729d = str4;
        this.f76730e = list;
        this.f76731f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5r)) {
            return false;
        }
        g5r g5rVar = (g5r) obj;
        return wj50.m88271j(this.f76726a, g5rVar.f76726a) && wj50.m88271j(this.f76727b, g5rVar.f76727b) && wj50.m88271j(this.f76728c, g5rVar.f76728c) && wj50.m88271j(this.f76729d, g5rVar.f76729d) && wj50.m88271j(this.f76730e, g5rVar.f76730e) && wj50.m88271j(this.f76731f, g5rVar.f76731f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f76726a.hashCode() * 31, 31, this.f76727b), 31, this.f76728c), 31, this.f76729d);
        List list = this.f76730e;
        int iHashCode = (iM77243b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f76731f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
