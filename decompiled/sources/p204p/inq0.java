package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class inq0 implements nnq0 {

    /* JADX INFO: renamed from: a */
    public final Set f104046a;

    public inq0(Set set) {
        this.f104046a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inq0) && wj50.m88271j(this.f104046a, ((inq0) obj).f104046a);
    }

    public final int hashCode() {
        return this.f104046a.hashCode();
    }
}
