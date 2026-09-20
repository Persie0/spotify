package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ht9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94954a;

    /* JADX INFO: renamed from: b */
    public final Object f94955b;

    public /* synthetic */ ht9(Object obj, int i) {
        this.f94954a = i;
        this.f94955b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final Object m48574a(ibk ibkVar) {
        gt9 gt9Var;
        ifp0 ifp0Var;
        switch (this.f94954a) {
            case 0:
                if (ibkVar instanceof gt9) {
                    gt9Var = (gt9) ibkVar;
                    int i = gt9Var.f84108c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gt9Var.f84108c = i - Integer.MIN_VALUE;
                    } else {
                        gt9Var = new gt9(this, ibkVar);
                    }
                } else {
                    gt9Var = new gt9(this, ibkVar);
                }
                Object objM95177a = gt9Var.f84106a;
                int i2 = gt9Var.f84108c;
                if (i2 == 0) {
                    bga.m29073P(objM95177a);
                    z261 z261Var = (z261) this.f94955b;
                    gt9Var.f84108c = 1;
                    objM95177a = z261Var.m95177a(gt9Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM95177a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM95177a);
                }
                ArrayList<aes0> arrayList = ((oy51) objM95177a).f171672a;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (aes0 aes0Var : arrayList) {
                    String str = aes0Var.f14946b;
                    ArrayList<tds0> arrayList3 = aes0Var.f14947c;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                    for (tds0 tds0Var : arrayList3) {
                        arrayList4.add(new xb6(tds0Var.f219474b, tds0Var.f219475c));
                    }
                    arrayList2.add(new wb6(str, arrayList4));
                }
                return new yb6(arrayList2);
            default:
                if (ibkVar instanceof ifp0) {
                    ifp0Var = (ifp0) ibkVar;
                    int i3 = ifp0Var.f101802c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ifp0Var.f101802c = i3 - Integer.MIN_VALUE;
                    } else {
                        ifp0Var = new ifp0(this, ibkVar);
                    }
                } else {
                    ifp0Var = new ifp0(this, ibkVar);
                }
                Object objM76265d = ifp0Var.f101800a;
                int i4 = ifp0Var.f101802c;
                if (i4 == 0) {
                    bga.m29073P(objM76265d);
                    rqs0 rqs0Var = (rqs0) this.f94955b;
                    ifp0Var.f101802c = 1;
                    objM76265d = rqs0Var.m76265d(ifp0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM76265d == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76265d);
                }
                ?? r9 = ((c261) objM76265d).f33303a;
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(r9, 10));
                for (b261 b261Var : r9) {
                    String str2 = b261Var.f22507a;
                    ArrayList<String> arrayList6 = b261Var.f22508b;
                    ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                    for (String str3 : arrayList6) {
                        arrayList7.add(new xb6(str3, str3));
                    }
                    arrayList5.add(new wb6(str2, arrayList7));
                }
                return new yb6(arrayList5);
        }
    }
}
