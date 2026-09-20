package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k5v implements t5v {

    /* JADX INFO: renamed from: a */
    public final Set f119589a;

    public k5v(Set set) {
        this.f119589a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5v) && wj50.m88271j(this.f119589a, ((k5v) obj).f119589a);
    }

    public final int hashCode() {
        return this.f119589a.hashCode();
    }
}
