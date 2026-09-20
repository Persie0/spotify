package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class xuj {

    /* JADX INFO: renamed from: a */
    public final Set f266122a;

    public xuj(Set set) {
        this.f266122a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuj) && wj50.m88271j(this.f266122a, ((xuj) obj).f266122a);
    }

    public final int hashCode() {
        return this.f266122a.hashCode();
    }
}
