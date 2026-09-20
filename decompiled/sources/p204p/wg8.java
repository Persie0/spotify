package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final Set f251004a;

    public wg8(Set set) {
        this.f251004a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg8) && wj50.m88271j(this.f251004a, ((wg8) obj).f251004a);
    }

    public final int hashCode() {
        return this.f251004a.hashCode();
    }
}
