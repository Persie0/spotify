package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class t9j implements w9j {

    /* JADX INFO: renamed from: a */
    public final Set f218319a;

    public t9j(Set set) {
        this.f218319a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9j) && wj50.m88271j(this.f218319a, ((t9j) obj).f218319a);
    }

    public final int hashCode() {
        return this.f218319a.hashCode();
    }
}
