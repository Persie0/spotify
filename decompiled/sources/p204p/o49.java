package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class o49 implements uz60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161588a = 1;

    /* JADX INFO: renamed from: b */
    public final tn61 f161589b;

    /* JADX INFO: renamed from: c */
    public final Object f161590c;

    /* JADX INFO: renamed from: d */
    public final rio f161591d;

    /* JADX INFO: renamed from: e */
    public final Object f161592e;

    /* JADX WARN: Multi-variable type inference failed */
    public o49(gh00 gh00Var, tn61 tn61Var, co61 co61Var, eh00 eh00Var) {
        this.f161590c = (qe70) gh00Var;
        this.f161589b = tn61Var;
        this.f161591d = co61Var;
        this.f161592e = new wg61(eh00Var);
    }

    /* JADX INFO: renamed from: f */
    public static LinkedHashMap m66235f(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM31820L = c95.m31820L(i6f.m49804T(setEntrySet, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(((k35) entry.getKey()).f118763b, (pjo) entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [p.gh00, p.qe70] */
    @Override // p204p.uz60
    /* JADX INFO: renamed from: b */
    public final Map mo28093b(Set set) {
        switch (this.f161588a) {
            case 0:
                Set set2 = set;
                tn61 tn61Var = (tn61) this.f161590c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k35(tn61Var, it.next()));
                }
                return m66235f(((l59) this.f161591d).mo24860b(g6f.m43736n1(arrayList)));
            default:
                ?? r0 = (qe70) this.f161590c;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : set) {
                    if (((Boolean) r0.invoke(obj)).booleanValue()) {
                        arrayList2.add(obj);
                    } else {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    g6f.m43736n1(arrayList2);
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                nau nauVar = nau.f152117a;
                return kkc0.m56700m0(nauVar, !zIsEmpty ? ((uz60) ((wg61) this.f161592e).getValue()).mo28093b(g6f.m43736n1(arrayList3)) : nauVar);
        }
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: c */
    public final tz60 mo28094c(gh00 gh00Var) {
        switch (this.f161588a) {
            case 0:
                return new m49(this, gh00Var);
            default:
                return new xnx0(this, (jq81) gh00Var);
        }
    }

    @Override // p204p.uz60
    /* JADX INFO: renamed from: d */
    public final tn61 mo28095d() {
        switch (this.f161588a) {
            case 0:
                break;
        }
        return this.f161589b;
    }

    public o49(tn61 tn61Var, e49 e49Var, juk jukVar, gh00 gh00Var, gh00 gh00Var2, th00 th00Var) {
        this.f161590c = tn61Var;
        this.f161592e = th00Var;
        this.f161589b = tn61Var;
        this.f161591d = new l59(new x4b(new cn8(gh00Var, tn61Var), jukVar, new ip7(tn61Var, 11), new cn8(2, gh00Var2, tn61Var)), e49Var, jukVar);
    }
}
