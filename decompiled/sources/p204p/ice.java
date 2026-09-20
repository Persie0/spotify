package p204p;

import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.p203bp.DateTimeException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ice implements Comparable {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static ice m50249a(bz61 bz61Var) {
        jlg1.m53716z(bz61Var, "temporal");
        ice iceVar = (ice) bz61Var.mo26518k(ez61.f64286b);
        return iceVar != null ? iceVar : np50.f156881a;
    }

    /* JADX INFO: renamed from: b */
    public static void m50250b(HashMap map, dce dceVar, long j) {
        Long l = (Long) map.get(dceVar);
        if (l == null || l.longValue() == j) {
            map.put(dceVar, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + dceVar + " " + l + " conflicts with " + dceVar + " " + j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((ice) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ice);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
