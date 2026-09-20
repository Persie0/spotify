package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class kqf0 implements pqf0 {

    /* JADX INFO: renamed from: a */
    public final Map f125311a;

    public kqf0(Map map) {
        this.f125311a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqf0) && wj50.m88271j(this.f125311a, ((kqf0) obj).f125311a);
    }

    public final int hashCode() {
        return this.f125311a.hashCode();
    }
}
