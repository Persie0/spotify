package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h0o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f86319a;

    /* JADX INFO: renamed from: b */
    public final List f86320b;

    /* JADX INFO: renamed from: c */
    public final o0o0 f86321c;

    /* JADX INFO: renamed from: d */
    public final Integer f86322d;

    public h0o0(boolean z, List list, o0o0 o0o0Var, Integer num) {
        this.f86319a = z;
        this.f86320b = list;
        this.f86321c = o0o0Var;
        this.f86322d = num;
    }

    /* JADX INFO: renamed from: a */
    public static h0o0 m46362a(h0o0 h0o0Var, boolean z, ArrayList arrayList, o0o0 o0o0Var, Integer num, int i) {
        if ((i & 1) != 0) {
            z = h0o0Var.f86319a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = h0o0Var.f86320b;
        }
        if ((i & 4) != 0) {
            o0o0Var = h0o0Var.f86321c;
        }
        if ((i & 8) != 0) {
            num = h0o0Var.f86322d;
        }
        h0o0Var.getClass();
        return new h0o0(z, list, o0o0Var, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0o0)) {
            return false;
        }
        h0o0 h0o0Var = (h0o0) obj;
        return this.f86319a == h0o0Var.f86319a && wj50.m88271j(this.f86320b, h0o0Var.f86320b) && wj50.m88271j(this.f86321c, h0o0Var.f86321c) && wj50.m88271j(this.f86322d, h0o0Var.f86322d);
    }

    public final int hashCode() {
        int iHashCode = (this.f86321c.hashCode() + s571.m77244c(Boolean.hashCode(this.f86319a) * 31, 31, this.f86320b)) * 31;
        Integer num = this.f86322d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ h0o0() {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add("");
        }
        this(true, arrayList, n0o0.f149124b, null);
    }
}
