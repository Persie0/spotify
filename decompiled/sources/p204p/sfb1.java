package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sfb1 extends djc {
    @Override // p204p.hq20, p204p.v6j, p204p.ulv0, p204p.e6y
    public final void apply() {
        xu41 xu41Var;
        ArrayList arrayList = this.f94003m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            xu41Var = this.f94001k0;
            if (!zHasNext) {
                break;
            } else {
                xu41Var.m92121b(it.next()).m84805q();
            }
        }
        v6j v6jVar = null;
        v6j v6jVar2 = null;
        for (Object obj : arrayList) {
            v6j v6jVarM92121b = xu41Var.m92121b(obj);
            if (v6jVar2 == null) {
                Object obj2 = this.f237867R;
                if (obj2 != null) {
                    v6jVarM92121b.m84786S(obj2);
                    v6jVarM92121b.mo54625y(this.f237899n).m84768A(this.f237905t);
                } else {
                    Object obj3 = this.f237868S;
                    if (obj3 != null) {
                        v6jVarM92121b.m84785R(obj3);
                        v6jVarM92121b.mo54625y(this.f237899n).m84768A(this.f237905t);
                    } else {
                        String string = v6jVarM92121b.f237876a.toString();
                        v6jVarM92121b.m84786S(0);
                        v6jVarM92121b.mo54626z(Float.valueOf(m36186f0(string))).m84769B(Float.valueOf(m36185e0(string)));
                    }
                }
                v6jVar2 = v6jVarM92121b;
            }
            if (v6jVar != null) {
                String string2 = v6jVar.f237876a.toString();
                String string3 = v6jVarM92121b.f237876a.toString();
                v6jVar.m84801m(v6jVarM92121b.f237876a);
                v6jVar.mo54626z(Float.valueOf(m36184d0(string2))).m84769B(Float.valueOf(m36183c0(string2)));
                v6jVarM92121b.m84785R(v6jVar.f237876a);
                v6jVarM92121b.mo54626z(Float.valueOf(m36186f0(string3))).m84769B(Float.valueOf(m36185e0(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f49648o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                v6jVarM92121b.f237888g = fFloatValue;
            }
            v6jVar = v6jVarM92121b;
        }
        if (v6jVar != null) {
            Object obj4 = this.f237870U;
            if (obj4 != null) {
                v6jVar.m84801m(obj4);
                v6jVar.mo54625y(this.f237900o).m84768A(this.f237906u);
            } else {
                Object obj5 = this.f237871V;
                if (obj5 != null) {
                    v6jVar.m84800l(obj5);
                    v6jVar.mo54625y(this.f237900o).m84768A(this.f237906u);
                } else {
                    String string5 = v6jVar.f237876a.toString();
                    v6jVar.m84800l(0);
                    v6jVar.mo54626z(Float.valueOf(m36184d0(string5))).m84769B(Float.valueOf(m36183c0(string5)));
                }
            }
        }
        if (v6jVar2 == null) {
            return;
        }
        float f = this.f49647n0;
        if (f != 0.5f) {
            v6jVar2.f237892i = f;
        }
        int iOrdinal = this.f49653t0.ordinal();
        if (iOrdinal == 0) {
            v6jVar2.f237884e = 0;
        } else if (iOrdinal == 1) {
            v6jVar2.f237884e = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            v6jVar2.f237884e = 2;
        }
    }
}
