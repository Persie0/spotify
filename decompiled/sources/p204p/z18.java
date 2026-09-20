package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z18 {

    /* JADX INFO: renamed from: a */
    public final wre f278253a;

    /* JADX INFO: renamed from: b */
    public final HashMap f278254b;

    public z18(wre wreVar, HashMap map) {
        this.f278253a = wreVar;
        this.f278254b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m95092a(ler0 ler0Var, long j, int i) {
        long jMo66379d = j - this.f278253a.mo66379d();
        a28 a28Var = (a28) this.f278254b.get(ler0Var);
        long j2 = a28Var.f11590a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jMo66379d), a28Var.f11591b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z18)) {
            return false;
        }
        z18 z18Var = (z18) obj;
        return this.f278253a.equals(z18Var.f278253a) && this.f278254b.equals(z18Var.f278254b);
    }

    public final int hashCode() {
        return ((this.f278253a.hashCode() ^ 1000003) * 1000003) ^ this.f278254b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f278253a + ", values=" + this.f278254b + "}";
    }
}
