package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final List f269789a;

    public y6i(List list) {
        this.f269789a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6i) && wj50.m88271j(this.f269789a, ((y6i) obj).f269789a);
    }

    public final int hashCode() {
        return this.f269789a.hashCode();
    }
}
