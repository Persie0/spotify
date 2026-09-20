package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vfa1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k791 f240922b;

    /* JADX INFO: renamed from: c */
    public int f240923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfa1(k791 k791Var, ibk ibkVar) {
        super(ibkVar);
        this.f240922b = k791Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240921a = obj;
        this.f240923c |= Integer.MIN_VALUE;
        return this.f240922b.m55639f(null, this);
    }
}
