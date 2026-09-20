package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class np10 implements v1x {

    /* JADX INFO: renamed from: a */
    public final Set f156848a;

    public np10(Set set) {
        this.f156848a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np10) && wj50.m88271j(this.f156848a, ((np10) obj).f156848a);
    }

    public final int hashCode() {
        return this.f156848a.hashCode();
    }
}
