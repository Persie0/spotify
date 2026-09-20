package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gbd extends jbd {

    /* JADX INFO: renamed from: c */
    public final nmn0 f78270c;

    /* JADX INFO: renamed from: d */
    public final String f78271d;

    public gbd(nmn0 nmn0Var, String str) {
        super(bsu.f30386c, null);
        this.f78270c = nmn0Var;
        this.f78271d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbd)) {
            return false;
        }
        gbd gbdVar = (gbd) obj;
        return wj50.m88271j(this.f78270c, gbdVar.f78270c) && wj50.m88271j(this.f78271d, gbdVar.f78271d);
    }

    public final int hashCode() {
        return this.f78271d.hashCode() + (this.f78270c.hashCode() * 31);
    }
}
