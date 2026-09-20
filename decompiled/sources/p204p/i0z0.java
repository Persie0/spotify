package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i0z0 implements m0z0 {

    /* JADX INFO: renamed from: a */
    public final List f97345a;

    public i0z0(List list) {
        this.f97345a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0z0) && wj50.m88271j(this.f97345a, ((i0z0) obj).f97345a);
    }

    public final int hashCode() {
        return this.f97345a.hashCode();
    }
}
