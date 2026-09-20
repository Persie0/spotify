package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pex extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176874a;

    /* JADX INFO: renamed from: b */
    public int f176875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qex f176876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pex(qex qexVar, ibk ibkVar) {
        super(ibkVar);
        this.f176876c = qexVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176874a = obj;
        this.f176875b |= Integer.MIN_VALUE;
        return this.f176876c.mo15629a(null, null, this);
    }
}
