package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class o2t implements p2t {

    /* JADX INFO: renamed from: a */
    public final Set f161147a;

    public o2t(Set set) {
        this.f161147a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2t) && wj50.m88271j(this.f161147a, ((o2t) obj).f161147a);
    }

    public final int hashCode() {
        return this.f161147a.hashCode();
    }
}
