package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cwh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42757a;

    /* JADX INFO: renamed from: b */
    public int f42758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dwh f42759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwh(dwh dwhVar, ibk ibkVar) {
        super(ibkVar);
        this.f42759c = dwhVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42757a = obj;
        this.f42758b |= Integer.MIN_VALUE;
        return this.f42759c.mo15629a(null, null, this);
    }
}
