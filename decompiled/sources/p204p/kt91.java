package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kt91 {

    /* JADX INFO: renamed from: a */
    public final ou91 f126193a;

    public kt91(ou91 ou91Var) {
        this.f126193a = ou91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt91) && wj50.m88271j(this.f126193a, ((kt91) obj).f126193a);
    }

    public final int hashCode() {
        return this.f126193a.f170235e.hashCode();
    }

    public final String toString() {
        return "UbiDwellTimeImpressionPartial(impressionEvent=" + this.f126193a + ')';
    }
}
