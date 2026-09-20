package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dmz extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqb f50640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmz(hqb hqbVar, int i) {
        super(0);
        this.f50639a = i;
        this.f50640b = hqbVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f50639a) {
            case 0:
                hqb hqbVar = this.f50640b;
                boolean zIsActive = hqbVar.isActive();
                w2a1 w2a1Var = w2a1.f247311a;
                if (zIsActive) {
                    hqbVar.resumeWith(w2a1Var);
                }
                return w2a1Var;
            case 1:
                this.f50640b.resumeWith(Boolean.FALSE);
                return w2a1.f247311a;
            case 2:
                this.f50640b.resumeWith(Boolean.FALSE);
                return w2a1.f247311a;
            default:
                hqb hqbVar2 = this.f50640b;
                if (hqbVar2.isActive()) {
                    hqbVar2.resumeWith(yp1.f274790a);
                }
                return w2a1.f247311a;
        }
    }
}
