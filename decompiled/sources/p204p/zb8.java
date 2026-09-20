package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zb8 implements bc8 {

    /* JADX INFO: renamed from: a */
    public final Set f281276a;

    public zb8(Set set) {
        this.f281276a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb8) && wj50.m88271j(this.f281276a, ((zb8) obj).f281276a);
    }

    public final int hashCode() {
        return this.f281276a.hashCode();
    }
}
