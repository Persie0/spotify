package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gyo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iyo0 f85683b;

    /* JADX INFO: renamed from: c */
    public int f85684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyo0(iyo0 iyo0Var, ibk ibkVar) {
        super(ibkVar);
        this.f85683b = iyo0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85682a = obj;
        this.f85684c |= Integer.MIN_VALUE;
        return this.f85683b.m51950e(this);
    }
}
