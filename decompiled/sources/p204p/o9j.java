package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o9j {

    /* JADX INFO: renamed from: a */
    public final Set f163045a;

    public o9j(Set set) {
        this.f163045a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9j) && wj50.m88271j(this.f163045a, ((o9j) obj).f163045a);
    }

    public final int hashCode() {
        return this.f163045a.hashCode();
    }
}
