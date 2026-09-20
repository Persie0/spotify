package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uei {

    /* JADX INFO: renamed from: a */
    public final luh f229542a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f229543b;

    public uei(luh luhVar, pfa0 pfa0Var) {
        this.f229542a = luhVar;
        this.f229543b = pfa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uei)) {
            return false;
        }
        uei ueiVar = (uei) obj;
        return wj50.m88271j(this.f229542a, ueiVar.f229542a) && wj50.m88271j(this.f229543b, ueiVar.f229543b);
    }

    public final int hashCode() {
        return this.f229543b.hashCode() + (this.f229542a.hashCode() * 31);
    }
}
