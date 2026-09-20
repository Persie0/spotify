package p204p;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class gay implements tz60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tz60 f78106a;

    public gay(tz60 tz60Var) {
        this.f78106a = tz60Var;
    }

    @Override // p204p.tz60
    /* JADX INFO: renamed from: a */
    public final Map mo30071a(Set set) {
        Map mapMo30071a = this.f78106a.mo30071a(set);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(mapMo30071a.size()));
        for (Map.Entry entry : mapMo30071a.entrySet()) {
            Object key = entry.getKey();
            ex80 ex80Var = (ex80) entry.getKey();
            Object obj = (pjo) entry.getValue();
            if (iay.m50105a(ex80Var.f63714a) && (obj instanceof mjo)) {
                obj = njo.f154639a;
            }
            linkedHashMap.put(key, obj);
        }
        return linkedHashMap;
    }

    @Override // p204p.tz60
    /* JADX INFO: renamed from: b */
    public final void mo30072b(Set set) {
        this.f78106a.mo30072b(set);
    }

    @Override // p204p.tz60
    /* JADX INFO: renamed from: c */
    public final Object mo30073c(pqm0 pqm0Var, fbk fbkVar) {
        Object objMo30073c = this.f78106a.mo30073c(pqm0Var, fbkVar);
        return objMo30073c == yuk.f276404a ? objMo30073c : w2a1.f247311a;
    }

    @Override // p204p.tz60
    public final void dispose() {
        this.f78106a.dispose();
    }
}
