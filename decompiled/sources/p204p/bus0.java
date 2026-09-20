package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bus0 {

    /* JADX INFO: renamed from: a */
    public final String f31204a;

    /* JADX INFO: renamed from: b */
    public final String f31205b;

    /* JADX INFO: renamed from: c */
    public final String f31206c;

    /* JADX INFO: renamed from: d */
    public final List f31207d;

    public bus0(String str, List list, String str2, String str3) {
        this.f31204a = str;
        this.f31205b = str2;
        this.f31206c = str3;
        this.f31207d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bus0)) {
            return false;
        }
        bus0 bus0Var = (bus0) obj;
        return wj50.m88271j(this.f31204a, bus0Var.f31204a) && wj50.m88271j(this.f31205b, bus0Var.f31205b) && wj50.m88271j(this.f31206c, bus0Var.f31206c) && wj50.m88271j(this.f31207d, bus0Var.f31207d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f31204a.hashCode() * 31, 31, this.f31205b);
        String str = this.f31206c;
        return this.f31207d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
