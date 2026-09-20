package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ox60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170898a;

    /* JADX INFO: renamed from: b */
    public int f170899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ px60 f170900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox60(px60 px60Var, ibk ibkVar) {
        super(ibkVar);
        this.f170900c = px60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170898a = obj;
        this.f170899b |= Integer.MIN_VALUE;
        return this.f170900c.mo15629a(null, null, this);
    }
}
