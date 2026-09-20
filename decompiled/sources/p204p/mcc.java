package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class mcc extends scc {

    /* JADX INFO: renamed from: a */
    public final List f142124a;

    public mcc(List list) {
        this.f142124a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcc) && wj50.m88271j(this.f142124a, ((mcc) obj).f142124a);
    }

    public final int hashCode() {
        return this.f142124a.hashCode();
    }
}
