package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pax0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qax0 f175646b;

    /* JADX INFO: renamed from: c */
    public int f175647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pax0(qax0 qax0Var, ibk ibkVar) {
        super(ibkVar);
        this.f175646b = qax0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175645a = obj;
        this.f175647c |= Integer.MIN_VALUE;
        return this.f175646b.m72477a(null, this);
    }
}
