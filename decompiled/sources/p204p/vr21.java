package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vr21 implements wr21 {

    /* JADX INFO: renamed from: a */
    public final List f244052a;

    public vr21(List list) {
        this.f244052a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr21) && wj50.m88271j(this.f244052a, ((vr21) obj).f244052a);
    }

    public final int hashCode() {
        return this.f244052a.hashCode();
    }
}
