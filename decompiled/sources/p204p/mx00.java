package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mx00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ px00 f147917b;

    /* JADX INFO: renamed from: c */
    public int f147918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx00(px00 px00Var, ibk ibkVar) {
        super(ibkVar);
        this.f147917b = px00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147916a = obj;
        this.f147918c |= Integer.MIN_VALUE;
        return this.f147917b.m71341f(null, null, null, null, this);
    }
}
