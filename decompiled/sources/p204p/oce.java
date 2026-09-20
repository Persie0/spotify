package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oce {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f163909a;

    public oce(int i) {
        switch (i) {
            case 1:
                this.f163909a = new LinkedHashMap();
                break;
            default:
                this.f163909a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m66680f(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    /* JADX INFO: renamed from: a */
    public void m66681a(nce nceVar) {
        long[] jArr = nceVar.f152499e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f163909a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(nceVar.f152499e[0]), nceVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public uxz0 m66682b() {
        uxz0 uxz0Var = new uxz0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f163909a.entrySet()) {
            hla1 hla1Var = (hla1) entry.getValue();
            if (hla1Var.f92661e) {
                uxz0Var.m84186a(hla1Var.f92657a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        vie1.m85624f("UseCaseAttachState");
        return uxz0Var;
    }

    /* JADX INFO: renamed from: c */
    public Collection m66683c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f163909a.entrySet()) {
            if (((hla1) entry.getValue()).f92661e) {
                arrayList.add(((hla1) entry.getValue()).f92657a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public Collection m66684d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f163909a.entrySet()) {
            if (((hla1) entry.getValue()).f92661e) {
                arrayList.add(((hla1) entry.getValue()).f92658b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public boolean m66685e(String str) {
        LinkedHashMap linkedHashMap = this.f163909a;
        if (linkedHashMap.containsKey(str)) {
            return ((hla1) linkedHashMap.get(str)).f92661e;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public nce m66686g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (nce nceVar : this.f163909a.values()) {
            arrayList.add(nceVar.f152496b);
            arrayList2.add(nceVar.f152497c);
            arrayList3.add(nceVar.f152498d);
            arrayList4.add(nceVar.f152499e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new nce(iArr3, kgg1.m56349l((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), kgg1.m56349l((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), kgg1.m56349l((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX INFO: renamed from: h */
    public void m66687h(String str, vxz0 vxz0Var, jla1 jla1Var, j28 j28Var, List list) {
        LinkedHashMap linkedHashMap = this.f163909a;
        if (linkedHashMap.containsKey(str)) {
            hla1 hla1Var = new hla1(vxz0Var, jla1Var, j28Var, list);
            hla1 hla1Var2 = (hla1) linkedHashMap.get(str);
            hla1Var.f92661e = hla1Var2.f92661e;
            hla1Var.f92662f = hla1Var2.f92662f;
            linkedHashMap.put(str, hla1Var);
        }
    }

    public oce(String str) {
        this.f163909a = new LinkedHashMap();
    }
}
