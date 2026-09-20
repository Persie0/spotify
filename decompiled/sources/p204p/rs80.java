package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rs80 {

    /* JADX INFO: renamed from: a */
    public final String f202224a;

    /* JADX INFO: renamed from: b */
    public final int f202225b;

    /* JADX INFO: renamed from: c */
    public final List f202226c;

    public rs80(String str, int i, List list) {
        this.f202224a = str;
        this.f202225b = i;
        this.f202226c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs80)) {
            return false;
        }
        rs80 rs80Var = (rs80) obj;
        return wj50.m88271j(this.f202224a, rs80Var.f202224a) && this.f202225b == rs80Var.f202225b && wj50.m88271j(this.f202226c, rs80Var.f202226c);
    }

    public final int hashCode() {
        return this.f202226c.hashCode() + mt60.m62800g(this.f202225b, this.f202224a.hashCode() * 31, 31);
    }
}
