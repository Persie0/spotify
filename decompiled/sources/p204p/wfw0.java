package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wfw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfw0 f250917b;

    /* JADX INFO: renamed from: c */
    public int f250918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfw0(xfw0 xfw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f250917b = xfw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250916a = obj;
        this.f250918c |= Integer.MIN_VALUE;
        return this.f250917b.mo50458d(null, this);
    }
}
