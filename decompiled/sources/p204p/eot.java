package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eot extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61472a;

    /* JADX INFO: renamed from: b */
    public int f61473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lot f61474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eot(lot lotVar, ibk ibkVar) {
        super(ibkVar);
        this.f61474c = lotVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61472a = obj;
        this.f61473b |= Integer.MIN_VALUE;
        return this.f61474c.mo15629a(null, null, this);
    }
}
