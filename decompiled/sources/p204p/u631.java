package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u631 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z631 f227213b;

    public /* synthetic */ u631(z631 z631Var, int i) {
        this.f227212a = i;
        this.f227213b = z631Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f227212a) {
            case 0:
                hqb hqbVar = this.f227213b.f279696d;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith(j931.f110084a);
                }
                return Boolean.TRUE;
            default:
                hqb hqbVar2 = this.f227213b.f279696d;
                if (hqbVar2.isActive()) {
                    hqbVar2.resumeWith(j931.f110085b);
                }
                return w2a1.f247311a;
        }
    }
}
