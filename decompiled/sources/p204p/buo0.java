package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class buo0 {

    /* JADX INFO: renamed from: a */
    public final n5f f31181a;

    /* JADX INFO: renamed from: b */
    public final xr9 f31182b;

    /* JADX INFO: renamed from: c */
    public final vmx f31183c;

    /* JADX INFO: renamed from: d */
    public final ron0 f31184d;

    /* JADX INFO: renamed from: e */
    public final epx f31185e;

    /* JADX INFO: renamed from: f */
    public final qwx0 f31186f;

    public buo0(n5f n5fVar, xr9 xr9Var, vmx vmxVar, ron0 ron0Var, epx epxVar, qwx0 qwx0Var) {
        this.f31181a = n5fVar;
        this.f31182b = xr9Var;
        this.f31183c = vmxVar;
        this.f31184d = ron0Var;
        this.f31185e = epxVar;
        this.f31186f = qwx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m30577a(buo0 buo0Var, ArrayList arrayList, ibk ibkVar) {
        wto0 wto0Var;
        if (ibkVar instanceof wto0) {
            wto0Var = (wto0) ibkVar;
            int i = wto0Var.f254993c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wto0Var.f254993c = i - Integer.MIN_VALUE;
            } else {
                wto0Var = new wto0(buo0Var, ibkVar);
            }
        } else {
            wto0Var = new wto0(buo0Var, ibkVar);
        }
        Object objM76073a = wto0Var.f254991a;
        int i2 = wto0Var.f254993c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76073a);
                ron0 ron0Var = buo0Var.f31184d;
                wto0Var.f254993c = 1;
                objM76073a = ron0.m76073a(ron0Var, arrayList, "PlayabilityStateProvider", wto0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76073a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76073a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (List) objM76073a) {
                if (((pob) obj).f179664b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((pob) it.next()).f179663a);
            }
            return g6f.m43736n1(arrayList3);
        } catch (Exception unused) {
            return gbu.f78413a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final nnc m30578b(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            gf41 gf41Var = new gf41((String) obj);
            df41 df41Var = df41.SHOW;
            df41 df41Var2 = gf41Var.f79270c;
            if (df41Var2 == df41Var || df41Var2 == df41.TRACK) {
                arrayList.add(obj);
            }
        }
        Set setM43736n1 = g6f.m43736n1(arrayList);
        return xtm0.m92074U(mvl0.m62953p(new vdm0(k0e1.m54985d(((rwx0) this.f31186f).f203428a), 5)), new g1i(3, this, setM43736n1, set, s601.m77305h0(set, setM43736n1), null));
    }
}
