package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class u3b0 implements v3b0 {

    /* JADX INFO: renamed from: a */
    public final Map f226314a;

    public u3b0(Map map) {
        this.f226314a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3b0) && wj50.m88271j(this.f226314a, ((u3b0) obj).f226314a);
    }

    public final int hashCode() {
        return this.f226314a.hashCode();
    }
}
