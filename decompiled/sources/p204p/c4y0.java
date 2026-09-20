package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c4y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ei1 f34031b;

    /* JADX INFO: renamed from: c */
    public int f34032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4y0(ei1 ei1Var, ibk ibkVar) {
        super(ibkVar);
        this.f34031b = ei1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34030a = obj;
        this.f34032c |= Integer.MIN_VALUE;
        return this.f34031b.m39058i(null, this);
    }
}
