package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k7w0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b581 f120205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7w0(b581 b581Var, int i) {
        super(0);
        this.f120204a = i;
        this.f120205b = b581Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f120204a) {
            case 0:
                return Boolean.valueOf(this.f120205b.getState().m31457a() > 0.3f);
            default:
                return this.f120205b.mo28148a();
        }
    }
}
