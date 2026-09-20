package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class l5s0 implements m5s0 {

    /* JADX INFO: renamed from: a */
    public final Map f129999a;

    public l5s0(Map map) {
        this.f129999a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5s0) && wj50.m88271j(this.f129999a, ((l5s0) obj).f129999a);
    }

    public final int hashCode() {
        return this.f129999a.hashCode();
    }
}
