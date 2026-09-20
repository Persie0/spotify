package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rx60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203513a;

    /* JADX INFO: renamed from: b */
    public int f203514b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sx60 f203515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx60(sx60 sx60Var, ibk ibkVar) {
        super(ibkVar);
        this.f203515c = sx60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203513a = obj;
        this.f203514b |= Integer.MIN_VALUE;
        return this.f203515c.mo15629a(null, null, this);
    }
}
