package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class gpq0 implements lpq0 {

    /* JADX INFO: renamed from: a */
    public final Set f83233a;

    public gpq0(Set set) {
        this.f83233a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpq0) && wj50.m88271j(this.f83233a, ((gpq0) obj).f83233a);
    }

    public final int hashCode() {
        return this.f83233a.hashCode();
    }
}
