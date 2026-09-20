package p204p;

import android.content.Context;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class udb implements mla1 {

    /* JADX INFO: renamed from: b */
    public final jvr f229217b;

    public udb(Context context) {
        this.f229217b = jvr.m54388b(context);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x003a  */
    @Override // p204p.mla1
    /* JADX INFO: renamed from: a */
    public final phi mo56820a(lla1 lla1Var, int i) {
        int i2;
        lpi0 lpi0VarM59671t = lpi0.m59671t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        lpi0 lpi0VarM59671t2 = lpi0.m59671t();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = nqi0.m65450a().f72778a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = lla1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 3) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        } else if (i == 2) {
            i2 = 5;
        } else {
            i2 = 1;
        }
        sy7 sy7Var = jla1.f113572x0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        jvl0 jvl0VarM54384j = jvl0.m54384j(lpi0VarM59671t2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        fs61 fs61Var = fs61.f72777b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        lpi0VarM59671t.m59673v(sy7Var, new vxz0(arrayList5, arrayList6, arrayList7, arrayList8, new yvb(arrayList9, jvl0VarM54384j, i2, arrayList10, false, new fs61(arrayMap2), null), null, null, null));
        lpi0VarM59671t.m59673v(jla1.f113574z0, tdb.f219275a);
        HashSet hashSet2 = new HashSet();
        lpi0 lpi0VarM59671t3 = lpi0.m59671t();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = nqi0.m65450a().f72778a;
        int iOrdinal2 = lla1Var.ordinal();
        int i3 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i == 2 ? 5 : 2;
        sy7 sy7Var2 = jla1.f113573y0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        jvl0 jvl0VarM54384j2 = jvl0.m54384j(lpi0VarM59671t3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        fs61 fs61Var2 = fs61.f72777b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        lpi0VarM59671t.m59673v(sy7Var2, new yvb(arrayList12, jvl0VarM54384j2, i3, arrayList13, false, new fs61(arrayMap4), null));
        lpi0VarM59671t.m59673v(jla1.f113564A0, lla1Var == lla1.f134599a ? u440.f226578b : odb.f164143a);
        lla1 lla1Var2 = lla1.f134600b;
        jvr jvrVar = this.f229217b;
        if (lla1Var == lla1Var2) {
            lpi0VarM59671t.m59673v(y940.f270503U, jvrVar.m54392e());
        }
        lpi0VarM59671t.m59673v(y940.f270498P, Integer.valueOf(jvrVar.m54391c(true).getRotation()));
        if (lla1Var == lla1.f134602d || lla1Var == lla1.f134603e) {
            lpi0VarM59671t.m59673v(jla1.f113567D0, Boolean.TRUE);
        }
        return jvl0.m54384j(lpi0VarM59671t);
    }
}
