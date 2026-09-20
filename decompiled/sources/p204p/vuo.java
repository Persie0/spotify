package p204p;

import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vuo {

    /* JADX INFO: renamed from: a */
    public final i4t0 f245033a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f245034b;

    public vuo(i4t0 i4t0Var, ron ronVar) {
        this.f245033a = i4t0Var;
        this.f245034b = ronVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m86439b(InterfaceC2415th interfaceC2415th) {
        C1742ci c1742ci = (C1742ci) interfaceC2415th;
        if (wj50.m88271j(c1742ci.f38164g, Boolean.TRUE)) {
            return;
        }
        Logger.m3973i(edb.m38564m("Attempted to update last active accessory with inactive state: ", c1742ci.f38159b), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Serializable m86440a(List list, grb0 grb0Var, ibk ibkVar) {
        tuo tuoVar;
        List<InterfaceC2415th> list2;
        Object objM45479b;
        EnumC2166nj enumC2166nj;
        boolean z;
        grb0 grb0Var2 = grb0Var;
        if (ibkVar instanceof tuo) {
            tuoVar = (tuo) ibkVar;
            int i = tuoVar.f223890e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tuoVar.f223890e = i - Integer.MIN_VALUE;
            } else {
                tuoVar = new tuo(this, ibkVar);
            }
        } else {
            tuoVar = new tuo(this, ibkVar);
        }
        Object obj = tuoVar.f223888c;
        int i2 = tuoVar.f223890e;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (Build.VERSION.SDK_INT >= 34) {
                list2 = list;
                tuoVar.f223886a = list2;
                tuoVar.f223887b = grb0Var2;
                tuoVar.f223890e = 1;
                objM45479b = grb0Var2.m45479b(tuoVar);
                yuk yukVar = yuk.f276404a;
                if (objM45479b == yukVar) {
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        grb0Var2 = tuoVar.f223887b;
        List list3 = tuoVar.f223886a;
        bga.m29073P(obj);
        objM45479b = obj;
        list2 = list3;
        if (((Boolean) objM45479b).booleanValue()) {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C1742ci.m32822c((C1742ci) ((InterfaceC2415th) it.next()), null, null, null, null, qyg1.m74178H(false), null, null, 223));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            enumC2166nj = EnumC2166nj.f154400a;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            if (((C1742ci) ((InterfaceC2415th) next)).f38166i.m74363b(enumC2166nj)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
            for (InterfaceC2415th interfaceC2415thM32822c : list2) {
                C1742ci c1742ci = (C1742ci) interfaceC2415thM32822c;
                Boolean bool = c1742ci.f38164g;
                r040 r040Var = c1742ci.f38166i;
                List list4 = r040Var.f194381a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list4) {
                    if (((xe21) obj2).f260619a == enumC2166nj) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList4.toString();
                if (!arrayList4.isEmpty()) {
                    List list5 = r040Var.f194381a;
                    if (list5 != null && list5.isEmpty()) {
                        z = false;
                        break;
                    }
                    Iterator it3 = list5.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        String str = ((xe21) it3.next()).f260620b;
                        if (str != null && grb0Var2.m45478a(str, c1742ci.m32823b())) {
                            z = true;
                            break;
                        }
                    }
                    C1742ci c1742ci2 = (C1742ci) interfaceC2415thM32822c;
                    if (wj50.m88271j(c1742ci2.f38164g, Boolean.valueOf(z))) {
                        interfaceC2415thM32822c = c1742ci2;
                    } else {
                        interfaceC2415thM32822c = C1742ci.m32822c(c1742ci2, null, null, null, null, Boolean.valueOf(z), null, null, 223);
                        if (z) {
                            m86439b(interfaceC2415thM32822c);
                        }
                    }
                }
                arrayList3.add(interfaceC2415thM32822c);
            }
            return arrayList3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0276  */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d5 A[LOOP:5: B:128:0x02cf->B:130:0x02d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:137:0x030e A[LOOP:6: B:135:0x0308->B:137:0x030e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0328  */
    /* JADX WARN: Code duplicated, block: B:143:0x033c  */
    /* JADX WARN: Code duplicated, block: B:149:0x034a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0374  */
    /* JADX WARN: Code duplicated, block: B:154:0x0380  */
    /* JADX WARN: Code duplicated, block: B:155:0x0382  */
    /* JADX WARN: Code duplicated, block: B:157:0x0397  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:166:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:4: B:121:0x02a2->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0346 A[EDGE_INSN: B:191:0x0346->B:147:0x0346 BREAK  A[LOOP:7: B:139:0x0322->B:192:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x024e  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x0397, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [p.vuo] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public final Object m86441c(List list, ibk ibkVar) {
        uuo uuoVar;
        EnumC2166nj enumC2166nj;
        ?? arrayList;
        Serializable serializableM86440a;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        Set setM43736n1;
        Iterator it2;
        Object next;
        InterfaceC2415th interfaceC2415th;
        C1742ci c1742ciM32822c;
        C1742ci c1742ciM32822c2;
        Set set;
        C1742ci c1742ci;
        Iterator it3;
        Iterator it4;
        int i;
        Object obj;
        List<InterfaceC2415th> list2 = list;
        if (ibkVar instanceof uuo) {
            uuoVar = (uuo) ibkVar;
            int i2 = uuoVar.f234229d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uuoVar.f234229d = i2 - Integer.MIN_VALUE;
            } else {
                uuoVar = new uuo(this, ibkVar);
            }
        } else {
            uuoVar = new uuo(this, ibkVar);
        }
        Object obj2 = uuoVar.f234227b;
        int i3 = uuoVar.f234229d;
        ArrayList arrayList6 = null;
        Object obj3 = null;
        arrayList6 = null;
        if (i3 == 0) {
            bga.m29073P(obj2);
            list2.size();
            list2.toString();
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (true) {
                boolean zHasNext = it5.hasNext();
                enumC2166nj = EnumC2166nj.f154404e;
                if (!zHasNext) {
                    break;
                }
                Object next2 = it5.next();
                if (((C1742ci) ((InterfaceC2415th) next2)).f38166i.m74363b(enumC2166nj)) {
                    arrayList7.add(next2);
                }
            }
            if (arrayList7.isEmpty()) {
                arrayList7 = null;
            }
            if (arrayList7 != null) {
                if (arrayList7.isEmpty()) {
                    throw new IllegalArgumentException("Car accessories list cannot be empty");
                }
                if (arrayList7.size() > 1) {
                    na6.m63957e("Multiple car accessories found: " + arrayList7);
                }
                ro80 ro80VarM44508o = geg1.m44508o();
                C1742ci c1742ciM32822c3 = C1742ci.m32822c((C1742ci) g6f.m43741q0(arrayList7), null, null, null, null, Boolean.TRUE, null, null, 223);
                m86439b(c1742ciM32822c3);
                ro80VarM44508o.add(c1742ciM32822c3);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!((C1742ci) ((InterfaceC2415th) obj4)).f38166i.m74363b(enumC2166nj)) {
                        arrayList8.add(obj4);
                    }
                }
                ArrayList arrayList9 = new ArrayList(i6f.m49804T(arrayList8, 10));
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    arrayList9.add(C1742ci.m32822c((C1742ci) ((InterfaceC2415th) it6.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                }
                ro80VarM44508o.addAll(arrayList9);
                ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                Objects.toString(ro80VarM44506m);
                return ro80VarM44506m;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                arrayList = 0;
            } else {
                ArrayList arrayList10 = new ArrayList();
                for (Object obj5 : list2) {
                    if (((C1742ci) ((InterfaceC2415th) obj5)).f38166i.m74363b(EnumC2166nj.f154401b)) {
                        arrayList10.add(obj5);
                    }
                }
                arrayList10.size();
                arrayList10.toString();
                ArrayList arrayList11 = new ArrayList();
                for (Object obj6 : arrayList10) {
                    if (wj50.m88271j(((C1742ci) ((InterfaceC2415th) obj6)).f38164g, Boolean.TRUE)) {
                        arrayList11.add(obj6);
                    }
                }
                int size = arrayList11.size();
                if (size != 0) {
                    if (size != 1) {
                        arrayList11.size();
                    } else {
                        InterfaceC2415th interfaceC2415th2 = (InterfaceC2415th) g6f.m43741q0(arrayList11);
                        if (list2.size() == 1) {
                            Objects.toString(interfaceC2415th2);
                            m86439b(interfaceC2415th2);
                            arrayList = list2;
                        } else {
                            list2.size();
                            Objects.toString(interfaceC2415th2);
                        }
                    }
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(i6f.m49804T(list2, 10));
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(C1742ci.m32822c((C1742ci) ((InterfaceC2415th) it7.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                    }
                }
            }
            if (arrayList != 0) {
                return arrayList;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                grb0 grb0Var = (grb0) this.f245033a.get();
                uuoVar.f234226a = list2;
                uuoVar.f234229d = 1;
                serializableM86440a = m86440a(list2, grb0Var, uuoVar);
                yuk yukVar = yuk.f276404a;
                if (serializableM86440a == yukVar) {
                    obj = serializableM86440a;
                    return yukVar;
                }
            }
            ArrayList arrayListM26885d = ((aqp) this.f245034b.get()).m26885d();
            arrayList2 = new ArrayList();
            for (Object obj7 : arrayListM26885d) {
                if (((rmx0) obj7).f200648n) {
                    arrayList2.add(obj7);
                }
            }
            arrayList2.size();
            arrayList2.toString();
            arrayList3 = new ArrayList();
            for (Object obj8 : arrayList2) {
                if (((Boolean) ((rmx0) obj8).f200650p.getValue()).booleanValue()) {
                    arrayList3.add(obj8);
                }
            }
            arrayList4 = new ArrayList();
            for (Object obj9 : arrayList3) {
                i = ((rmx0) obj9).f200639e;
                if (i != 3 || i == 22 || i == 13 || i == 14 || i == 20) {
                    arrayList4.add(obj9);
                }
            }
            if (arrayList3.isEmpty()) {
                it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        if (((Boolean) ((rmx0) it3.next()).f200649o.getValue()).booleanValue()) {
                            if (arrayList4.isEmpty()) {
                                arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                                it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList6.add(C1742ci.m32822c((C1742ci) ((InterfaceC2415th) it4.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList4.toString();
                        arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(((rmx0) it.next()).f200636b);
                        }
                        setM43736n1 = g6f.m43736n1(arrayList5);
                        it2 = list2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            set = setM43736n1;
                            c1742ci = (C1742ci) ((InterfaceC2415th) next);
                            if (!g6f.m43725i0(set, c1742ci.f38159b)) {
                                break;
                                break;
                            }
                        } while (!g6f.m43725i0(set, c1742ci.f38160c));
                        interfaceC2415th = (InterfaceC2415th) next;
                        if (interfaceC2415th != null) {
                            interfaceC2415th.toString();
                            c1742ciM32822c = C1742ci.m32822c((C1742ci) interfaceC2415th, null, null, null, null, Boolean.TRUE, null, null, 223);
                            m86439b(c1742ciM32822c);
                            arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                            for (InterfaceC2415th interfaceC2415th3 : list2) {
                                if (wj50.m88271j(interfaceC2415th3, interfaceC2415th)) {
                                    c1742ciM32822c2 = c1742ciM32822c;
                                } else {
                                    c1742ciM32822c2 = C1742ci.m32822c((C1742ci) interfaceC2415th3, null, null, null, null, Boolean.FALSE, null, null, 223);
                                }
                                arrayList6.add(c1742ciM32822c2);
                            }
                        } else {
                            Logger.m3966b("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list2, new Object[0]);
                        }
                    }
                }
            } else if (!arrayList4.isEmpty()) {
                arrayList4.toString();
                arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((rmx0) it.next()).f200636b);
                }
                setM43736n1 = g6f.m43736n1(arrayList5);
                it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    set = setM43736n1;
                    c1742ci = (C1742ci) ((InterfaceC2415th) next);
                    if (!g6f.m43725i0(set, c1742ci.f38159b)) {
                        break;
                    }
                } while (!g6f.m43725i0(set, c1742ci.f38160c));
                interfaceC2415th = (InterfaceC2415th) next;
                if (interfaceC2415th != null) {
                    interfaceC2415th.toString();
                    c1742ciM32822c = C1742ci.m32822c((C1742ci) interfaceC2415th, null, null, null, null, Boolean.TRUE, null, null, 223);
                    m86439b(c1742ciM32822c);
                    arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                    while (r3.hasNext()) {
                        if (wj50.m88271j(interfaceC2415th3, interfaceC2415th)) {
                            c1742ciM32822c2 = c1742ciM32822c;
                        } else {
                            c1742ciM32822c2 = C1742ci.m32822c((C1742ci) interfaceC2415th3, null, null, null, null, Boolean.FALSE, null, null, 223);
                        }
                        arrayList6.add(c1742ciM32822c2);
                    }
                } else {
                    Logger.m3966b("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list2, new Object[0]);
                }
            }
            if (arrayList6 != null) {
                return arrayList6;
            }
            Objects.toString(list2);
            return list2;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = uuoVar.f234226a;
        bga.m29073P(obj2);
        obj = obj2;
        obj = serializableM86440a;
        List list3 = (List) obj;
        if (list3 != null) {
            for (Object obj10 : list3) {
                if (wj50.m88271j(((C1742ci) ((InterfaceC2415th) obj10)).f38164g, qyg1.m74178H(true))) {
                    obj3 = obj10;
                    break;
                }
            }
            InterfaceC2415th interfaceC2415th4 = (InterfaceC2415th) obj3;
            if (interfaceC2415th4 != null) {
                m86439b(interfaceC2415th4);
            }
            return list3;
        }
        ArrayList arrayListM26885d2 = ((aqp) this.f245034b.get()).m26885d();
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            if (((rmx0) obj7).f200648n) {
                arrayList2.add(obj7);
            }
        }
        arrayList2.size();
        arrayList2.toString();
        arrayList3 = new ArrayList();
        while (r3.hasNext()) {
            if (((Boolean) ((rmx0) obj8).f200650p.getValue()).booleanValue()) {
                arrayList3.add(obj8);
            }
        }
        arrayList4 = new ArrayList();
        while (r4.hasNext()) {
            i = ((rmx0) obj9).f200639e;
            if (i != 3) {
            }
            arrayList4.add(obj9);
        }
        if (arrayList3.isEmpty()) {
            it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    if (((Boolean) ((rmx0) it3.next()).f200649o.getValue()).booleanValue()) {
                        if (arrayList4.isEmpty()) {
                            arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(C1742ci.m32822c((C1742ci) ((InterfaceC2415th) it4.next()), null, null, null, null, Boolean.FALSE, null, null, 223));
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList4.toString();
                    arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((rmx0) it.next()).f200636b);
                    }
                    setM43736n1 = g6f.m43736n1(arrayList5);
                    it2 = list2.iterator();
                    do {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        set = setM43736n1;
                        c1742ci = (C1742ci) ((InterfaceC2415th) next);
                        if (!g6f.m43725i0(set, c1742ci.f38159b)) {
                            break;
                            break;
                        }
                    } while (!g6f.m43725i0(set, c1742ci.f38160c));
                    interfaceC2415th = (InterfaceC2415th) next;
                    if (interfaceC2415th != null) {
                        interfaceC2415th.toString();
                        c1742ciM32822c = C1742ci.m32822c((C1742ci) interfaceC2415th, null, null, null, null, Boolean.TRUE, null, null, 223);
                        m86439b(c1742ciM32822c);
                        arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                        while (r3.hasNext()) {
                            if (wj50.m88271j(interfaceC2415th3, interfaceC2415th)) {
                                c1742ciM32822c2 = c1742ciM32822c;
                            } else {
                                c1742ciM32822c2 = C1742ci.m32822c((C1742ci) interfaceC2415th3, null, null, null, null, Boolean.FALSE, null, null, 223);
                            }
                            arrayList6.add(c1742ciM32822c2);
                        }
                    } else {
                        Logger.m3966b("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list2, new Object[0]);
                    }
                }
            }
        } else if (!arrayList4.isEmpty()) {
            arrayList4.toString();
            arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
            it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(((rmx0) it.next()).f200636b);
            }
            setM43736n1 = g6f.m43736n1(arrayList5);
            it2 = list2.iterator();
            do {
                if (it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                set = setM43736n1;
                c1742ci = (C1742ci) ((InterfaceC2415th) next);
                if (!g6f.m43725i0(set, c1742ci.f38159b)) {
                    break;
                    break;
                }
            } while (!g6f.m43725i0(set, c1742ci.f38160c));
            interfaceC2415th = (InterfaceC2415th) next;
            if (interfaceC2415th != null) {
                interfaceC2415th.toString();
                c1742ciM32822c = C1742ci.m32822c((C1742ci) interfaceC2415th, null, null, null, null, Boolean.TRUE, null, null, 223);
                m86439b(c1742ciM32822c);
                arrayList6 = new ArrayList(i6f.m49804T(list2, 10));
                while (r3.hasNext()) {
                    if (wj50.m88271j(interfaceC2415th3, interfaceC2415th)) {
                        c1742ciM32822c2 = c1742ciM32822c;
                    } else {
                        c1742ciM32822c2 = C1742ci.m32822c((C1742ci) interfaceC2415th3, null, null, null, null, Boolean.FALSE, null, null, 223);
                    }
                    arrayList6.add(c1742ciM32822c2);
                }
            } else {
                Logger.m3966b("AndroidX MediaRouter selected routes not in accessories list. Routes: " + arrayList4 + ", Accessories: " + list2, new Object[0]);
            }
        }
        if (arrayList6 != null) {
            return arrayList6;
        }
        Objects.toString(list2);
        return list2;
    }
}
