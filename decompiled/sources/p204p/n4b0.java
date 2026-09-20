package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n4b0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ra9 f150293b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pa9 f150294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4b0(ra9 ra9Var, pa9 pa9Var, int i) {
        super(1);
        this.f150292a = i;
        this.f150293b = ra9Var;
        this.f150294c = pa9Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f150292a) {
            case 0:
                return new m4b0(this.f150293b, this.f150294c, 0);
            default:
                return new m4b0(this.f150293b, this.f150294c, 1);
        }
    }
}
