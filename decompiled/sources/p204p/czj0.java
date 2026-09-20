package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class czj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gzj0 f43575b;

    /* JADX INFO: renamed from: c */
    public int f43576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f43575b = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43574a = obj;
        this.f43576c |= Integer.MIN_VALUE;
        return this.f43575b.m46212i(this);
    }
}
