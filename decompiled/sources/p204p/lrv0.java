package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lrv0 extends nrv0 {

    /* JADX INFO: renamed from: a */
    public final List f136363a;

    public lrv0(List list) {
        this.f136363a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrv0) && wj50.m88271j(this.f136363a, ((lrv0) obj).f136363a);
    }

    public final int hashCode() {
        return this.f136363a.hashCode();
    }
}
