package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mwz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f147901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ owz f147902b;

    /* JADX INFO: renamed from: c */
    public int f147903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwz(owz owzVar, ibk ibkVar) {
        super(ibkVar);
        this.f147902b = owzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147901a = obj;
        this.f147903c |= Integer.MIN_VALUE;
        return owz.m68190g(this.f147902b, null, false, this);
    }
}
