package p204p;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dua extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final qh00 f53021a;

    /* JADX INFO: renamed from: b */
    public final tvl0 f53022b;

    public dua(qh00 qh00Var, tvl0 tvl0Var) {
        this.f53021a = qh00Var;
        this.f53022b = tvl0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qh00 qh00Var = this.f53021a;
        return this.f53022b.compare(qh00Var.apply(obj), qh00Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dua) {
            dua duaVar = (dua) obj;
            if (this.f53021a.equals(duaVar.f53021a) && this.f53022b.equals(duaVar.f53022b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53021a, this.f53022b});
    }

    public final String toString() {
        return this.f53022b + ".onResultOf(" + this.f53021a + ")";
    }
}
