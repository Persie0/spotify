package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class gfr {

    /* JADX INFO: renamed from: a */
    public final qcr f79442a;

    /* JADX INFO: renamed from: b */
    public final e261 f79443b;

    /* JADX INFO: renamed from: c */
    public final Set f79444c;

    /* JADX INFO: renamed from: d */
    public final long f79445d;

    /* JADX INFO: renamed from: e */
    public final long f79446e;

    public gfr(qcr qcrVar, e261 e261Var, Set set, long j, long j2) {
        this.f79442a = qcrVar;
        this.f79443b = e261Var;
        this.f79444c = set;
        this.f79445d = j;
        this.f79446e = j2;
    }

    /* JADX INFO: renamed from: a */
    public static gfr m44638a(gfr gfrVar, qcr qcrVar, e261 e261Var, Set set, long j, long j2, int i) {
        if ((i & 1) != 0) {
            qcrVar = gfrVar.f79442a;
        }
        qcr qcrVar2 = qcrVar;
        if ((i & 2) != 0) {
            e261Var = gfrVar.f79443b;
        }
        e261 e261Var2 = e261Var;
        if ((i & 4) != 0) {
            set = gfrVar.f79444c;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            j = gfrVar.f79445d;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = gfrVar.f79446e;
        }
        gfrVar.getClass();
        return new gfr(qcrVar2, e261Var2, set2, j3, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfr)) {
            return false;
        }
        gfr gfrVar = (gfr) obj;
        return wj50.m88271j(this.f79442a, gfrVar.f79442a) && this.f79443b == gfrVar.f79443b && wj50.m88271j(this.f79444c, gfrVar.f79444c) && this.f79445d == gfrVar.f79445d && this.f79446e == gfrVar.f79446e;
    }

    public final int hashCode() {
        qcr qcrVar = this.f79442a;
        int iHashCode = (qcrVar == null ? 0 : qcrVar.hashCode()) * 31;
        e261 e261Var = this.f79443b;
        return Long.hashCode(this.f79446e) + dq60.m36605e(klh.m56830b((iHashCode + (e261Var != null ? e261Var.hashCode() : 0)) * 31, 31, this.f79444c), this.f79445d, 31);
    }
}
