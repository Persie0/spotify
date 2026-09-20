package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class y860 implements c960 {

    /* JADX INFO: renamed from: a */
    public final Set f270228a;

    public y860(Set set) {
        this.f270228a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y860) && wj50.m88271j(this.f270228a, ((y860) obj).f270228a);
    }

    public final int hashCode() {
        return this.f270228a.hashCode();
    }
}
