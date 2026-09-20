package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i361 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cpa f98049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i361(cpa cpaVar, int i) {
        super(1);
        this.f98048a = i;
        this.f98049b = cpaVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f98048a) {
            case 0:
                return ((zw20) this.f98049b.f40504c).f286890a;
            default:
                return new h361((g361) obj, ((zw20) this.f98049b.f40504c).m97106a());
        }
    }
}
