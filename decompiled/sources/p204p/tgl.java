package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tgl implements chl {

    /* JADX INFO: renamed from: a */
    public final List f220212a;

    public tgl(List list) {
        this.f220212a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tgl) && wj50.m88271j(this.f220212a, ((tgl) obj).f220212a);
    }

    public final int hashCode() {
        return this.f220212a.hashCode();
    }
}
