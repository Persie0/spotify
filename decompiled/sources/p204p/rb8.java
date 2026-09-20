package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rb8 implements sb8 {

    /* JADX INFO: renamed from: a */
    public final Set f197523a;

    public rb8(Set set) {
        this.f197523a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb8) && wj50.m88271j(this.f197523a, ((rb8) obj).f197523a);
    }

    public final int hashCode() {
        return this.f197523a.hashCode();
    }
}
