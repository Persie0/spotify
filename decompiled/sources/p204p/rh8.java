package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rh8 implements th8 {

    /* JADX INFO: renamed from: a */
    public final Set f199170a;

    public rh8(Set set) {
        this.f199170a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh8) && wj50.m88271j(this.f199170a, ((rh8) obj).f199170a);
    }

    public final int hashCode() {
        return this.f199170a.hashCode();
    }
}
