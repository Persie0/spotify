package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class meq0 implements qeq0 {

    /* JADX INFO: renamed from: a */
    public final Map f142826a;

    public meq0(Map map) {
        this.f142826a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof meq0) && wj50.m88271j(this.f142826a, ((meq0) obj).f142826a);
    }

    public final int hashCode() {
        return this.f142826a.hashCode();
    }
}
