package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h5q0 implements j5q0 {

    /* JADX INFO: renamed from: a */
    public final Set f87887a;

    public h5q0(Set set) {
        this.f87887a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5q0) && wj50.m88271j(this.f87887a, ((h5q0) obj).f87887a);
    }

    public final int hashCode() {
        return this.f87887a.hashCode();
    }
}
