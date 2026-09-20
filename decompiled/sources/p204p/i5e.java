package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public final class i5e implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f98901b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ twy f98902c;

    public /* synthetic */ i5e(niz nizVar, twy twyVar, int i) {
        this.f98900a = i;
        this.f98901b = nizVar;
        this.f98902c = twyVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        h5e h5eVar;
        k5e k5eVar;
        n5e n5eVar;
        switch (this.f98900a) {
            case 0:
                if (fbkVar instanceof h5e) {
                    h5eVar = (h5e) fbkVar;
                    int i = h5eVar.f87810b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h5eVar.f87810b = i - Integer.MIN_VALUE;
                    } else {
                        h5eVar = new h5e(this, fbkVar);
                    }
                } else {
                    h5eVar = new h5e(this, fbkVar);
                }
                Object obj2 = h5eVar.f87809a;
                int i2 = h5eVar.f87810b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    SortedMap sortedMap = (SortedMap) obj;
                    int size = sortedMap.size();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : sortedMap.entrySet()) {
                        Integer num = (Integer) entry.getKey();
                        twy twyVar = this.f98902c;
                        List list = (List) twyVar.f224512d;
                        wj50.m88279p(num);
                        Integer numMo41116h = ((s4e) list.get(num.intValue())).mo41116h();
                        if (size >= (numMo41116h != null ? numMo41116h.intValue() : ((md4) twyVar.f224510b).m61507a())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    TreeMap treeMap = new TreeMap(linkedHashMap);
                    h5eVar.f87810b = 1;
                    Object objEmit = this.f98901b.emit(treeMap, h5eVar);
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
                if (fbkVar instanceof k5e) {
                    k5eVar = (k5e) fbkVar;
                    int i3 = k5eVar.f119487b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k5eVar.f119487b = i3 - Integer.MIN_VALUE;
                    } else {
                        k5eVar = new k5e(this, fbkVar);
                    }
                } else {
                    k5eVar = new k5e(this, fbkVar);
                }
                Object obj3 = k5eVar.f119486a;
                int i4 = k5eVar.f119487b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Set<Integer> setKeySet = ((SortedMap) obj).keySet();
                    boolean z = false;
                    if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        for (Integer num2 : setKeySet) {
                            List list2 = (List) this.f98902c.f224512d;
                            wj50.m88279p(num2);
                            if (((s4e) list2.get(num2.intValue())).getType() == 2) {
                                z = true;
                            }
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    k5eVar.f119487b = 1;
                    Object objEmit2 = this.f98901b.emit(boolValueOf, k5eVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof n5e) {
                    n5eVar = (n5e) fbkVar;
                    int i5 = n5eVar.f150530b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        n5eVar.f150530b = i5 - Integer.MIN_VALUE;
                    } else {
                        n5eVar = new n5e(this, fbkVar);
                    }
                } else {
                    n5eVar = new n5e(this, fbkVar);
                }
                Object obj4 = n5eVar.f150529a;
                int i6 = n5eVar.f150530b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    List<Integer> listM43714b1 = g6f.m43714b1(((SortedMap) obj).keySet(), 99);
                    ArrayList arrayList = new ArrayList(i6f.m49804T(listM43714b1, 10));
                    for (Integer num3 : listM43714b1) {
                        wj50.m88279p(num3);
                        arrayList.add(new d5e(num3.intValue(), (s4e) ((List) this.f98902c.f224512d).get(num3.intValue())));
                    }
                    n5eVar.f150530b = 1;
                    Object objEmit3 = this.f98901b.emit(arrayList, n5eVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objEmit3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
