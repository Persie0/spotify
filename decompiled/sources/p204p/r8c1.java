package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r8c1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t5o0 f196769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8c1(t5o0 t5o0Var, int i) {
        super(1);
        this.f196768a = i;
        this.f196769b = t5o0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f196768a) {
            case 0:
                ((s5o0) obj).m77294i(this.f196769b, 0, 0, 0.0f);
                break;
            case 1:
                s5o0.m77288l((s5o0) obj, this.f196769b, 0, 0, ube1.f228724a1, 4);
                break;
            default:
                s5o0 s5o0Var = (s5o0) obj;
                t5o0 t5o0Var = this.f196769b;
                if (t5o0Var != null) {
                    s5o0Var.m77294i(t5o0Var, 0, 0, 0.0f);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
