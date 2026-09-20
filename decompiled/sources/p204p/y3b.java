package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class y3b {
    public static final x3b Companion = new x3b();

    /* JADX INFO: renamed from: b */
    public static final fr70[] f268796b = {q3d0.m72078I(2, yva.f276617d)};

    /* JADX INFO: renamed from: a */
    public final Map f268797a;

    public /* synthetic */ y3b(int i, Map map) {
        if ((i & 1) == 0) {
            this.f268797a = new LinkedHashMap();
        } else {
            this.f268797a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3b) && wj50.m88271j(this.f268797a, ((y3b) obj).f268797a);
    }

    public final int hashCode() {
        return this.f268797a.hashCode();
    }

    public y3b() {
        this.f268797a = new LinkedHashMap();
    }
}
