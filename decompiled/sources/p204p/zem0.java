package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class zem0 implements tlm0 {

    /* JADX INFO: renamed from: a */
    public final rmm0 f282058a;

    /* JADX INFO: renamed from: b */
    public g940 f282059b;

    public zem0(rmm0 rmm0Var) {
        this.f282058a = rmm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m95986a(Set set, ibk ibkVar) {
        xem0 xem0Var;
        if (ibkVar instanceof xem0) {
            xem0Var = (xem0) ibkVar;
            int i = xem0Var.f260744d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xem0Var.f260744d = i - Integer.MIN_VALUE;
            } else {
                xem0Var = new xem0(this, ibkVar);
            }
        } else {
            xem0Var = new xem0(this, ibkVar);
        }
        Object objM48221p = xem0Var.f260742b;
        int i2 = xem0Var.f260744d;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((pqm0) it.next()).f180350a);
            }
            xem0Var.f260741a = set;
            xem0Var.f260744d = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(xem0Var));
            hqbVar.m48222q();
            try {
                this.f282059b = new g940(hqbVar, 5);
                hqbVar.mo42415l(new yem0(this, 0));
                k5k0 k5k0VarMo29880l = this.f282058a.mo29880l();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                k5k0VarMo29880l.m55458H0((String[]) Arrays.copyOf(strArr, strArr.length));
            } catch (Throwable th) {
                this.f282059b = null;
                hqbVar.resumeWith(new c6x0(th));
            }
            objM48221p = hqbVar.m48221p();
            yuk yukVar = yuk.f276404a;
            if (objM48221p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = xem0Var.f260741a;
            bga.m29073P(objM48221p);
        }
        Map map = (Map) objM48221p;
        Set set3 = set;
        int iM31820L = c95.m31820L(i6f.m49804T(set3, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : set3) {
            linkedHashMap.put(obj, wj50.m88271j(map.get(((pqm0) obj).f180350a), Boolean.TRUE) ? pnn0.f179442a : pnn0.f179443b);
        }
        return linkedHashMap;
    }

    @Override // p204p.tlm0
    /* JADX INFO: renamed from: b */
    public final boolean mo35686b(olm0 olm0Var) {
        if (!(olm0Var instanceof apn0)) {
            return false;
        }
        g940 g940Var = this.f282059b;
        if (g940Var != null) {
            g940Var.invoke(((apn0) olm0Var).f17988a);
        }
        this.f282059b = null;
        return true;
    }
}
