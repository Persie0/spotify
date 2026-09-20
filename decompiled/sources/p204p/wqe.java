package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wqe {

    /* JADX INFO: renamed from: a */
    public final List f254027a;

    /* JADX INFO: renamed from: b */
    public final Set f254028b;

    public wqe(List list, Set set) {
        this.f254027a = list;
        this.f254028b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqe)) {
            return false;
        }
        wqe wqeVar = (wqe) obj;
        return wj50.m88271j(this.f254027a, wqeVar.f254027a) && wj50.m88271j(this.f254028b, wqeVar.f254028b);
    }

    public final int hashCode() {
        return this.f254028b.hashCode() + (this.f254027a.hashCode() * 31);
    }
}
