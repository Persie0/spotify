package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ocj0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pcj0 f163936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ocj0(pcj0 pcj0Var, int i) {
        super(1);
        this.f163935a = i;
        this.f163936b = pcj0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f163935a) {
            case 0:
                if (((lue0) obj) instanceof iue0) {
                    this.f163936b.f176144g = null;
                }
                break;
            case 1:
                pcj0 pcj0Var = this.f163936b;
                x0h1.m89578u(pcj0Var.f176143f, null, 0, new l2i0(pcj0Var, null, 9), 3);
                break;
            default:
                pcj0 pcj0Var2 = this.f163936b;
                x0h1.m89578u(pcj0Var2.f176143f, null, 0, new l2i0(pcj0Var2, null, 9), 3);
                break;
        }
        return w2a1.f247311a;
    }
}
