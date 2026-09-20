package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d5q0 implements e5q0 {

    /* JADX INFO: renamed from: a */
    public final Set f45473a;

    public d5q0(Set set) {
        this.f45473a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5q0) && wj50.m88271j(this.f45473a, ((d5q0) obj).f45473a);
    }

    public final int hashCode() {
        return this.f45473a.hashCode();
    }
}
