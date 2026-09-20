package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ni5 {
    /* JADX INFO: renamed from: a */
    public static Object[] m64553a(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj instanceof Object[]) {
                for (Object obj2 : m64553a((Object[]) obj)) {
                    arrayList.add(obj2);
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList.toArray();
    }
}
