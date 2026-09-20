package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i6v0 {

    /* JADX INFO: renamed from: a */
    public final pxj f99337a;

    /* JADX INFO: renamed from: b */
    public final List f99338b;

    public i6v0(List list, pxj pxjVar) {
        this.f99337a = pxjVar;
        this.f99338b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6v0)) {
            return false;
        }
        i6v0 i6v0Var = (i6v0) obj;
        return this.f99337a == i6v0Var.f99337a && wj50.m88271j(this.f99338b, i6v0Var.f99338b);
    }

    public final int hashCode() {
        return this.f99338b.hashCode() + (this.f99337a.hashCode() * 31);
    }
}
