package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gil0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80202a;

    /* JADX INFO: renamed from: b */
    public int f80203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hil0 f80204c;

    /* JADX INFO: renamed from: d */
    public bqz0 f80205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gil0(hil0 hil0Var, ibk ibkVar) {
        super(ibkVar);
        this.f80204c = hil0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80202a = obj;
        this.f80203b |= Integer.MIN_VALUE;
        return this.f80204c.mo15629a(null, null, this);
    }
}
