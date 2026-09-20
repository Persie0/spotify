package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class il2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f103269b;

    /* JADX INFO: renamed from: c */
    public int f103270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f103269b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103268a = obj;
        this.f103270c |= Integer.MIN_VALUE;
        return this.f103269b.m70243d(null, null, this);
    }
}
