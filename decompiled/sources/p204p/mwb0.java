package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mwb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147748a;

    /* JADX INFO: renamed from: b */
    public int f147749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f147750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwb0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f147750c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147748a = obj;
        this.f147749b |= Integer.MIN_VALUE;
        return this.f147750c.emit(null, this);
    }
}
