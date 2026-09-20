package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class feo implements heo {

    /* JADX INFO: renamed from: a */
    public final List f68812a;

    public feo(List list) {
        this.f68812a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feo) && wj50.m88271j(this.f68812a, ((feo) obj).f68812a);
    }

    public final int hashCode() {
        return this.f68812a.hashCode();
    }
}
