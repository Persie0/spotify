package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ses extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tes f208383b;

    /* JADX INFO: renamed from: c */
    public int f208384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ses(tes tesVar, ibk ibkVar) {
        super(ibkVar);
        this.f208383b = tesVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208382a = obj;
        this.f208384c |= Integer.MIN_VALUE;
        return this.f208383b.mo25864m0(0L, this);
    }
}
