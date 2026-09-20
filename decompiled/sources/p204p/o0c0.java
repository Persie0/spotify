package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o0c0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a470 f160334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0c0(a470 a470Var, int i) {
        super(1);
        this.f160333a = i;
        this.f160334b = a470Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f160333a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f160334b.f12149b;
            default:
                return new oq91(new o0c0(this.f160334b, 0));
        }
    }
}
