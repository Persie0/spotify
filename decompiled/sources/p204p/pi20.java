package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pi20 {

    /* JADX INFO: renamed from: a */
    public final List f177820a;

    /* JADX INFO: renamed from: b */
    public final a281 f177821b;

    public pi20(List list, a281 a281Var) {
        this.f177820a = list;
        this.f177821b = a281Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi20)) {
            return false;
        }
        pi20 pi20Var = (pi20) obj;
        return wj50.m88271j(this.f177820a, pi20Var.f177820a) && wj50.m88271j(this.f177821b, pi20Var.f177821b);
    }

    public final int hashCode() {
        return this.f177821b.hashCode() + (this.f177820a.hashCode() * 31);
    }
}
