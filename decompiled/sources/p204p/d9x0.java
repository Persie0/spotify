package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d9x0 {

    /* JADX INFO: renamed from: a */
    public final Set f46929a;

    public d9x0(Set set) {
        this.f46929a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9x0) && wj50.m88271j(this.f46929a, ((d9x0) obj).f46929a);
    }

    public final int hashCode() {
        return this.f46929a.hashCode();
    }
}
