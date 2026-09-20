package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i5q0 implements j5q0 {

    /* JADX INFO: renamed from: a */
    public final Map f99009a;

    public i5q0(Map map) {
        this.f99009a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5q0) && wj50.m88271j(this.f99009a, ((i5q0) obj).f99009a);
    }

    public final int hashCode() {
        return this.f99009a.hashCode();
    }
}
