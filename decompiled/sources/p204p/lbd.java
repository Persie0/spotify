package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lbd extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mbd f131632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbd(mbd mbdVar, int i) {
        super(0);
        this.f131631a = i;
        this.f131632b = mbdVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f131631a) {
            case 0:
                return new jdg0(new kdg0(new l9g0(this.f131632b.f141879a, 18)));
            default:
                return new mdg0(new x9g0(new l9g0(this.f131632b.f141879a, 18), (char) 0));
        }
    }
}
