package p204p;

import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class uc90 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f228974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinkedHashMap f228975c;

    public /* synthetic */ uc90(niz nizVar, LinkedHashMap linkedHashMap, int i) {
        this.f228973a = i;
        this.f228974b = nizVar;
        this.f228975c = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:153:0x033f  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [p.mv01] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [p.ok01] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        tc90 tc90Var;
        v2s0 v2s0Var;
        pla1 pla1Var;
        pqm0 pqm0Var;
        Object next;
        xv01 xv01Var;
        LinkedHashMap linkedHashMap;
        Iterator it;
        ?? r23;
        LinkedHashMap linkedHashMap2;
        ?? SingletonList;
        ?? r13;
        Parcelable parcelable;
        hv01 hv01Var;
        ok01 ok01Var;
        LinkedHashMap linkedHashMap3;
        Iterator it2;
        ?? r24;
        LinkedHashMap linkedHashMap4;
        mv01 mv01Var;
        mv01 mv01VarM27269b;
        ?? r25;
        tua1 tua1Var;
        eua1 eua1Var;
        switch (this.f228973a) {
            case 0:
                if (fbkVar instanceof tc90) {
                    tc90Var = (tc90) fbkVar;
                    int i = tc90Var.f219046b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tc90Var.f219046b = i - Integer.MIN_VALUE;
                    } else {
                        tc90Var = new tc90(this, fbkVar);
                    }
                } else {
                    tc90Var = new tc90(this, fbkVar);
                }
                Object obj2 = tc90Var.f219045a;
                int i2 = tc90Var.f219046b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object obj3 = ((s6x0) obj).f206218a;
                    Throwable thM77348a = s6x0.m77348a(obj3);
                    if (thM77348a != null) {
                        Logger.m3967c(thM77348a, "Failed to load listening activity", new Object[0]);
                        obj3 = lau.f131415a;
                    }
                    ArrayList<nb90> arrayList = new ArrayList();
                    Iterator it3 = ((Iterable) obj3).iterator();
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        LinkedHashMap linkedHashMap5 = this.f228975c;
                        if (zHasNext) {
                            Object next2 = it3.next();
                            nb90 nb90Var = (nb90) next2;
                            mb90 mb90Var = nb90Var.f152221b;
                            if (mb90Var != null && mb90Var.f141840c && linkedHashMap5.containsKey(nb90Var.f152220a)) {
                                arrayList.add(next2);
                            }
                        } else {
                            ArrayList<pqm0> arrayList2 = new ArrayList();
                            for (nb90 nb90Var2 : arrayList) {
                                pla1 pla1Var2 = (pla1) kkc0.m56692e0(nb90Var2.f152220a, linkedHashMap5);
                                mb90 mb90Var2 = nb90Var2.f152221b;
                                wj50.m88279p(mb90Var2);
                                ro80 ro80VarM44508o = geg1.m44508o();
                                ro80VarM44508o.add(new pqm0(hyv.m49210j(mb90Var2.f141838a), pla1Var2));
                                String str = mb90Var2.f141839b;
                                if (str != null) {
                                    ro80VarM44508o.add(new pqm0(hyv.m49210j(str), pla1Var2));
                                }
                                j6f.m52564V(geg1.m44506m(ro80VarM44508o), arrayList2);
                            }
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                            for (pqm0 pqm0Var2 : arrayList2) {
                                String str2 = (String) pqm0Var2.f180350a;
                                Object objM75735i = linkedHashMap6.get(str2);
                                if (objM75735i == null) {
                                    objM75735i = rkh0.m75735i(str2, linkedHashMap6);
                                }
                                ((List) objM75735i).add((pla1) pqm0Var2.f180351b);
                            }
                            tc90Var.f219046b = 1;
                            Object objEmit = this.f228974b.emit(linkedHashMap6, tc90Var);
                            yuk yukVar = yuk.f276404a;
                            if (objEmit == yukVar) {
                                return yukVar;
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof v2s0) {
                    v2s0Var = (v2s0) fbkVar;
                    int i3 = v2s0Var.f236720b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v2s0Var.f236720b = i3 - Integer.MIN_VALUE;
                    } else {
                        v2s0Var = new v2s0(this, fbkVar);
                    }
                } else {
                    v2s0Var = new v2s0(this, fbkVar);
                }
                Object obj4 = v2s0Var.f236719a;
                int i4 = v2s0Var.f236720b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    ArrayList arrayList3 = new ArrayList();
                    for (fqx fqxVar : (List) obj) {
                        String str3 = (String) this.f228975c.get(fqxVar.f72300a);
                        if (str3 != null) {
                            eua1 eua1Var2 = (eua1) fqxVar.f72301b;
                            if (eua1Var2 != null) {
                                String str4 = eua1Var2.f62929a;
                                String str5 = eua1Var2.f62930b;
                                Iterator it4 = eua1Var2.f62933e.iterator();
                                if (it4.hasNext()) {
                                    next = it4.next();
                                    if (it4.hasNext()) {
                                        o340 o340Var = (o340) next;
                                        int i5 = o340Var.f161281c * o340Var.f161280b;
                                        do {
                                            Object next3 = it4.next();
                                            o340 o340Var2 = (o340) next3;
                                            int i6 = o340Var2.f161281c * o340Var2.f161280b;
                                            if (i5 < i6) {
                                                i5 = i6;
                                                next = next3;
                                            }
                                        } while (it4.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                o340 o340Var3 = (o340) next;
                                pla1Var = new pla1(str4, str5, eua1Var2.f62934f, o340Var3 != null ? o340Var3.f161279a : null);
                            } else {
                                pla1Var = null;
                            }
                            if (pla1Var == null) {
                                pqm0Var = null;
                            } else {
                                pqm0Var = new pqm0(str3, pla1Var);
                            }
                        } else {
                            pqm0Var = null;
                        }
                        if (pqm0Var != null) {
                            arrayList3.add(pqm0Var);
                        }
                    }
                    Map mapM56705r0 = kkc0.m56705r0(arrayList3);
                    v2s0Var.f236720b = 1;
                    Object objEmit2 = this.f228974b.emit(mapM56705r0, v2s0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof xv01) {
                    xv01Var = (xv01) fbkVar;
                    int i7 = xv01Var.f266239b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xv01Var.f266239b = i7 - Integer.MIN_VALUE;
                    } else {
                        xv01Var = new xv01(this, fbkVar);
                    }
                } else {
                    xv01Var = new xv01(this, fbkVar);
                }
                Object obj5 = xv01Var.f266238a;
                int i8 = xv01Var.f266239b;
                if (i8 == 0) {
                    bga.m29073P(obj5);
                    vv01 vv01Var = (vv01) obj;
                    ?? r3 = vv01Var.f245107a;
                    Object obj6 = vv01Var.f245108b;
                    Map map = vv01Var.f245109c;
                    LinkedHashMap linkedHashMap7 = vv01Var.f245110d;
                    LinkedHashMap linkedHashMap8 = vv01Var.f245111e;
                    int i9 = 10;
                    ArrayList arrayList4 = new ArrayList(i6f.m49804T(r3, 10));
                    Iterator it5 = r3.iterator();
                    ?? r5 = obj6;
                    while (it5.hasNext()) {
                        fqx fqxVar2 = (fqx) it5.next();
                        String str6 = fqxVar2.f72300a;
                        ktx ktxVar = fqxVar2.f72301b;
                        Set set = (Set) this.f228975c.get(str6);
                        lv01 lv01Var = (lv01) linkedHashMap8.get(str6);
                        xu01 xu01Var = (xu01) linkedHashMap7.get(str6);
                        Set set2 = set;
                        Object objM27270c = yu01.f276244a;
                        if (set2 == null || set2.isEmpty()) {
                            linkedHashMap = linkedHashMap8;
                            it = it5;
                            r23 = r5;
                            linkedHashMap2 = linkedHashMap7;
                            tv01 tv01Var = new tv01(fqxVar2.f72300a, (String) null, 6);
                            uy31 uy31Var = (uy31) ktxVar;
                            if (uy31Var != null) {
                                objM27270c = aw01.m27270c(uy31Var, null, lv01Var, xu01Var);
                            }
                            SingletonList = Collections.singletonList(new pqm0(tv01Var, objM27270c));
                        } else {
                            uy31 uy31Var2 = (uy31) ktxVar;
                            int iM31820L = c95.m31820L(i6f.m49804T(r5, i9));
                            if (iM31820L < 16) {
                                iM31820L = 16;
                            }
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap(iM31820L);
                            ?? r6 = r5;
                            for (fqx fqxVar3 : r5) {
                                String str7 = fqxVar3.f72300a;
                                cud cudVar = (cud) fqxVar3.f72301b;
                                if (cudVar == null) {
                                    linkedHashMap3 = linkedHashMap8;
                                    it2 = it5;
                                } else {
                                    bud budVar = cudVar.f42092a;
                                    linkedHashMap3 = linkedHashMap8;
                                    jsf1 jsf1Var = budVar.f31085b;
                                    float f = budVar.f31084a;
                                    it2 = it5;
                                    if (jsf1Var instanceof xtd) {
                                        String str8 = cudVar.f42093b;
                                        if (str8 != null && str8.length() != 0) {
                                            r25 = r6;
                                            xtd xtdVar = (xtd) jsf1Var;
                                            linkedHashMap4 = linkedHashMap7;
                                            hv01 hv01Var2 = new hv01(f, new cv01(xtdVar.f265842d, xtdVar.f265843e));
                                            String str9 = cudVar.f42093b;
                                            String str10 = cudVar.f42094c;
                                            uy31Var2 = uy31Var2;
                                            mv01VarM27269b = aw01.m27269b(uy31Var2, hv01Var2, str9, str10, lv01Var, xu01Var);
                                            lv01Var = lv01Var;
                                            xu01Var = xu01Var;
                                        }
                                    } else {
                                        r24 = r6;
                                        linkedHashMap4 = linkedHashMap7;
                                        mv01Var = null;
                                        if (jsf1Var instanceof ytd) {
                                            hv01 hv01Var3 = new hv01(f, new dv01(((ytd) jsf1Var).f276097d));
                                            String str11 = cudVar.f42093b;
                                            String str12 = cudVar.f42094c;
                                            uy31Var2 = uy31Var2;
                                            mv01VarM27269b = aw01.m27269b(uy31Var2, hv01Var3, str11, str12, lv01Var, xu01Var);
                                            r25 = r24;
                                        } else if (jsf1Var instanceof aud) {
                                            hv01 hv01Var4 = new hv01(f, new fv01(((aud) jsf1Var).f19915d));
                                            String str13 = cudVar.f42093b;
                                            String str14 = cudVar.f42094c;
                                            uy31Var2 = uy31Var2;
                                            mv01VarM27269b = aw01.m27269b(uy31Var2, hv01Var4, str13, str14, lv01Var, xu01Var);
                                            r25 = r24;
                                        } else {
                                            if (!jsf1Var.equals(ztd.f286139d)) {
                                                r25 = r24;
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            r25 = r24;
                                            mv01VarM27269b = mv01Var;
                                        }
                                        lv01Var = lv01Var;
                                        xu01Var = xu01Var;
                                    }
                                    linkedHashMap9.put(str7, mv01VarM27269b);
                                    lv01Var = lv01Var;
                                    xu01Var = xu01Var;
                                    uy31Var2 = uy31Var2;
                                    linkedHashMap8 = linkedHashMap3;
                                    it5 = it2;
                                    r6 = r25;
                                    linkedHashMap7 = linkedHashMap4;
                                }
                                r25 = r6;
                                linkedHashMap4 = linkedHashMap7;
                                mv01Var = null;
                                r25 = r24;
                                mv01VarM27269b = mv01Var;
                                linkedHashMap9.put(str7, mv01VarM27269b);
                                lv01Var = lv01Var;
                                xu01Var = xu01Var;
                                uy31Var2 = uy31Var2;
                                linkedHashMap8 = linkedHashMap3;
                                it5 = it2;
                                r6 = r25;
                                linkedHashMap7 = linkedHashMap4;
                            }
                            linkedHashMap = linkedHashMap8;
                            it = it5;
                            r23 = r6;
                            linkedHashMap2 = linkedHashMap7;
                            uy31 uy31Var3 = uy31Var2;
                            lv01 lv01Var2 = lv01Var;
                            xu01 xu01Var2 = xu01Var;
                            hv01 hv01Var5 = null;
                            Set<tv01> set3 = set;
                            SingletonList = new ArrayList(i6f.m49804T(set3, 10));
                            for (tv01 tv01Var2 : set3) {
                                String str15 = tv01Var2.f224021b;
                                ?? r12 = str15 != null ? (mv01) linkedHashMap9.get(str15) : hv01Var5;
                                String str16 = tv01Var2.f224022c;
                                if (str16 != null) {
                                    ok01Var = (ok01) map.get(str16);
                                } else {
                                    r13 = hv01Var5;
                                }
                                if (r12 == 0 || (hv01Var = r12.f147475c) == null) {
                                    r13 = ok01Var;
                                    r13 = ok01Var;
                                    parcelable = hv01Var5;
                                } else {
                                    r13 = ok01Var;
                                    parcelable = hv01Var.f95521b;
                                }
                                ?? iv01Var = r12;
                                iv01Var = r12;
                                if (parcelable instanceof cv01) {
                                    if (uy31Var3 != null) {
                                        hv01 hv01Var6 = r12.f147475c;
                                        if (hv01Var6 == null || !(hv01Var6.f95521b instanceof cv01)) {
                                            hv01Var6 = hv01Var5;
                                        }
                                        iv01Var = aw01.m27270c(uy31Var3, hv01Var6, lv01Var2, xu01Var2);
                                    }
                                } else if (r12 == 0) {
                                    Parcelable parcelableM27270c = uy31Var3 != null ? aw01.m27270c(uy31Var3, hv01Var5, lv01Var2, xu01Var2) : hv01Var5;
                                    iv01Var = parcelableM27270c == null ? objM27270c : parcelableM27270c;
                                }
                                if (r13 != 0) {
                                    iv01Var = new iv01(r13, iv01Var instanceof pv01 ? (pv01) iv01Var : null);
                                }
                                SingletonList.add(new pqm0(tv01Var2, iv01Var));
                                hv01Var5 = null;
                            }
                        }
                        arrayList4.add(SingletonList);
                        linkedHashMap8 = linkedHashMap;
                        it5 = it;
                        r5 = r23;
                        linkedHashMap7 = linkedHashMap2;
                        i9 = 10;
                    }
                    Map mapM56705r1 = kkc0.m56705r0(i6f.m49805U(arrayList4));
                    xv01Var.f266239b = 1;
                    Object objEmit3 = this.f228974b.emit(mapM56705r1, xv01Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof tua1) {
                    tua1Var = (tua1) fbkVar;
                    int i10 = tua1Var.f223808b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tua1Var.f223808b = i10 - Integer.MIN_VALUE;
                    } else {
                        tua1Var = new tua1(this, fbkVar);
                    }
                } else {
                    tua1Var = new tua1(this, fbkVar);
                }
                Object obj7 = tua1Var.f223807a;
                int i11 = tua1Var.f223808b;
                if (i11 == 0) {
                    bga.m29073P(obj7);
                    ArrayList arrayList5 = new ArrayList();
                    for (fqx fqxVar4 : (List) obj) {
                        String str17 = (String) this.f228975c.get(fqxVar4.f72300a);
                        pqm0 pqm0Var3 = null;
                        if (str17 != null && (eua1Var = (eua1) fqxVar4.f72301b) != null) {
                            pqm0Var3 = new pqm0(str17, eua1Var);
                        }
                        if (pqm0Var3 != null) {
                            arrayList5.add(pqm0Var3);
                        }
                    }
                    Map mapM56705r2 = kkc0.m56705r0(arrayList5);
                    tua1Var.f223808b = 1;
                    Object objEmit4 = this.f228974b.emit(mapM56705r2, tua1Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
        }
    }

    public /* synthetic */ uc90(niz nizVar, LinkedHashMap linkedHashMap, Object obj, int i) {
        this.f228973a = i;
        this.f228974b = nizVar;
        this.f228975c = linkedHashMap;
    }
}
