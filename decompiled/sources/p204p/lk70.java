package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lk70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134277a;

    /* JADX INFO: renamed from: b */
    public int f134278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mk70 f134279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk70(mk70 mk70Var, ibk ibkVar) {
        super(ibkVar);
        this.f134279c = mk70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134277a = obj;
        this.f134278b |= Integer.MIN_VALUE;
        return this.f134279c.mo15629a(null, null, this);
    }
}
