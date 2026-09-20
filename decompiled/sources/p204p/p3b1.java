package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class p3b1 extends kce0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f173604c = 1;

    /* JADX INFO: renamed from: d */
    public final int f173605d;

    /* JADX WARN: Illegal instructions before constructor call */
    public p3b1(int i) {
        StringBuilder sbM56838j = klh.m56838j(i, "must have at least ", " value parameter");
        sbM56838j.append(i > 1 ? "s" : "");
        super(sbM56838j.toString(), 1);
        this.f173605d = i;
    }

    @Override // p204p.xxd
    /* JADX INFO: renamed from: a */
    public final boolean mo28860a(nd60 nd60Var) {
        switch (this.f173604c) {
            case 0:
                return nd60Var.mo32015K().size() >= this.f173605d;
            default:
                return nd60Var.mo32015K().size() == this.f173605d;
        }
    }

    public p3b1() {
        super("must have exactly 2 value parameters", 1);
        this.f173605d = 2;
    }
}
