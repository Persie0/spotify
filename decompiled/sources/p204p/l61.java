package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f130136a;

    /* JADX INFO: renamed from: b */
    public int f130137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m61 f130138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(m61 m61Var, ibk ibkVar) {
        super(ibkVar);
        this.f130138c = m61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130136a = obj;
        this.f130137b |= Integer.MIN_VALUE;
        return this.f130138c.mo15629a(null, null, this);
    }
}
