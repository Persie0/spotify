package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class x4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final Object f258079a;

    public x4e1(Map map) {
        this.f258079a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4e1) && this.f258079a.equals(((x4e1) obj).f258079a);
    }

    public final int hashCode() {
        return this.f258079a.hashCode();
    }
}
