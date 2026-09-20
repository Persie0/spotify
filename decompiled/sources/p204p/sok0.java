package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sok0 implements zmt {

    /* JADX INFO: renamed from: a */
    public final Set f211206a;

    public sok0(Set set) {
        this.f211206a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sok0) && wj50.m88271j(this.f211206a, ((sok0) obj).f211206a);
    }

    public final int hashCode() {
        return this.f211206a.hashCode();
    }
}
