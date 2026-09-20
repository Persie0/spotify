package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class vre extends yre implements Serializable {

    /* JADX INFO: renamed from: a */
    public final gze1 f244195a;

    public vre(gze1 gze1Var) {
        this.f244195a = gze1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vre)) {
            return false;
        }
        return this.f244195a.equals(((vre) obj).f244195a);
    }

    public final int hashCode() {
        return this.f244195a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f244195a + "]";
    }
}
