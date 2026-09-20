package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hux0 {

    /* JADX INFO: renamed from: a */
    public lud1 f95482a;

    /* JADX INFO: renamed from: b */
    public ArrayList f95483b;

    /* JADX INFO: renamed from: a */
    public static long m48700a(ftq ftqVar, long j) {
        lud1 lud1Var = ftqVar.f73268d;
        ArrayList arrayList = ftqVar.f73275k;
        if (lud1Var instanceof iq20) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ctq ctqVar = (ctq) arrayList.get(i);
            if (ctqVar instanceof ftq) {
                ftq ftqVar2 = (ftq) ctqVar;
                if (ftqVar2.f73268d != lud1Var) {
                    jMin = Math.min(jMin, m48700a(ftqVar2, ((long) ftqVar2.f73270f) + j));
                }
            }
        }
        ftq ftqVar3 = lud1Var.f137069i;
        ftq ftqVar4 = lud1Var.f137068h;
        if (ftqVar != ftqVar3) {
            return jMin;
        }
        long jMo39171j = j - lud1Var.mo39171j();
        return Math.min(Math.min(jMin, m48700a(ftqVar4, jMo39171j)), jMo39171j - ((long) ftqVar4.f73270f));
    }

    /* JADX INFO: renamed from: b */
    public static long m48701b(ftq ftqVar, long j) {
        lud1 lud1Var = ftqVar.f73268d;
        ArrayList arrayList = ftqVar.f73275k;
        if (lud1Var instanceof iq20) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ctq ctqVar = (ctq) arrayList.get(i);
            if (ctqVar instanceof ftq) {
                ftq ftqVar2 = (ftq) ctqVar;
                if (ftqVar2.f73268d != lud1Var) {
                    jMax = Math.max(jMax, m48701b(ftqVar2, ((long) ftqVar2.f73270f) + j));
                }
            }
        }
        ftq ftqVar3 = lud1Var.f137068h;
        ftq ftqVar4 = lud1Var.f137069i;
        if (ftqVar != ftqVar3) {
            return jMax;
        }
        long jMo39171j = lud1Var.mo39171j() + j;
        return Math.max(Math.max(jMax, m48701b(ftqVar4, jMo39171j)), jMo39171j - ((long) ftqVar4.f73270f));
    }
}
