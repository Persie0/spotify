package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147432a;

    /* JADX INFO: renamed from: b */
    public int f147433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f147434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mus0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f147434c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147432a = obj;
        this.f147433b |= Integer.MIN_VALUE;
        return this.f147434c.emit(null, this);
    }
}
