package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class u4s0 implements v4s0 {

    /* JADX INFO: renamed from: a */
    public final Set f226794a;

    public u4s0(Set set) {
        this.f226794a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4s0) && wj50.m88271j(this.f226794a, ((u4s0) obj).f226794a);
    }

    public final int hashCode() {
        return this.f226794a.hashCode();
    }
}
