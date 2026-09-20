package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class eo11 implements fo11 {

    /* JADX INFO: renamed from: a */
    public final List f61272a;

    public eo11(List list) {
        this.f61272a = list;
    }

    @Override // p204p.fo11
    /* JADX INFO: renamed from: a */
    public final List mo33479a() {
        return this.f61272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo11) && wj50.m88271j(this.f61272a, ((eo11) obj).f61272a);
    }

    public final int hashCode() {
        return this.f61272a.hashCode();
    }
}
