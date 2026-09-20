package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class fxp0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f74411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sxp0 f74412c;

    public /* synthetic */ fxp0(niz nizVar, sxp0 sxp0Var, int i) {
        this.f74410a = i;
        this.f74411b = nizVar;
        this.f74412c = sxp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        exp0 exp0Var;
        hxp0 hxp0Var;
        switch (this.f74410a) {
            case 0:
                if (fbkVar instanceof exp0) {
                    exp0Var = (exp0) fbkVar;
                    int i = exp0Var.f63815b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        exp0Var.f63815b = i - Integer.MIN_VALUE;
                    } else {
                        exp0Var = new exp0(this, fbkVar);
                    }
                } else {
                    exp0Var = new exp0(this, fbkVar);
                }
                Object obj2 = exp0Var.f63814a;
                int i2 = exp0Var.f63815b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (vco vcoVar : (List) obj) {
                        sxp0 sxp0Var = this.f74412c;
                        String strM79665c = sxp0Var.m79665c(vcoVar);
                        LinkedHashMap linkedHashMap = sxp0Var.f214972n;
                        if (linkedHashMap == null) {
                            wj50.m88260d0("rowElements");
                            throw null;
                        }
                        ry8 ry8Var = (ry8) linkedHashMap.get(strM79665c);
                        izd1 izd1Var = ry8Var instanceof izd1 ? (izd1) ry8Var : null;
                        lho lhoVarMo28634a = izd1Var != null ? izd1Var.getData().mo28634a(vcoVar) : null;
                        if (lhoVarMo28634a != null) {
                            arrayList.add(lhoVarMo28634a);
                        }
                    }
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    exp0Var.f63815b = 1;
                    Object objEmit = this.f74411b.emit(setM43736n1, exp0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof hxp0) {
                    hxp0Var = (hxp0) fbkVar;
                    int i3 = hxp0Var.f96262b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hxp0Var.f96262b = i3 - Integer.MIN_VALUE;
                    } else {
                        hxp0Var = new hxp0(this, fbkVar);
                    }
                } else {
                    hxp0Var = new hxp0(this, fbkVar);
                }
                Object obj3 = hxp0Var.f96261a;
                int i4 = hxp0Var.f96262b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        km51 km51VarM95598r = z8g1.m95598r((vco) it.next());
                        ArrayList arrayList3 = this.f74412c.f214964f;
                        ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((ivt) ((dyp0) it2.next()).f54428b).mo39927c().mo25659a().mo28634a(km51VarM95598r));
                        }
                        j6f.m52564V(arrayList4, arrayList2);
                    }
                    Set setM43736n2 = g6f.m43736n1(arrayList2);
                    hxp0Var.f96262b = 1;
                    Object objEmit2 = this.f74411b.emit(setM43736n2, hxp0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
