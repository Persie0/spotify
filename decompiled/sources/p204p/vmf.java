package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class vmf {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f242803a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m85990a() {
        this.f242803a.clear();
    }

    /* JADX INFO: renamed from: b */
    public final kmf m85991b(String str) {
        LinkedHashMap linkedHashMap = this.f242803a;
        kmf kmfVar = (kmf) linkedHashMap.get(str);
        linkedHashMap.remove(str);
        return kmfVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m85992c(kmf kmfVar) {
        LinkedHashMap linkedHashMap = this.f242803a;
        linkedHashMap.clear();
        linkedHashMap.put(kmfVar.f124131a, kmf.m56898a(kmfVar, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, false, 522687));
    }
}
