package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class sn61 {

    /* JADX INFO: renamed from: a */
    public final boolean f210834a;

    /* JADX INFO: renamed from: b */
    public final List f210835b;

    public sn61(int i, ArrayList arrayList, boolean z) {
        z = (i & 2) != 0 ? false : z;
        List list = (i & 4) != 0 ? lau.f131415a : arrayList;
        this.f210834a = z;
        this.f210835b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn61)) {
            return false;
        }
        sn61 sn61Var = (sn61) obj;
        return this.f210834a == sn61Var.f210834a && wj50.m88271j(this.f210835b, sn61Var.f210835b);
    }

    public final int hashCode() {
        return this.f210835b.hashCode() + (Boolean.hashCode(this.f210834a) * 31);
    }
}
