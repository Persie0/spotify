package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mtt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ntt f147155b;

    /* JADX INFO: renamed from: c */
    public int f147156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtt(ntt nttVar, ibk ibkVar) {
        super(ibkVar);
        this.f147155b = nttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147154a = obj;
        this.f147156c |= Integer.MIN_VALUE;
        return this.f147155b.m65638a(null, this);
    }
}
