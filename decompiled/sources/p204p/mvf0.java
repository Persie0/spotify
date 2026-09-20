package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mvf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ovf0 f147574b;

    /* JADX INFO: renamed from: c */
    public int f147575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvf0(ovf0 ovf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f147574b = ovf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147573a = obj;
        this.f147575c |= Integer.MIN_VALUE;
        return this.f147574b.m68128a(false, this);
    }
}
