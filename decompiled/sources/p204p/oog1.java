package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class oog1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kkc1 f167621b;

    /* JADX INFO: renamed from: c */
    public int f167622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oog1(kkc1 kkc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f167621b = kkc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167620a = obj;
        this.f167622c |= Integer.MIN_VALUE;
        return this.f167621b.m56714g(null, null, this);
    }
}
