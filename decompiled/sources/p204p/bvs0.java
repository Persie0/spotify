package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bvs0 extends dvs0 {

    /* JADX INFO: renamed from: a */
    public final List f31426a;

    public bvs0(List list) {
        this.f31426a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvs0) && wj50.m88271j(this.f31426a, ((bvs0) obj).f31426a);
    }

    public final int hashCode() {
        return this.f31426a.hashCode();
    }
}
