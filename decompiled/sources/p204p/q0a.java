package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q0a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f183934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r0a f183935b;

    /* JADX INFO: renamed from: c */
    public int f183936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0a(r0a r0aVar, ibk ibkVar) {
        super(ibkVar);
        this.f183935b = r0aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f183934a = obj;
        this.f183936c |= Integer.MIN_VALUE;
        return this.f183935b.m74366a(this);
    }
}
