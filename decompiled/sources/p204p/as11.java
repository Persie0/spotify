package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class as11 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f19277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bs11 f19279c;

    /* JADX INFO: renamed from: d */
    public int f19280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as11(bs11 bs11Var, ibk ibkVar) {
        super(ibkVar);
        this.f19279c = bs11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19278b = obj;
        this.f19280d |= Integer.MIN_VALUE;
        return this.f19279c.m30341a(null, this);
    }
}
