package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pmd0 {

    /* JADX INFO: renamed from: a */
    public final List f179022a;

    public pmd0(List list) {
        this.f179022a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pmd0) && wj50.m88271j(this.f179022a, ((pmd0) obj).f179022a);
    }

    public final int hashCode() {
        return this.f179022a.hashCode();
    }
}
