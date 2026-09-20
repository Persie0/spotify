package p204p;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lpi0 extends jvl0 implements ioi0 {
    /* JADX INFO: renamed from: t */
    public static lpi0 m59671t() {
        return new lpi0(new TreeMap(jvl0.f116365b));
    }

    /* JADX INFO: renamed from: u */
    public static lpi0 m59672u(phi phiVar) {
        TreeMap treeMap = new TreeMap(jvl0.f116365b);
        for (sy7 sy7Var : phiVar.mo39827b()) {
            Set<nhi> setMo39833i = phiVar.mo39833i(sy7Var);
            ArrayMap arrayMap = new ArrayMap();
            for (nhi nhiVar : setMo39833i) {
                arrayMap.put(nhiVar, phiVar.mo39832h(sy7Var, nhiVar));
            }
            treeMap.put(sy7Var, arrayMap);
        }
        return new lpi0(treeMap);
    }

    /* JADX INFO: renamed from: v */
    public final void m59673v(sy7 sy7Var, Object obj) {
        m59674w(sy7Var, nhi.f154013c, obj);
    }

    /* JADX INFO: renamed from: w */
    public final void m59674w(sy7 sy7Var, nhi nhiVar, Object obj) {
        nhi nhiVar2;
        TreeMap treeMap = this.f116367a;
        Map map = (Map) treeMap.get(sy7Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(sy7Var, arrayMap);
            arrayMap.put(nhiVar, obj);
            return;
        }
        nhi nhiVar3 = (nhi) Collections.min(map.keySet());
        if (Objects.equals(map.get(nhiVar3), obj) || nhiVar3 != (nhiVar2 = nhi.f154012b) || nhiVar != nhiVar2) {
            map.put(nhiVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + sy7Var.f215171a + ", existing value (" + nhiVar3 + ")=" + map.get(nhiVar3) + ", conflicting (" + nhiVar + ")=" + obj);
    }
}
