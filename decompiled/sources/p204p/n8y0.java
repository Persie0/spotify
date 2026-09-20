package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n8y0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151662a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sag0 f151663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8y0(sag0 sag0Var, int i) {
        super(0);
        this.f151662a = i;
        this.f151663b = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f151662a) {
            case 0:
                return this.f151663b.m77625j(1, 2);
            case 1:
                return this.f151663b.m77625j(2, 1);
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f151663b.f207208b, st91.f213865b, System.currentTimeMillis());
        }
    }
}
