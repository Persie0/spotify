package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class io80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ia70 f104155b;

    /* JADX INFO: renamed from: c */
    public int f104156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io80(ia70 ia70Var, ibk ibkVar) {
        super(ibkVar);
        this.f104155b = ia70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104154a = obj;
        this.f104156c |= Integer.MIN_VALUE;
        return this.f104155b.m50044p(null, this);
    }
}
