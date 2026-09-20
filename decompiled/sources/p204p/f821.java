package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f821 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66840a;

    /* JADX INFO: renamed from: b */
    public int f66841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g821 f66842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f821(g821 g821Var, ibk ibkVar) {
        super(ibkVar);
        this.f66842c = g821Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66840a = obj;
        this.f66841b |= Integer.MIN_VALUE;
        return this.f66842c.mo15629a(null, null, this);
    }
}
