package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xlu implements ylu {

    /* JADX INFO: renamed from: a */
    public final tlu f263238a;

    /* JADX INFO: renamed from: b */
    public final List f263239b;

    public xlu(tlu tluVar, List list) {
        this.f263238a = tluVar;
        this.f263239b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlu)) {
            return false;
        }
        xlu xluVar = (xlu) obj;
        return wj50.m88271j(this.f263238a, xluVar.f263238a) && wj50.m88271j(this.f263239b, xluVar.f263239b);
    }

    public final int hashCode() {
        return this.f263239b.hashCode() + (this.f263238a.hashCode() * 31);
    }

    public /* synthetic */ xlu(tlu tluVar) {
        this(tluVar, lau.f131415a);
    }
}
