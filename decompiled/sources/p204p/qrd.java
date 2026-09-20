package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qrd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ trd f191819b;

    /* JADX INFO: renamed from: c */
    public int f191820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrd(trd trdVar, ibk ibkVar) {
        super(ibkVar);
        this.f191819b = trdVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191818a = obj;
        this.f191820c |= Integer.MIN_VALUE;
        return trd.m81344a(this.f191819b, this);
    }
}
