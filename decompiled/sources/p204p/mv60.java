package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mv60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147517a;

    /* JADX INFO: renamed from: b */
    public int f147518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kv60 f147519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv60(kv60 kv60Var, fbk fbkVar) {
        super(fbkVar);
        this.f147519c = kv60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147517a = obj;
        this.f147518b |= Integer.MIN_VALUE;
        return this.f147519c.emit(null, this);
    }
}
