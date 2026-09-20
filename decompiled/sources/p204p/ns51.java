package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ns51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bc21 f157690b;

    /* JADX INFO: renamed from: c */
    public int f157691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns51(bc21 bc21Var, ibk ibkVar) {
        super(ibkVar);
        this.f157690b = bc21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157689a = obj;
        this.f157691c |= Integer.MIN_VALUE;
        return this.f157690b.m28666j(null, this);
    }
}
