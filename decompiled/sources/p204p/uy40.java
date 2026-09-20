package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uy40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f235149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f235150b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sx40 f235151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy40(gh00 gh00Var, sx40 sx40Var, int i) {
        super(0);
        this.f235149a = i;
        this.f235150b = gh00Var;
        this.f235151c = sx40Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f235149a) {
            case 0:
                this.f235150b.invoke(((px40) this.f235151c).f182201d);
                break;
            case 1:
                this.f235150b.invoke(this.f235151c);
                break;
            case 2:
                this.f235150b.invoke(this.f235151c);
                break;
            case 3:
                this.f235150b.invoke(((ox40) this.f235151c).f170882d);
                break;
            default:
                this.f235150b.invoke(this.f235151c);
                break;
        }
        return w2a1.f247311a;
    }
}
