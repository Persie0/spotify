package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class sr4 {

    /* JADX INFO: renamed from: a */
    public final String f213226a;

    /* JADX INFO: renamed from: b */
    public final ayh0 f213227b;

    /* JADX INFO: renamed from: c */
    public final UUID f213228c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f213229d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f213230e;

    /* JADX INFO: renamed from: f */
    public volatile String f213231f;

    /* JADX INFO: renamed from: g */
    public Long f213232g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f213233h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentLinkedQueue f213234i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentLinkedQueue f213235j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentLinkedQueue f213236k;

    /* JADX INFO: renamed from: l */
    public final udy0 f213237l;

    /* JADX INFO: renamed from: m */
    public final pa81 f213238m;

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Map] */
    public sr4(String str, ayh0 ayh0Var) {
        new cu5(28);
        this.f213226a = str;
        this.f213227b = ayh0Var;
        this.f213228c = UUID.randomUUID();
        this.f213229d = new ConcurrentHashMap();
        this.f213230e = new ConcurrentHashMap();
        this.f213233h = new AtomicBoolean(true);
        this.f213234i = new ConcurrentLinkedQueue();
        this.f213235j = new ConcurrentLinkedQueue();
        this.f213236k = new ConcurrentLinkedQueue();
        if (wl51.m88460J0(str)) {
            throw new IllegalArgumentException("Category must not be empty");
        }
        String str2 = (String) tr4.f222964a.get(str);
        str = str2 != null ? str2 : str;
        tnk0 tnk0Var = tnk0.f221995a;
        this.f213237l = tnk0Var.mo75876t(str);
        this.f213238m = unk0.m83565m(tnk0Var, str, Integer.valueOf(hashCode()), 4);
    }

    /* JADX INFO: renamed from: c */
    public static void m79008c(sr4 sr4Var, String str, long j, long j2, int i) {
        String str2 = (i & 8) != 0 ? null : "assisted-curation";
        boolean z = (i & 16) == 0;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        if (z || sr4Var.f213232g == null) {
            sr4Var.f213232g = lValueOf;
        }
        sr4Var.f213236k.add(new qwb(str, str2, lValueOf, lValueOf2));
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m79009e(ConcurrentLinkedQueue concurrentLinkedQueue, ConcurrentLinkedQueue concurrentLinkedQueue2, ConcurrentLinkedQueue concurrentLinkedQueue3) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            swb swbVar = (swb) it.next();
            Iterator it2 = concurrentLinkedQueue2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!wj50.m88271j(((rwb) next).f203314a, swbVar.f214634a));
            rwb rwbVar = (rwb) next;
            if (rwbVar != null) {
                long j = rwbVar.f203315b;
                long j2 = swbVar.f214636c;
                arrayList.add(new a410(swbVar.f214634a, swbVar.f214635b, Long.valueOf(j2), Long.valueOf(j - j2)));
            }
        }
        Iterator it3 = concurrentLinkedQueue3.iterator();
        while (it3.hasNext()) {
            qwb qwbVar = (qwb) it3.next();
            arrayList.add(new a410(qwbVar.f193220a, qwbVar.f193221b, qwbVar.f193222c, qwbVar.f193223d));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Object m79010h(sr4 sr4Var, String str, eh00 eh00Var) {
        sr4Var.m79019k(str, null, false);
        Object objInvoke = eh00Var.invoke();
        sr4Var.m79016f(str);
        return objInvoke;
    }

    /* JADX INFO: renamed from: i */
    public static Set m79011i(long j, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a410 a410Var = (a410) it.next();
            Long l = (Long) a410Var.f12113c;
            arrayList2.add(new a410(a410Var.f12111a, a410Var.f12112b, l != null ? Long.valueOf(l.longValue() - j) : null, a410Var.f12114d));
        }
        return g6f.m43736n1(arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final void m79013a(String str, String str2) {
        this.f213230e.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m79014b(String str, String str2) {
        this.f213229d.put(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final mm71 m79015d() {
        sm71 sm71Var;
        Object next;
        if (this.f213233h.getAndSet(false)) {
            ov50 ov50VarM33874y = cu5.m33874y(new s2b1(this.f213236k, this.f213234i, this.f213235j, this.f213230e));
            sm71Var = ov50VarM33874y != null ? new sm71(ov50VarM33874y, m79018j()) : null;
        } else {
            sm71Var = new sm71(2, nau.f152117a, m79018j());
        }
        Set setM79011i = gbu.f78413a;
        if (sm71Var == null) {
            ArrayList arrayListM79009e = m79009e(this.f213234i, this.f213235j, this.f213236k);
            Long l = this.f213232g;
            setM79011i = m79011i(l != null ? l.longValue() : 0L, arrayListM79009e);
        }
        Set set = setM79011i;
        boolean z = sm71Var != null;
        udy0 udy0Var = this.f213237l;
        pa81 pa81Var = this.f213238m;
        for (Map.Entry entry : this.f213230e.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (udy0Var != null) {
                udy0Var.setAttribute(str, str2);
            }
            if (pa81Var != null) {
                pa81Var.setAttribute(str, str2);
            }
        }
        for (Map.Entry entry2 : this.f213229d.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            if (pa81Var != null) {
                pa81Var.setAttribute(str3, str4);
            }
        }
        String str5 = z ? "timekeeper_error" : "success";
        if (udy0Var != null) {
            udy0Var.setAttribute("observation_outcome", str5);
        }
        if (pa81Var != null) {
            pa81Var.setAttribute("observation_outcome", str5);
        }
        pa81 pa81Var2 = this.f213238m;
        for (swb swbVar : this.f213234i) {
            Iterator it = this.f213235j.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((rwb) next).f203314a, swbVar.f214634a));
            rwb rwbVar = (rwb) next;
            if (rwbVar != null) {
                long j = rwbVar.f203315b;
                if (pa81Var2 != null) {
                    pa81Var2.mo51104e(swbVar.f214636c, swbVar.f214634a, j);
                }
            } else if (pa81Var2 != null) {
                pa81Var2.mo51104e(swbVar.f214636c, swbVar.f214634a, 0L);
            }
        }
        for (qwb qwbVar : this.f213236k) {
            Long l2 = qwbVar.f193222c;
            Long l3 = qwbVar.f193223d;
            if (l2 != null) {
                long jLongValue = l3.longValue() + l2.longValue();
                if (pa81Var2 != null) {
                    pa81Var2.mo51104e(l2.longValue(), qwbVar.f193220a, jLongValue);
                }
            }
        }
        pa81 pa81Var3 = this.f213238m;
        if (pa81Var3 != null) {
            pa81Var3.stop();
        }
        udy0 udy0Var2 = this.f213237l;
        if (udy0Var2 != null) {
            Long l4 = this.f213232g;
            if (l4 != null) {
                udy0Var2.mo33388d(l4.longValue());
            }
            udy0Var2.stop();
        }
        return new mm71(this.f213228c, this.f213226a, this.f213229d, this.f213230e, set, this.f213231f, null, sm71Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m79016f(String str) {
        this.f213235j.add(new rwb(str, this.f213227b.m27521a()));
    }

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap m79017g() {
        ArrayList arrayListM79009e = m79009e(this.f213234i, this.f213235j, this.f213236k);
        int iM31820L = c95.m31820L(i6f.m49804T(arrayListM79009e, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : arrayListM79009e) {
            linkedHashMap.put(((a410) obj).f12111a, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    public final Set m79018j() {
        ArrayList<swb> arrayList = new ArrayList();
        for (Object obj : this.f213234i) {
            swb swbVar = (swb) obj;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f213235j;
            if (concurrentLinkedQueue == null || !concurrentLinkedQueue.isEmpty()) {
                Iterator it = concurrentLinkedQueue.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!wj50.m88271j(((rwb) it.next()).f203314a, swbVar.f214634a));
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (swb swbVar2 : arrayList) {
            arrayList2.add(new a410(swbVar2.f214634a, swbVar2.f214635b, Long.valueOf(swbVar2.f214636c), null));
        }
        Long l = this.f213232g;
        return m79011i(l != null ? l.longValue() : 0L, arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public final void m79019k(String str, String str2, boolean z) {
        long jM27521a = this.f213227b.m27521a();
        if (this.f213232g == null) {
            this.f213232g = Long.valueOf(jM27521a);
        }
        this.f213234i.add(new swb(str, str2, jM27521a, z));
    }
}
