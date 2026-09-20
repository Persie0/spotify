package p204p;

import com.spotify.home.evopage.events.proto.C0782a;
import com.spotify.home.evopage.events.proto.C0783b;
import com.spotify.home.evopage.events.proto.HomeMetadataLoadingErrorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class p7f0 implements bgo {

    /* JADX INFO: renamed from: a */
    public final String f174682a;

    /* JADX INFO: renamed from: b */
    public final o7f0 f174683b;

    /* JADX INFO: renamed from: c */
    public ago f174684c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f174685d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f174686e = new LinkedHashMap();

    public p7f0(String str, o7f0 o7f0Var) {
        this.f174682a = str;
        this.f174683b = o7f0Var;
    }

    @Override // p204p.bgo
    /* JADX INFO: renamed from: a */
    public final void mo29143a(Set set) {
        ago agoVar;
        String str;
        LinkedHashMap linkedHashMap = this.f174686e;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        LinkedHashSet linkedHashSet = this.f174685d;
        if ((zIsEmpty && linkedHashSet.isEmpty()) || (agoVar = this.f174684c) == null) {
            return;
        }
        LinkedHashMap linkedHashMapM25879p = agoVar.m25879p();
        if (linkedHashMap.isEmpty() && linkedHashSet.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapM25879p.entrySet()) {
            k35 k35Var = (k35) entry.getKey();
            Object value = entry.getValue();
            if ((k35Var.f118762a instanceof jqx) && (value instanceof pjo)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            k35 k35Var2 = (k35) entry2.getKey();
            Object value2 = entry2.getValue();
            tn61 tn61Var = k35Var2.f118762a;
            Object obj = k35Var2.f118763b;
            String str2 = tn61Var + ":" + obj;
            pjo pjoVar = (pjo) value2;
            boolean z = pjoVar instanceof ojo;
            if (z) {
                linkedHashSet2.add(str2);
            }
            if (linkedHashMap.containsKey(str2)) {
                if (z) {
                    i++;
                } else if (pjoVar instanceof mjo) {
                    i2++;
                    if (linkedHashSet.contains(str2)) {
                        continue;
                    } else {
                        mjo mjoVar = (mjo) pjoVar;
                        jqx jqxVar = (jqx) k35Var2.f118762a;
                        String string = obj.toString();
                        up60 up60Var = jqxVar.f115017a;
                        String strMo29111F = up60Var.mo29111F();
                        if (strMo29111F == null) {
                            strMo29111F = up60Var.toString();
                        }
                        kjo kjoVar = mjoVar.f144297a;
                        if (kjoVar instanceof ijo) {
                            str = "notAvailable";
                        } else if (kjoVar instanceof hjo) {
                            str = "missingValue";
                        } else {
                            if (!(kjoVar instanceof jjo)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((jjo) kjoVar).f113062a;
                        }
                        arrayList.add(new pqm0(str2, new n7f0(string, strMo29111F, str)));
                    }
                } else if (pjoVar instanceof njo) {
                    i3++;
                }
            }
        }
        linkedHashSet.removeAll(linkedHashSet2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add((String) ((pqm0) it.next()).f180350a);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((n7f0) ((pqm0) it2.next()).f180351b);
        }
        List<n7f0> listM43714b1 = g6f.m43714b1(g6f.m43711Y0(arrayList2, jlg1.m53700j(p6f0.f174381f, p6f0.f174382g)), 25);
        int size = arrayList.size();
        C0782a c0782aM11769u = HomeMetadataLoadingErrorEvent.m11769u();
        c0782aM11769u.m11776r(this.f174682a);
        o7f0 o7f0Var = this.f174683b;
        c0782aM11769u.m11777s(o7f0Var.f162538b.m61499f());
        c0782aM11769u.m11780v(size);
        c0782aM11769u.m11778t(i);
        c0782aM11769u.m11775q(i2);
        c0782aM11769u.m11779u(i3);
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(listM43714b1, 10));
        for (n7f0 n7f0Var : listM43714b1) {
            C0783b c0783bM11773q = HomeMetadataLoadingErrorEvent.Failures.m11773q();
            c0783bM11773q.m11781m(n7f0Var.f151151a);
            c0783bM11773q.m11783r(n7f0Var.f151152b);
            c0783bM11773q.m11782q(n7f0Var.f151153c);
            arrayList3.add((HomeMetadataLoadingErrorEvent.Failures) c0783bM11773q.build());
        }
        c0782aM11769u.m11774m(arrayList3);
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) c0782aM11769u.build();
        qre0 qre0Var = o7f0Var.f162537a;
        wj50.m88279p(homeMetadataLoadingErrorEvent);
        qre0Var.m73616a(homeMetadataLoadingErrorEvent);
    }

    /* JADX INFO: renamed from: j */
    public final void m69272j(svw0 svw0Var) {
        for (tvw0 tvw0Var : svw0Var.f214523a) {
            if (bm51.m29803n0(tvw0Var.f224264a, "ExtendedMetadataTable", false) && wj50.m88271j(tvw0Var.f224266c, "Required")) {
                String strM56834f = klh.m56834f(tvw0Var.f224264a, ":", tvw0Var.f224265b);
                LinkedHashMap linkedHashMap = this.f174686e;
                Integer num = (Integer) linkedHashMap.get(strM56834f);
                linkedHashMap.put(strM56834f, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m69273k(too tooVar) {
        for (tvw0 tvw0Var : tooVar.f222292a) {
            if (bm51.m29803n0(tvw0Var.f224264a, "ExtendedMetadataTable", false) && wj50.m88271j(tvw0Var.f224266c, "Required")) {
                String strM56834f = klh.m56834f(tvw0Var.f224264a, ":", tvw0Var.f224265b);
                LinkedHashMap linkedHashMap = this.f174686e;
                Integer num = (Integer) linkedHashMap.get(strM56834f);
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue > 1) {
                        linkedHashMap.put(strM56834f, Integer.valueOf(iIntValue - 1));
                    } else {
                        linkedHashMap.remove(strM56834f);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m69280r(ago agoVar) {
        this.f174684c = agoVar;
    }

    @Override // p204p.bgo
    /* JADX INFO: renamed from: b */
    public final void mo29144b() {
    }

    /* JADX INFO: renamed from: d */
    public final void m69266d() {
    }

    /* JADX INFO: renamed from: g */
    public final void m69269g() {
    }

    /* JADX INFO: renamed from: m */
    public final void m69275m() {
    }

    /* JADX INFO: renamed from: p */
    public final void m69278p() {
    }

    /* JADX INFO: renamed from: c */
    public final void m69265c(Object obj) {
    }

    /* JADX INFO: renamed from: e */
    public final void m69267e(int i) {
    }

    /* JADX INFO: renamed from: f */
    public final void m69268f(Set set) {
    }

    /* JADX INFO: renamed from: h */
    public final void m69270h(Object obj) {
    }

    /* JADX INFO: renamed from: i */
    public final void m69271i(bea1 bea1Var) {
    }

    /* JADX INFO: renamed from: l */
    public final void m69274l(Object obj) {
    }

    /* JADX INFO: renamed from: n */
    public final void m69276n(String str) {
    }

    /* JADX INFO: renamed from: o */
    public final void m69277o(String str) {
    }

    /* JADX INFO: renamed from: q */
    public final void m69279q(int i) {
    }
}
