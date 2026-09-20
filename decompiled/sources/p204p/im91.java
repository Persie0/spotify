package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class im91 implements tks {

    /* JADX INFO: renamed from: a */
    public final int f103647a;

    /* JADX INFO: renamed from: b */
    public final int f103648b;

    /* JADX INFO: renamed from: c */
    public final bqs f103649c;

    public im91(int i, bqs bqsVar, int i2) {
        this(i, 0, (i2 & 4) != 0 ? iqs.f104839a : bqsVar);
    }

    @Override // p204p.n05
    /* JADX INFO: renamed from: a */
    public final g5b1 mo31113a(tm91 tm91Var) {
        return new p4l0(this.f103647a, this.f103648b, this.f103649c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof im91) {
            im91 im91Var = (im91) obj;
            if (im91Var.f103647a == this.f103647a && im91Var.f103648b == this.f103648b && wj50.m88271j(im91Var.f103649c, this.f103649c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f103649c.hashCode() + (this.f103647a * 31)) * 31) + this.f103648b;
    }

    @Override // p204p.tks, p204p.n05
    /* JADX INFO: renamed from: a */
    public final i5b1 mo31113a(tm91 tm91Var) {
        return new p4l0(this.f103647a, this.f103648b, this.f103649c);
    }

    public im91(int i, int i2, bqs bqsVar) {
        this.f103647a = i;
        this.f103648b = i2;
        this.f103649c = bqsVar;
    }
}
