package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class odn0 implements ic50 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f164224a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f164225b = new LinkedHashMap();

    @Override // p204p.ic50
    /* JADX INFO: renamed from: a */
    public final Object mo44137a(lvu0 lvu0Var, fbk fbkVar) {
        vb40 vb40Var = lvu0Var.f137396d;
        LinkedHashSet linkedHashSet = this.f164224a;
        if (linkedHashSet.isEmpty()) {
            return lvu0Var.m60083c((ibk) fbkVar);
        }
        for (Object obj : vb40Var.f239417s.f87925a.values()) {
            if ((obj instanceof String) && linkedHashSet.contains(obj)) {
                LinkedHashMap linkedHashMap = this.f164225b;
                List arrayList = (List) linkedHashMap.get(obj);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vb40Var);
                linkedHashMap.put(obj, arrayList);
                throw new CancellationException("Request is paused");
            }
        }
        return lvu0Var.m60083c((ibk) fbkVar);
    }
}
