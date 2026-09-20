package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class gvh {

    /* JADX INFO: renamed from: a */
    public final String f84756a;

    /* JADX INFO: renamed from: b */
    public final List f84757b;

    public gvh(String str, List list) {
        this.f84756a = str;
        this.f84757b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvh)) {
            return false;
        }
        gvh gvhVar = (gvh) obj;
        return wj50.m88271j(this.f84756a, gvhVar.f84756a) && wj50.m88271j(this.f84757b, gvhVar.f84757b);
    }

    public final int hashCode() {
        return this.f84757b.hashCode() + (this.f84756a.hashCode() * 31);
    }
}
