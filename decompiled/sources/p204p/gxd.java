package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class gxd implements hxd {

    /* JADX INFO: renamed from: a */
    public final List f85258a;

    public gxd(List list) {
        this.f85258a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxd) && wj50.m88271j(this.f85258a, ((gxd) obj).f85258a);
    }

    public final int hashCode() {
        return this.f85258a.hashCode();
    }
}
