package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class eoi {

    /* JADX INFO: renamed from: a */
    public final wt80 f61428a;

    /* JADX INFO: renamed from: b */
    public final epx f61429b;

    public eoi(epx epxVar, wt80 wt80Var) {
        this.f61429b = epxVar;
        this.f61428a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m39570a(eoi eoiVar, ArrayList arrayList, ibk ibkVar) {
        doi doiVar;
        List list;
        eoiVar.getClass();
        if (ibkVar instanceof doi) {
            doiVar = (doi) ibkVar;
            int i = doiVar.f51049c;
            if ((i & Integer.MIN_VALUE) != 0) {
                doiVar.f51049c = i - Integer.MIN_VALUE;
            } else {
                doiVar = new doi(eoiVar, ibkVar);
            }
        } else {
            doiVar = new doi(eoiVar, ibkVar);
        }
        Object objM62842g = doiVar.f51047a;
        int i2 = doiVar.f51049c;
        if (i2 == 0) {
            bga.m29073P(objM62842g);
            st80 st80Var = new st80(null, null, null, false, new qt80(Collections.singleton(in80.f103926g)), a5u0.f12598a, null, 0, null, 463);
            int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : arrayList) {
                linkedHashMap.put(obj, new vt80((String) obj, st80Var));
            }
            wt80 wt80Var = eoiVar.f61428a;
            doiVar.f51049c = 1;
            objM62842g = ((mu80) wt80Var).m62842g(linkedHashMap, null, doiVar);
            yuk yukVar = yuk.f276404a;
            if (objM62842g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62842g);
        }
        Map map = (Map) objM62842g;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            qu80 qu80Var = (qu80) ((p2x0) entry.getValue()).m68970c();
            linkedHashMap2.put(key, (qu80Var == null || (list = qu80Var.f192598d) == null) ? null : new Integer(list.size()));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x014b  */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x016d -> B:41:0x0171). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public java.lang.Object m39571b(java.lang.String r22, p204p.ibk r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.eoi.m39571b(java.lang.String, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0126 A[PHI: r4
      0x0126: PHI (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:96:0x0149, B:84:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    public Object m39572c(nw80 nw80Var, ibk ibkVar) {
        dus0 dus0Var;
        String str;
        aus0 aus0Var;
        String str2;
        String str3;
        u140 u140Var;
        aus0 aus0Var2;
        String str4;
        List list;
        t140 t140Var;
        if (ibkVar instanceof dus0) {
            dus0Var = (dus0) ibkVar;
            int i = dus0Var.f53273f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dus0Var.f53273f = i - Integer.MIN_VALUE;
            } else {
                dus0Var = new dus0(this, ibkVar);
            }
        } else {
            dus0Var = new dus0(this, ibkVar);
        }
        Object objM39573d = dus0Var.f53271d;
        int i2 = dus0Var.f53273f;
        if (i2 == 0) {
            bga.m29073P(objM39573d);
            dpx dpxVar = nw80Var.f159062p;
            v140 v140Var = (v140) dpxVar.mo30169a(v140.class);
            ee7 ee7Var = (ee7) dpxVar.mo30169a(ee7.class);
            str = "";
            String strM89458a = null;
            if (ee7Var != null) {
                psl pslVar = ee7Var.f58690c;
                String str5 = ee7Var.f58689b;
                if (str5.length() == 0) {
                    String str6 = v140Var != null ? v140Var.f236243a : null;
                    str5 = str6 == null ? "" : str6;
                }
                wzk wzkVar = (wzk) dpxVar.mo30169a(wzk.class);
                strM89458a = wzkVar != null ? wzkVar.m89458a(szk.f215608c) : null;
                str = strM89458a != null ? strM89458a : "";
                String strM43753y0 = g6f.m43753y0(pslVar.f180888a, null, null, null, jqs0.f114977S0, 31);
                if (strM43753y0.length() == 0) {
                    strM43753y0 = g6f.m43753y0(pslVar.f180889b, null, null, null, jqs0.f114978T0, 31);
                }
                return new zts0(str5, str, strM43753y0, aus0.f20021c);
            }
            String str7 = v140Var != null ? v140Var.f236244b : null;
            if (str7 == null) {
                aus0Var = aus0.f20019a;
            } else {
                int iHashCode = str7.hashCode();
                if (iHashCode != -1891298259) {
                    if (iHashCode != 2103152) {
                        if (iHashCode == 120215003 && str7.equals("Episode")) {
                            aus0Var = aus0.f20020b;
                        } else {
                            aus0Var = aus0.f20019a;
                        }
                    } else if (str7.equals("Clip")) {
                        aus0Var = aus0.f20022d;
                    } else {
                        aus0Var = aus0.f20019a;
                    }
                } else if (str7.equals("Chapter")) {
                    aus0Var = aus0.f20023e;
                } else {
                    aus0Var = aus0.f20019a;
                }
            }
            str2 = v140Var != null ? v140Var.f236243a : null;
            if (str2 == null) {
                str2 = "";
            }
            erc1 erc1Var = (erc1) dpxVar.mo30169a(erc1.class);
            if (erc1Var != null) {
                z240 z240VarM60640a = erc1Var.f62079a.m60640a(a340.f11862c);
                if (z240VarM60640a != null) {
                    str3 = z240VarM60640a.f278475a.f198763a;
                } else {
                    str3 = null;
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            int iOrdinal = aus0Var.ordinal();
            if (iOrdinal == 1) {
                if (v140Var != null && (u140Var = v140Var.f236247e) != null) {
                    strM89458a = u140Var.f225678a;
                }
                if (strM89458a != null) {
                    str = strM89458a;
                }
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                dus0Var.f53268a = aus0Var;
                dus0Var.f53269b = str2;
                dus0Var.f53270c = str3;
                dus0Var.f53273f = 1;
                objM39573d = m39573d(v140Var, dus0Var);
                Object obj = yuk.f276404a;
                if (objM39573d == obj) {
                    return obj;
                }
                aus0Var2 = aus0Var;
                str4 = str2;
            } else {
                if (v140Var != null && (list = v140Var.f236246d) != null && (t140Var = (t140) g6f.m43745s0(list)) != null) {
                    strM89458a = t140Var.f216153a;
                }
                if (strM89458a != null) {
                    str = strM89458a;
                }
            }
            return new zts0(str2, str3, str, aus0Var);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str3 = dus0Var.f53270c;
        str4 = dus0Var.f53269b;
        aus0Var2 = dus0Var.f53268a;
        bga.m29073P(objM39573d);
        str = (String) objM39573d;
        str2 = str4;
        aus0Var = aus0Var2;
        return new zts0(str2, str3, str, aus0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m39573d(v140 v140Var, ibk ibkVar) {
        eus0 eus0Var;
        u140 u140Var;
        String str;
        u140 u140Var2;
        if (ibkVar instanceof eus0) {
            eus0Var = (eus0) ibkVar;
            int i = eus0Var.f63072c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eus0Var.f63072c = i - Integer.MIN_VALUE;
            } else {
                eus0Var = new eus0(this, ibkVar);
            }
        } else {
            eus0Var = new eus0(this, ibkVar);
        }
        Object objM96571q = eus0Var.f63070a;
        int i2 = eus0Var.f63072c;
        String str2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96571q);
                if (v140Var == null || (u140Var = v140Var.f236247e) == null || (str = u140Var.f225679b) == null) {
                    return "";
                }
                Observable map = ((jpx) this.f61429b).m53978b(new C1668ai("episode-share", false, (gh00) new j1r0(str, 12))).filter(pqq0.f180388d).map(new b93(str, 14));
                eus0Var.f63072c = 1;
                objM96571q = zn91.m96571q(map, 1, null, eus0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96571q == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96571q);
            }
            v140 v140Var2 = (v140) ((fqx) objM96571q).f72301b;
            if (v140Var2 != null && (u140Var2 = v140Var2.f236247e) != null) {
                str2 = u140Var2.f225678a;
            }
            return str2 == null ? "" : str2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public eoi(wt80 wt80Var, epx epxVar) {
        this.f61428a = wt80Var;
        this.f61429b = epxVar;
    }
}
