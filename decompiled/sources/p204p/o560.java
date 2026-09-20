package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o560 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161894a;

    /* JADX INFO: renamed from: b */
    public int f161895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p560 f161896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o560(p560 p560Var, ibk ibkVar) {
        super(ibkVar);
        this.f161896c = p560Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161894a = obj;
        this.f161895b |= Integer.MIN_VALUE;
        return this.f161896c.mo15629a(null, null, this);
    }
}
