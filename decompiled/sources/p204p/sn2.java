package p204p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sn2 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f210778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f210779c;

    public /* synthetic */ sn2(niz nizVar, List list, int i) {
        this.f210777a = i;
        this.f210778b = nizVar;
        this.f210779c = list;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:129:0x028f  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x0335  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        rn2 rn2Var;
        String str;
        z240 z240VarM60640a;
        String str2;
        erc1 erc1Var;
        v140 v140Var;
        enp enpVar;
        ztv ztvVar;
        k480 k480Var;
        ArrayList arrayListM24675l;
        el90 el90Var;
        iuo0 iuo0Var;
        diu0 diu0Var;
        switch (this.f210777a) {
            case 0:
                if (fbkVar instanceof rn2) {
                    rn2Var = (rn2) fbkVar;
                    int i = rn2Var.f200702b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rn2Var.f200702b = i - Integer.MIN_VALUE;
                    } else {
                        rn2Var = new rn2(this, fbkVar);
                    }
                } else {
                    rn2Var = new rn2(this, fbkVar);
                }
                Object obj2 = rn2Var.f200701a;
                int i2 = rn2Var.f200702b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    gqx gqxVar = (gqx) obj;
                    List listMo45450b = gqxVar.mo45450b(v140.class);
                    int iM31820L = c95.m31820L(i6f.m49804T(listMo45450b, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj3 : listMo45450b) {
                        linkedHashMap.put(((fqx) obj3).f72300a, obj3);
                    }
                    List listMo45450b2 = gqxVar.mo45450b(erc1.class);
                    int iM31820L2 = c95.m31820L(i6f.m49804T(listMo45450b2, 10));
                    if (iM31820L2 < 16) {
                        iM31820L2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L2);
                    for (Object obj4 : listMo45450b2) {
                        linkedHashMap2.put(((fqx) obj4).f72300a, obj4);
                    }
                    List list = this.f210779c;
                    int iM31820L3 = c95.m31820L(i6f.m49804T(list, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM31820L3 >= 16 ? iM31820L3 : 16);
                    for (Object obj5 : list) {
                        String str3 = (String) obj5;
                        fqx fqxVar = (fqx) linkedHashMap.get(str3);
                        String str4 = null;
                        if (fqxVar == null || (v140Var = (v140) fqxVar.f72301b) == null || (str = v140Var.f236243a) == null || wl51.m88460J0(str)) {
                            str = null;
                        }
                        fqx fqxVar2 = (fqx) linkedHashMap2.get(str3);
                        m340 m340Var = (fqxVar2 == null || (erc1Var = (erc1) fqxVar2.f72301b) == null) ? null : erc1Var.f62079a;
                        if (m340Var == null || (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) {
                            z240VarM60640a = m340Var != null ? m340Var.m60640a(a340.f11862c) : null;
                            if (z240VarM60640a == null) {
                                z240VarM60640a = m340Var != null ? m340Var.m60640a(a340.f11860a) : null;
                            }
                        }
                        if (z240VarM60640a != null && (str2 = z240VarM60640a.f278475a.f198763a) != null && !wl51.m88460J0(str2)) {
                            str4 = str2;
                        }
                        if (str == null) {
                            str = "Studio by Spotify Labs";
                        }
                        if (str4 == null) {
                            str4 = "https://open.spotifycdn.com/cdn/images/producer.2d43e170.png";
                        }
                        linkedHashMap3.put(obj5, new pla1(str3, str, 8, str4));
                    }
                    rn2Var.f200702b = 1;
                    Object objEmit = this.f210778b.emit(linkedHashMap3, rn2Var);
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
            case 1:
                if (fbkVar instanceof enp) {
                    enpVar = (enp) fbkVar;
                    int i3 = enpVar.f61194b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        enpVar.f61194b = i3 - Integer.MIN_VALUE;
                    } else {
                        enpVar = new enp(this, fbkVar);
                    }
                } else {
                    enpVar = new enp(this, fbkVar);
                }
                Object obj6 = enpVar.f61193a;
                int i4 = enpVar.f61194b;
                if (i4 == 0) {
                    bga.m29073P(obj6);
                    by50 by50Var = (by50) obj;
                    if (by50Var != null) {
                        ArrayList arrayList = by50Var.f32077c;
                        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((tx50) it.next()).f224567c);
                        }
                        if (arrayList2.isEmpty()) {
                            by50Var = null;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    by50Var = null;
                                }
                            } while (!this.f210779c.contains((String) it2.next()));
                        }
                    } else {
                        by50Var = null;
                    }
                    Object fh60Var = (by50Var == null || !by50Var.f32082h.f287209b.f224569e) ? by50Var != null ? new fh60(by50Var) : ch60.f37937a : new dh60(by50Var);
                    enpVar.f61194b = 1;
                    Object objEmit2 = this.f210778b.emit(fh60Var, enpVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof ztv) {
                    ztvVar = (ztv) fbkVar;
                    int i5 = ztvVar.f286271b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ztvVar.f286271b = i5 - Integer.MIN_VALUE;
                    } else {
                        ztvVar = new ztv(this, fbkVar);
                    }
                } else {
                    ztvVar = new ztv(this, fbkVar);
                }
                Object obj7 = ztvVar.f286270a;
                int i6 = ztvVar.f286271b;
                if (i6 == 0) {
                    bga.m29073P(obj7);
                    fc0 fc0Var = (fc0) obj;
                    Integer num = new Integer(this.f210779c.indexOf(fc0Var != null ? fc0Var.f67962a : null));
                    Integer num2 = num.intValue() != -1 ? num : null;
                    if (num2 != null) {
                        ztvVar.f286271b = 1;
                        Object objEmit3 = this.f210778b.emit(num2, ztvVar);
                        yuk yukVar3 = yuk.f276404a;
                        if (objEmit3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj7);
                }
                return w2a1.f247311a;
            case 3:
                s380 s380Var = s380.f205204L0;
                if (fbkVar instanceof k480) {
                    k480Var = (k480) fbkVar;
                    int i7 = k480Var.f119133b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        k480Var.f119133b = i7 - Integer.MIN_VALUE;
                    } else {
                        k480Var = new k480(this, fbkVar);
                    }
                } else {
                    k480Var = new k480(this, fbkVar);
                }
                Object obj8 = k480Var.f119132a;
                int i8 = k480Var.f119133b;
                int i9 = 1;
                if (i8 == 0) {
                    bga.m29073P(obj8);
                    List list2 = (List) obj;
                    List list3 = this.f210779c;
                    if (list2 == null) {
                        arrayListM24675l = a470.m24675l(list3, s380Var);
                    } else {
                        ArrayList arrayList3 = new ArrayList(i6f.m49804T(list3, 10));
                        int i10 = 0;
                        for (Object obj9 : list3) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                h6f.m46722S();
                                throw null;
                            }
                            int i12 = i10 * 2;
                            long jM87008m = w1h1.m87008m((pu71) list2.get(i12));
                            long jM87008m2 = w1h1.m87008m((pu71) list2.get(i12 + i9));
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(new j480(new fc0(((ruv) obj9).f202915a, (pu71) s380Var.invoke(new Long(jM87008m)), (pu71) s380Var.invoke(new Long(jM87008m2 + 1))), new t2b0(jM87008m, jM87008m2)));
                            arrayList3 = arrayList4;
                            i10 = i11;
                            list2 = list2;
                            i9 = 1;
                        }
                        arrayListM24675l = arrayList3;
                    }
                    k480Var.f119133b = i9;
                    Object objEmit4 = this.f210778b.emit(arrayListM24675l, k480Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj8);
                }
                return w2a1.f247311a;
            case 4:
                if (fbkVar instanceof el90) {
                    el90Var = (el90) fbkVar;
                    int i13 = el90Var.f60661b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        el90Var.f60661b = i13 - Integer.MIN_VALUE;
                    } else {
                        el90Var = new el90(this, fbkVar);
                    }
                } else {
                    el90Var = new el90(this, fbkVar);
                }
                Object obj10 = el90Var.f60660a;
                int i14 = el90Var.f60661b;
                if (i14 == 0) {
                    bga.m29073P(obj10);
                    ArrayList<pqm0> arrayListM43746s1 = g6f.m43746s1(g6f.m43728j1(this.f210779c), ((CollectionPlatformEsperantoContainsResponse) obj).m6873o().m6864p());
                    int iM31820L4 = c95.m31820L(i6f.m49804T(arrayListM43746s1, 10));
                    if (iM31820L4 < 16) {
                        iM31820L4 = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM31820L4);
                    for (pqm0 pqm0Var : arrayListM43746s1) {
                        linkedHashMap4.put(pqm0Var.f180350a, pqm0Var.f180351b);
                    }
                    el90Var.f60661b = 1;
                    Object objEmit5 = this.f210778b.emit(linkedHashMap4, el90Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj10);
                }
                return w2a1.f247311a;
            case 5:
                if (fbkVar instanceof iuo0) {
                    iuo0Var = (iuo0) fbkVar;
                    int i15 = iuo0Var.f106013b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        iuo0Var.f106013b = i15 - Integer.MIN_VALUE;
                    } else {
                        iuo0Var = new iuo0(this, fbkVar);
                    }
                } else {
                    iuo0Var = new iuo0(this, fbkVar);
                }
                Object obj11 = iuo0Var.f106012a;
                int i16 = iuo0Var.f106013b;
                if (i16 == 0) {
                    bga.m29073P(obj11);
                    Boolean bool = (Boolean) obj;
                    List list4 = this.f210779c;
                    int iM31820L5 = c95.m31820L(i6f.m49804T(list4, 10));
                    if (iM31820L5 < 16) {
                        iM31820L5 = 16;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(iM31820L5);
                    for (Object obj12 : list4) {
                        linkedHashMap5.put(obj12, bool);
                    }
                    iuo0Var.f106013b = 1;
                    Object objEmit6 = this.f210778b.emit(linkedHashMap5, iuo0Var);
                    yuk yukVar6 = yuk.f276404a;
                    if (objEmit6 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj11);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof diu0) {
                    diu0Var = (diu0) fbkVar;
                    int i17 = diu0Var.f49489b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        diu0Var.f49489b = i17 - Integer.MIN_VALUE;
                    } else {
                        diu0Var = new diu0(this, fbkVar);
                    }
                } else {
                    diu0Var = new diu0(this, fbkVar);
                }
                Object obj13 = diu0Var.f49488a;
                int i18 = diu0Var.f49489b;
                if (i18 == 0) {
                    bga.m29073P(obj13);
                    qf40 qf40VarM67574x = opo.m67574x(g6f.m43727j0(g6f.m43700N0(fiu0.f69993b, g6f.m43700N0((List) obj, this.f210779c))));
                    diu0Var.f49489b = 1;
                    Object objEmit7 = this.f210778b.emit(qf40VarM67574x, diu0Var);
                    yuk yukVar7 = yuk.f276404a;
                    if (objEmit7 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj13);
                }
                return w2a1.f247311a;
        }
    }

    public sn2(niz nizVar, a470 a470Var, List list) {
        this.f210777a = 3;
        this.f210778b = nizVar;
        this.f210779c = list;
    }
}
