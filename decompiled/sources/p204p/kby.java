package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mby f121303b;

    /* JADX INFO: renamed from: c */
    public int f121304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(mby mbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f121303b = mbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121302a = obj;
        this.f121304c |= Integer.MIN_VALUE;
        return this.f121303b.m61430b(null, null, this);
    }
}
