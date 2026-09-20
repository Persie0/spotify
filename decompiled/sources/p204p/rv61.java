package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rv61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sv61 f203012b;

    /* JADX INFO: renamed from: c */
    public int f203013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv61(sv61 sv61Var, ibk ibkVar) {
        super(ibkVar);
        this.f203012b = sv61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203011a = obj;
        this.f203013c |= Integer.MIN_VALUE;
        return this.f203012b.m79427a(this);
    }
}
