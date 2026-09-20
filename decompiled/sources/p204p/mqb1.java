package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mqb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146237a;

    /* JADX INFO: renamed from: b */
    public int f146238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nqb1 f146239c;

    /* JADX INFO: renamed from: d */
    public bqz0 f146240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqb1(nqb1 nqb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f146239c = nqb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146237a = obj;
        this.f146238b |= Integer.MIN_VALUE;
        return this.f146239c.mo15629a(null, null, this);
    }
}
