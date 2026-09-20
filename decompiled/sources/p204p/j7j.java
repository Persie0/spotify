package p204p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j7j {

    /* JADX INFO: renamed from: a */
    public HashMap f109612a;

    /* JADX INFO: renamed from: b */
    public HashMap f109613b;

    /* JADX INFO: renamed from: c */
    public HashMap f109614c;

    /* JADX INFO: renamed from: a */
    public float m52624a(qva qvaVar) {
        HashMap map = this.f109612a;
        HashMap map2 = this.f109613b;
        if (!(qvaVar instanceof wva)) {
            if (qvaVar instanceof sva) {
                return ((sva) qvaVar).mo73979e();
            }
            return 0.0f;
        }
        String strM73978d = ((wva) qvaVar).m73978d();
        if (map2.containsKey(strM73978d)) {
            return ((h7j) map2.get(strM73978d)).value();
        }
        if (map.containsKey(strM73978d)) {
            return ((Integer) map.get(strM73978d)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public void m52625b(int i, String str) {
        this.f109612a.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public void m52626c(String str, ArrayList arrayList) {
        this.f109614c.put(str, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public void m52627d(int i, String str, String str2) {
        this.f109612a.put(str, str2);
        this.f109613b.put(str2, str);
        this.f109614c.put(str, Integer.valueOf(i));
    }
}
