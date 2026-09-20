package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r630 extends djc {
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
                xu41Var.m92121b(it.next()).m84804p();
            }
        }
        v6j v6jVar = null;
        v6j v6jVar2 = null;
        for (Object obj : arrayList) {
            v6j v6jVarM92121b = xu41Var.m92121b(obj);
            if (v6jVar2 == null) {
                Object obj2 = this.f237863N;
                if (obj2 != null) {
                    v6jVarM92121b.m84783P(obj2);
                    v6jVarM92121b.mo54625y(this.f237897l).m84768A(this.f237903r);
                } else {
                    Object obj3 = this.f237864O;
                    if (obj3 != null) {
                        v6jVarM92121b.f237895j0 = 6;
                        v6jVarM92121b.f237864O = obj3;
                        v6jVarM92121b.mo54625y(this.f237897l).m84768A(this.f237903r);
                    } else {
                        Object obj4 = this.f237859J;
                        if (obj4 != null) {
                            v6jVarM92121b.m84783P(obj4);
                            v6jVarM92121b.mo54625y(this.f237894j).m84768A(this.f237901p);
                        } else {
                            Object obj5 = this.f237860K;
                            if (obj5 != null) {
                                v6jVarM92121b.f237895j0 = 6;
                                v6jVarM92121b.f237864O = obj5;
                                v6jVarM92121b.mo54625y(this.f237894j).m84768A(this.f237901p);
                            } else {
                                String string = v6jVarM92121b.f237876a.toString();
                                v6jVarM92121b.m84783P(0);
                                v6jVarM92121b.mo54626z(Float.valueOf(m36186f0(string))).m84769B(Float.valueOf(m36185e0(string)));
                            }
                        }
                    }
                }
                v6jVar2 = v6jVarM92121b;
            }
            if (v6jVar != null) {
                String string2 = v6jVar.f237876a.toString();
                String string3 = v6jVarM92121b.f237876a.toString();
                Object obj6 = v6jVarM92121b.f237876a;
                v6jVar.f237895j0 = 7;
                v6jVar.f237865P = obj6;
                v6jVar.mo54626z(Float.valueOf(m36184d0(string2))).m84769B(Float.valueOf(m36183c0(string2)));
                Object obj7 = v6jVar.f237876a;
                v6jVarM92121b.f237895j0 = 6;
                v6jVarM92121b.f237864O = obj7;
                v6jVarM92121b.mo54626z(Float.valueOf(m36186f0(string3))).m84769B(Float.valueOf(m36185e0(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.f49648o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                v6jVarM92121b.f237886f = fFloatValue;
            }
            v6jVar = v6jVarM92121b;
        }
        if (v6jVar != null) {
            Object obj8 = this.f237865P;
            if (obj8 != null) {
                v6jVar.f237895j0 = 7;
                v6jVar.f237865P = obj8;
                v6jVar.mo54625y(this.f237898m).m84768A(this.f237904s);
            } else {
                Object obj9 = this.f237866Q;
                if (obj9 != null) {
                    v6jVar.m84806r(obj9);
                    v6jVar.mo54625y(this.f237898m).m84768A(this.f237904s);
                } else {
                    Object obj10 = this.f237861L;
                    if (obj10 != null) {
                        v6jVar.f237895j0 = 7;
                        v6jVar.f237865P = obj10;
                        v6jVar.mo54625y(this.f237896k).m84768A(this.f237902q);
                    } else {
                        Object obj11 = this.f237862M;
                        if (obj11 != null) {
                            v6jVar.m84806r(obj11);
                            v6jVar.mo54625y(this.f237896k).m84768A(this.f237902q);
                        } else {
                            String string5 = v6jVar.f237876a.toString();
                            v6jVar.m84806r(0);
                            v6jVar.mo54626z(Float.valueOf(m36184d0(string5))).m84769B(Float.valueOf(m36183c0(string5)));
                        }
                    }
                }
            }
        }
        if (v6jVar2 == null) {
            return;
        }
        float f = this.f49647n0;
        if (f != 0.5f) {
            v6jVar2.f237890h = f;
        }
        int iOrdinal = this.f49653t0.ordinal();
        if (iOrdinal == 0) {
            v6jVar2.f237882d = 0;
        } else if (iOrdinal == 1) {
            v6jVar2.f237882d = 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            v6jVar2.f237882d = 2;
        }
    }
}
