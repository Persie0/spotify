package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class w6z {

    /* JADX INFO: renamed from: a */
    public final List f248490a;

    /* JADX INFO: renamed from: b */
    public final List f248491b;

    public w6z(List list, List list2) {
        this.f248490a = list;
        this.f248491b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6z)) {
            return false;
        }
        w6z w6zVar = (w6z) obj;
        return wj50.m88271j(this.f248490a, w6zVar.f248490a) && wj50.m88271j(this.f248491b, w6zVar.f248491b);
    }

    public final int hashCode() {
        return this.f248491b.hashCode() + (this.f248490a.hashCode() * 31);
    }
}
