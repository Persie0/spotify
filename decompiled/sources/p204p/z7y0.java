package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z7y0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw70 f280298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f280299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f280300d;

    public /* synthetic */ z7y0(yw70 yw70Var, int i, int i2, int i3) {
        this.f280297a = i3;
        this.f280298b = yw70Var;
        this.f280299c = i;
        this.f280300d = i2;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        Object objM94782k;
        switch (this.f280297a) {
            case 0:
                ((Number) obj).intValue();
                yw70 yw70Var = this.f280298b;
                int iM86437v = ((vum0) yw70Var.f276892e.f191124b).m86437v();
                int i = this.f280300d;
                int i2 = this.f280299c;
                return (!(iM86437v == i2 && ((vum0) yw70Var.f276892e.f191125c).m86437v() == i) && (objM94782k = yw70Var.m94782k(i2, i, fbkVar)) == yuk.f276404a) ? objM94782k : w2a1.f247311a;
            default:
                ((Number) obj).intValue();
                Object objM94782k2 = this.f280298b.m94782k(this.f280299c, this.f280300d, fbkVar);
                return objM94782k2 == yuk.f276404a ? objM94782k2 : w2a1.f247311a;
        }
    }
}
