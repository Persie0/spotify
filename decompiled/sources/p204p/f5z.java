package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f5z {

    /* JADX INFO: renamed from: a */
    public final Set f66223a;

    public f5z(Set set) {
        this.f66223a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5z) && wj50.m88271j(this.f66223a, ((f5z) obj).f66223a);
    }

    public final int hashCode() {
        return this.f66223a.hashCode();
    }
}
