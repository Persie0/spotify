package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a6r {

    /* JADX INFO: renamed from: a */
    public final x5r f12842a;

    /* JADX INFO: renamed from: b */
    public final List f12843b;

    public a6r(x5r x5rVar, List list) {
        this.f12842a = x5rVar;
        this.f12843b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6r)) {
            return false;
        }
        a6r a6rVar = (a6r) obj;
        return wj50.m88271j(this.f12842a, a6rVar.f12842a) && wj50.m88271j(this.f12843b, a6rVar.f12843b);
    }

    public final int hashCode() {
        return this.f12843b.hashCode() + (this.f12842a.hashCode() * 31);
    }
}
