package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rgf extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sgf f198944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rgf(sgf sgfVar, int i) {
        super(0);
        this.f198943a = i;
        this.f198944b = sgfVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f198943a) {
            case 0:
                this.f198944b.f208855Z.onNext(aif.f15978a);
                return w2a1.f247311a;
            default:
                return Boolean.valueOf(this.f198944b.f208851P0);
        }
    }
}
