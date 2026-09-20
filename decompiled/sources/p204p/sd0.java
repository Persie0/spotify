package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f207829a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f207830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ td0 f207831c;

    /* JADX INFO: renamed from: d */
    public int f207832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd0(td0 td0Var, ibk ibkVar) {
        super(ibkVar);
        this.f207831c = td0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207830b = obj;
        this.f207832d |= Integer.MIN_VALUE;
        return this.f207831c.m80485d(null, this);
    }
}
