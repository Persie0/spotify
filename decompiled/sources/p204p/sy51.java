package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class sy51 {

    /* JADX INFO: renamed from: a */
    public final List f215157a;

    public sy51(List list) {
        this.f215157a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy51) && wj50.m88271j(this.f215157a, ((sy51) obj).f215157a);
    }

    public final int hashCode() {
        return this.f215157a.hashCode();
    }
}
