package p204p;

import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse;
import com.spotify.p010ad.detection.esperanto.proto.AdDetectionOuterClass$UserTimestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class pbt implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f175903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f175904c;

    public /* synthetic */ pbt(niz nizVar, ArrayList arrayList, int i) {
        this.f175902a = i;
        this.f175903b = nizVar;
        this.f175904c = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x027b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        obt obtVar;
        m340 m340Var;
        List list;
        z240 z240Var;
        qa70 qa70Var;
        Object kd90Var;
        wf90 wf90Var;
        mb90 mb90Var;
        wf90 wf90Var2;
        mb90 mb90Var2;
        axp0 axp0Var;
        ha41 ha41Var;
        xp71 xp71Var;
        wp71 wp71Var;
        switch (this.f175902a) {
            case 0:
                if (fbkVar instanceof obt) {
                    obtVar = (obt) fbkVar;
                    int i = obtVar.f163716b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        obtVar.f163716b = i - Integer.MIN_VALUE;
                    } else {
                        obtVar = new obt(this, fbkVar);
                    }
                } else {
                    obtVar = new obt(this, fbkVar);
                }
                Object obj2 = obtVar.f163715a;
                int i2 = obtVar.f163716b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    gqx gqxVar = (gqx) obj;
                    ArrayList arrayList = new ArrayList();
                    for (pqm0 pqm0Var : this.f175904c) {
                        String str = (String) pqm0Var.f180350a;
                        String str2 = (String) pqm0Var.f180351b;
                        fqx fqxVarMo45449a = gqxVar.mo45449a(v140.class, str2);
                        v140 v140Var = (v140) fqxVarMo45449a.f72301b;
                        dil dilVar = null;
                        str = null;
                        str = null;
                        str = null;
                        String str3 = null;
                        dilVar = null;
                        if (v140Var != null && fqxVarMo45449a.f72302c.f61974b == 2) {
                            erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str2).f72301b;
                            if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (list = m340Var.f139524a) != null && (z240Var = (z240) g6f.m43745s0(list)) != null) {
                                str3 = z240Var.f278475a.f198763a;
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            dilVar = new dil(str2, str, v140Var.f236243a, str3);
                        }
                        if (dilVar != null) {
                            arrayList.add(dilVar);
                        }
                    }
                    gbt gbtVar = new gbt(arrayList);
                    obtVar.f163716b = 1;
                    Object objEmit = this.f175903b.emit(gbtVar, obtVar);
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
                if (fbkVar instanceof qa70) {
                    qa70Var = (qa70) fbkVar;
                    int i3 = qa70Var.f186773b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qa70Var.f186773b = i3 - Integer.MIN_VALUE;
                    } else {
                        qa70Var = new qa70(this, fbkVar);
                    }
                } else {
                    qa70Var = new qa70(this, fbkVar);
                }
                Object obj3 = qa70Var.f186772a;
                int i4 = qa70Var.f186773b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (true) {
                        mb90Var = null;
                        mb90Var = null;
                        mb90Var = null;
                        mb90 mb90Var3 = null;
                        if (it.hasNext()) {
                            qho qhoVar = (qho) it.next();
                            oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                            if (ohoVar != null && (wf90Var2 = (wf90) ohoVar.f165512a) != null && (mb90Var2 = wf90Var2.f250768a) != null && mb90Var2.f141840c) {
                                mb90Var3 = mb90Var2;
                            }
                            if (mb90Var3 != null) {
                                arrayList2.add(mb90Var3);
                            }
                        } else {
                            int size = arrayList2.size();
                            if (size == 0) {
                                kd90Var = id90.f100986a;
                            } else if (size != 1) {
                                kd90Var = new jd90(arrayList2.size());
                            } else {
                                Iterator it2 = list2.iterator();
                                int i5 = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        qho qhoVar2 = (qho) it2.next();
                                        oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                                        if (ohoVar2 == null || (wf90Var = (wf90) ohoVar2.f165512a) == null || (mb90Var = wf90Var.f250768a) == null || !mb90Var.f141840c) {
                                            i5++;
                                        }
                                    } else {
                                        i5 = -1;
                                    }
                                }
                                dd90 dd90Var = (dd90) g6f.m43747t0(i5, this.f175904c);
                                String str4 = dd90Var != null ? dd90Var.f47750b : null;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                kd90Var = new kd90(str4);
                            }
                            qa70Var.f186773b = 1;
                            Object objEmit2 = this.f175903b.emit(kd90Var, qa70Var);
                            yuk yukVar2 = yuk.f276404a;
                            if (objEmit2 == yukVar2) {
                                return yukVar2;
                            }
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof axp0) {
                    axp0Var = (axp0) fbkVar;
                    int i6 = axp0Var.f20945b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        axp0Var.f20945b = i6 - Integer.MIN_VALUE;
                    } else {
                        axp0Var = new axp0(this, fbkVar);
                    }
                } else {
                    axp0Var = new axp0(this, fbkVar);
                }
                Object obj4 = axp0Var.f20944a;
                int i7 = axp0Var.f20945b;
                if (i7 == 0) {
                    bga.m29073P(obj4);
                    Set set = (Set) obj;
                    ro80 ro80VarM44508o = geg1.m44508o();
                    for (dyp0 dyp0Var : this.f175904c) {
                        if (set.contains(dyp0Var.f54427a)) {
                            ro80VarM44508o.add(dyp0Var.f54427a);
                        }
                    }
                    ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                    axp0Var.f20945b = 1;
                    Object objEmit3 = this.f175903b.emit(ro80VarM44506m, axp0Var);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 3:
                if (fbkVar instanceof ha41) {
                    ha41Var = (ha41) fbkVar;
                    int i8 = ha41Var.f89122b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ha41Var.f89122b = i8 - Integer.MIN_VALUE;
                    } else {
                        ha41Var = new ha41(this, fbkVar);
                    }
                } else {
                    ha41Var = new ha41(this, fbkVar);
                }
                Object obj5 = ha41Var.f89121a;
                int i9 = ha41Var.f89122b;
                if (i9 == 0) {
                    bga.m29073P(obj5);
                    gqx gqxVar2 = (gqx) obj;
                    ArrayList arrayList3 = this.f175904c;
                    int iM31820L = c95.m31820L(i6f.m49804T(arrayList3, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                    for (Object obj6 : arrayList3) {
                        linkedHashMap.put(obj6, new ia41(g391.m43460s((ea41) gqxVar2.mo45449a(ea41.class, (String) obj6).f72301b)));
                    }
                    gso gsoVar = new gso(linkedHashMap);
                    ha41Var.f89122b = 1;
                    Object objEmit4 = this.f175903b.emit(gsoVar, ha41Var);
                    yuk yukVar4 = yuk.f276404a;
                    if (objEmit4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof xp71) {
                    xp71Var = (xp71) fbkVar;
                    int i10 = xp71Var.f264523b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        xp71Var.f264523b = i10 - Integer.MIN_VALUE;
                    } else {
                        xp71Var = new xp71(this, fbkVar);
                    }
                } else {
                    xp71Var = new xp71(this, fbkVar);
                }
                Object obj7 = xp71Var.f264522a;
                int i11 = xp71Var.f264523b;
                if (i11 == 0) {
                    bga.m29073P(obj7);
                    AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse = (AdDetectionOuterClass$SubscribeCreatorToUserTimestampResponse) obj;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = this.f175904c.iterator();
                    boolean z = false;
                    while (true) {
                        if (it3.hasNext()) {
                            AdDetectionOuterClass$UserTimestamp adDetectionOuterClass$UserTimestamp = (AdDetectionOuterClass$UserTimestamp) adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.m2297n().get(new Integer(((Number) it3.next()).intValue()));
                            if (adDetectionOuterClass$UserTimestamp == null) {
                                wp71Var = new wp71(adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.m2298o(), null, false);
                            } else {
                                z = z || adDetectionOuterClass$UserTimestamp.m2307o();
                                arrayList4.add(new nu71(adDetectionOuterClass$UserTimestamp.m2308p()));
                            }
                        } else {
                            wp71Var = new wp71(adDetectionOuterClass$SubscribeCreatorToUserTimestampResponse.m2298o(), g6f.m43728j1(arrayList4), z);
                        }
                    }
                    xp71Var.f264523b = 1;
                    Object objEmit5 = this.f175903b.emit(wp71Var, xp71Var);
                    yuk yukVar5 = yuk.f276404a;
                    if (objEmit5 == yukVar5) {
                        return yukVar5;
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
}
