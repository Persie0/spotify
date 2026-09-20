package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zbu0 implements acu0 {

    /* JADX INFO: renamed from: a */
    public final Set f281395a;

    public zbu0(Set set) {
        this.f281395a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbu0) && wj50.m88271j(this.f281395a, ((zbu0) obj).f281395a);
    }

    public final int hashCode() {
        Set set = this.f281395a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "Reachable(capabilities=" + this.f281395a + ")";
    }
}
