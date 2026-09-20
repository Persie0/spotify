package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tt80 {

    /* JADX INFO: renamed from: a */
    public final List f223551a;

    /* JADX INFO: renamed from: b */
    public final Object f223552b;

    public tt80(List list, List list2) {
        this.f223551a = list;
        this.f223552b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt80)) {
            return false;
        }
        tt80 tt80Var = (tt80) obj;
        return wj50.m88271j(this.f223551a, tt80Var.f223551a) && this.f223552b.equals(tt80Var.f223552b);
    }

    public final int hashCode() {
        return this.f223552b.hashCode() + (this.f223551a.hashCode() * 31);
    }
}
