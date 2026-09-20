package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tab1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218533a;

    /* JADX INFO: renamed from: b */
    public int f218534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uab1 f218535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tab1(uab1 uab1Var, ibk ibkVar) {
        super(ibkVar);
        this.f218535c = uab1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218533a = obj;
        this.f218534b |= Integer.MIN_VALUE;
        return this.f218535c.mo15629a(null, null, this);
    }
}
