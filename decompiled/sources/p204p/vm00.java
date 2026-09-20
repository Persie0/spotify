package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vm00 extends an00 {

    /* JADX INFO: renamed from: a */
    public final List f242652a;

    public vm00(List list) {
        this.f242652a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm00) && wj50.m88271j(this.f242652a, ((vm00) obj).f242652a);
    }

    public final int hashCode() {
        return this.f242652a.hashCode();
    }
}
