package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class y0t {

    /* JADX INFO: renamed from: a */
    public final Set f268054a;

    /* JADX INFO: renamed from: b */
    public final int f268055b;

    public y0t(int i, Set set) {
        this.f268054a = set;
        this.f268055b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0t)) {
            return false;
        }
        y0t y0tVar = (y0t) obj;
        return wj50.m88271j(this.f268054a, y0tVar.f268054a) && this.f268055b == y0tVar.f268055b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f268055b) + (this.f268054a.hashCode() * 31);
    }
}
