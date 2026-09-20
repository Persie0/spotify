package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class op5 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167757a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f167758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rk0 f167759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ op5(rk0 rk0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f167757a = i;
        this.f167759c = rk0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f167757a) {
            case 0:
                op5 op5Var = new op5(this.f167759c, fbkVar, 0);
                op5Var.f167758b = obj;
                return op5Var;
            default:
                op5 op5Var2 = new op5(this.f167759c, fbkVar, 1);
                op5Var2.f167758b = obj;
                return op5Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f167757a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((op5) create(null, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                throw null;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((op5) create(null, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
                throw null;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f167757a) {
            case 0:
                if (this.f167758b != null) {
                    throw new ClassCastException();
                }
                bga.m29073P(obj);
                throw null;
            default:
                if (this.f167758b != null) {
                    throw new ClassCastException();
                }
                bga.m29073P(obj);
                throw null;
        }
    }
}
