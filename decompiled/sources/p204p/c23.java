package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c23 {

    /* JADX INFO: renamed from: a */
    public final String f33281a;

    /* JADX INFO: renamed from: b */
    public final String f33282b;

    /* JADX INFO: renamed from: c */
    public final List f33283c;

    public c23(String str, List list, String str2) {
        this.f33281a = str;
        this.f33282b = str2;
        this.f33283c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c23)) {
            return false;
        }
        c23 c23Var = (c23) obj;
        return wj50.m88271j(this.f33281a, c23Var.f33281a) && wj50.m88271j(this.f33282b, c23Var.f33282b) && wj50.m88271j(this.f33283c, c23Var.f33283c);
    }

    public final int hashCode() {
        return this.f33283c.hashCode() + s571.m77243b(((this.f33281a.hashCode() * 31) + 2098153138) * 31, 31, this.f33282b);
    }
}
