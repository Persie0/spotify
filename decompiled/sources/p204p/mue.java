package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mue extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dve f147319b;

    /* JADX INFO: renamed from: c */
    public int f147320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mue(dve dveVar, ibk ibkVar) {
        super(ibkVar);
        this.f147319b = dveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147318a = obj;
        this.f147320c |= Integer.MIN_VALUE;
        return this.f147319b.m37089j(0L, this);
    }
}
