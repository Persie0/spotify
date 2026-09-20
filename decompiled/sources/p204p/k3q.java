package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class k3q {

    /* JADX INFO: renamed from: a */
    public final er70 f118954a;

    /* JADX INFO: renamed from: b */
    public final er70 f118955b;

    /* JADX INFO: renamed from: c */
    public final er70 f118956c;

    /* JADX INFO: renamed from: d */
    public final Object f118957d = kkc0.m56695h0(new pqm0(r4t0.f195845b, 0), new pqm0(r4t0.f195846c, 1), new pqm0(r4t0.f195844a, 2), new pqm0(r4t0.f195847d, 3));

    public k3q(er70 er70Var, er70 er70Var2, er70 er70Var3) {
        this.f118954a = er70Var;
        this.f118955b = er70Var2;
        this.f118956c = er70Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m55278a(k3q k3qVar, List list, ibk ibkVar) {
        j3q j3qVar;
        if (ibkVar instanceof j3q) {
            j3qVar = (j3q) ibkVar;
            int i = j3qVar.f108457d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j3qVar.f108457d = i - Integer.MIN_VALUE;
            } else {
                j3qVar = new j3q(k3qVar, ibkVar);
            }
        } else {
            j3qVar = new j3q(k3qVar, ibkVar);
        }
        Object objM89557A = j3qVar.f108455b;
        int i2 = j3qVar.f108457d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            edp edpVar = (edp) k3qVar.f118955b.get();
            Map map = edpVar.f58553b;
            Iterator it = ((Iterable) edpVar.f58552a.get()).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                ((fwi) next).getClass();
                xbr xbrVar = xbr.f259983a;
                Integer num = (Integer) map.get(xbrVar);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                do {
                    Object next2 = it.next();
                    ((fwi) next2).getClass();
                    Integer num2 = (Integer) map.get(xbrVar);
                    int iIntValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            fwi fwiVar = (fwi) next;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((er50) it2.next()).f62022a);
            }
            j3qVar.f108454a = list;
            j3qVar.f108457d = 1;
            objM89557A = x0h1.m89557A(fwiVar.f74071d, new dze(arrayList, fwiVar, null, 22), j3qVar);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = j3qVar.f108454a;
            bga.m29073P(objM89557A);
        }
        co40 co40VarM43744r1 = g6f.m43744r1((List) objM89557A);
        int iM31820L = c95.m31820L(i6f.m49804T(co40VarM43744r1, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        Iterator it3 = co40VarM43744r1.iterator();
        while (true) {
            do40 do40Var = (do40) it3;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                return g6f.m43711Y0(list, new i3q(0, linkedHashMap));
            }
            bo40 bo40Var = (bo40) do40Var.next();
            linkedHashMap.put((String) bo40Var.f29009b, new Integer(bo40Var.f29008a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final nnc m55279b() {
        Iterable iterable = (Iterable) this.f118954a.get();
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            fbk fbkVar = null;
            if (!it.hasNext()) {
                return xtm0.m92074U(new nmp(7, (fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), this), new eud(fbkVar, this, 18));
            }
            v9r v9rVar = (v9r) it.next();
            arrayList.add(new vjz(new nmp(5, v9rVar.mo26952b(), v9rVar), new f3q(2, 0, fbkVar)));
        }
    }
}
