package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oh30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mqr f165328b;

    /* JADX INFO: renamed from: c */
    public int f165329c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh30(mqr mqrVar, ibk ibkVar) {
        super(ibkVar);
        this.f165328b = mqrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165327a = obj;
        this.f165329c |= Integer.MIN_VALUE;
        return this.f165328b.m62586g(null, null, this);
    }
}
