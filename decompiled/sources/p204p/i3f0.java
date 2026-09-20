package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class i3f0 extends j3f0 {

    /* JADX INFO: renamed from: a */
    public final Set f98169a;

    public i3f0(Set set) {
        this.f98169a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3f0) && wj50.m88271j(this.f98169a, ((i3f0) obj).f98169a);
    }

    public final int hashCode() {
        return this.f98169a.hashCode();
    }
}
