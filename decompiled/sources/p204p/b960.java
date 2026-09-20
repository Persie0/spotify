package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b960 implements c960 {

    /* JADX INFO: renamed from: a */
    public final Set f24783a;

    public b960(Set set) {
        this.f24783a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b960) && wj50.m88271j(this.f24783a, ((b960) obj).f24783a);
    }

    public final int hashCode() {
        return this.f24783a.hashCode();
    }
}
