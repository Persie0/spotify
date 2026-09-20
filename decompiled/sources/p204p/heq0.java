package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class heq0 implements peq0 {

    /* JADX INFO: renamed from: a */
    public final Set f90486a;

    public heq0(Set set) {
        this.f90486a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof heq0) && wj50.m88271j(this.f90486a, ((heq0) obj).f90486a);
    }

    public final int hashCode() {
        return this.f90486a.hashCode();
    }
}
