package p204p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lhj0 {

    /* JADX INFO: renamed from: b */
    public static final lhj0 f133582b = new lhj0(kkc0.m56706s0(new LinkedHashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f133583a;

    public lhj0(Map map) {
        this.f133583a = map;
    }

    /* JADX INFO: renamed from: a */
    public final Map m58996a() {
        return this.f133583a;
    }

    /* JADX INFO: renamed from: b */
    public final String m58997b() {
        List list = (List) this.f133583a.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) g6f.m43689C0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhj0) && wj50.m88271j(this.f133583a, ((lhj0) obj).f133583a);
    }

    public final int hashCode() {
        return this.f133583a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f133583a + ')';
    }
}
