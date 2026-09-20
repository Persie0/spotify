package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e2g extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fgu f55463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f55464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2g(fgu fguVar, kqi0 kqi0Var, int i) {
        super(0);
        this.f55462a = i;
        this.f55463b = fguVar;
        this.f55464c = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f55462a;
        w2a1 w2a1Var = w2a1.f247311a;
        fgu fguVar = this.f55463b;
        kqi0 kqi0Var = this.f55464c;
        switch (i) {
            case 0:
                kqi0Var.setValue(ih5.f102171a);
                fguVar.m41614a();
                break;
            case 1:
                kqi0Var.setValue(jh5.f112338a);
                fguVar.m41614a();
                break;
            default:
                float f = wbb0.f249729a;
                kqi0Var.setValue(null);
                fguVar.m41614a();
                break;
        }
        return w2a1Var;
    }
}
