package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xn9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ go9 f263561b;

    /* JADX INFO: renamed from: c */
    public int f263562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn9(go9 go9Var, ibk ibkVar) {
        super(ibkVar);
        this.f263561b = go9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263560a = obj;
        this.f263562c |= Integer.MIN_VALUE;
        return go9.m45326a(this.f263561b, null, this);
    }
}
