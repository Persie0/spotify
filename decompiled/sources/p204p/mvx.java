package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mvx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ai50 f147666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvx(ai50 ai50Var, int i) {
        super(1);
        this.f147665a = i;
        this.f147666b = ai50Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f147665a) {
            case 0:
                q381 q381Var = this.f147666b.f15890e;
                if (q381Var != null) {
                    q381Var.mo33779a();
                }
                break;
            default:
                q381 q381Var2 = this.f147666b.f15890e;
                if (q381Var2 != null) {
                    q381Var2.mo33780c();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
