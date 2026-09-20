package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mta1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147007a;

    /* JADX INFO: renamed from: b */
    public int f147008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f147009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mta1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f147009c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147007a = obj;
        this.f147008b |= Integer.MIN_VALUE;
        return this.f147009c.emit(null, this);
    }
}
