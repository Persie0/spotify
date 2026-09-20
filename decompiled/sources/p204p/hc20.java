package p204p;

import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes16.dex */
public abstract class hc20 implements gc20 {

    /* JADX INFO: renamed from: a */
    public final Object f89665a;

    public hc20(Object... objArr) {
        this.f89665a = new ArrayList();
        for (Object obj : objArr) {
            ((ArrayList) this.f89665a).add(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m47091b(String str) {
        String str2 = (String) ((TreeMap) this.f89665a).get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    public synchronized ArrayList m47092c() {
        return new ArrayList((ArrayList) this.f89665a);
    }

    /* JADX INFO: renamed from: d */
    public void m47093d(String str, String str2) {
        ((TreeMap) this.f89665a).put(str, str2);
    }

    public hc20() {
        this.f89665a = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }
}
