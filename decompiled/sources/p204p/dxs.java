package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final List f54088a;

    public dxs(List list) {
        this.f54088a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxs) && wj50.m88271j(this.f54088a, ((dxs) obj).f54088a);
    }

    public final int hashCode() {
        return this.f54088a.hashCode();
    }
}
