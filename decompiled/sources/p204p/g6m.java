package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g6m extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j6m f77067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6m(j6m j6mVar, int i) {
        super(0);
        this.f77066a = i;
        this.f77067b = j6mVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f77066a) {
            case 0:
                x5m x5mVar = this.f77067b.f109356b;
                if (x5mVar != null) {
                    x5mVar.start();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("curationStateApiService");
                throw null;
            default:
                x5m x5mVar2 = this.f77067b.f109356b;
                if (x5mVar2 != null) {
                    x5mVar2.stop();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("curationStateApiService");
                throw null;
        }
    }
}
