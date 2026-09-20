package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class j2f0 extends k2f0 {

    /* JADX INFO: renamed from: a */
    public final Set f108069a;

    public j2f0(Set set) {
        this.f108069a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2f0) && wj50.m88271j(this.f108069a, ((j2f0) obj).f108069a);
    }

    public final int hashCode() {
        return this.f108069a.hashCode();
    }
}
