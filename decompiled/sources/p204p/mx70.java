package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mx70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147979a;

    /* JADX INFO: renamed from: b */
    public int f147980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f147981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f147981c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147979a = obj;
        this.f147980b |= Integer.MIN_VALUE;
        return this.f147981c.emit(null, this);
    }
}
