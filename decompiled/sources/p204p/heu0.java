package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class heu0 implements peu0 {

    /* JADX INFO: renamed from: a */
    public final List f90509a;

    public heu0(List list) {
        this.f90509a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof heu0) && wj50.m88271j(this.f90509a, ((heu0) obj).f90509a);
    }

    public final int hashCode() {
        return this.f90509a.hashCode();
    }
}
