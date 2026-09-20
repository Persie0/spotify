package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class z860 implements c960 {

    /* JADX INFO: renamed from: a */
    public final Set f280394a;

    public z860(Set set) {
        this.f280394a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z860) && wj50.m88271j(this.f280394a, ((z860) obj).f280394a);
    }

    public final int hashCode() {
        return this.f280394a.hashCode();
    }
}
