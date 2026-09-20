package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dda0 {

    /* JADX INFO: renamed from: a */
    public final List f47756a;

    public dda0(List list) {
        this.f47756a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dda0) && wj50.m88271j(this.f47756a, ((dda0) obj).f47756a);
    }

    public final int hashCode() {
        return this.f47756a.hashCode();
    }
}
