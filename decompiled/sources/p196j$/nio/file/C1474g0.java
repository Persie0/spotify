package p196j$.nio.file;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p196j$.time.format.C1553a;
import p196j$.time.format.C1572t;
import p196j$.time.format.TextStyle;

/* JADX INFO: renamed from: j$.nio.file.g0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1474g0 implements InterfaceC1482k0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10553a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f10554b;

    /* JADX INFO: renamed from: c */
    public final Object f10555c;

    public C1474g0(String str, Class cls) {
        this.f10554b = str;
        this.f10555c = cls;
    }

    /* JADX INFO: renamed from: a */
    public String m23919a(long j, TextStyle textStyle) {
        Map map = (Map) ((Map) this.f10554b).get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // p196j$.nio.file.InterfaceC1482k0
    public String name() {
        return (String) this.f10554b;
    }

    public String toString() {
        switch (this.f10553a) {
            case 0:
                return (String) this.f10554b;
            default:
                return super.toString();
        }
    }

    @Override // p196j$.nio.file.InterfaceC1482k0
    public Class type() {
        return (Class) this.f10555c;
    }

    public C1474g0(Map map) {
        this.f10554b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                C1572t c1572t = C1553a.f10708b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C1553a.f10708b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C1553a.f10708b);
        this.f10555c = map2;
    }
}
