package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f5a1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wh51 f66001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5a1(wh51 wh51Var, int i) {
        super(1);
        this.f66000a = i;
        this.f66001b = wh51Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f66000a) {
            case 0:
                ((Number) obj).intValue();
                return (st91) this.f66001b.f251262b;
            default:
                return new oq91(new f5a1(this.f66001b, 0));
        }
    }
}
