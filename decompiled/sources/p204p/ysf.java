package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ysf {

    /* JADX INFO: renamed from: a */
    public final xsf f275763a;

    /* JADX INFO: renamed from: b */
    public final List f275764b;

    public ysf(xsf xsfVar, List list) {
        this.f275763a = xsfVar;
        this.f275764b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysf)) {
            return false;
        }
        ysf ysfVar = (ysf) obj;
        return wj50.m88271j(this.f275763a, ysfVar.f275763a) && wj50.m88271j(this.f275764b, ysfVar.f275764b);
    }

    public final int hashCode() {
        return this.f275764b.hashCode() + (this.f275763a.hashCode() * 31);
    }
}
