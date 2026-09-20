package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lkl0 implements okl0 {

    /* JADX INFO: renamed from: a */
    public final List f134388a;

    public lkl0(List list) {
        this.f134388a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkl0) && wj50.m88271j(this.f134388a, ((lkl0) obj).f134388a);
    }

    public final int hashCode() {
        return this.f134388a.hashCode();
    }
}
