package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class c7i {

    /* JADX INFO: renamed from: a */
    public final String f34903a;

    /* JADX INFO: renamed from: b */
    public final List f34904b;

    /* JADX INFO: renamed from: c */
    public final String f34905c;

    /* JADX INFO: renamed from: d */
    public final String f34906d;

    /* JADX INFO: renamed from: e */
    public final int f34907e;

    /* JADX INFO: renamed from: f */
    public final Integer f34908f;

    /* JADX INFO: renamed from: g */
    public final Integer f34909g;

    public c7i(String str, List list, String str2, String str3, int i, Integer num, Integer num2) {
        this.f34903a = str;
        this.f34904b = list;
        this.f34905c = str2;
        this.f34906d = str3;
        this.f34907e = i;
        this.f34908f = num;
        this.f34909g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7i)) {
            return false;
        }
        c7i c7iVar = (c7i) obj;
        return wj50.m88271j(this.f34903a, c7iVar.f34903a) && this.f34904b.equals(c7iVar.f34904b) && wj50.m88271j(this.f34905c, c7iVar.f34905c) && wj50.m88271j(this.f34906d, c7iVar.f34906d) && this.f34907e == c7iVar.f34907e && wj50.m88271j(this.f34908f, c7iVar.f34908f) && wj50.m88271j(this.f34909g, c7iVar.f34909g);
    }

    public final int hashCode() {
        String str = this.f34903a;
        int iM77244c = s571.m77244c((str == null ? 0 : str.hashCode()) * 31, 31, this.f34904b);
        String str2 = this.f34905c;
        int iHashCode = (iM77244c + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34906d;
        int iM40938f = f710.m40938f(this.f34907e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num = this.f34908f;
        int iHashCode2 = (iM40938f + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f34909g;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
