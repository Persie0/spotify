package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dpi extends epi {

    /* JADX INFO: renamed from: a */
    public final List f51338a;

    public dpi(List list) {
        this.f51338a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpi) && wj50.m88271j(this.f51338a, ((dpi) obj).f51338a);
    }

    public final int hashCode() {
        return this.f51338a.hashCode();
    }
}
