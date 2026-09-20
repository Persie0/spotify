package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class hhf0 {

    /* JADX INFO: renamed from: a */
    public final Map f91380a;

    public hhf0(Map map) {
        this.f91380a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhf0) && wj50.m88271j(this.f91380a, ((hhf0) obj).f91380a);
    }

    public final int hashCode() {
        return this.f91380a.hashCode();
    }
}
