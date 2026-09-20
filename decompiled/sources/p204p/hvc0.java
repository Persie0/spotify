package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hvc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95647a;

    /* JADX INFO: renamed from: b */
    public int f95648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ivc0 f95649c;

    /* JADX INFO: renamed from: d */
    public bqz0 f95650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvc0(ivc0 ivc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f95649c = ivc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95647a = obj;
        this.f95648b |= Integer.MIN_VALUE;
        return this.f95649c.mo15629a(null, null, this);
    }
}
