package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xvc1 {

    /* JADX INFO: renamed from: a */
    public final List f266358a;

    /* JADX INFO: renamed from: b */
    public final qdp0 f266359b;

    /* JADX INFO: renamed from: c */
    public final long f266360c;

    /* JADX INFO: renamed from: d */
    public final boolean f266361d;

    public /* synthetic */ xvc1(List list) {
        this(list, null, 1L, false);
    }

    /* JADX INFO: renamed from: a */
    public static xvc1 m92233a(xvc1 xvc1Var, ArrayList arrayList, qdp0 qdp0Var, long j, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = xvc1Var.f266358a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            qdp0Var = xvc1Var.f266359b;
        }
        qdp0 qdp0Var2 = qdp0Var;
        if ((i & 4) != 0) {
            j = xvc1Var.f266360c;
        }
        long j2 = j;
        boolean z = (i & 8) != 0 ? xvc1Var.f266361d : true;
        xvc1Var.getClass();
        return new xvc1(list2, qdp0Var2, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvc1)) {
            return false;
        }
        xvc1 xvc1Var = (xvc1) obj;
        return wj50.m88271j(this.f266358a, xvc1Var.f266358a) && wj50.m88271j(this.f266359b, xvc1Var.f266359b) && this.f266360c == xvc1Var.f266360c && this.f266361d == xvc1Var.f266361d;
    }

    public final int hashCode() {
        int iHashCode = this.f266358a.hashCode() * 31;
        qdp0 qdp0Var = this.f266359b;
        return Boolean.hashCode(this.f266361d) + dq60.m36605e((iHashCode + (qdp0Var == null ? 0 : qdp0Var.hashCode())) * 31, this.f266360c, 31);
    }

    public xvc1(List list, qdp0 qdp0Var, long j, boolean z) {
        this.f266358a = list;
        this.f266359b = qdp0Var;
        this.f266360c = j;
        this.f266361d = z;
    }
}
