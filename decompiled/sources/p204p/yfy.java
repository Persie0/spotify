package p204p;

import android.util.Base64;
import com.spotify.featuregate.p068v1.FeatureAccessResponse;
import com.spotify.featuregate.p068v1.FeatureAccessResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class yfy {

    /* JADX INFO: renamed from: a */
    public final bfy f272371a;

    /* JADX INFO: renamed from: b */
    public final vmz f272372b;

    /* JADX INFO: renamed from: c */
    public final lja1 f272373c;

    /* JADX INFO: renamed from: d */
    public final bji f272374d;

    /* JADX INFO: renamed from: e */
    public final cv8 f272375e;

    /* JADX INFO: renamed from: f */
    public final xuk f272376f;

    /* JADX INFO: renamed from: g */
    public final i4t0 f272377g;

    /* JADX INFO: renamed from: h */
    public final boolean f272378h;

    /* JADX INFO: renamed from: i */
    public final mw00 f272379i;

    public yfy(bfy bfyVar, vmz vmzVar, lja1 lja1Var, bji bjiVar, cv8 cv8Var, xuk xukVar, i4t0 i4t0Var, boolean z, boolean z2, qre0 qre0Var) {
        this.f272371a = bfyVar;
        this.f272372b = vmzVar;
        this.f272373c = lja1Var;
        this.f272374d = bjiVar;
        this.f272375e = cv8Var;
        this.f272376f = xukVar;
        this.f272377g = i4t0Var;
        this.f272378h = z2;
        this.f272379i = new mw00(z, qre0Var, ((dfy) bfyVar).f48676a, new c7x(this, 18));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m93571a(yfy yfyVar, Map map, ibk ibkVar) {
        xfy xfyVar;
        LinkedHashMap linkedHashMap;
        int i;
        if (ibkVar instanceof xfy) {
            xfyVar = (xfy) ibkVar;
            int i2 = xfyVar.f261120e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xfyVar.f261120e = i2 - Integer.MIN_VALUE;
            } else {
                xfyVar = new xfy(yfyVar, ibkVar);
            }
        } else {
            xfyVar = new xfy(yfyVar, ibkVar);
        }
        Object obj = xfyVar.f261118c;
        int i3 = xfyVar.f261120e;
        if (i3 == 0) {
            bga.m29073P(obj);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                sey seyVar = (sey) entry.getKey();
                AbstractC2528wc abstractC2528wc = (AbstractC2528wc) entry.getValue();
                String str = ((dfy) yfyVar.f272371a).f48676a;
                String strMo26728a = seyVar.mo26728a();
                if (abstractC2528wc instanceof C2490vc) {
                    i = 2;
                } else {
                    if (!(abstractC2528wc instanceof C2448uc)) {
                        throw new IllegalStateException((abstractC2528wc + " should not reach upsell fetch").toString());
                    }
                    i = 1;
                }
                linkedHashMap2.put(key, new xu00(str, strMo26728a, i));
            }
            lja1 lja1Var = yfyVar.f272373c;
            List listM43728j1 = g6f.m43728j1(linkedHashMap2.values());
            xfyVar.f261116a = map;
            xfyVar.f261117b = linkedHashMap2;
            xfyVar.f261120e = 1;
            Serializable serializableM59142a = lja1Var.m59142a(listM43728j1, xfyVar);
            yuk yukVar = yuk.f276404a;
            if (serializableM59142a == yukVar) {
                return yukVar;
            }
            obj = serializableM59142a;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = xfyVar.f261117b;
            map = xfyVar.f261116a;
            bga.m29073P(obj);
        }
        Map map2 = (Map) obj;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c95.m31820L(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            Object key2 = entry2.getKey();
            sey seyVar2 = (sey) entry2.getKey();
            AbstractC2528wc abstractC2528wc2 = (AbstractC2528wc) entry2.getValue();
            sia1 sia1Var = (sia1) map2.get(linkedHashMap.get(seyVar2));
            linkedHashMap3.put(key2, new pey(seyVar2.mo26728a(), abstractC2528wc2, new lia1(sia1Var instanceof ria1 ? ((ria1) sia1Var).f199470a ? new jia1(abstractC2528wc2) : kia1.f122903e : kia1.f122902d)));
        }
        return linkedHashMap3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX INFO: renamed from: b */
    public final LinkedHashMap m93572b(List list, Map map, tub tubVar) {
        mey keyVar;
        mey keyVar2;
        cfy cfyVar;
        boolean z;
        AbstractC1737cd abstractC1737cd;
        cfy cfyVar2;
        cfy cfyVar3;
        bfy bfyVar = this.f272371a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map2 = ((dfy) bfyVar).f48678c;
        Iterator it = map2.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C1700bd c1700bd = C1700bd.f25961a;
            if (!zHasNext) {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (Map.Entry entry : map2.entrySet()) {
                    sey seyVar = (sey) entry.getKey();
                    oub oubVar = ((f50) entry.getValue()).f65880f;
                    if (oubVar != null) {
                        Boolean bool = (Boolean) tubVar.f223810a.get(oubVar);
                        if (bool != null ? bool.booleanValue() : false) {
                            linkedHashSet3.add(seyVar);
                        }
                    }
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                for (Map.Entry entry2 : map2.entrySet()) {
                    sey seyVar2 = (sey) entry2.getKey();
                    oub oubVar2 = ((f50) entry2.getValue()).f65880f;
                    if (oubVar2 != null && tubVar.f223811b.contains(oubVar2)) {
                        linkedHashSet4.add(seyVar2);
                    }
                }
                g40 g40VarMo29042a = bfyVar.mo29042a(this.f272374d);
                int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L);
                for (Object obj : list) {
                    sey seyVar3 = (sey) obj;
                    String strMo26728a = seyVar3.mo26728a();
                    if (g40VarMo29042a.f76307b.contains(seyVar3)) {
                        keyVar2 = new key(strMo26728a, c1700bd);
                    } else {
                        if (linkedHashSet2.contains(seyVar3) || !linkedHashSet.contains(seyVar3)) {
                            AbstractC1737cd abstractC1737cd2 = (AbstractC1737cd) linkedHashMap.get(seyVar3);
                            if (abstractC1737cd2 == null) {
                                abstractC1737cd2 = c1700bd;
                            }
                            keyVar = new key(strMo26728a, abstractC1737cd2);
                        } else if (linkedHashSet3.contains(seyVar3)) {
                            keyVar2 = new key(strMo26728a, C2448uc.f228910a);
                        } else {
                            keyVar = new ley(strMo26728a, linkedHashSet4.contains(seyVar3));
                        }
                        keyVar2 = keyVar;
                    }
                    linkedHashMap2.put(obj, keyVar2);
                }
                return linkedHashMap2;
            }
            Map.Entry entry3 = (Map.Entry) it.next();
            sey seyVar4 = (sey) entry3.getKey();
            f50 f50Var = (f50) entry3.getValue();
            String str = f50Var.f65875a;
            boolean z2 = f50Var.f65879e;
            String str2 = (String) map.get(str);
            C2410tc c2410tc = C2410tc.f218976a;
            if (str2 == null) {
                cfyVar = z2 ? new cfy(true, null) : new cfy(false, c1700bd);
            } else if (f50Var.f65877c) {
                String str3 = f50Var.f65878d;
                if (str2.length() == 0) {
                    z = false;
                    cfyVar2 = null;
                } else {
                    z = false;
                    try {
                        try {
                            FeatureAccessResult featureAccessResult = (FeatureAccessResult) FeatureAccessResponse.m10961o(Base64.decode(str2, 0)).m10962n().get(str3);
                            if (featureAccessResult == null) {
                                if (z2) {
                                    cfyVar3 = new cfy(true, null);
                                } else {
                                    cfyVar2 = null;
                                }
                                z = false;
                            } else if (featureAccessResult.m10966q()) {
                                cfyVar3 = new cfy(true, null);
                            } else if (featureAccessResult.m10965p()) {
                                oey oeyVar = (oey) g6f.m43745s0(featureAccessResult.m10964o().m10968o());
                                if (oeyVar != null) {
                                    switch (oeyVar.ordinal()) {
                                        case 1:
                                            abstractC1737cd = C2490vc.f239615a;
                                            break;
                                        case 2:
                                            abstractC1737cd = c1700bd;
                                            break;
                                        case 3:
                                            abstractC1737cd = C2567xc.f260033a;
                                            break;
                                        case 4:
                                            abstractC1737cd = C2371sc.f207611a;
                                            break;
                                        case 5:
                                            abstractC1737cd = C2645zc.f281427a;
                                            break;
                                        case 6:
                                            abstractC1737cd = C1663ad.f14480a;
                                            break;
                                        case 7:
                                            abstractC1737cd = c2410tc;
                                            break;
                                        case 8:
                                            abstractC1737cd = C2608yc.f271325a;
                                            break;
                                        default:
                                            abstractC1737cd = null;
                                            break;
                                    }
                                } else {
                                    abstractC1737cd = null;
                                }
                                z = false;
                                cfyVar2 = new cfy(false, abstractC1737cd);
                            } else {
                                z = false;
                                cfyVar2 = null;
                            }
                            cfyVar2 = cfyVar3;
                            z = false;
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                }
                cfyVar = cfyVar2 == null ? new cfy(z, c1700bd) : cfyVar2;
            } else {
                cfyVar = str2.equals(f50Var.f65876b) ? new cfy(true, null) : new cfy(false, c1700bd);
            }
            AbstractC1737cd abstractC1737cd3 = cfyVar.f37478b;
            boolean z3 = cfyVar.f37477a;
            if (!z3) {
                wj50.m88271j(abstractC1737cd3, c2410tc);
            }
            if (z3) {
                linkedHashSet.add(seyVar4);
            } else {
                linkedHashSet2.add(seyVar4);
                if (abstractC1737cd3 != null) {
                    linkedHashMap.put(seyVar4, abstractC1737cd3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final ew41 m93573c(List list) {
        hlr0 glr0Var;
        if (this.f272378h) {
            int iM31820L = c95.m31820L(i6f.m49804T(list, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : list) {
                linkedHashMap.put(obj, new key(((sey) obj).mo26728a(), C1700bd.f25961a));
            }
            return new ew41(jag1.m52819d(linkedHashMap));
        }
        yab yabVar = this.f272372b.f242953a;
        dfy dfyVar = (dfy) this.f272371a;
        Collection collectionValues = dfyVar.f48678c.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            oub oubVar = ((f50) it.next()).f65880f;
            if (oubVar != null) {
                linkedHashSet.add(oubVar);
            }
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add((xv41) this.f272375e.invoke((oub) it2.next()));
        }
        ysk yskVar = new ysk(w2a1.f247311a, 27);
        hlr0 hlr0Var = null;
        fiz zuxVar = arrayList.isEmpty() ? new zux(yabVar, yskVar, new zp0(this, list, (fbk) null), 1) : g0g1.m43302g(yabVar, new ou8((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), 7), yskVar, new rx2((Object) this, (Object) list, (fbk) (false ? 1 : 0), 6));
        Map mapM92199e = nau.f152117a;
        try {
            elr0 elr0Var = (elr0) this.f272377g.get();
            if (elr0Var != null) {
                hlr0 hlr0Var2 = (hlr0) elr0Var.f60746c.m23798h();
                if (hlr0Var2 == null) {
                    glr0Var = hlr0Var2;
                    glr0Var = new glr0(pkr0.f178516a);
                }
                glr0Var = hlr0Var2;
                hlr0Var = glr0Var;
            }
            if (hlr0Var instanceof flr0) {
                mapM92199e = ((flr0) hlr0Var).f70858a.m92199e();
            }
        } catch (Throwable th) {
            na6.m63959g("ProductStateProvider not ready when evaluating feature access for ".concat(dfyVar.f48676a), th);
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((pub) ((xv41) it3.next()).getValue());
        }
        return new ew41(bzf1.m31029u(zuxVar, this.f272376f, hf11.f90581a, m93572b(list, mapM92199e, vlg1.m85967o(arrayList2))));
    }
}
