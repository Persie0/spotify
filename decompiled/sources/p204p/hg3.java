package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class hg3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final Set f91007a;

    public hg3(Set set) {
        this.f91007a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg3) && wj50.m88271j(this.f91007a, ((hg3) obj).f91007a);
    }

    public final int hashCode() {
        return this.f91007a.hashCode();
    }
}
