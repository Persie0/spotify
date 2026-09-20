package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hut0 extends iut0 {

    /* JADX INFO: renamed from: a */
    public final List f95460a;

    public hut0(List list) {
        this.f95460a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hut0) && wj50.m88271j(this.f95460a, ((hut0) obj).f95460a);
    }

    public final int hashCode() {
        return this.f95460a.hashCode();
    }
}
