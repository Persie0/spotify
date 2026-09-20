package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class m5p {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f140273a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m60867a(Boolean bool, String str, String str2) {
        LinkedHashMap linkedHashMap = this.f140273a;
        Map map = (Map) linkedHashMap.get(str);
        if (map == null || map.isEmpty()) {
            linkedHashMap.put(str, kkc0.m56694g0(new pqm0(str2, bool)));
            return;
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(str);
        if (linkedHashMap2 != null) {
            linkedHashMap2.put(str2, bool);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m60868b(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f140273a.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap.get(str2);
        }
        return null;
    }
}
