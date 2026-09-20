package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yvh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276667a;

    /* JADX INFO: renamed from: b */
    public int f276668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zvh f276669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvh(zvh zvhVar, ibk ibkVar) {
        super(ibkVar);
        this.f276669c = zvhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276667a = obj;
        this.f276668b |= Integer.MIN_VALUE;
        return this.f276669c.mo15629a(null, null, this);
    }
}
