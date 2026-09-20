package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xmy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263464a;

    /* JADX INFO: renamed from: b */
    public int f263465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ymy f263466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmy(ymy ymyVar, ibk ibkVar) {
        super(ibkVar);
        this.f263466c = ymyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263464a = obj;
        this.f263465b |= Integer.MIN_VALUE;
        return this.f263466c.mo15629a(null, null, this);
    }
}
