package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class olz extends wc9 {

    /* JADX INFO: renamed from: a */
    public final ee9 f166944a;

    /* JADX INFO: renamed from: b */
    public final x6x0 f166945b;

    public olz(ee9 ee9Var, x6x0 x6x0Var) {
        this.f166944a = ee9Var;
        this.f166945b = x6x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olz)) {
            return false;
        }
        olz olzVar = (olz) obj;
        return wj50.m88271j(this.f166944a, olzVar.f166944a) && wj50.m88271j(this.f166945b, olzVar.f166945b);
    }

    public final int hashCode() {
        return this.f166945b.hashCode() + (this.f166944a.hashCode() * 31);
    }
}
