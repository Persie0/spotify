package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v2c extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f236602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fix0 f236603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2c(fix0 fix0Var, int i) {
        super(0);
        this.f236602a = i;
        this.f236603b = fix0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f236602a) {
            case 0:
                this.f236603b.f70012b.invoke();
                break;
            default:
                this.f236603b.f70013c.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
