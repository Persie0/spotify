package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class u4g0 {

    /* JADX INFO: renamed from: a */
    public final Map f226683a;

    public u4g0(Map map) {
        this.f226683a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4g0) && wj50.m88271j(this.f226683a, ((u4g0) obj).f226683a);
    }

    public final int hashCode() {
        return this.f226683a.hashCode();
    }
}
