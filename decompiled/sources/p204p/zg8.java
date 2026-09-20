package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zg8 implements bh8 {

    /* JADX INFO: renamed from: a */
    public final Set f282543a;

    public zg8(Set set) {
        this.f282543a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg8) && wj50.m88271j(this.f282543a, ((zg8) obj).f282543a);
    }

    public final int hashCode() {
        return this.f282543a.hashCode();
    }
}
