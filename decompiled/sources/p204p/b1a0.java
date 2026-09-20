package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b1a0 implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fnc f22271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l1a0 f22272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f22273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f22274d;

    public b1a0(fnc fncVar, l1a0 l1a0Var, boolean z, boolean z2) {
        this.f22271a = fncVar;
        this.f22272b = l1a0Var;
        this.f22273c = z;
        this.f22274d = z2;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f22271a.collect(new a1a0(nizVar, this.f22272b, this.f22273c, this.f22274d), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
