package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vfl0 {

    /* JADX INFO: renamed from: a */
    public final List f240998a;

    /* JADX INFO: renamed from: b */
    public final int f240999b;

    public vfl0(int i, List list) {
        this.f240998a = list;
        this.f240999b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfl0)) {
            return false;
        }
        vfl0 vfl0Var = (vfl0) obj;
        return wj50.m88271j(this.f240998a, vfl0Var.f240998a) && this.f240999b == vfl0Var.f240999b;
    }

    public final int hashCode() {
        List list = this.f240998a;
        return Integer.hashCode(this.f240999b) + ((list == null ? 0 : list.hashCode()) * 31);
    }
}
