package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sj81 {

    /* JADX INFO: renamed from: a */
    public final String f209779a;

    /* JADX INFO: renamed from: b */
    public final String f209780b;

    /* JADX INFO: renamed from: c */
    public final String f209781c;

    /* JADX INFO: renamed from: d */
    public final List f209782d;

    public sj81(String str, List list, String str2, String str3) {
        this.f209779a = str;
        this.f209780b = str2;
        this.f209781c = str3;
        this.f209782d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj81)) {
            return false;
        }
        sj81 sj81Var = (sj81) obj;
        return wj50.m88271j(this.f209779a, sj81Var.f209779a) && wj50.m88271j(this.f209780b, sj81Var.f209780b) && wj50.m88271j(this.f209781c, sj81Var.f209781c) && wj50.m88271j(this.f209782d, sj81Var.f209782d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f209779a.hashCode() * 31, 31, this.f209780b);
        String str = this.f209781c;
        return this.f209782d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
