package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7p f151195b;

    /* JADX INFO: renamed from: c */
    public int f151196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7p(r7p r7pVar, ibk ibkVar) {
        super(ibkVar);
        this.f151195b = r7pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151194a = obj;
        this.f151196c |= Integer.MIN_VALUE;
        return this.f151195b.m74955g(null, this);
    }
}
