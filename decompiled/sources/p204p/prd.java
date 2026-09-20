package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class prd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ trd f180554b;

    /* JADX INFO: renamed from: c */
    public int f180555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prd(trd trdVar, ibk ibkVar) {
        super(ibkVar);
        this.f180554b = trdVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180553a = obj;
        this.f180555c |= Integer.MIN_VALUE;
        return this.f180554b.m81345b(this);
    }
}
