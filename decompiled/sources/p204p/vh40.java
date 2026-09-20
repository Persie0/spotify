package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class vh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final Map f241407a;

    public vh40(Map map) {
        this.f241407a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh40) && wj50.m88271j(this.f241407a, ((vh40) obj).f241407a);
    }

    public final int hashCode() {
        return this.f241407a.hashCode();
    }
}
