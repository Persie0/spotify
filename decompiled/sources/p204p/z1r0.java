package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class z1r0 {

    /* JADX INFO: renamed from: a */
    public final List f278405a;

    public z1r0(List list) {
        this.f278405a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1r0) && wj50.m88271j(this.f278405a, ((z1r0) obj).f278405a);
    }

    public final int hashCode() {
        return this.f278405a.hashCode();
    }
}
