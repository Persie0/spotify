package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76825a;

    /* JADX INFO: renamed from: b */
    public int f76826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i61 f76827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(i61 i61Var, ibk ibkVar) {
        super(ibkVar);
        this.f76827c = i61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76825a = obj;
        this.f76826b |= Integer.MIN_VALUE;
        return this.f76827c.mo15629a(null, null, this);
    }
}
