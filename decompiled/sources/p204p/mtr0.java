package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mtr0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147143a;

    /* JADX INFO: renamed from: b */
    public int f147144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dar0 f147145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtr0(dar0 dar0Var, fbk fbkVar) {
        super(fbkVar);
        this.f147145c = dar0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147143a = obj;
        this.f147144b |= Integer.MIN_VALUE;
        return this.f147145c.emit(null, this);
    }
}
