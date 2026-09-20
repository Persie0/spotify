package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z2m implements g3m {

    /* JADX INFO: renamed from: a */
    public final List f278614a;

    public z2m(List list) {
        this.f278614a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2m) && wj50.m88271j(this.f278614a, ((z2m) obj).f278614a);
    }

    public final int hashCode() {
        return this.f278614a.hashCode();
    }
}
