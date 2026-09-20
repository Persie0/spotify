package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i4s implements k4s {

    /* JADX INFO: renamed from: a */
    public final Set f98580a;

    public i4s(Set set) {
        this.f98580a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4s) && wj50.m88271j(this.f98580a, ((i4s) obj).f98580a);
    }

    public final int hashCode() {
        return this.f98580a.hashCode();
    }
}
