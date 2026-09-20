package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e1t implements f1t {

    /* JADX INFO: renamed from: a */
    public final Set f55249a;

    public e1t(Set set) {
        this.f55249a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1t) && wj50.m88271j(this.f55249a, ((e1t) obj).f55249a);
    }

    public final int hashCode() {
        return this.f55249a.hashCode();
    }
}
