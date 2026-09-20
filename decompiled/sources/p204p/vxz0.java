package p204p;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vxz0 {

    /* JADX INFO: renamed from: i */
    public static final List f245865i = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a */
    public final ArrayList f245866a;

    /* JADX INFO: renamed from: b */
    public final c28 f245867b;

    /* JADX INFO: renamed from: c */
    public final List f245868c;

    /* JADX INFO: renamed from: d */
    public final List f245869d;

    /* JADX INFO: renamed from: e */
    public final List f245870e;

    /* JADX INFO: renamed from: f */
    public final txz0 f245871f;

    /* JADX INFO: renamed from: g */
    public final yvb f245872g;

    /* JADX INFO: renamed from: h */
    public final InputConfiguration f245873h;

    public vxz0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, yvb yvbVar, txz0 txz0Var, InputConfiguration inputConfiguration, c28 c28Var) {
        this.f245866a = arrayList;
        this.f245868c = Collections.unmodifiableList(arrayList2);
        this.f245869d = Collections.unmodifiableList(arrayList3);
        this.f245870e = Collections.unmodifiableList(arrayList4);
        this.f245871f = txz0Var;
        this.f245872g = yvbVar;
        this.f245873h = inputConfiguration;
        this.f245867b = c28Var;
    }

    /* JADX INFO: renamed from: a */
    public static vxz0 m86699a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        lpi0 lpi0VarM59671t = lpi0.m59671t();
        ArrayList arrayList5 = new ArrayList();
        nqi0 nqi0VarM65450a = nqi0.m65450a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        jvl0 jvl0VarM54384j = jvl0.m54384j(lpi0VarM59671t);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        fs61 fs61Var = fs61.f72777b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = nqi0VarM65450a.f72778a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new vxz0(arrayList, arrayList2, arrayList3, arrayList4, new yvb(arrayList6, jvl0VarM54384j, -1, arrayList7, false, new fs61(arrayMap), null), null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final List m86700b() {
        ArrayList arrayList = new ArrayList();
        for (c28 c28Var : this.f245866a) {
            arrayList.add(c28Var.f33314a);
            Iterator it = c28Var.f33315b.iterator();
            while (it.hasNext()) {
                arrayList.add((mjq) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
