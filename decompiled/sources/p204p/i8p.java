package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i8p extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b250 f99820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8p(b250 b250Var, int i) {
        super(1);
        this.f99819a = i;
        this.f99820b = b250Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f99819a) {
            case 0:
                return this.f99820b;
            default:
                ((i551) obj).f98811a.m58200a(this.f99820b);
                return w2a1.f247311a;
        }
    }
}
