package p204p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e070 {

    /* JADX INFO: renamed from: a */
    public final HashMap f54891a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final int f54892b = 64;

    /* JADX INFO: renamed from: c */
    public final int f54893c;

    public e070(int i) {
        this.f54893c = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m37481a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m37482b(String str, String str2) {
        boolean zEquals;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strM37481a = m37481a(this.f54893c, str);
            if (this.f54891a.size() >= this.f54892b && !this.f54891a.containsKey(strM37481a)) {
                haz.f89320X.m46953t();
                return false;
            }
            String strM37481a2 = m37481a(this.f54893c, str2);
            String str3 = (String) this.f54891a.get(strM37481a);
            if (str3 == null) {
                zEquals = strM37481a2 == null;
            } else {
                zEquals = str3.equals(strM37481a2);
            }
            if (zEquals) {
                return false;
            }
            HashMap map = this.f54891a;
            if (str2 == null) {
                strM37481a2 = "";
            }
            map.put(strM37481a, strM37481a2);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m37483c(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM37481a = m37481a(this.f54893c, str);
                if (this.f54891a.size() < this.f54892b || this.f54891a.containsKey(strM37481a)) {
                    String str2 = (String) entry.getValue();
                    this.f54891a.put(strM37481a, str2 == null ? "" : m37481a(this.f54893c, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                haz.f89320X.m46953t();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
