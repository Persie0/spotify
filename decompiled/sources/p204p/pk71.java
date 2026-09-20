package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pk71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ay21 f178408b;

    /* JADX INFO: renamed from: c */
    public int f178409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk71(ay21 ay21Var, ibk ibkVar) {
        super(ibkVar);
        this.f178408b = ay21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178407a = obj;
        this.f178409c |= Integer.MIN_VALUE;
        return this.f178408b.m27483s(this);
    }
}
