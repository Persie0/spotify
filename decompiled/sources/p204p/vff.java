package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vff extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f240972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tff f240973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vff(gh00 gh00Var, tff tffVar, int i) {
        super(0);
        this.f240971a = i;
        this.f240972b = gh00Var;
        this.f240973c = tffVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f240971a) {
            case 0:
                this.f240972b.invoke(new pff(this.f240973c.f219942h));
                break;
            case 1:
                this.f240972b.invoke(new nff(this.f240973c.f219942h));
                break;
            case 2:
                this.f240972b.invoke(new mff(this.f240973c.f219942h));
                break;
            case 3:
                this.f240972b.invoke(new off(this.f240973c.f219942h));
                break;
            case 4:
                this.f240972b.invoke(new nff(this.f240973c.f219942h));
                break;
            case 5:
                this.f240972b.invoke(new mff(this.f240973c.f219942h));
                break;
            default:
                this.f240972b.invoke(new off(this.f240973c.f219942h));
                break;
        }
        return w2a1.f247311a;
    }
}
