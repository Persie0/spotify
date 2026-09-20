package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oyk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x5m f171783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyk(x5m x5mVar, int i) {
        super(1);
        this.f171782a = i;
        this.f171783b = x5mVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f171782a) {
            case 0:
                x5m x5mVar = this.f171783b;
                x5mVar.start();
                return new nyk(x5mVar, 0);
            default:
                x5m x5mVar2 = this.f171783b;
                x5mVar2.start();
                return new nyk(x5mVar2, 1);
        }
    }
}
