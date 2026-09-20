package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d341 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f341 f44770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d341(f341 f341Var, int i) {
        super(1);
        this.f44769a = i;
        this.f44770b = f341Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f44769a) {
            case 0:
                return this.f44770b.f65353d;
            default:
                return new y241(this.f44770b.f65351b.f161282a, true);
        }
    }
}
