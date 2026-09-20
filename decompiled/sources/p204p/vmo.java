package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vmo extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f242882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umo f242883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmo(gh00 gh00Var, hr81 hr81Var, umo umoVar, int i) {
        super(0);
        this.f242881a = i;
        this.f242882b = gh00Var;
        this.f242883c = umoVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f242881a) {
            case 0:
                this.f242882b.invoke(new rmo(this.f242883c.f231927c.m93744q6(1L)));
                break;
            default:
                this.f242882b.invoke(new rmo(this.f242883c.f231927c.m93744q6(-1L)));
                break;
        }
        return w2a1.f247311a;
    }
}
