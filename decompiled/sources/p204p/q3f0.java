package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class q3f0 extends r3f0 {

    /* JADX INFO: renamed from: a */
    public final Set f184876a;

    public q3f0(Set set) {
        this.f184876a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3f0) && wj50.m88271j(this.f184876a, ((q3f0) obj).f184876a);
    }

    public final int hashCode() {
        return this.f184876a.hashCode();
    }
}
