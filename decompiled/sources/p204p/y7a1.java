package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y7a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270003a;

    /* JADX INFO: renamed from: b */
    public int f270004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z7a1 f270005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7a1(z7a1 z7a1Var, ibk ibkVar) {
        super(ibkVar);
        this.f270005c = z7a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270003a = obj;
        this.f270004b |= Integer.MIN_VALUE;
        return this.f270005c.mo15629a(null, null, this);
    }
}
