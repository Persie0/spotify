package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f222902a;

    /* JADX INFO: renamed from: b */
    public final String f222903b;

    /* JADX INFO: renamed from: c */
    public final String f222904c;

    /* JADX INFO: renamed from: d */
    public final List f222905d;

    /* JADX INFO: renamed from: e */
    public final String f222906e;

    public tqx(String str, String str2, String str3, String str4, List list) {
        this.f222902a = str;
        this.f222903b = str2;
        this.f222904c = str3;
        this.f222905d = list;
        this.f222906e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqx)) {
            return false;
        }
        tqx tqxVar = (tqx) obj;
        return wj50.m88271j(this.f222902a, tqxVar.f222902a) && wj50.m88271j(this.f222903b, tqxVar.f222903b) && wj50.m88271j(this.f222904c, tqxVar.f222904c) && wj50.m88271j(this.f222905d, tqxVar.f222905d) && wj50.m88271j(this.f222906e, tqxVar.f222906e);
    }

    public final int hashCode() {
        int iHashCode = this.f222902a.hashCode() * 31;
        String str = this.f222903b;
        int iM77244c = s571.m77244c(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f222904c), 31, this.f222905d);
        String str2 = this.f222906e;
        return iM77244c + (str2 != null ? str2.hashCode() : 0);
    }
}
