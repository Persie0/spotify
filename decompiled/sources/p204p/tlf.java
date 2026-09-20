package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class tlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final Set f221458a;

    public tlf(Set set) {
        this.f221458a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlf) && wj50.m88271j(this.f221458a, ((tlf) obj).f221458a);
    }

    public final int hashCode() {
        return this.f221458a.hashCode();
    }
}
