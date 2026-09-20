package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final List f135545a;

    public lot0(List list) {
        this.f135545a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lot0) && wj50.m88271j(this.f135545a, ((lot0) obj).f135545a);
    }

    public final int hashCode() {
        return this.f135545a.hashCode();
    }
}
