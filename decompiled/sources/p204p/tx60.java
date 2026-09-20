package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tx60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224575a;

    /* JADX INFO: renamed from: b */
    public int f224576b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ux60 f224577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx60(ux60 ux60Var, ibk ibkVar) {
        super(ibkVar);
        this.f224577c = ux60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224575a = obj;
        this.f224576b |= Integer.MIN_VALUE;
        return this.f224577c.mo15629a(null, null, this);
    }
}
