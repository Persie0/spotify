package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oks {

    /* JADX INFO: renamed from: a */
    public final mks f166661a;

    /* JADX INFO: renamed from: b */
    public final y6s0 f166662b;

    public oks(mks mksVar, y6s0 y6s0Var) {
        this.f166661a = mksVar;
        this.f166662b = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oks)) {
            return false;
        }
        oks oksVar = (oks) obj;
        return wj50.m88271j(this.f166661a, oksVar.f166661a) && wj50.m88271j(this.f166662b, oksVar.f166662b);
    }

    public final int hashCode() {
        return this.f166662b.hashCode() + (this.f166661a.hashCode() * 31);
    }
}
