package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class t590 implements z590 {

    /* JADX INFO: renamed from: a */
    public final Set f217246a;

    public t590(Set set) {
        this.f217246a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t590) && wj50.m88271j(this.f217246a, ((t590) obj).f217246a);
    }

    public final int hashCode() {
        return this.f217246a.hashCode();
    }
}
