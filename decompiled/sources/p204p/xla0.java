package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xla0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ skp f263082b;

    /* JADX INFO: renamed from: c */
    public int f263083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla0(skp skpVar, ibk ibkVar) {
        super(ibkVar);
        this.f263082b = skpVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263081a = obj;
        this.f263083c |= Integer.MIN_VALUE;
        Object objM78380d = this.f263082b.m78380d(null, null, this);
        return objM78380d == yuk.f276404a ? objM78380d : new s6x0(objM78380d);
    }
}
