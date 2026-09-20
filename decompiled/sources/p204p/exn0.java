package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class exn0 {

    /* JADX INFO: renamed from: a */
    public final List f63804a;

    /* JADX INFO: renamed from: b */
    public final Integer f63805b;

    public exn0(Integer num, List list) {
        this.f63804a = list;
        this.f63805b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exn0)) {
            return false;
        }
        exn0 exn0Var = (exn0) obj;
        return wj50.m88271j(this.f63804a, exn0Var.f63804a) && wj50.m88271j(this.f63805b, exn0Var.f63805b);
    }

    public final int hashCode() {
        int iHashCode = this.f63804a.hashCode() * 31;
        Integer num = this.f63805b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
